/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classnotfound;
import java.util.*; 
/**
 *
 * @author NATANIEL
 */
public class Classnotfound {

    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in); 
  
                 while (true) { 
                         //access the ArrayList 
                         System.out.print("Enter the name of a class : "); 
                         String className = scan.nextLine(); 
  
                         try { 
                                 Class<?> classRecord = Class.forName(className); 
                                 System.out.println("Class found: " + classRecord.getName()); 
                         } catch (ClassNotFoundException e) { 
                                 System.err.println("Class Not Found Exception : " + e.getMessage()); 
                         } 
  
  
                 } 
         } 
 
}
