
package com.mycompany.practiceprobs;
import java.util.Arrays;
import java.util.Scanner;


public class PracticeProb3 {
    
    static final Scanner scan = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        Four();
    }
    
    static void One (){
      //Write a Java program that takes a string as input and prints out the string in reverse order.
      
      System.out.print("Enter a string: ");

      String inputString = scan.nextLine();
      //String str = inputString;
      String temp = " ";
      char chr;
      
      for (int i=0; i<inputString.length(); i++){
          
       chr = inputString.charAt(i);
       temp = chr + temp;
      }
        System.out.println("Reversed String is: " + temp);
    }
    
    static void Two(){
        // Write a Java program that takes two strings as input and checks if they are anagrams of each other.
        
        System.out.print("Enter the first string: ");
        String one = scan.nextLine().replaceAll("[^a-zA-Z]", "").replaceAll("\\s+", "").toLowerCase();
        
        
        System.out.print("Enter the second string: ");
        String two = scan.nextLine().replaceAll("[^a-zA-Z]", "").replaceAll("\\s+", "").toLowerCase();
        
        String three = scan.nextLine().replaceAll("[^a-zA-Z]", "").replaceAll("\\s+", "");
    
        char c1 [] = one.toCharArray();
        char c2 [] = two.toCharArray();
        
        if (c1.length != c2.length){
            System.out.println("The two strings are Not Anagram at length");
        }
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        boolean isAnagram = Arrays.equals(c1, c2);
        
        if (isAnagram) {
            System.out.println(one + " and " + two + " are anagram.");
        } else {
            System.out.println(one + " and " + two + " are not anagram.");
        }
    }
        
        public static void Three (){
         // Write a Java program that takes a string as input and removes all the vowels from the string.
         
         System.out.print("Enter the string: ");
         String one = scan.nextLine();
         String str = " ";
         
         for (int i=0; i<one.length(); i++){
         char ch = Character.toUpperCase(one.charAt(i));
             
             if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                 continue;
                 str = str + ch;
          }
        System.out.println("Original Strings are: " + one);
        System.out.println("String after removing vowels are: " + str);
    }
        
        public static void Four (){
            //Write a Java program that takes a string as input and checks if it is a palindrome.
            
//            System.out.print("Enter a string: ");
//            String input = scan.nextLine();
//            
//            for (int i = 0; i < input.length() / 2; i++) {
//            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
//             System.out.println(input + " is not a palindrome.");
//            }
//            else {
//            System.out.println(input + " is a palindrome.");
//            }
//
//        }
          
            
            System.out.println("PALINDROME CHECK...");
            System.out.println("Enter a word: ");
            String inputWord = scan.nextLine().toLowerCase();
            inputWord = inputWord.replace (" ", "");

            char[] word = new char[inputWord.length()];
            char[] check = new char[inputWord.length()];


            for (int i = 0; i < inputWord.length(); i++) {
            word[i] = inputWord.charAt(i);
            check[i] = inputWord.charAt(inputWord.length()- (i+1));
            }

            //String output = "Palindrome";
            
            int checkCount = 0;
            for (int i = 0; i < inputWord.length(); i++) {
                if (word[i] == check[i]) {
                    checkCount++;
                }
            }
            
            if (checkCount == inputWord.length()) {
            System.out.println("Palindrome");
            }
            else {
            System.out.println("Not a palindrome");
            }
      }
            
            
    
        public static void Five (){
            
            System.out.print("Enter the string you want: ");
            String name = scan.nextLine();
            
            System.out.println("Word length is: " + name.length());
        }
}





     
      

    
    

