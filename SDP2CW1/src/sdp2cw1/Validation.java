
package sdp2cw1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public  class Validation   {
    
    Scanner sc = new Scanner(System.in);
    public void wrongCharactor(Scanner in, String UserInput){
 
         if((!UserInput.equals("V")) 
                || (!UserInput.equals("A")) 
                || (!UserInput.equals("E")) 
                || (!UserInput.equals("D")) 
                || (!UserInput.equals("F")) 
                || (!UserInput.equals("S"))
                || (!UserInput.equals("O")) 
                || (!UserInput.equals("L"))){
            
             JOptionPane.showMessageDialog(null, "Wrong Input !! Please Enter again");
             UserInput=sc.next();
        } 

    }
     
    void StringInputforRoomNumbers(Scanner in ,int roomNumber){
        
        Scanner sc = new Scanner(System.in);
        if(!(sc.hasNextInt())){
             JOptionPane.showMessageDialog(null, "Wrong Input !! Please Enter Room Number again");
             roomNumber=sc.nextInt();
        }
//        if(){
//            
//        }
                
    } 
//      public int  NumOnly(Scanner in, int roomNumber){
//	        
//	        
//	        while (!sc.hasNextInt()) {
//	            System.out.print("Entered value is invalid. Enter again: ");
//	            roomNumber = sc.nextInt();
//	        }
//	        return roomNumber;
//	    }
      
     
      
      public int nonExistingRoomNumber(int roomNumber){
          if(roomNumber>10){
              JOptionPane.showMessageDialog(null, "Non Existing Room Number!!");
              roomNumber=sc.nextInt();
          }return roomNumber;
      }
      
      public void nonExistingCustomer( Scanner input ,String customerName ,String guest[]){
          for(int i=1; i<guest.length; i++){
        if(!(guest[i].equalsIgnoreCase(customerName))){
            JOptionPane.showMessageDialog(null, "Non Existing Customer!!");
            customerName= input.next();
            break;
      }
    }
}
}
