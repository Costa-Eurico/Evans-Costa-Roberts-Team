/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import java.util.Scanner;

/**
 *
 * @author eucosta
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        promptMessage = "\n"
           + "\n******************************************************************"
            + "\n| Help Menu                                                      |"
            + "\n******************************************************************"
            + "\n O - What is the objective of the game (how to win)?"
            + "\n M - How to move between doors and floors?"
            + "\n D - What are the differences between each difficulty level?"
            + "\n X - Return to the main menu ";
       }     
    
    
    @Override
    public void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            case 'o': //display game objective
                this.displayGameObjective();
                break;
            case 'm': //how to move around the game
                this.displayMoveInstructions();
                break;
            case 'x': //return to main menu
                return;
            default:
                this.console.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void displayGameObjective() {
        this.console.println("*** displayGameObjective function called ***");
    }

    private void displayMoveInstructions() {
        this.console.println("*** displayMoveInstructions function called ***");
    }

}
