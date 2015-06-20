/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.view;
import byui.cit260.charcoaled.control.ProgramControl;
import byui.cit260.charcoaled.model.Player;
import java.util.Scanner;

/**
 *
 * @author xyz
 */

public class CreditsView {
    
    public CreditsView() {
    }
    
    public void CreditsView() {
        
        // Displays names of creators
        this.displayCreators();
        
        // Displays game info
        this.displayCredits();
        
        // Select E to exit
    }
    
    private void displayCreators() {
        System.out.println("Game developers, creators, and designers");
        System.out.println("Tiffany Evans");
        System.out.println("Eurico Costa");
        System.out.println("Michael Roberts");
    }
    
    private void displayCredits() {
        System.out.println("\n******************************************************************");
        System.out.println("Game Credits");
        System.out.println("Charcoaled - 2015");
        System.out.println("http://github.com/Costa-Eurico/Evans-Costa-Roberts-Team");
        System.out.println("Special thanks for the BYU-Idaho CIT 260 course "
                + "developers, instructor, TA, and classmates that helped "
                + "provide feedback, additional insight and help. Charcoaled "
                + "is available on GitHub for anyone to download and use as "
                + "they like. Please provide reference to its original "
                + "creators. ");
        System.out.println("\n******************************************************************");
    }
    

}
