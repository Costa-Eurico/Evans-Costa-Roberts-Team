/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.view;

/**
 *
 * @author xyz
 */
public class CreditsView extends View{
    
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
        this.console.println("\n******************************************************************");
        this.console.println("Game developers, creators, and designers");
        this.console.println("Tiffany Evans");
        this.console.println("Eurico Costa");
        this.console.println("Michael Roberts");
    }
    
    private void displayCredits() {
        this.console.println("\n******************************************************************");
        this.console.println("Game Credits");
        this.console.println("Charcoaled - 2015");
        this.console.println("http://github.com/Costa-Eurico/Evans-Costa-Roberts-Team \n");
        this.console.println("Special thanks for the BYU-Idaho CIT 260 course \n"
                + "developers, instructor, TA, and classmates that helped \n"
                + "provide feedback, additional insight and help. Charcoaled \n"
                + "is available on GitHub for anyone to download and use as \n"
                + "they like. Please provide reference to its original creators. ");
        this.console.println("\n******************************************************************");
    }
    
    @Override
    public void display() {
        displayCreators();
        displayCredits();
    }
}
