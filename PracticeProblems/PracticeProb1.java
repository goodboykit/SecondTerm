

package com.mycompany.practiceprobs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PracticeProbs {

    public static void main(String[] args) {
        Twelve();
        
        
//        int numbers [] = {1,2,3,4,5,6,7,8};
//        int result = summation(numbers);
//        System.out.println(result);

         
    }
    
    public static void One () {
    Scanner scan = new Scanner (System.in);
        
        int[] nums = new int [10];
        
        for(int i=0; i<nums.length; i++){
            nums[i] = scan.nextInt();
            if (nums [i] <=0){
                nums[i]=1;
            }
        }
        
        for(int j=0; j<10; j++){
	  System.out.println("X ["+j+"]"+" = "+nums[j]);

        }
    } 
    
    public static void Two(){
        
        Scanner scan = new Scanner (System.in);
        int v, j=1;        
        
        int[] ints = new int [10];
        v = scan.nextInt();

        for (int i=0; i<ints.length; i++){
            ints[i] = v*j;
            j+=j; 
        }
        
        for(int i =0; i<ints.length; i++){
            System.out.printf("N[%d] = %d",i, ints[i]);
            System.out.println("");
        }
        
    }
    
    public static void Three(){
        Scanner scan = new Scanner (System.in);
        
        double[] num = new double [100];
        
        for (int i=0; i<num.length; i++){
            num[i] = scan.nextDouble();
        }
        
        for (int i=0; i<num.length; i++){
            if (num[i]<=10){
            System.out.println("A["+i+"] = "+num[i] );

            }
        } 
    }
    
    public static void Four() {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the numbers: ");
       
        int[] one = new int [10];
        int sum =0;
        
        for (int i=0; i<one.length; i++){
            one[i]= scan.nextInt();
            sum = sum + one[i];
        }
       
        System.out.println("Elements of the array are: "+Arrays.toString(one));
        System.out.println("Sum of the elements in the array are: "+ sum);
    }
    
    public static void Five (){
        
        Scanner scan = new Scanner (System.in);
        long[] arr = new long [61];
        arr [0]=0;
        arr[1] =1;
        int n, t;
        n =scan.nextInt();
        
        for (int i=2; i<=60; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }  
        
        for (int i=0; i< n; i++){
            t = scan.nextInt();
            System.out.println("Fib("+t+") = "+ arr[t]);
        }
    }
        
        public static void Six (){
            
           Scanner scan = new Scanner (System.in);
           int[] nums = new int [1000];
           int j =0; 
           int n = scan.nextInt();
           
           for (int i=0; i<1000; i++){
               if (n==j){
                   j=0;
               }
               System.out.println("N["+i+"] = "+j);
               j++;
           }

        }
        
        public static void Seven (){
            
            Scanner scan = new Scanner (System.in);
            int[] arr = new int [100];
            
            double n = scan.nextDouble();
            
            for(int i=0; i<1000; i++){
                System.out.printf("N[%d] = %.4f\n",i,n);
                n/=2.0;
            }
  
        }
        
        public static void Eight (){
            double dailytemp[] = {87.5, 90.0, 91.2, 30.0,98.7};
            double max;
            int i;
            max = dailytemp[0];
            
            for(i=0; i<5; i++){
                if (dailytemp[i] > max) 
                    max = dailytemp[i];
            }
            System.out.println("The max temp is " +max);
            
        }
        
        public static void Nine (){
            
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter the no. of elements in the array: ");
            int n = scan.nextInt();
            int square []; square = new int [n];
 
            System.out.println("Enter elements in the array: ");
            
           for (int i =0; i<square.length; i++){
               square[i] =scan.nextInt();
           }
           
            int smallest = (int) square[0];
            int largest = square[0];
            
            for (int element: square){
                if (element <smallest){
                    smallest = element;
                }
                if (element >largest){
                    largest = element;
                }
           }
            
//            for (int i =0; i<square.length; i++){
//                if (smallest >square[i]){
//                    smallest = square[i];
//                }
//                if (largest < square[i]){
//                    largest = square[i];
//                }
//
//           }
           System.out.println("The smallest value in the array is: " + smallest);
           System.out.println("The largest value in the array is: " + largest);

        }
        
        public static void Ten (){
            int table [][] = new int [3][4];
            
            table [0][0] = 2;
            table [0][1] = 4;
            table [0][2] = 8;
            table [0][3] = 4;
            
            table [1][0] = 11;
            table [1][1] = 12;
            table [1][2] = 9;
            table [1][3] = 5;
            
            table [2][0] = 10;
            table [2][1] = 3;
            table [2][2] = 2;
            table [2][3] = -2;
            
            System.out.println(table [0][0] + " " + table [0][1]);
        }
        
        public static void Eleven (){
            
            Scanner scan = new Scanner (System.in);
            ArrayList <String> studentList = new ArrayList <String>();
           
            
            studentList.add("John");
                        
             
        }
        
        static int summation (int numbers []){
           
           int sum =0; 
           
           for(int number: numbers){
               sum = sum +number;
           }
            return sum;
            
        }
        
        public static void Twelve (){
            
            Scanner scan = new Scanner (System.in);
           
            System.out.println("How many rows you want to enter?");
            int rows = scan.nextInt();
            
            System.out.println("How many columns you want to enter?");
            int cols = scan.nextInt();
            System.out.println("...............");
            
            int matrix [][] =  new int [rows][cols];
            
            for (int i =0; i<rows; i++){
                for (int j =0; j<cols; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.println();
            
            
            //traverse each rows and sum the values
            int rowsTots = 0; 
            
            for (int i=0; i<rows; i++){

                for(int j=0; j<cols; j++){
                    rowsTots += matrix[i][j];
                } 
                System.out.println("Sum for the row ["+i+"]= " +rowsTots);
            }
          
            int colTot =0; 
            
            for (int i =0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    colTot += matrix [j][i];
                }
                System.out.println("Sum for the columnss ["+i+"] = " + colTot);
            }
            
           int perTotal = 0;
           
           
                for (int i = (rows-1); i < rows; i++)
         {
             perTotal = 0;
             for (int j = 0; j < cols; j++)
             {
                 perTotal += matrix[i][j];
             }
         }

        // top and bottom row
            for (int c = 0; c < cols; c++)
                perTotal += matrix[0][c] + matrix[rows-1][c];
            // left and right column
            for (int r = 1; r < rows-1; r++)
                perTotal += matrix[r][0] + matrix[r][0];

            // output
            System.out.println("Perimeter=" + perTotal);
        }
    
}

        
        

