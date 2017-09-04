/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import Assignment.InsuranceController;
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {
  private static InsuranceController controller;
 
    
  public static void main(String args[]) {
  controller = new InsuranceController();
 
  
  insertPolicy();
 }
  
  public static void showPolicies(int policyNum) {
      for(InsurancePlans ip : controller.getPolicies()) {
          if(policyNum == ip.getPolicynumber()){
              if(ip.getType() == InsurancePlans.TYPE.VEHICLE){
              printPolicyVehicle((Vehicle)ip);}
              
          }
      }
      for(InsurancePlans ip : controller.getPolicies()) {
          if(policyNum == ip.getPolicynumber()){
              if(ip.getType() == InsurancePlans.TYPE.TRAVEL){
              printPolicyTravel((Travel)ip);}
              
          }
      }
      
  }
  
  public  static void displayPolicies() {
      for(InsurancePlans insurancePlans : controller.getPolicies()) {
          System.out.println("fasdasd");
          if(insurancePlans.getType() == InsurancePlans.TYPE.VEHICLE) {
              printPolicyVehicle((Vehicle) insurancePlans);
            } else if(insurancePlans.getType() == InsurancePlans.TYPE.TRAVEL) {
              printPolicyTravel((Travel) insurancePlans);
          }
      }
  }
 
//  public static void showPolicies() {
//      for(Vehicle vh1 : controller1.getAllPolicies()) {
//              printPolicyVehicle(vh1);
//          
//      }
//      for(Travel tv1 : controller2.getAllPolicies()) {
//          printPolicyTravel(tv1);
//          
//      }
//  }
private static void printPolicyVehicle(Vehicle vh1) {
      System.out.println("Policy Number\tInsurer Name\tPolicy Amount\tPolicyIntrest\tPolicy Term\tVehicle Owner\tVehicle Number\tVehicle Type");
      System.out.println(vh1.getPolicynumber()+"\t\t"
              +vh1.getInsurerName()+"\t\t"
              +vh1.getPolicyAmount()+"\t\t"
              +vh1.getInterest()+"\t\t"
              +vh1.getPolicyTerm()+"\t\t"
              +vh1.getVehicleowner()+"\t\t"
              +vh1.getVehiclenum()+"\t\t"
              +vh1.getVehicletype());
  }
   private static void printPolicyTravel(Travel tv1) {
      System.out.println("Policy Number\tInsurer Name\tPolicy Amount\tPolicyIntrest\tPolicy Term\tTravel Id\tPassenger Name");
      System.out.println(tv1.getPolicynumber()+"\t\t"
              +tv1.getInsurerName()+"\t\t"
              +tv1.getPolicyAmount()+"\t\t"
              +tv1.getInterest()+"\t\t"
              +tv1.getPolicyTerm()+"\t\t"
              +tv1.getTravelId()+"\t\t"
              +tv1.getPassengerName());
   

  }
  
  private static void insertPolicy() {
            Scanner sc1= new Scanner(System.in);
            int temp_pn =1000;
            System.out.println("Welcome To Insurance Management System!!!");
            int choice1 = 1;
            while(choice1 !=4){
            System.out.print("Enetr Your Choice\n 1:Create Policy \n 2:Search\n 3:View Policy's \n 4:Exit\n Enter HERE:");
            choice1= sc1.nextInt();
            if(choice1 == 1){
                System.out.println("Enter The typeof  Insurance \n 1:Vehicle Insurance\n 2:Travel Insurance\n");
                int choice = sc1.nextInt();
                Vehicle vehicle = new Vehicle();
                
                if(choice == 1){
                    
                    System.out.print("Insurer Name:");
                    String a2 = sc1.next();
                    vehicle.setInsurerName(a2);
                    System.out.print("Policy Amount:");
                    float a3 =sc1.nextFloat();
                    vehicle.setPolicyAmount(a3);
                    System.out.print("Policy Intrest  Rate:");
                    float a4 = sc1.nextFloat();
                    vehicle.setInterest(a4);
                    System.out.print("Policy Term:");
                    int a5 = sc1.nextInt();
                    vehicle.setPolicyTerm(a5);
                    System.out.print("Vehicle Owner:");
                    String a7 = sc1.next();
                    vehicle.setVehicleowner(a7);
                    System.out.print("Enter Vehicle Number:");
                    int ti = sc1.nextInt();
                    vehicle.setVehiclenum(ti);
                    System.out.print("Enter Vehicle Type:");
                    String t4 = sc1.next();
                    vehicle.setVehicletype(t4);
                    vehicle.setPolicynumber(++temp_pn);
                    
                    controller.addnewPolicyVehicle(vehicle);
                    System.out.println("doner");
                    displayPolicies();
                }
                               
                if(choice == 2){
                    Travel tv = new Travel();
                    System.out.print("Insurer Name:");
                    String a2 = sc1.next();
                    tv.setInsurerName(a2);
                    System.out.println("Policy Amount:");
                    float a3 =sc1.nextFloat();
                    tv.setPolicyAmount(a3);
                    System.out.println("Policy Intrest  Rate:");
                    float a4 = sc1.nextFloat();
                    tv.setInterest(a4);
                    System.out.println("Policy Term:");
                    int a5 = sc1.nextInt();
                    tv.setPolicyTerm(a5);
                    System.out.println("Enter Travel Id");
                    int t1 = sc1.nextInt();
                    tv.setTravelId(t1);
                    System.out.println("Enter Passenger Name:");
                    String str1 = sc1.next();
                    tv.setPassengerName(str1);
                    tv.setPolicynumber(++temp_pn);
                    controller.addnewPolicyTravel(tv);
                    displayPolicies();
                    
                }
            }
               
            
            if(choice1 == 2){
                System.out.print("Enter policyNumber to be Searched For:");
                int flag =1;
                int pn = sc1.nextInt();
                showPolicies(pn);
//                if(flag1 == 1){
//                    System.out.println("No Results");
//                }
//            }
//            if(choice1 == 3){
//                showPolicies();
//            }
           
        
        
    }
}
  }}
                
    


  



 

 

