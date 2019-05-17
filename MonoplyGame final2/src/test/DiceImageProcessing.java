/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author abdel
 */
public class DiceImageProcessing {
    
       //PythonInterpreter interpreter = null;  


   public void startDecleration() throws IOException, InterruptedException  
   {  
     try{
         String s = null;
         Process P  = Runtime.getRuntime().exec("C:\\Users\\abdel\\OneDrive\\Desktop\\MonoplyGame final2\\image_proccessing\\dist\\welcome\\welcome.exe");
         BufferedReader in = new BufferedReader(new InputStreamReader(P.getInputStream()));
         while((s = in.readLine())!=null){
             System.out.println("DiceDecleration.DiceImageProcessing.startDecleration()");
         }
                
     }
     catch(IOException ie){
     }
   }  
   
}
