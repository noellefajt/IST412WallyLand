/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;

/**
 *
 * @author Dylan
 */
interface Ticket {
    public void scan();

    public String getType();

    public int getPrice();

    public String getID();

    public String getRide();

    public String getTime();
}