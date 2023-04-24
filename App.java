package suppliers2;
import java.sql.*;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
Scanner sc=new Scanner(System.in);
    	
		do {
    	System.out.println("please enter 1 if you want to see supplier registration ");
    	System.out.println("please enter 2 if you want to see all supplierdetails  ");
    	System.out.println("please enter 3 if you want to  search supplier By Id  ");
    	System.out.println("please enter 4 if you want to update supplier by id  ");
    	System.out.println("please enter 5 if you want to delete supplier by id  ");
    	System.out.println("please enter 6 if you want to exit  ");
    	System.out.println("enter your choice");
    	DaoInterface2 dao2=new daoimpl2();
    	Suppliers s=new Suppliers();  	
    	int option =sc.nextInt();
    	switch(option) { 
    	case 1:
    		s.setSupplierID(4);
    		s.setSupplierName("pavan");
    		s.setDate("12-11-2023");
    		s.setTime("23:45PM");
    		dao2.EnterSupplierDetails(s);
    		break;
    	case 2:
       	 
       	 dao2.ShowAllSupplier();
       	 break;
        case 3:
       	 System.out.println("enter supplier id to search");
       	 int id2=sc.nextInt();
       	  dao2.SearchSupplierById(id2);
       	 break;
        case 4:
       	 System.out.println("enter id to update supplier ");
       	 int id3=sc.nextInt();
       dao2.UpdateSupplierById(id3);
       	 break;
        case 5:
       	 System.out.println("enter  id to delete supplier ");
       	 int id4=sc.nextInt();
       	
       	 dao2.DeleteSupplierById(id4);
       	 break;
       
        case 6:
       	 System.exit(0);
       	 break;
       default :
       	System.out.println("please check your option correctly");
         
   	}	 
   	}while(true);
   	}
}
   	 
//Scanner sc=new Scanner(System.in);
//    	
//		do {
//    	System.out.println("please enter 1 if you want to see patient registration ");
//    	System.out.println("please enter 2 if you want to see all patient  ");
//    	System.out.println("please enter 3 if you want to  search Patient By Id  ");
//    	System.out.println("please enter 4 if you want to search Patient By City  ");
//    	System.out.println("please enter 5 if you want to search patient by age ");
//    	System.out.println("please enter 6 if you want to  recovery status patient  ");
//    	System.out.println("please enter 7 if you want to delete patient  ");
//    	System.out.println("please enter 8 if you want to exit  ");
//    	System.out.println("enter your choice");
//    	DaoInterface dao=new daoimpl();
//    	patient p=new patient();  	
//    	int option =sc.nextInt();
//    	switch(option) {
//    	case 1:
//    		
//        	
//        	 p.setName("mary");
//        	 p.setGender("male");
//        	 p.setCity("hbcolony");
//        	 p.setAddress("vijayawada");
//        	 p.setDateOfAdmission("12-56-4565");
//        	 p.setGuardianName("vijaya");
//        	 p.setGuardianAddress("america");
//        	 p.setAadharNumber("1234543");
//        	 p.setContactNumber("6456765");
//        	 p.setGuardianContactNumber("566778");
//        	 p.setAge(65);
//        	 p.setstatus("unrecovered");
//        	 dao.patientRegistartion(p);
//        	 break;
//         case 2:
//        	 
//        	 dao.showAllPatient();
//        	 break;
//         case 3:
//        	 System.out.println("enter patient id to search");
//        	 int id2=sc.nextInt();
//        	 
//        	 dao.searchPatientById(id2);
//        	 break;
//         case 4:
//        	 System.out.println("enter patient city  to search");
//        	 String city1=sc.next();
//        	
//        	 dao.searchPatientByCity(city1);
//        	 break;
//         case 5:
//        	 System.out.println("enter patient age  to search");
//        	 int age1=sc.nextInt();
//        	
//        	 dao.searchPatientByAge(age1);
//        	 break;
//         case 6:
//        	 System.out.println("enter patient recovery status to update");
//        	 String s=sc.next();
//        	 
//        	 dao.recoveryStatus(s);
//        	 break;
//         case 7:
//        	 System.out.println("enter patient id to delete");
//        	 int id6=sc.nextInt();
//        	 
//        	 dao.deletePatientById(id6);
//        	 break;
//         case 8:
//        	 System.exit(0);
//        	 break;
//        default :
//        	System.out.println("please check your option correctly");
//          
//    	}	 
//    	}while(true);
//    	}
//      }
