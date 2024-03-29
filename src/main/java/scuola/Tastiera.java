/**
 *  Tastiera.java
 *
 *  @version 4.0 - feb 2017
 *  @author  N. Galati - ITI E.Mattei Maglie
 */
package scuola;

import java.io.*;

public class Tastiera {
       
       private final static InputStreamReader input = new  InputStreamReader(System.in);
       private final static BufferedReader bufferTastiera = new BufferedReader(input);
       
       public static String leggiStringa() throws IOException  {
            String stringaLetta;
            try {            
                stringaLetta = bufferTastiera.readLine();
            } catch (IOException e) {
                throw new IOException();
            }
            return stringaLetta;
       }

       public static char leggiCarattere() throws IOException {
            char c;
            try {    
               c = leggiStringa().charAt(0);
            } catch (IOException e) {
               throw new IOException();
            }
            return c;
        }
       
       public static int leggiIntero() throws IOException, NumberFormatException {
            try {
                return Integer.valueOf(leggiStringa());
            } catch (IOException e) {
               throw new IOException();
            } catch(NumberFormatException e) {
                throw new NumberFormatException(); 
            }
        }
       
       public static float leggiReale() throws IOException, NumberFormatException {
            try {
               return Float.parseFloat(leggiStringa());
            } catch (IOException e) {
               throw new IOException();
            } catch(NumberFormatException e) {
                throw new NumberFormatException();
            }
       }   
}
