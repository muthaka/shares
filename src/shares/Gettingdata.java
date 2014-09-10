/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import java.io.*;
import java.net.*;


/**
 *
 * @author MUTHAKA
 */
public class Gettingdata {
    public static void main(String[] args) {
        try {
            URL nelly = new URL("http://www.nellydata.com/abc/livedata.asp");
            URLConnection yahooConnection = nelly.openConnection();
            DataInputStream dis = new DataInputStream(yahooConnection.getInputStream());
            String inputLine;

            while ((inputLine = dis.readLine()) != null) {
                System.out.println(inputLine);
            }
            dis.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
}





