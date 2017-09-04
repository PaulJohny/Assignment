/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import Assignment.InsurancePlans.*;
import java.util.ArrayList;

/**
 *
 * @author Paul Johny
 */
public class InsuranceController {
     private ArrayList<InsurancePlans> policies;

    public InsuranceController() {
        policies = new ArrayList<>();
    }
    
    
//    public void deletePolicy(InsurancePlans al){
//        policies.remove(al);
//    }
//     
//     
//    
//    public void sorting(InsurrancePlans a3){
//        Collections.sort(a3);
//    }
    
//    public InsurancePlans getPolicy(int policyNumber) {
//        return(policies.get(policyNumber));
//        }
    
//    public ArrayList<InsurancePlans> getAllPolicies() {
//        InsurancePlans insurancePlans = policies.get(0);
//        if(insurancePlans.getType() == InsurancePlans.TYPE.VEHICLE){
//            insurancePlans = (Vehicle) insurancePlans;}
//        if(insurancePlans.getType() == InsurancePlans.TYPE.TRAVEL){
//            insurancePlans = (Travel) insurancePlans;}     
//        return(policies);
//    }
    
    public ArrayList<InsurancePlans> getPolicies() {
        return policies;
    }
    
    public void addnewPolicyVehicle(Vehicle vh1) {
        policies.add(vh1);
        }
    public void addnewPolicyTravel(Travel tv1) {
        policies.add(tv1);
        }
}
