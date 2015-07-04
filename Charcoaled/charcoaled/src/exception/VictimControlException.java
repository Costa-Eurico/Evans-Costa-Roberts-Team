/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;



public class VictimControlException extends Exception{

    public VictimControlException() {
    }

    public VictimControlException(String message) {
        super(message);
    }

    public VictimControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public VictimControlException(Throwable cause) {
        super(cause);
    }

    public VictimControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
