/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import static javax.swing.text.html.HTML.Tag.BR;

/**
 *
 * @author evmcnally0
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello world.");
        
        try{
        FileReader F = new FileReader(args[0]);
        BufferedReader BR = new BufferedReader(F);} catch(IOException e){ 
          } 
        l
        String line = "";
        String lines = "";
        while ((line = BR.toString()) != null)
            lines += line;
        String s = null;
        

            System.out.printf("  -->%s%n", s);

    }
    
}
