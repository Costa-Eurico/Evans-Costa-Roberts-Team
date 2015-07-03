/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

/**
 *
 * @author ih8pcs
 */
public class MapView extends View {

    public MapView() {
    promptMessage = "\n"
            + "\n----------------------------------------------"
            + "\n|  F1R1  |  F1R2  |  F1R3  |  F1R4  |  F1R5  |"
            + "\n----------------------------------------------"
            + "\n|  F2R1  |  F2R2  |  F2R3  |  F2R4  |  F2R5  |"
            + "\n----------------------------------------------"
            + "\n|  F3R1  |  F3R2  |  F3R3  |  F3R4  |  F3R5  |"
            + "\n----------------------------------------------"
            + "\n|  F4R1  |  F4R2  |  F4R3  |  F4R4  |  F4R5  |"
            + "\n----------------------------------------------"
            + "\n|  F5R1  |  F5R2  |  F5R3  |  F5R4  |  F5R5  |"
            + "\n----------------------------------------------"
            + "\n******************************************************************"
            + "\n| You are located at insert Room # and Floor#                    |"
            + "\n******************************************************************"
            + "\n Z - Zoom in on Room"
            + "\n X - Exit Map View";
        } 
    
    @Override
    public void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
                case 'z': //display help menu
                this.roomView();
                break;
            case 'x': //exit the program
                return;
                default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
            }
        }

    private void roomView() {
        RoomView RoomView = new RoomView();
        RoomView.display();
    }
}
