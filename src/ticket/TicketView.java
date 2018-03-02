/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

/**
 *
 * @author johndfstone
 */
public class TicketView extends GridPane {

    private Label licenseNumberLabel = new Label("License No.");
    private TextField licenseNumberTf = new TextField();
    private Label stateLabel = new Label("State");
    private TextField stateTf = new TextField();
    private Label permitNumberLabel = new Label("Permit No.");
    private TextField permitNumberTf = new TextField();
    private Label vehicleMakeModelLabel = new Label("Vehicle Make/Model");
    private TextField vehicleMakeModelTf = new TextField();
    private Label colorLabel = new Label("Color");
    private TextField colorTf = new TextField();
    private ToggleGroup problems = new ToggleGroup();
    private RadioButton hasNoParkingPermitRb = new RadioButton("Vehicle has No Parking Permit");
    private RadioButton parkedInNoParkingAreaSpaceRb = new RadioButton("Parked in No Parking Area/Space");
    private RadioButton parkedInFireLaneRb = new RadioButton("Parked in Fire Lane");
    private RadioButton parkedInHandicapSpaceRb = new RadioButton("Parked in Handicap Space");
    private RadioButton parkedInReserveredOrAssignedSpaceRb = new RadioButton("Parked in Reserved or Assigned Space");
    private RadioButton blockingDrivewayAccessOrOtherVehicleRb = new RadioButton("Blocking Driveway, Access, or Other Vehicle");
    private RadioButton parkedIn2SpacesRb = new RadioButton("Parked in 2 Spaces");
    private RadioButton expiredMeterRb = new RadioButton("Expired Meter");
    private RadioButton hasOtherProblemRb = new RadioButton("Other");
    private TextField otherProblemTf = new TextField();
    private Label dateLabel = new Label("Date:");
    private TextField dateTf = new TextField();
    private Label locationLabel = new Label("Location:");
    private TextField locationTf = new TextField();
    private Label timeLabel = new Label("Time:");
    private TextField timeTf = new TextField();
    private Label issuerLabel = new Label("Issued By:");
    private TextField issuerTf = new TextField();
    private Button issueBtn = new Button("Issue ticket");
    private Button viewBtn = new Button("View data");
    private Button viewAllBtn = new Button("View all data");
    private Label textArealLabel = new Label("Show All:");
    private TextArea AllUsersTA = new TextArea();

    public TicketView() {
        this.addRow(0, licenseNumberLabel, licenseNumberTf);
        this.addRow(1, stateLabel, stateTf);
        this.addRow(2, permitNumberLabel, permitNumberTf);
        this.addRow(3, vehicleMakeModelLabel, vehicleMakeModelTf);
        this.addRow(4, colorLabel, colorTf);
        hasNoParkingPermitRb.setToggleGroup(problems);
        parkedInNoParkingAreaSpaceRb.setToggleGroup(problems);
        parkedInFireLaneRb.setToggleGroup(problems);
        parkedInHandicapSpaceRb.setToggleGroup(problems);
        parkedInReserveredOrAssignedSpaceRb.setToggleGroup(problems);
        blockingDrivewayAccessOrOtherVehicleRb.setToggleGroup(problems);
        parkedIn2SpacesRb.setToggleGroup(problems);
        expiredMeterRb.setToggleGroup(problems);
        hasOtherProblemRb.setToggleGroup(problems);
        this.addRow(5, hasNoParkingPermitRb);
        this.addRow(6, parkedInNoParkingAreaSpaceRb);
        this.addRow(7, parkedInFireLaneRb);
        this.addRow(8, parkedInHandicapSpaceRb);
        this.addRow(9, parkedInReserveredOrAssignedSpaceRb);
        this.addRow(10, blockingDrivewayAccessOrOtherVehicleRb);
        this.addRow(11, parkedIn2SpacesRb);
        this.addRow(12, expiredMeterRb);
        this.addRow(13, hasOtherProblemRb, otherProblemTf);
        this.addRow(14, dateLabel, dateTf);
        this.addRow(15, locationLabel, locationTf);
        this.addRow(16, timeLabel, timeTf);
        this.addRow(17, issuerLabel, issuerTf);
        this.addRow(18, issueBtn);
        this.addRow(19, viewBtn);
        this.addRow(20, viewAllBtn);

    }

     public void updateTicketView(Ticket currentUser) {

        String licenseNumber = currentUser.getLicenseNumber();
        String state = currentUser.getState();
        String permitNumber = currentUser.getPermitNumber();
        String vehicleMakeModel = currentUser.getVehicleMakeModel();
        String color = currentUser.getColor();
        boolean hasNoParkingPermit = currentUser.isHasNoParkingPermit();
        boolean parkedInNoParkingAreaSpace = currentUser.isParkedInNoParkingAreaSpace();
        boolean parkedInFireLane = currentUser.isParkedInFireLane();
        boolean parkedInHandicapSpace = currentUser.isParkedInHandicapSpace();
        boolean parkedInReserveredOrAssignedSpace = currentUser.isParkedInReserveredOrAssignedSpace();
        boolean blockingDrivewayAccessOrOtherVehicle = currentUser.isBlockingDrivewayAccessOrOtherVehicle();
        boolean parkedIn2Spaces = currentUser.isParkedIn2Spaces();
        boolean expiredMeter = currentUser.isExpiredMeter();
        boolean hasOtherProblem = currentUser.isHasOtherProblem();
        String otherProblem = currentUser.getOtherProblem();
        String date = currentUser.getDate();
        String location = currentUser.getLocation();
        String time = currentUser.getTime();
        String issuer = currentUser.getIssuer();

        this.getChildren().clear();
        this.addRow(0, licenseNumberLabel, licenseNumberTf);
        licenseNumberTf.setText(licenseNumber);

        this.addRow(1, stateLabel, stateTf);
        stateTf.setText(state);

        this.addRow(2, permitNumberLabel, permitNumberTf);
        permitNumberTf.setText(permitNumber);

        this.addRow(3, vehicleMakeModelLabel, vehicleMakeModelTf);
        vehicleMakeModelTf.setText(vehicleMakeModel);

        this.addRow(4, colorLabel, colorTf);
        colorTf.setText(color);

        this.addRow(5, hasNoParkingPermitRb);
        hasNoParkingPermitRb.setSelected(hasNoParkingPermit);

        this.addRow(6, parkedInNoParkingAreaSpaceRb);
        parkedInNoParkingAreaSpaceRb.setSelected(parkedInNoParkingAreaSpace);

        this.addRow(7, parkedInFireLaneRb);
        parkedInFireLaneRb.setSelected(parkedInFireLane);

        this.addRow(8, parkedInHandicapSpaceRb);
        parkedInHandicapSpaceRb.setSelected(parkedInHandicapSpace);

        this.addRow(9, parkedInReserveredOrAssignedSpaceRb);
        parkedInReserveredOrAssignedSpaceRb.setSelected(parkedInReserveredOrAssignedSpace);

        this.addRow(10, parkedInReserveredOrAssignedSpaceRb);
        parkedInReserveredOrAssignedSpaceRb.setSelected(parkedInReserveredOrAssignedSpace);

        this.addRow(11, blockingDrivewayAccessOrOtherVehicleRb);
        blockingDrivewayAccessOrOtherVehicleRb.setSelected(blockingDrivewayAccessOrOtherVehicle);

        this.addRow(12, parkedIn2SpacesRb);
        parkedIn2SpacesRb.setSelected(parkedIn2Spaces);

        this.addRow(13, expiredMeterRb);
        expiredMeterRb.setSelected(expiredMeter);

        this.addRow(14, hasOtherProblemRb, otherProblemTf);
        hasOtherProblemRb.setSelected(hasOtherProblem);
        otherProblemTf.setText(otherProblem);

        this.addRow(15, dateLabel, dateTf);
        dateTf.setText(date);

        this.addRow(16, locationLabel, locationTf);
        locationTf.setText(location);

        this.addRow(17, timeLabel, timeTf);
        timeTf.setText(time);

        this.addRow(18, issuerLabel, issuerTf);
        issuerTf.setText(issuer);

        this.addRow(19, issueBtn);
        this.addRow(20, getViewBtn());
    }

    public void updateTicketViewAll(ArrayList<Ticket> allUsers) {
        String licenseNumber = "";
        String state = "";
        String permitNumber = "";
        String vehicleMakeModel = "";
        String color = "";
        boolean hasNoParkingPermit;
        boolean parkedInNoParkingAreaSpace;
        boolean parkedInFireLane;
        boolean parkedInHandicapSpace;
        boolean parkedInReserveredOrAssignedSpace;
        boolean blockingDrivewayAccessOrOtherVehicle;
        boolean parkedIn2Spaces;
        boolean expiredMeter;
        boolean hasOtherProblem;
        String otherProblem = "";
        String date = "";
        String location = "";
        String time = "";
        String issuer = "";
        String allusers = "";

        for (int i = 0; i < allUsers.size(); i++) {
            Ticket current = (Ticket) allUsers.get(i);
            licenseNumber = current.getLicenseNumber();
            state = current.getState();
            permitNumber = current.getPermitNumber();
            vehicleMakeModel = current.getVehicleMakeModel();
            color = current.getColor();
            hasNoParkingPermit = current.isHasNoParkingPermit();
            parkedInNoParkingAreaSpace = current.isParkedInNoParkingAreaSpace();
            parkedInFireLane = current.isParkedInFireLane();
            parkedInHandicapSpace = current.isParkedInHandicapSpace();
            parkedInReserveredOrAssignedSpace = current.isParkedInReserveredOrAssignedSpace();
            blockingDrivewayAccessOrOtherVehicle = current.isBlockingDrivewayAccessOrOtherVehicle();
            parkedIn2Spaces = current.isParkedIn2Spaces();
            expiredMeter = current.isExpiredMeter();
            hasOtherProblem = current.isHasOtherProblem();
            otherProblem = current.getOtherProblem();
            date = current.getDate();
            location = current.getLocation();
            time = current.getTime();
            issuer = current.getIssuer();

            allusers += licenseNumber + " " + state + " " + permitNumber + " " + vehicleMakeModel
                    + " " + color + " " + otherProblem + " " + date + " " + location + " " + time + " " + issuer + "\n";
        }

        this.getChildren().clear();
        this.addRow(0, licenseNumberLabel, licenseNumberTf);
        this.addRow(1, stateLabel, stateTf);
        this.addRow(2, permitNumberLabel, permitNumberTf);
        this.addRow(3, vehicleMakeModelLabel, vehicleMakeModelTf);
        this.addRow(4, colorLabel, colorTf);
        hasNoParkingPermitRb.setToggleGroup(problems);
        parkedInNoParkingAreaSpaceRb.setToggleGroup(problems);
        parkedInFireLaneRb.setToggleGroup(problems);
        parkedInHandicapSpaceRb.setToggleGroup(problems);
        parkedInReserveredOrAssignedSpaceRb.setToggleGroup(problems);
        blockingDrivewayAccessOrOtherVehicleRb.setToggleGroup(problems);
        parkedIn2SpacesRb.setToggleGroup(problems);
        expiredMeterRb.setToggleGroup(problems);
        hasOtherProblemRb.setToggleGroup(problems);
        this.addRow(5, hasNoParkingPermitRb);
        this.addRow(6, parkedInNoParkingAreaSpaceRb);
        this.addRow(7, parkedInFireLaneRb);
        this.addRow(8, parkedInHandicapSpaceRb);
        this.addRow(9, parkedInReserveredOrAssignedSpaceRb);
        this.addRow(10, blockingDrivewayAccessOrOtherVehicleRb);
        this.addRow(11, parkedIn2SpacesRb);
        this.addRow(12, expiredMeterRb);
        this.addRow(13, hasOtherProblemRb, otherProblemTf);
        this.addRow(14, dateLabel, dateTf);
        this.addRow(15, locationLabel, locationTf);
        this.addRow(16, timeLabel, timeTf);
        this.addRow(17, issuerLabel, issuerTf);
        this.addRow(18, issueBtn);
        this.addRow(19, viewBtn);
        this.addRow(20, viewAllBtn);
        AllUsersTA.setText(allusers);
        this.addRow(21, AllUsersTA);

    }

    public void clearFields() {
        licenseNumberTf.clear();
        stateTf.clear();
        permitNumberTf.clear();
        vehicleMakeModelTf.clear();
        colorTf.clear();
        otherProblemTf.clear();
        dateTf.clear();
        locationTf.clear();
        timeTf.clear();
        issuerTf.clear();
    }

    public Label getLicenseNumberLabel() {
        return licenseNumberLabel;
    }

    public void setLicenseNumberLabel(Label licenseNumberLabel) {
        this.licenseNumberLabel = licenseNumberLabel;
    }

    public TextField getLicenseNumberTf() {
        return licenseNumberTf;
    }

    public void setLicenseNumberTf(TextField licenseNumberTf) {
        this.licenseNumberTf = licenseNumberTf;
    }

    public Label getStateLabel() {
        return stateLabel;
    }

    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    public TextField getStateTf() {
        return stateTf;
    }

    public void setStateTf(TextField stateTf) {
        this.stateTf = stateTf;
    }

    public Label getPermitNumberLabel() {
        return permitNumberLabel;
    }

    public void setPermitNumberLabel(Label permitNumberLabel) {
        this.permitNumberLabel = permitNumberLabel;
    }

    public TextField getPermitNumberTf() {
        return permitNumberTf;
    }

    public void setPermitNumberTf(TextField permitNumberTf) {
        this.permitNumberTf = permitNumberTf;
    }

    public Label getVehicleMakeModelLabel() {
        return vehicleMakeModelLabel;
    }

    public void setVehicleMakeModelLabel(Label vehicleMakeModelLabel) {
        this.vehicleMakeModelLabel = vehicleMakeModelLabel;
    }

    public TextField getVehicleMakeModelTf() {
        return vehicleMakeModelTf;
    }

    public void setVehicleMakeModelTf(TextField vehicleMakeModelTf) {
        this.vehicleMakeModelTf = vehicleMakeModelTf;
    }

    public Label getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    public TextField getColorTf() {
        return colorTf;
    }

    public void setColorTf(TextField colorTf) {
        this.colorTf = colorTf;
    }

    public ToggleGroup getProblems() {
        return problems;
    }

    public void setProblems(ToggleGroup problems) {
        this.problems = problems;
    }

    public RadioButton getHasNoParkingPermit() {
        return hasNoParkingPermitRb;
    }

    public void setHasNoParkingPermit(RadioButton hasNoParkingPermit) {
        this.hasNoParkingPermitRb = hasNoParkingPermit;
    }

    public RadioButton getParkedInNoParkingAreaSpace() {
        return parkedInNoParkingAreaSpaceRb;
    }

    public void setParkedInNoParkingAreaSpace(RadioButton parkedInNoParkingAreaSpace) {
        this.parkedInNoParkingAreaSpaceRb = parkedInNoParkingAreaSpace;
    }

    public RadioButton getParkedInFireLane() {
        return parkedInFireLaneRb;
    }

    public void setParkedInFireLane(RadioButton parkedInFireLane) {
        this.parkedInFireLaneRb = parkedInFireLane;
    }

    public RadioButton getParkedInHandicapSpace() {
        return parkedInHandicapSpaceRb;
    }

    public void setParkedInHandicapSpace(RadioButton parkedInHandicapSpace) {
        this.parkedInHandicapSpaceRb = parkedInHandicapSpace;
    }

    public RadioButton getParkedInReserveredOrAssignedSpace() {
        return parkedInReserveredOrAssignedSpaceRb;
    }

    public void setParkedInReserveredOrAssignedSpace(RadioButton parkedInReserveredOrAssignedSpace) {
        this.parkedInReserveredOrAssignedSpaceRb = parkedInReserveredOrAssignedSpace;
    }

    public RadioButton getBlockingDrivewayAccessOrOtherVehicle() {
        return blockingDrivewayAccessOrOtherVehicleRb;
    }

    public void setBlockingDrivewayAccessOrOtherVehicle(RadioButton blockingDrivewayAccessOrOtherVehicle) {
        this.blockingDrivewayAccessOrOtherVehicleRb = blockingDrivewayAccessOrOtherVehicle;
    }

    public RadioButton getParkedIn2Spaces() {
        return parkedIn2SpacesRb;
    }

    public void setParkedIn2Spaces(RadioButton parkedIn2Spaces) {
        this.parkedIn2SpacesRb = parkedIn2Spaces;
    }

    public RadioButton getExpiredMeter() {
        return expiredMeterRb;
    }

    public void setExpiredMeter(RadioButton expiredMeter) {
        this.expiredMeterRb = expiredMeter;
    }

    public RadioButton getHasOtherProblem() {
        return hasOtherProblemRb;
    }

    public void setHasOtherProblem(RadioButton hasOtherProblem) {
        this.hasOtherProblemRb = hasOtherProblem;
    }

    public TextField getOtherProblemTf() {
        return otherProblemTf;
    }

    public void setOtherProblemTf(TextField otherProblemTf) {
        this.otherProblemTf = otherProblemTf;
    }

    public Label getDateLabel() {
        return dateLabel;
    }

    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    public TextField getDateTf() {
        return dateTf;
    }

    public void setDateTf(TextField dateTf) {
        this.dateTf = dateTf;
    }

    public Label getLocationLabel() {
        return locationLabel;
    }

    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    public TextField getLocationTf() {
        return locationTf;
    }

    public void setLocationTf(TextField locationTf) {
        this.locationTf = locationTf;
    }

    public Label getTimeLabel() {
        return timeLabel;
    }

    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    public TextField getTimeTf() {
        return timeTf;
    }

    public void setTimeTf(TextField timeTf) {
        this.timeTf = timeTf;
    }

    public Label getIssuerLabel() {
        return issuerLabel;
    }

    public void setIssuerLabel(Label issuerLabel) {
        this.issuerLabel = issuerLabel;
    }

    public TextField getIssuerTf() {
        return issuerTf;
    }

    public void setIssuerTf(TextField issuerTf) {
        this.issuerTf = issuerTf;
    }

    public Button getIssueBtn() {
        return issueBtn;
    }

    public void setIssueBtn(Button issueBtn) {
        this.issueBtn = issueBtn;
    }

    public Button getViewAllBtn() {
        return viewAllBtn;
    }

    public void setViewAllBtn(Button viewAllBtn) {
        this.viewAllBtn = viewAllBtn;
    }

    public Button getViewBtn() {
        return viewBtn;
    }

    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }

    public Label getTextArealLabel() {
        return textArealLabel;
    }

    public void setTextArealLabel(Label textArealLabel) {
        this.textArealLabel = textArealLabel;
    }

    public TextArea getAllUsersTA() {
        return AllUsersTA;
    }

    public void setAllUsersTA(TextArea AllUsersTA) {
        this.AllUsersTA = AllUsersTA;
    }

}
