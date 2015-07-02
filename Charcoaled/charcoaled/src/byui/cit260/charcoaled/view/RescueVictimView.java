/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.ActorControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eucosta
 */
public class RescueVictimView extends View{

    public RescueVictimView() {
        promptMessage = "\n"
            + "\n******************************************************************"
            + "\n| Saving Victim in the room                                      |"
            + "\n******************************************************************"
            + "\n\n If there's a victim in the room, you will need to save him/her"
            + "\n by lowering him/her to the ground through the outside of the "
            + "\n  building, using a rope. You will need to determine"
            + "\n the length of rope required to lower the victim and away from "
            + "\n the burning building. You will need to provide the victims girth, "
            + "\n and the game will do the rest. But before you do, you need to answer"
            + "\n a challenge question, You'll have three tries to answer the challenge"
            + "\n question correctly: "
            + "\n";
        
    }
    
    
    
    @Override
    public void display() {
        double girth;
        int floor;
        double floorHeight;
        boolean correctAnswer = false;
        int attempts = 3;
        
        do {  
            System.out.println(promptMessage); //display question
            
            correctAnswer = askChallengeQuestion();
            if(!correctAnswer){
                System.out.println("\n*** Incorrect answer, please try again. You have " + attempts + " attempts left ***");
                attempts--;
            }
            else{
                System.out.println("\n*** Correct! Now lets see if you have enough rope! ***");
                correctAnswer = true;
            }
         
        } while (!correctAnswer); // a selection is not "return to main menu"
        
        //determine rope length
        ActorControl actorCtrl = new ActorControl();
        double ropeLength;
        
        do {
            double input = this.getVictimGirth(); //get the user's girth
            girth = input;
            
            // determine needed rope length. For simplicity, we'll use a fixed floor and floor heigth
            //TODO: add code to determine the current floor and floor height
            ropeLength = actorCtrl.calcLengthOfRope(girth, 2, 9);
  
            if(ropeLength == -1.0){
                System.out.println("\n*** Invalid girth. Girth can only be a value between 20 and 40 inches ***");
            }
            else{
                doActionAttempSaveVictim(ropeLength);
            }
            
        } while (ropeLength == -1.0);
    }
    
    private double getVictimGirth() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;
        double girth = 0;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            //prompt for victim's girth
            System.out.println("Enter the victim's girth in inches (example 32.5): ");
            /**
             * girth = Double.parseDouble(value) 
             * 
             */
            try{
                //get the girth from the keyboard and trim off blanks
                playerInput = keyboard.nextLine();
                playerInput = playerInput.trim();

                //if the name is invalid (< 1 characters)
                if (playerInput.length() < 1) {
                    System.out.println("*** Invalid input. ***");
                    continue; //and repeat again
                } 
                else{
                    girth = Double.parseDouble(playerInput);
                    valid = true;
                }
            }catch(NumberFormatException e){
                System.out.println("*** Invalid input. ***");
                continue; //and repeat again
            }
        }
        
        return girth; //return playerInput
    }
    
    private void doActionAttempSaveVictim(double ropeLength) {
       ActorControl actorCtrl = new ActorControl();
       double availableRope;
       
       //Determine how much rope is available in the resources inventory
       availableRope = determineAvailableRope();
       
       
       if(availableRope < ropeLength){
           System.out.println("*** You don't have enough rope. The Victim perished. ***");
       }
       else{
           System.out.println("*** Congratulations!!! You had enough rope! The Victim was saved. ***");
           
           //TODO: Code to add additional time to the player and to add to the players' victim's saved score.
       }
    }

    private boolean askChallengeQuestion() {
        System.out.println("*** called generate challenge question ***");
        
        //will generate a random challenge question, which will be an equation 
        //and return true or false based on the answer provided
        //for the sake of simplicity, it will return a random true or false value to 
        //test the function and simulate a correct or incorrect answer.
        
        return getRandomBoolean();
    }
    
    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private Double determineAvailableRope() {
        //stub to determine rope length available to the player
        //for now, return a random rope length
        //TODO: replace later by actual rope length determination from player's inventory
        
        return randomRopeRange();
    }
    
    private double randomRopeRange(){
        double min = 0;
        double max = 20;
        Random r = new Random();
        
        return min + (max - min) * r.nextDouble();
    }
    
}
