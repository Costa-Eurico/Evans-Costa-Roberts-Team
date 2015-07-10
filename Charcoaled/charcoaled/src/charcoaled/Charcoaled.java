/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.view.StartProgramView;
import exception.ProgramControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 *
 * @author ih8pcs
 */
public class Charcoaled {

    private static Game currentGame = null;
    private static Player player = null;
    private static String[] savedGamesList;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    public static String filePath = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        Charcoaled.currentGame = currentGame;
    }

    public static String[] getSavedGamesList() {
        return savedGamesList;
    }

    public static void setSavedGamesList(String[] savedGamesList) {
        Charcoaled.savedGamesList = savedGamesList;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        Charcoaled.player = player;
    }
    
    public static void main(String[] args) throws ProgramControlException {
       //create StartProgram and start the program
       try {
           
           System.out.println(Charcoaled.class.getSimpleName());
           
           //open character stream files for end user input and output
           Charcoaled.inFile = new BufferedReader(new InputStreamReader(System.in));
           
           Charcoaled.outFile = new PrintWriter(System.out, true);
           
           //open log file
           String filePath = "log.txt";
           Charcoaled.logFile = new PrintWriter(filePath);
           
           //create StartProgramView and start the program
            StartProgramView startProgram = new StartProgramView();
            startProgram.startProgram();
            return;
       } catch (Throwable e){
           System.out.println("Exception: " + e.toString() + 
                   "\nCause: " + e.getCause() + 
                   "\nMessage: " + e.getMessage());
           
           e.printStackTrace();
       }
       
       finally{
           try{
               if (Charcoaled.inFile != null) //used to avoid throwing a NullPointerException in case the file was not open correctly.
                   Charcoaled.inFile.close();
               
               if (Charcoaled.outFile != null)
                   Charcoaled.outFile.close();
               
               if (Charcoaled.logFile != null)
                   Charcoaled.logFile.close();
               
           } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
           }
       }
   }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Charcoaled.outFile = outFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Charcoaled.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Charcoaled.logFile = logFile;
    }

    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(String filePath) {
        Charcoaled.filePath = filePath;
    }
    
}

