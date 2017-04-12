
package sdp2cw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HotelDetails  {
    
    static void initialize (String guestHouse []){
        for(int i=1; i<guestHouse.length; i++)
            guestHouse[i] = "empty"; //default value for all array elemnts is "empty"
            System.out.println("--WELCOME TO HOTEL GREEN PARADISE--");
        //if i put braces it will print println statement 10 times
    }
    
 
public static void view(String guest[],String Customer){
    for(int i=1; i<guest.length; i++){

        if(guest[i].equals("empty"))
            System.out.println("Room " + i + "is Empty ");
        else{
            System.out.println("Room " + i + "is reserved by " + guest[i]);
        }

        }    
    }

static void add(String guest[]){
    for(int i=1; i<guest.length;i++){
        if(guest[i].equals("empty"))
            System.out.println("Room " + i + " is Empty " );
        else{
            System.out.println("Room " + i + " is reserved by " + guest[i]);
        }
    }
}
//not working
static void emptyRooms(String guest[] , String Customer){
//    try{
    for(int i=1; i<guest.length; i++){
        int j=0;
        String CustomerName=Customer;
        guest[j]= CustomerName;
        
        if(guest[i].equals("empty")){
            System.out.println("room " + i + " is Empty");
        }
        }
    }
//    catch(Exception e){
//        JOptionPane.showMessageDialog(null, "Wrong Input !! Please Enter again");
//    }


static void delete(String guest[], String Customer){
//    try{
    for(int i=0; i<guest.length; i++){
        int j=0;
	String CustomerName = Customer;
	guest[j]= CustomerName;
	if (guest[i].equals("empty")){ 
            System.out.println( i + "room " + " is empty");
	}else{
            System.out.println("Room " + i + "reserved by "+ guest[i]);
        }
    }
//    } catch(Exception e){
//        
//    }
}
Validation v2=new Validation();
static void find(String guest[]){
// try{   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Customer Name to Search: ");
    String customerName;
    customerName= input.next();
    
    for(int i=1; i<guest.length; i++){
        if(guest[i].equalsIgnoreCase(customerName)){
            System.out.println(customerName +" Reserved " + i + " th room");
        } if(!(guest[i].equalsIgnoreCase(customerName))){            
            JOptionPane.showMessageDialog(null, "Non Existing Customer!!");
            customerName= input.next();
            //use else if
       }  
        
    }
// }catch(Exception e){
//     JOptionPane.showMessageDialog(null, "Wrong Input!! Please Enter again");
// }
}

static void store(String guest[]){
    String temp = "";
    for(String guest1:guest){
        temp+=guest1 + ";" ;
    }
    System.out.println(temp);
    save(temp);
    System.out.println("File Created Success");
}

static void loadFile(String guest[]){
    String fileName="HotelDetails.txt ";
    File f=new File(fileName);
    
        try {
            Scanner sc1=new Scanner (f);
            String code=sc1.next();
            String[] text= code.split(";");
            System.arraycopy(text, 0, guest, 0, text.length);
            
        } catch (FileNotFoundException ex) {
           System.out.println("file not found . Try again");
        }
    System.out.println("File Read Completed");
}
//not working
static void alphabeticallyOrder(String guest[]){
    
    List<String> orderGuest = new ArrayList<>();
    String temp;
    for (int i = 0; i < guest.length; i++) {
	for (int j = i + 1; j < guest.length; j++){
            if (guest[i] != null) {
		if (guest[i].compareTo(guest[j]) > 0) {
                    temp = guest[i];
                    guest[i] = guest[j];
                    guest[j] = temp;
	        }
	    }
	}
}
    System.out.println("Names in alphabetical order : ");
    for (int i = 0; i < guest.length - 1; i++) {
	if (guest[i] != null) {
	    if (guest[i].equals("empty")) {

}  else {
    orderGuest.add(guest[i]);
}

}
}
    orderGuest.add(guest[(guest.length) - 1]);
    orderGuest.stream().forEach((name) -> {
	System.out.println(name);
	});
    
//    ArrayList<String>orderGuest=new ArrayList<>();
//    String temp;
//    guest= new String[orderGuest.size()];
//    guest = orderGuest.toArray(guest);
//    
//    for(String item : guest ){
//        System.out.println("Names in Alphabetical Order : ");
//        System.out.println(item);
//    }
    
    
//   boolean swap = true;
//   int j=0;
//   while(swap){
//       swap=false;
//       j++;
//       for(int i=0; i<guest.length - j; i++){
//           if(guest[i].compareTo(guest[i+1])>0){
//               temp = guest[i];
//               guest[i]=guest[i+1];
//               guest[i+1]=temp;
//               swap=true;
//                System.out.println(guest[i]);
//           }
//       }
//   }
}

public static void save(String r){
        
            String filename="HotelDetails.txt";
            File file = new File(filename);
            FileWriter fw = null;
            PrintWriter pw = null;
        try {   
            fw = new FileWriter(file , true);
            pw = new PrintWriter(fw , true);
            pw.println(r);
            
        }catch(FileNotFoundException e){    
            JOptionPane.showMessageDialog(null, "File not found!!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something wrong with IO Please Check ");
        }
        finally{
            try{
                fw.close();
            }catch(IOException e){
                pw.close();
            }
        }
    }
}