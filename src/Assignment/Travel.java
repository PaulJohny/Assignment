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
public class Travel extends InsurancePlans implements Comparable<Travel> {
    
    int travelId;
    String PassengerName;

    public Travel() {
        super(InsurancePlans.TYPE.TRAVEL);
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }
    
    @Override     
    public int compareTo(Travel tra) {          
        return (this.getPolicyAmount() < tra.getPolicyAmount() ? -1 : 
            (this.getPolicyAmount() == tra.getPolicyAmount() ? 0 : 1));     
  }
    
}
