/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannerPackage;

/**
 * The controller is responsible for communicating with the different classes in the app to create a cohesive user experience.
 * @author mattu
 */
public class PlannerController {
    private Planner model;
    private PlannerView view;

    
    /**
     * Constructor in the controller class
     * @param model
     * @param view 
     */
    public PlannerController(Planner model, PlannerView view){
        this.model = model;
        this.view = view;
    }

    /**
     * Set time method
     * @param time 
     */
    public void setTime(String time){
        model.setTime(time);
     }
     
     /**
      * Get time method
      * @return 
      */
     public String getTime(){
         return model.getTime();
     }
     
     /**
      * Set description method
      * @param description 
      */
     public void setDescription(String description){
        model.setDescription(description);  
     }
     
     /**
      * Get description method
      * @return 
      */
     public String getDescription(){
         return model.getDescription();
     } 
     
     /**
      * Method to print the events to the user based on data that can be updated.
      */
     public void displayEvents(){
         System.out.println("You have " + model.getDescription() + " on your schedule today at " + model.getTime() + ".");
     }
     
    
    
}
