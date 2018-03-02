/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;

/**
 *
 * @author johndfstone
 */
public class TicketModel {

    ArrayList<Ticket> ticketDB = new ArrayList<>();
    Ticket currentTicket = new Ticket();

    public void setCurrentUser(Ticket currentTicket) {
        this.currentTicket = currentTicket;
        ticketDB.add(currentTicket);
    }

    public Ticket getCurrentUser() {
        return currentTicket;
    }

    public ArrayList<Ticket> getCurrentUsers() {
        return ticketDB;
    }

}
