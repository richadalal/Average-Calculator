//Richa Dalal
//Average Calculator 

import java.util.Scanner;

public class averagecalculator
{ 
public static void main(String[] args)   

  { 
    Scanner sc= new Scanner(System.in);
  
    String name; 
    Double markphysics, markmath, markcomputerscience, markfrench;
    Double average;    
           
    System.out.println("Please enter your name:");
    name = sc.nextLine(); 
    
     System.out.println("Enter your mark for physics:");
         markphysics = sc.nextDouble(); 
     System.out.println("Enter your mark for math:");
         markmath = sc.nextDouble(); 
     System.out.println("Enter your mark for computerscience:");
         markcomputerscience = sc.nextDouble(); 
     System.out.println("Enter your mark for french:");
         markfrench = sc.nextDouble(); 
         
     //Calculate the average of the marks 
     average = ((markphysics + markmath + markcomputerscience + markfrench)/4);
     
     //Output page 
     System.out.println ("Your name is: " + name);
     System.out.println ("Your physics mark is: " + markphysics);
     System.out.println ("Your math mark is: " + markmath); 
     System.out.println ("Your computer science mark is: " + markcomputerscience);
     System.out.println ("Your french mark is: " + markfrench);
     System.out.println ("Your average is:" + average);
     
    }
  }
