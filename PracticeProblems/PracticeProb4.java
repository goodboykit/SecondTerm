
package com.mycompany.practiceprobs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeProb4 {
    
    static Scanner scan = new Scanner (System.in);
    
    static File f = new File ("/Users/goodboykit/Desktop/LC.txt");
    static String filename = "/Users/goodboykit/Downloads/filewriteexample/filee.txt";
    
    public static void main(String[] args) {
       Eight();
        
        //Whot();
        //one();
    }

    public static void Whot (){
            
    try{ 
        FileWriter writer = new FileWriter(filename);

        String text = ("Holabels!\nMay kwento akizkis gorabels ang lola nyey sa nyinistop");            
        String text2 = ("\npara mag buyla ng mga meslu at nyogig\nsyempre kailangan ko mag-breakfastlu diba! ");
              
        writer.write(text);
        writer.write(text2);
        writer.close();
           
        System.out.println("File succesfully created: "+ filename );
         
        Scanner scan = new Scanner(filename);
        System.out.println(scan.next());
    }
    
    catch (IOException e) {
      System.out.println("An error occured.");  
    }
}
        

    public static void one (){
        
        if (f.exists()) {
        System.out.println("File Name: " + f.getName());
        System.out.println("File Location: " + f.getAbsolutePath());
        System.out.println("File Writable: " + f.canWrite());
        System.out.println("File Size: " + f.length());
        // System.out.println("File Removed: " + f.delete());
    }
       else{
        System.out.println("File doesn't exists");
      }
 }
    
    public static void Two (){
        // Write a Java program that reads a text file and prints out the contents of the file
        // inputing
        
        try {
	BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        Scanner scan = new Scanner (System.in);	

	System.out.println("Enter names: [Type Quit]");
	String names = scan.nextLine();
				
        while (!names.equalsIgnoreCase("quit")) {
	writer.write(names);
	writer.newLine();
        names = scan.nextLine();
				
	if(names.equals("Exit")){			
        }
    }
				
        System.out.println("");
        writer.close();
        scan.close();
				
        System.out.println("Names written to " + filename);
	TwoOne();			
				
				
    } 
      catch (IOException e) {
	System.out.println("An error occured.");
        e.printStackTrace();
   }
			
	}
        
    

    public static void TwoOne (){
        
        //reader
        try {
         
         BufferedReader reader = new BufferedReader (new FileReader(filename));
         String line = reader.readLine();
        
          while (line != null){
          System.out.println(line);
          line = reader.readLine();
        }
            reader.close();
    }
          catch (IOException e){
            System.out.println("An Error Occured");
	    e.printStackTrace();
        }
         
    }
    
    public static void Four() {
       
        int countofWords = 0;
        
        try{
          
          BufferedReader reader = new BufferedReader (new FileReader(f));
          String lineStr = null;
          
         
          while ((lineStr = reader.readLine()) !=null){
              
              String wordsArr []= lineStr.split("\\s+");
              countofWords = countofWords + wordsArr.length;
              lineStr = reader.readLine();
          }
          
            System.out.println("Number of words in the file are: " + countofWords);
            reader.close();
        }
        
        catch(IOException e){
            
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
    
    public static void Five (){
        
            int lineCount =0;
        
            
            try {
                BufferedReader nwe = new BufferedReader (new FileReader (f));
                String line = nwe.readLine();
                
                while (line != null){
                    lineCount++;
                    line = nwe.readLine();
                }
                
                System.out.println("Number of lines in the file are : " + lineCount);
                                nwe.close();
            } 
            
            catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
    }
            
     public static void Six (){
        
         // Write a Java program that reads a text file and finds the longest word in the file.
         
       String longestWord = " ";
       try {
        
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
            
          while (line != null) {
              
          String[] words = line.split("\\s+");
       
          for (String word : words) {  
         
             if (word.length() > longestWord.length()) {
              longestWord = word;
           }
        }
            line = reader.readLine();
       }
            
        System.out.println("Longest word: " + longestWord);
        
       } 
         catch (IOException e) {
            System.out.println("An error occurred.");
           }
        
     }
     
     public static void Seven (){
         
         //Write a Java program that reads a text file
        //and finds the frequency of each word in the file.
           
        System.out.println("File operations with some of the string methods");
	System.out.println("===============================================");
	Scanner input=new Scanner(System.in);// to get the input
	System.out.println("Enter full file path");
	String filename=input.next();
 	
        File file = new File(filename);// Accepts the file type available in java.io package
	
        try {
   	 //To get choice from the user and perform the corresponding action on file
	 System.out.println("Please enter your choice");
	 System.out.println("Press 1 if the file content need to be printed.");
	 System.out.println("Press 2 if the  particular word occurancerance in the file need to be checked");
	 System.out.println("==========================================================");
	 
         int choice=input.nextInt();//Choice value accepted and perform its action correspondingly
	
         String s=null;
	 
         switch(choice)
	 {
	     case 1: //Print the file content
		  {
			 Scanner scanner = new Scanner(file);//Get
			 System.out.println("Printing the file contnent:");
			 while (scanner.hasNext()) //Get the Words from the file until next word is not available in file (java.util)
			 {
			 s= scanner.next(); //Will move the Scanner pointer and print next available data/word avaialble
			 System.out.println(s+" ");//print the value obtained by the scanner variable in before step.
			 } //while end
			 break;
		  }//Case1
	      case 2:  //Word Search
		  {
			 Scanner scanner = new Scanner(file);  //get the content or read the file
			 System.out.print("Enter the word that need to be searched:");
			 String word=input.next();  //Get the input of the word that need to be searched in the file
			 int flag=0;     //Flag value to count the number of occurrance of word.
			 		 
			 while (scanner.hasNext())  //get the next value if it is available
			 {
			    
			    s= scanner.next();  // get the value holded by Scanner
			    if(s.equalsIgnoreCase(word))//Check whether the File value obtained by Scanner is equal to the searched word.
			    {
			      
			      flag++; //incrementing flag value to know the searched value is available in the file
			    }//if end
					 
		         } //while end
			 if(flag!=0)// if the searched word is avaialble
			 {
                                System.out.println("The Word - '"+word+"' is available in the file");
				System.out.println("'"+ word+"' have occurred "+ flag +" times in the file");
			    
			 }//if end
			 else //if searched word is not available
			 {
			    System.out.println("The Word - '"+word+"' is not available in the file"); 
			 }//else end
			    break;
		     }  //case 2 end
               
              default:
		   {
		    System.out.println("You have entered incorrect option"); //Check for the option entered inappropriately 
		    break;
		   }//Default case
	    }//Switch end
         }//try end
	
        catch(Exception e)
	 {
	      System.out.println(e.getMessage()); //Display the exception if any 
	 }//catch end
     }
        public static void Eight (){
            
            Map<String , Integer>wordcount = new HashMap<>();
                    
                    
            Map<String, Integer> wordCount = new HashMap<>();
        
         try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    word = word.toLowerCase();
                    
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } 
                    
                    else {
                        wordCount.put(word, 1);
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        }
	
 //main end

}//class end
   
 



//        try {
//            Scanner read = new Scanner (reader);
//            String line = reader.readLine();
//            
//            while (read.hasNextLine()){
//                String data = read.nextLine();
//                System.out.println(data);
//            }
            
            
//            read.close();
//        } 
//        
//        catch (FileNotFoundException ex) {
//            System.out.println("An error occured");
//            ex.printStackTrace();
//        }

 
        

    
    

