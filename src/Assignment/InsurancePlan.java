/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Paul Johny
 */
public abstract class InsurancePlan implements Comparable<InsurancePlan> {
    String policynumber;
    String InsurerName;
    float PolicyAmount;
    int PolicyTerm;
    
    private TYPE type;
    
    public static enum TYPE {
        VEHICLE,
        TRAVEL
    }
    
    InsurancePlan(TYPE type) {
        this.type = type;
    }
    public String getInsurerName() {
        return InsurerName;        
    }

    public void setInsurerName(String InsurerName) {
        this.InsurerName = InsurerName;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    

   

    public float getPolicyAmount() {
        return PolicyAmount;
    }

    public void setPolicyAmount(float PolicyAmount) {
        this.PolicyAmount = PolicyAmount;
    }

    public int getPolicyTerm() {
        return PolicyTerm;
    }

    public void setPolicyTerm(int PolicyTerm) {
        this.PolicyTerm = PolicyTerm;
    }

    public TYPE getType() {
        return type;
    }
    @Override     
    public int compareTo(InsurancePlan insurancePlan) {          
        return (this.getPolicyAmount() < insurancePlan.getPolicyAmount() ? -1 : 
            (this.getPolicyAmount() == insurancePlan.getPolicyAmount() ? 0 : 1));     
  }
}
