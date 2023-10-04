
package com.mycompany.practiceprobs;

import java.util.Arrays;
import java.util.Scanner;


public class PracticeProb2 {
    
    static final Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        Three();
        
//        System.out.print("Enter the length of the first array: ");
//        int length1 = scan.nextInt();
//        int[] array1 = new int[length1];
////
//        for (int i = 0; i < length1; i++) {
//            System.out.print("Enter element #" + (i+1) + " of array 1: ");
//            array1[i] = scan.nextInt();
//        }
////
//        System.out.print("Enter the length of the second array: ");
//        int length2 = scan.nextInt();
//        int[] array2 = new int[length2];
////
//        for (int i = 0; i < length2; i++) {
//            System.out.print("Enter element #" + (i+1) + " of array 2: ");
//            array2[i] = scan.nextInt();
//        }
////
//        int[] commonElements = findCommonElements(array1, array2);
//
//        System.out.print("Common Elements: ");
//        for (int element : commonElements) {
//            System.out.print(element + " ");
//        }
//
        scan.close();
        
//        String[] names = {"cat", "rabbit", "horse", "goat", "rooster", "ooooooooooooooo"};
//        
//        String result = getNames(names);
//        System.out.println("The longets length of strings are: " +result);
        
    }
    
    public static void One (){
     
    //Write a Java program that initializes an array of integers with some values and then 
    //finds the sum of all the values in the array.
     
     System.out.println("Enter the length numbers you want?");
     int nwe = scan.nextInt();
     
     System.out.println(".............");
     System.out.println("Now enter the numbers");
     int [] sum = new int [nwe];
     
     int temp =0; 
     for (int i = 0; i<sum.length; i++){
         sum[i]= scan.nextInt();
         temp+=sum[i];
     }
        System.out.println("Elements in the array are: "+ Arrays.toString(sum));
        System.out.println("Sum of the elements are: " + temp);
        
     }

    static String getNames (String names []){
           
           int index =0; 
       
           int elementLength = names [0].length();
        
           for (int i =0; i<names.length; i++){
               if (names[i].length()>elementLength){
                   index = i;
                   elementLength = names[i].length();
               }
           }
                return names [index];

           }
    
    public static void Three (){
        
        System.out.println("Enter the size of the array");
        int nwe = scan.nextInt();
        
        String [] namess = new String [nwe];
        
        System.out.println("Now enter the names");

        for (int i=0; i<nwe; i++){
            namess[i] = scan.next();
        }
        
        String smallestt = namess[0];

        
         for (int i = 1; i < namess.length; i++) {
            if (namess[i].length()<smallestt.length()) { 
                smallestt = namess[i];
            }
        }
        System.out.println("The smallest string in the array is: " + smallestt);

       }
    
    public static void Four (){
        
        //Write a Java program that initializes an array of integers with some values 
        //and then finds the smallest value in the array
        
        System.out.println("Enter the size of the array");
        int nwe = scan.nextInt();
        
        int [] jwe = new int [nwe];
        
        System.out.println("Now enter the numbers");
        
        for (int i=0; i<jwe.length; i++){
            jwe[i]= scan.nextInt();
        }
        
        int temp = jwe[0]; 
        for (int i=0; i<jwe.length; i++){
            if (jwe[i] < temp){
                temp= jwe[i];
            }
           
        }
         System.out.println("The elements value in the array are: " + Arrays.toString(jwe));
         System.out.println("The smallest value in the array are: " + temp);

    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        
        int[] tempArray = new int[array1.length];
        int index = 0;

        for (int element : array1) {
            for (int element2 : array2) {
                if (element == element2) {
                    tempArray[index++] = element;
                    break;
                }
            }
        }

        int[] commonElements = new int[index];
        System.arraycopy(tempArray, 0, commonElements, 0, index);
        
        return commonElements;
    }
    
    public static void Prob4(){
/*Write a Java program that initializes two arrays of integers with some values and
then finds the common elements in both arrays*/  
         int[] arr1 = {23, 26, 40, 15, 30};
         int[] arr2 = {23, 26, 40, 30, 15};
         int same = 0;
         
//         int eme = ArrayString[e]. length() ;
//String baryable = ArrayString[e];
//for (int i = 0; i ‹ Arraystring. length; i++) {
//if (eme
//< ArrayString[i]. length ())
//eme = ArrayString[i]. length() ;
//baryable = Arraystring[i];
//} else if (eme == Arraystring[i]. length()) {
//baryable +=
//+ ArrayString[i];
//}
//System.out.printIn (baryable);
         
         System.out.print("Common elements: ");
       for(int i = 0; i<arr1.length; i++){ 
          for(int j = 0; j<arr2.length; j++){  
            if(arr1[i] == arr2[j]){   
               same = arr1[i]; 
                System.out.println(same);
            }
        }
       }
          System.out.println(" ");
      }
    
    public static void Five (){
       // Write a Java program that initializes an array 
       //of integers with some values and then sorts the array in descending order.
       
       System.out.print("Enter the length of the array: ");
       int val = scan.nextInt();
       
       int [] values = new int [val];
       System.out.println("Enter the elements of the array:");
       
       for (int i=0; i<values.length; i++){
           values[i] =scan.nextInt();
       }
       
       System.out.println("");
       System.out.println("Original Array: " + Arrays.toString(values));
       
       int temp= 0;
       for (int i =0; i<val; i++){
           for(int j=0; j<val; j++){
               if (values[i] >values[j]){
                   temp = values[i];
                   values[i] = values[j];
                   values[j] = temp;
               }
           }
      } 
        System.out.println("Descending Order Array: " + Arrays.toString(values));

    }
}


    

    
    
           
 
        
    

   
    
    

