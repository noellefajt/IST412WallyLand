/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

/**
 *
 * @author mattu
 */
public class PlannerView {
        /**
     * Simple method to print the user's schedule to them. This data, down the line, will be integrated with the reservation data from the other use cases.
     * @param time
     * @param description 
     */
    public void printDailyEvents(String time, String description){
        System.out.println("You have " + description + " on your schedule today at " + time + ".");
    }
}
