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
public class Vehicle extends InsurancePlans implements Comparable<Vehicle>  {
    
    int vehiclenum;
    String vehicletype;
    String vehicleowner;

    public int getVehiclenum() {
        return vehiclenum;
    }

    public void setVehiclenum(int vehiclenum) {
        this.vehiclenum = vehiclenum;
    }

    public String getVehicleowner() {
        return vehicleowner;
    }

    public void setVehicleowner(String vehicleowner) {
        this.vehicleowner = vehicleowner;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }
    
    public Vehicle() {
        super(InsurancePlans.TYPE.VEHICLE);
    }
     @Override     
  public int compareTo(Vehicle veh) {          
    return (this.getPolicyAmount() < veh.getPolicyAmount() ? -1 : 
            (this.getPolicyAmount() == veh.getPolicyAmount() ? 0 : 1));     
  }
}

