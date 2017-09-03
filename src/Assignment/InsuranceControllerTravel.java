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
public class InsuranceControllerTravel {
    private ArrayList<Travel> policies;
    
    public InsuranceControllerTravel() {
        policies = new ArrayList<>();
    }
    public void addPolicy(Travel al) {
        policies.add(al);
    }
    public void deletePolicy(Travel al){
        policies.remove(al);
    }
    public ArrayList<Travel> getAllPolicies() {
        return policies;
    }
    
}
