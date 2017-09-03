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
public class InsuranceControllerVehicle {
    private ArrayList<Vehicle> policies;
    
    public InsuranceControllerVehicle() {
        policies = new ArrayList<>();
    }
    public void addPolicy(Vehicle al) {
        policies.add(al);
    }
    public void deletePolicy(Vehicle al){
        policies.remove(al);
    }
    public ArrayList<Vehicle> getAllPolicies() {
        return policies;
    }
    
}
