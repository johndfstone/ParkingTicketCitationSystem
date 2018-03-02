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

 /*

I can't deal with this write now.  I'm already discouraged thinking I'll only ever be marginally employed because I'm too shy to work in groups and I'm too old -- I'm told I was supposed to have already know github in high school -- thanks, that just makes me feel worse -- and github didn't exist when I was in high school, which means I'm too old to get a job and by my age I was supposed to have stopped programming and gone into management, which I'll never do because the whole point of studying programming was not to have to work with people and I can't follow anything during any lecture and I just learned that there's a warrant for my arrest because I didn't pay a fine because I can't follow anything that's going on when I get pulled over either.  I never want to start driving again.

*/   public ArrayList<Ticket> getCurrentUsers() {
        return ticketDB;
    }

}

