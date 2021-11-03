/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RidePackage;

import java.util.ArrayList;

/**
 *
 * @author cjm6757
 */
public class RideViewController {
    
    private Ride ride;
    private ArrayList<Ride> rideList = new ArrayList<>();

    public RideViewController(Ride ride) {
        this.ride = ride;
        rideList.add(ride);
    }
    
    public void addRide(Ride ride){
        rideList.add(ride);
    }
    
    public int getRideWait(String rideName){
        if(doesRideExist(rideName)){
            this.ride = rideList.get(getRide(rideName));
            if(!ride.getIsShowType()){
                if(ride.getIsWait()){
                return ride.getWaitTime();
                } else {
                    return 0;
                }
            } else {
                return -2;
            }
        } else {
            return -1; 
        }
    }
    
    public boolean doesRideExist(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
    public int getRide(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    
    //This is just to facilitate basic function
    //It will be more complex, however more development is needed to know what must be added
    
}