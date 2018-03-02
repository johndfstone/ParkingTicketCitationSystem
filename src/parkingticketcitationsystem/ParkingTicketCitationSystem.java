/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingticketcitationsystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ticket.TicketView;

/**
 *
 * @author johndfstone
 */
public class ParkingTicketCitationSystem extends Application {
	
	@Override
	public void start(Stage primaryStage) {

		
		TicketView ticketView = new TicketView();
		
		Scene scene = new Scene(ticketView, 600, 900);
		
		primaryStage.setTitle("Parking Ticket Citation System");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
