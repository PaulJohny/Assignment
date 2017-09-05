/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import Assignment.InsurancePlan.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paul Johny
 */
public class InsuranceController {
     private ArrayList<InsurancePlan> policies;

    public InsuranceController() {
        policies = new ArrayList<>();
    }
    
    
//    public void deletePolicy(InsurancePlan al){
//        policies.remove(al);
//    }
//     
//     
//    
//    public void sorting(InsurrancePlans a3){
//        
//    }
    
//    public InsurancePlan getPolicy(int policyNumber) {
//        return(policies.get(policyNumber));
//        }
    
//    public ArrayList<InsurancePlans> getAllPolicies() {
//        InsurancePlan insurancePlans = policies.get(0);
//        if(insurancePlans.getType() == InsurancePlan.TYPE.VEHICLE){
//            insurancePlans = (VehicleInsurancePolicy) insurancePlans;}
//        if(insurancePlans.getType() == InsurancePlan.TYPE.TRAVEL){
//            insurancePlans = (TravelInsurancePolicy) insurancePlans;}     
//        return(policies);
//    }
    
    public ArrayList<InsurancePlan> getPolicies() {
        return policies;
    }
    
    public void addnewPolicyVehicle(VehicleInsurancePolicy vh1) {
        policies.add(vh1);
        Collections.sort(policies);
        }
    public void addnewPolicyTravel(TravelInsurancePolicy tv1) {
        policies.add(tv1);
        Collections.sort(policies);
        }
}
