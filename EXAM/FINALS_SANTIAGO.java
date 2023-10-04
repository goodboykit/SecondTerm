
package com.mycompany.finals_santiago;

import java.util.Arrays;
import java.util.Scanner;


public class FINALS_SANTIAGO {

    static final Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
        NumberSix();
        NumberEleven();
    }
    
    public static void NumberSix (){
      // Write a Java program that takes a string as input and finds the longest word in the string.
      
      String word = " ";
      String largest =" ";    
      
      String[] words = new String[50];    
         
      String stringg = "I am taking my current final exam now" +"";
      int temp = 0; 
      for(int i = 0; i < stringg.length(); i++){    
          if(stringg.charAt(i) != ' '){    
              word = word + stringg.charAt(i);    
          }    
          else{    
              words[temp] = word;    
              temp++;      
              word = "";    
          }    
      }            

      largest = words[0];    
      for(int i = 0; i < temp; i++){      
          if(largest.length() < words[i].length())    
              largest = words[i];    
      }  
        System.out.println("Answer in PROBLEM 6");
      System.out.println("The Largest word in the sentence: " + largest);    
  }  
    
    public static void NumberEleven(){
        
        //Write a Java program that initializes an 
        //array of integers with some values and then calculates the average of all the values in the array.
        System.out.println("....................");
        System.out.println("Enter the length numbers you want to enter?");
        int nwe = scan.nextInt();
        int [] sum = new int [nwe];
        
        System.out.println("....................");
        System.out.println("Now enter the number values");

         double [] arrays = new double[nwe];
         double total = 0;
         
         for(int i=0; i<arrays.length; i++){
            System.out.print("Enter the Value # "+(i+1)+": ");
            arrays[i] = scan.nextDouble();
        }
         
         for(int i=0; i<arrays.length; i++){
        	total = total + arrays[i];
        }
         
         double avg = total / arrays.length;
         System.out.println("ANSWER IN PROBLEM 12");
         System.out.format("The average is: %.2f", avg);
      }
              
}


