/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.illegalargumentproject5;
import java.util.*;
/**
 *
 * @author NATANIEL
 */
public class Illegalargumentproject5 {

    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in); 
         while (true){ 
  
         System.out.print("Enter a positive number: "); 
         int Input = scan.nextInt(); 
        scan.nextLine();
         try { 
             if (Input < 0) { 
                 throw new IllegalArgumentException("Input must be a positive number."); 
             } 
             System.out.println("You entered: " + Input); 
         } 
         catch (IllegalArgumentException e) { 
             System.err.println("IllegalArgumentException: " + e.getMessage()); 
           } 
        } 
}
}
