/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import Assignment.InsurancePlans.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        Collections.sort(policies);
    }
    public void deletePolicy(Vehicle a1){
//        for (Iterator<Vehicle> it = policies.iterator(); it.hasNext();){
//            Vehicle vh2 = it.next();
//            if(vh2.equals(a1)){
//                policies.remove(a1);
//            }
//        }}
policies.remove(0);
        //if (it.equals(a1)){
           // System.out.println("Treueeeee");}
            //it.remove();
            
//        policies.remove(al);
        
    }
    
    public ArrayList<Vehicle> getAllPolicies() {
        return policies;
    }   
}
