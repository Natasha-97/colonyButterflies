//********************************************************************************
// PantherID:  6222580
// CLASS: COP 2210 – Fall 2019
// ASSIGNMENT # 2
// DATE: 10/09/2019
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package assignment2butterfliescolony;

import javax.swing.JOptionPane;
import java.util.Random;

public class Assignment2ButterfliesColony {

   
    public static void main(String[] args) {
        
        
      ButterflyColony MyColony = new ButterflyColony();//new object
      
      
        
      JOptionPane.showMessageDialog(null,"Welcome, here is a program to help "
                + "you with your Buttefly Colony. Let's begin. ");
        
   
     String colNm = JOptionPane.showInputDialog(" What would you like to call "
              + "your colony?");
     String careTNm = JOptionPane.showInputDialog(" What is your Name?");
      
      
     String stSz = JOptionPane.showInputDialog(" How many Butterflies do you "
              + "have? ");
      int stSize = Integer.parseInt(stSz); // change string to int
    
     
     String stCl = JOptionPane.showInputDialog(" What is your Butterflies "
              + "color? ");
     
    
     String Bcl;    
     int nwCl = JOptionPane.showConfirmDialog( null, " Would you like to add "
             + "a new color to your Colony?", "It will increase your current "
             + "population by 10%",JOptionPane.YES_NO_OPTION );
     if (nwCl == 0 ){
             Bcl = JOptionPane.showInputDialog("Write the Color that you want"
                + " to add.");
     }else
          { 
           Bcl = "None";
          }
      // if else statements to add a new color or not. 
       
     int btotal = MyColony.setAddColor(nwCl,stSize);
       // calling the method to add 10% of the actual population if a new color 
       // is added.
       
     String daysF = JOptionPane.showInputDialog("How many days would you like"
              + " to feed your Butterflies ");
     int daysfeed = Integer.parseInt(daysF); 

       
     String daysBr = JOptionPane.showInputDialog("How many days would you like"
               + " them to breed?");
         int dBreed = Integer.parseInt(daysBr);
 
         int succesfulD = MyColony.setBreedDays(daysfeed, dBreed);
         // calling the method and assigning the result to show which 
         //input value is smaller.     
         btotal = MyColony.populationB(daysfeed, dBreed, btotal);
          // calling the method and assigning the result of the calculation
          //that will double the size of the buttefly population per day.
              
              
     String answer;
     int sickB ;
     Random buttSick = new Random();
        
         int VitaM = JOptionPane.showConfirmDialog(null,"Do you want to give "
               + "your butterflies vitamins?", "Select",
               JOptionPane.YES_NO_OPTION);
          
     if (VitaM == 1){
           
            sickB = buttSick.nextInt(5);
     }else
          {
            sickB = buttSick.nextInt(4);
          }
     // randomly decide if the butterflies got sick, with vitamins 20% and 
     // without it 25% of chances to get sick.
          
          
     if (sickB ==1){   
           
            answer = "YES";
            MyColony.setDeadB(sickB, btotal);
        
     }else
         { 
            answer ="No";
         }
     
        
     int finalPop;
        
     finalPop = btotal - MyColony.setDeadB(sickB, btotal);
     // total number of butterflies alive. 
        
        
      JOptionPane.showMessageDialog(null,"The Colony named " + colNm + 
                " taken care for " + careTNm + " has: \n" + "Starting Size: " 
                + stSz + " Butterflies \n Starting Color: " + stCl + 
                " \n Additional Color: " + Bcl + "\n They were fed: " + daysfeed 
                + " days \n You wanted them " + "to breed : " + daysBr + 
                " days \n They successfully Breed: " + succesfulD
                 + "\n They got sick: " + answer + " \n Dead Butterflies: " + 
                MyColony.setDeadB(sickB, btotal) + 
                "\n Final Butterfly population:" + finalPop );
       
       }
      
    }
    
   
   






