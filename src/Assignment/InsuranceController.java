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
    
    public void addPolicy(InsurancePlans al) {
        policies.add(al);
    }
    public void deletePolicy(InsurancePlans al){
        policies.remove(al);
    }
    
//    public void sorting(InsurrancePlans a3){
//        Collections.sort(a3);
//    }
    
//    public InsurancePlans getPolicy(int policyNumber) {
//        return(policies.get(policyNumber));
//        }
    
    public ArrayList<InsurancePlans> getAllPolicies() {
        return policies;
    }
}
