import hsa.Console;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class averagecalculator
{ static Console c;

  public static void main(String[] args)
      {  c = new Console(50, 100);
    //Set the console

    String name;
   
    Double markbiology, markmath, markenglish, markfrench;

    Double average;    
           
    //Enter in name
          
          c.println("Please enter your name:");
    name = c.readLine(); 
    
    //Enter marks 
     c.println("Enter your mark for physics:");
         markphysics = c.readDouble();
     c.println("Enter your mark for math:");
         markmath = c.readDouble();
     c.println("Enter your mark for computerscience:");
         markcomputerscience = c.readDouble();
     c.println("Enter your mark for french:");
         markfrench = c.readDouble();
         
     //Calculate the average of the marks 
     average = ((markbiology + markmath + markenglish + markfrench)/4);
     
     //Output page 
     c.println ("Your name is:" + name);
     c.println ("Your physics mark is:" + markphysics);
     c.println ("Your math mark is:" + markmath);
     c.println ("Your computer science mark is:" + markcomputerscience);
     c.println ("Your french mark is:" + markfrench);
     c.println ("Your average is:" + average);
     
     
    }
  }
