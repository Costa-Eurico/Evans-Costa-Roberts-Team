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
            case 'd': //differences between levels of difficulty
                this.displayDiffLevelsOfDifficulty();
                break;
            case 'x': //return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void displayGameObjective() {
        System.out.println("*** displayGameObjective function called ***");
    }

    private void displayMoveInstructions() {
        System.out.println("*** displayMoveInstructions function called ***");
    }

    private void displayDiffLevelsOfDifficulty() {
        System.out.println("*** displayDiffLevelsOfDifficulty function called ***");
    }
    
}
