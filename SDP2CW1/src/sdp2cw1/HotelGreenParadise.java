
package sdp2cw1;

import java.util.Scanner;


public class HotelGreenParadise  extends HotelDetails{
    
    public static void main(String []args){
        
        Scanner sc= new Scanner (System.in);
        String UserInput;
        int roomNumber = 1;
        String Customer= null;
        String guest [] = new String [11];
        initialize(guest);
    while(roomNumber < guest.length)  {  
        System.out.println("        Hotel Green Paradise          ");
        System.out.println(" Hotel Green Paradise Booking Options ");
        System.out.println("**************************************");
        System.out.println("  Please Select from Below Options    ");
        System.out.println(" V : To View all rooms        ");
        System.out.println(" A : To Add Customer to a Room");
        System.out.println(" E : To Display Empty rooms   ");
        System.out.println(" D : To Delete Customer from a Room");
        System.out.println(" F : To Find room by Customer Name ");
        System.out.println(" S : Store Program array data into a Plain Text File");
        System.out.println(" L : Load program data back from the file into the array");
        System.out.println(" O : View ordered rooms       ");
        System.out.println(" X : Exit ");
        
    Validation v = new Validation() ;    
        UserInput=sc.next();
   
  
   // v.wrongCharactor(sc, UserInput);
       
        if(UserInput.equalsIgnoreCase("V")){
//pressing V will view all the rooms which is occupied by whom and other empty rooms
            view(guest, Customer);
        }
        
        if(UserInput.equalsIgnoreCase("A")){
//pressing A will add the Customer to the selected room number   
           // Validation v2= new Validation();
            System.out.println("Enter Room number (1-10)"); 
            roomNumber=sc.nextInt();
            //v.StringInputforRoomNumbers(sc, roomNumber);
            //v.NumOnly(sc, roomNumber);
            System.out.println("Enter Name for Reservation room number  " + roomNumber + " : ");
            Customer= sc.next();
            guest[roomNumber]=Customer; //add customer to the room number
            add(guest);
            System.out.println("Thank you for the Reservation");
        }
        
        if(UserInput.equalsIgnoreCase("E")){
//pressing E will show the empty rooms but not the occupied rooms  
            emptyRooms(guest, Customer);
        }
        
        if(UserInput.equalsIgnoreCase("D")){
//Deletes a consumer from the current occupied room   
            view(guest,Customer);
            System.out.println("Enter a room number which you want to delete Customer from : ");
            roomNumber=sc.nextInt();
            guest[roomNumber]="empty";
            delete(guest, Customer);
            System.out.println("Deleted!!");
        }
        
        if(UserInput.equalsIgnoreCase("F")){
//Find room from customer name and links to static void empty  in HotelDetails class    
             find(guest);
             v.nonExistingCustomer(sc, Customer, guest);
        }
        
        if(UserInput.equalsIgnoreCase("S")){
//Store program array data into a plain text file  
            store(guest);
        }
        
        if(UserInput.equalsIgnoreCase("L")){
//Load program data back from the file into the array  
            loadFile(guest);
        }
        
        if(UserInput.equalsIgnoreCase("O")){
// View rooms Ordered alphabetically by name 
            alphabeticallyOrder(guest);
        }
        
        if(UserInput.equalsIgnoreCase("X")){
            System.out.println("Thank you for Coming!!");
            System.exit(0);
        }
        
        }
    }
     
    
}
