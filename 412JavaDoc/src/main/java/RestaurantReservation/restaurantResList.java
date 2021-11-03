/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantReservation;

/**
 *
 * @author noellefajt
 */
import java.util.ArrayList;

public class restaurantResList {
    private ArrayList <restaurantRes> resList = new ArrayList<>();
    
    /**
     * method creates a list of reservations for all the restaurants
     */
    public void createList(){
       
    }
    /**
     * method adds a reservation to the list of reservations
     * @param restaurantRes = restaurant reservation
     */
    public void addRes(String restaurantRes){
        
    }
    
    /**
     * method removes a reservation to the list of reservations
     * @param restaurantRes = restaurant reservation
     */
    public void removeRes(String restaurantRes){
        
    }
    
    /**
     * method updates a reservation to the list of reservations
     * @param restaurantRes = restaurant reservation
     */
    public void updateRes(String restaurantRes){
        
    }
    
    /**
     * prints the restaurant reservation list
     */
    public void printResList(){
        
    }
    
    /**
     * method gets restaurant reservation list
     * @return restaurantRes = restaurant reservation
     */
    public ArrayList<restaurantRes> getResList(){
         ArrayList <restaurantRes> r = new ArrayList<>();
         
        return r;
    }
    
    /**
     * method that checks to see if the reservation the user wants to make is available
     * @param resName = restaurant name
     * @param numPeople = number of people in the reservation party
     * @param resTime = restaurant reservation time
     * @return boolean = true or false depending on if the reservation can be made
     */
    public boolean isAvailable(String resName, int numPeople, String resTime){
        return false;
    }
    
}