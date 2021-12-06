/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainMenu;

import mainMenu.homeScreen;
import TicketPackage.app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;
import TicketPackage.TicketView;
import RestaurantReservation.RestaurantBrowseCntl;
import RestaurantReservation.RestaurantsBrowseUI;

/**
 *
 * @author noellefajt
 */
public class homeController implements ActionListener{

    private homeScreen homeScreen;
    private app app;
    TicketController TicketController;
    TicketModel TicketModel;
    TicketView TicketView;
    RestaurantBrowseCntl RestaurantsCntl;
    RestaurantsBrowseUI RestaurantsView;
    //loginUI = new LoginUI(this);
     //homeScreen userSearchCntl = new homeScreen(this);
    //homeScreen = new homeScreen(this);
    //homeScreen.setVisible(true);
    
    public homeController(){
      
       homeScreen = new homeScreen(this);
       
       homeScreen.tixbtn.addActionListener(this);
       homeScreen.resbtn.addActionListener(this);
       homeScreen.planbtn.addActionListener(this);
       homeScreen.ridebtn.addActionListener(this);
       homeScreen.setVisible(true);
       
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
       
        if(obj == homeScreen.tixbtn){
            TicketModel model = new TicketModel();
            //TicketView view = new TicketView();
            TicketController = new TicketController(model);
            
        }
        else if(obj == homeScreen.resbtn){
            //TicketModel model = new TicketModel();
            //RestaurantsView.setVisible(true);
            
            //TicketView view = new TicketView();
           // RestaurantBrowseCntl = new RestaurantBrowseCntl();
        }
     }
}
