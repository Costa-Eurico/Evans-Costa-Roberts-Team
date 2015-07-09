/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import charcoaled.Charcoaled;
import java.io.PrintWriter;

/**
 *
 * @author ih8pcs
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Charcoaled.getOutFile();
    private static final PrintWriter logFile = Charcoaled.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "--------------------------------------------------"
                  +"\n -- ERROR -- " + errorMessage
                  +"\n--------------------------------------------------");
        
        //log error
        logFile.println(className + "-" + errorMessage);
    }
/*
    static void display(String mainMenuView, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
