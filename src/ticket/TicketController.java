/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author johndfstone
 */
public class TicketController {

    private TicketModel ticketModel;
    private TicketView ticketView;

    public TicketController(TicketModel ticketModel, TicketView ticketView) {
        this.ticketModel = ticketModel;
        this.ticketView = ticketView;
        attachHandlers();
    }

    public void attachHandlers() {
        // attach handlers for GUI
        ticketView.getIssueBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Get Fields
                String licenseNumber = getTicketView().getLicenseNumberTf().getText();
                String state = getTicketView().getStateTf().getText();
                String permitNumber = getTicketView().getPermitNumberTf().getText();
                String vehicleMakeModel = getTicketView().getVehicleMakeModelTf().getText();
                String color = getTicketView().getColorTf().getText();
                boolean hasNoParkingPermit = getTicketView().getHasNoParkingPermit().isSelected();
                boolean parkedInNoParkingAreaSpace = getTicketView().getParkedInNoParkingAreaSpace().isSelected();
                boolean parkedInFireLane = getTicketView().getParkedInFireLane().isSelected();
                boolean parkedInHandicapSpace = getTicketView().getParkedInHandicapSpace().isSelected();
                boolean parkedInReserveredOrAssignedSpace = getTicketView().getParkedInReserveredOrAssignedSpace().isSelected();
                boolean blockingDrivewayAccessOrOtherVehicle = getTicketView().getBlockingDrivewayAccessOrOtherVehicle().isSelected();
                boolean parkedIn2Spaces = getTicketView().getParkedIn2Spaces().isSelected();
                boolean expiredMeter = getTicketView().getExpiredMeter().isSelected();
                boolean hasOtherProblem = getTicketView().getHasOtherProblem().isSelected();
                String otherProblem = getTicketView().getOtherProblemTf().getText();
                String date = getTicketView().getDateTf().getText();
                String location = getTicketView().getLocationTf().getText();
                String time = getTicketView().getTimeTf().getText();
                String issuer = getTicketView().getIssuerTf().getText();
                Ticket currentTicket = new Ticket(licenseNumber, state, permitNumber, vehicleMakeModel, color, hasNoParkingPermit, parkedInNoParkingAreaSpace, parkedInFireLane, parkedInHandicapSpace, parkedInReserveredOrAssignedSpace, blockingDrivewayAccessOrOtherVehicle, parkedIn2Spaces, expiredMeter, hasOtherProblem, otherProblem, date, location, time, issuer);

                getTicketModel().setCurrentUser(currentTicket);
                getTicketView().clearFields();

            }

        }
        );

        ticketView.getViewBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //set the fields
                Ticket currentTicket = getTicketModel().getCurrentUser();

                getTicketView().updateTicketView(currentTicket);

            }

        }
        );
        ticketView.getViewAllBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //set the fields
                ArrayList<Ticket> currentTickets = getTicketModel().getCurrentUsers();

                getTicketView().updateTicketViewAll(currentTickets);

            }

        }
        );

    }

    public TicketModel getTicketModel() {
        return ticketModel;
    }

    public void setTicketModel(TicketModel ticketModel) {
        this.ticketModel = ticketModel;
    }

    public TicketView getTicketView() {
        return ticketView;
    }

    public void setTicketView(TicketView ticketView) {
        this.ticketView = ticketView;
    }

}
