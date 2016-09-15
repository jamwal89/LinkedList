import java.io.File;
import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.PrintWriter;





public class LinkedListProgram {
public static void main(String[] args) {
    
	File file = new File("/home/oracle/workspace/LinkedList/src/customers.txt");
    
    LinkedList<CustomerData> cust = new  LinkedList <CustomerData>();
    
    PrintWriter writer =null;
    
    try {
    	Scanner scan= new Scanner(file);
    	scan.useDelimiter("\\t"); 
        writer = new PrintWriter(new File("output.txt"));
        
        CustomerData cd=new CustomerData();
        //scan.nextLine();
        
        while (scan.hasNextLine()){
        	cd.setFullName(scan.next());
        	cd.setSalutation(scan.next());
        	cd.setFirstName(scan.next());
        	cd.setLastName(scan.next());
        	cd.setAddress(scan.next());
        	cd.setCity(scan.next());
        	cd.setState(scan.next());
        	cd.setZipcode(scan.next());
        	cd.setEmail(scan.next());
        	cd.setPosition(scan.next());
        	cd.setCompany(scan.next());
        	
        	scan.nextLine();
        	
        	System.out.println(cd.getFullName());
        	System.out.println(cd.getEmail());
        	
        	
        	cust.add(cd);
        	writer.println(cd.getFullName());
        	writer.println(cd.getEmail());
        	writer.println(cd.getAddress());
        	writer.println(cd.getCompany());
        }
        
    
        
        
        
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    }
    //close the print writer
    writer.close();
    
    
 }
}