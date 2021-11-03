/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

/**
 * Planner serves as the model in this app.
 * @author mattu
 */
public class Planner {
    private String time;
    private String description;
    
    public Planner(String time, String description){
        /**
         * Constructor for the daily planner
         * @param time dictates the time of the event in the daily planner, description creates a description of the event.
         */
        this.time = time;
        this.description = description;
    }
    
    /**
     * Getter for time variable
     * @return 
     */
    public String getTime(){
        return time;
    }
    
    /**
     * Setter for time variable
     * @param time 
     */
    public void setTime(String time) {
        if(time.equals("4:00am")){
            this.time = "*Invalid*";
        }
        else{
            this.time = time;
        }
    }
    
    /**
     * Getter for description variable
     * @return 
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Setter for description variable
     * @param description 
     */
    public void setDescription(String description){
        if(description.equals("Roller Coaster") || description.equals("Log Flume") || description.equals("Ferris Wheel")){
            this.description = description;
        }
        else{
            this.description = "*Invalid*";
        }
    }
    

}