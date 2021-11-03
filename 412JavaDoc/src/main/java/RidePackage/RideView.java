/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RidePackage;

import java.util.Scanner;

/**
 *
 * @author cjm6757
 */
public class RideView {
    
    private RideViewController cntl;
    private Scanner reader = new Scanner(System.in);

    public RideView(RideViewController cntl) {
        this.cntl = cntl;
    }
    
    public void displayWaitTime(String input){
//        System.out.println("What ride do you want to know the wait time of?");
//        String input = reader.nextLine();
        int wait = cntl.getRideWait(input);
        if(wait > -1){
            System.out.println(input + " wait time is " + wait + " minutes.");
        } else{
            System.out.println("Sorry, " + input + " does not exist as a ride.");
        }
    }
}