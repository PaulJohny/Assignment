/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import Assignment.InsuranceController;
import java.util.ArrayList;
import java.util.Scanner;


public class InsuranceManagementSystem {
  private static InsuranceController controller;
 
    
  public static void main(String args[]) {
  controller = new InsuranceController();
 
  
  insertPolicy();
 }
  
  public static int showPolicies(String policyNum,int flag) {
      for(InsurancePlan ip : controller.getPolicies()) {
          if(policyNum.equalsIgnoreCase(ip.getPolicynumber())){
              if(ip.getType() == InsurancePlan.TYPE.VEHICLE){
              printPolicyVehicle((VehicleInsurancePolicy)ip);
              flag = 1;}
              if(ip.getType() == InsurancePlan.TYPE.TRAVEL){
              printPolicyTravel((TravelInsurancePolicy)ip);
              flag = 1;}
              
          }
      }
     
      return flag;
      
  }
  public  static void showPolicies() {
      for(InsurancePlan insurancePlans : controller.getPolicies()) {
          
          if(insurancePlans.getType() == InsurancePlan.TYPE.VEHICLE) {
              printPolicyVehicle((VehicleInsurancePolicy) insurancePlans);
            } else if(insurancePlans.getType() == InsurancePlan.TYPE.TRAVEL) {
              printPolicyTravel((TravelInsurancePolicy) insurancePlans);
          }
      }
  }
  
  public  static void displayPolicies() {
      for(InsurancePlan insurancePlans : controller.getPolicies()) {
          
          if(insurancePlans.getType() == InsurancePlan.TYPE.VEHICLE) {
              printPolicyVehicle((VehicleInsurancePolicy) insurancePlans);
            } else if(insurancePlans.getType() == InsurancePlan.TYPE.TRAVEL) {
              printPolicyTravel((TravelInsurancePolicy) insurancePlans);
          }
      }
  }
 
 
private static void printPolicyVehicle(VehicleInsurancePolicy vh1) {
      System.out.println("Policy Number\tInsurer Name\tPolicy Amount\tPolicy Term\tVehicle Owner\tVehicle Number\tVehicle Type");
      System.out.println(vh1.getPolicynumber()+"\t\t"
              +vh1.getInsurerName()+"\t\t"
              +vh1.getPolicyAmount()+"\t\t"
              +vh1.getPolicyTerm()+"\t\t"
              +vh1.getVehicleowner()+"\t\t"
              +vh1.getVehiclenum()+"\t\t"
              +vh1.getVehicletype());
  }
   private static void printPolicyTravel(TravelInsurancePolicy tv1) {
      System.out.println("Policy Number\tInsurer Name\tPolicy Amount\tPolicy Term\tTravel Id\tPassenger Name");
      System.out.println(tv1.getPolicynumber()+"\t\t"
              +tv1.getInsurerName()+"\t\t"
              +tv1.getPolicyAmount()+"\t\t"
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
                
                VehicleInsurancePolicy vehicle = new VehicleInsurancePolicy();
                TravelInsurancePolicy tv = new TravelInsurancePolicy();
                
                    System.out.print("Insurer Name:");
                    String a2 = sc1.next();
                    vehicle.setInsurerName(a2);
                    tv.setInsurerName(a2);
                    System.out.print("Enter the Place:");
                    String place = sc1.next();
                    place =place.substring(0, 3);
                    System.out.print("Policy Amount:");
                    float a3 =sc1.nextFloat();
                    vehicle.setPolicyAmount(a3);
                    tv.setPolicyAmount(a3); 
                    System.out.print("Policy Term:");
                    int a5 = sc1.nextInt();
                    tv.setPolicyTerm(a5);
                    vehicle.setPolicyTerm(a5);
                    String  tempId = Integer.toString(temp_pn);
                    place = place.concat(tempId);
                    ++temp_pn;
                    System.out.println("Enter The typeof  Insurance \n 1:Vehicle Insurance\n 2:Travel Insurance\n");
                    int choice = sc1.nextInt();
                    
                if(choice == 1) {
                    System.out.print("Vehicle Owner:");
                    String a7 = sc1.next();
                    vehicle.setVehicleowner(a7);
                    System.out.print("Enter Vehicle Number:");
                    int ti = sc1.nextInt();
                    vehicle.setVehiclenum(ti);
                    System.out.print("Enter Vehicle Type:");
                    String t4 = sc1.next();
                    vehicle.setVehicletype(t4);
                    vehicle.setPolicynumber(place);
                    controller.addnewPolicyVehicle(vehicle);
                    showPolicies();
//                    System.out.print("Do you want to enter one more entry for vehicle \n1:Yes\n2:No\nEnter Choice:");
//                    choice3 =sc1.nextInt();
                    
                   }
                               
                if(choice == 2){
                    
                    System.out.println("Enter Travel Id");
                    int t1 = sc1.nextInt();
                    tv.setTravelId(t1);
                    System.out.println("Enter Passenger Name:");
                    String str1 = sc1.next();
                    tv.setPassengerName(str1);
                    tv.setPolicynumber(place);
                    controller.addnewPolicyTravel(tv);
                    showPolicies();
                    
                }
            }
            if(choice1 == 2){
                System.out.print("Enter policyNumber to be Searched For:");
                int flag =0;
                String searchId= sc1.next();
                int pn1 = showPolicies(searchId,flag);
                if(pn1 == 0){
                    System.out.println("No Results");
                }
            }
            if(choice1 == 3){
                displayPolicies();
            }
        }
    }
}

                
    


  



 

 

