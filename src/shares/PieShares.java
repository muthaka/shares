/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import java.sql.Connection;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

/**
 *
 * @author MUTHAKA
 */
public class PieShares extends Application{
    private ObservableList data;	 
	    //MAIN EXECUTOR
	    public static void main(String[] args) {
	        Application.launch(Trying.class, args);
	    }
	 
	    //CONNECTION DATABASE SAVING DATA
	    public void buildData(){
	          Connection c ;
	          data = FXCollections.observableArrayList();
	          try{
	            c = Connectdb.Connection();
	            //SQL FOR SELECTING NATIONALITY OF CUSTOMER
	            /* String SQL = "SELECT COUNT(nationality_id), "
	                    + "type FROM CUSTOMER c,NATIONALITY na"
	                    + " WHERE na.id=c.nationality_id GROUP BY type";  */
                    String SQL = "SELECT Kengen FROM september2014";
	 
	            ResultSet rs = c.createStatement().executeQuery(SQL);
	            while(rs.next()){
	                //adding data on piechart data
	                data.add(new PieChart.Data(rs.getString(1),rs.getDouble(1)));
	            }
	          }catch(Exception e){
	              System.out.println("Error on DB connection");
	          }
	 
	      }
	 
	      @Override
	      public void start(Stage stage) throws Exception {
	        //PIE CHART
	        PieChart pieChart = new PieChart();
	        buildData();
	        pieChart.getData().addAll(data);
	 
	        //Main Scene
	        Scene scene = new Scene(pieChart);       
	 
	        stage.setScene(scene);
	        stage.show();
	      }
    
}
