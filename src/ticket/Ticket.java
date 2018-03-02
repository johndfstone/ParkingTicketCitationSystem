/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author johndfstone
 */
public class Ticket {

    private String licenseNumber;
    private String state;
    private String permitNumber;
    private String vehicleMakeModel;
    private String color;
    private boolean hasNoParkingPermit;
    private boolean parkedInNoParkingAreaSpace;
    private boolean parkedInFireLane;
    private boolean parkedInHandicapSpace;
    private boolean parkedInReserveredOrAssignedSpace;
    private boolean blockingDrivewayAccessOrOtherVehicle;
    private boolean parkedIn2Spaces;
    private boolean expiredMeter;
    private boolean hasOtherProblem;
    private String otherProblem;
    private String date;
    private String location;
    private String time;
    private String issuer;

    public Ticket() {
    }

    public Ticket(String licenseNumber, String state, String permitNumber, String vehicleMakeModel, String color, boolean hasNoParkingPermit, boolean parkedInNoParkingAreaSpace, boolean parkedInFireLane, boolean parkedInHandicapSpace, boolean parkedInReserveredOrAssignedSpace, boolean blockingDrivewayAccessOrOtherVehicle, boolean parkedIn2Spaces, boolean expiredMeter, boolean hasOtherProblem, String otherProblem, String date, String location, String time, String issuer) {
        this.licenseNumber = licenseNumber;
        this.state = state;
        this.permitNumber = permitNumber;
        this.vehicleMakeModel = vehicleMakeModel;
        this.color = color;
        this.hasNoParkingPermit = hasNoParkingPermit;
        this.parkedInNoParkingAreaSpace = parkedInNoParkingAreaSpace;
        this.parkedInFireLane = parkedInFireLane;
        this.parkedInHandicapSpace = parkedInHandicapSpace;
        this.parkedInReserveredOrAssignedSpace = parkedInReserveredOrAssignedSpace;
        this.blockingDrivewayAccessOrOtherVehicle = blockingDrivewayAccessOrOtherVehicle;
        this.parkedIn2Spaces = parkedIn2Spaces;
        this.expiredMeter = expiredMeter;
        this.hasOtherProblem = hasOtherProblem;
        this.otherProblem = otherProblem;
        this.date = date;
        this.location = location;
        this.time = time;
        this.issuer = issuer;
    }    
    
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    public String getVehicleMakeModel() {
        return vehicleMakeModel;
    }

    public void setVehicleMakeModel(String vehicleMakeModel) {
        this.vehicleMakeModel = vehicleMakeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasNoParkingPermit() {
        return hasNoParkingPermit;
    }

    public void setHasNoParkingPermit(boolean hasNoParkingPermit) {
        this.hasNoParkingPermit = hasNoParkingPermit;
    }

    public boolean isParkedInNoParkingAreaSpace() {
        return parkedInNoParkingAreaSpace;
    }

    public void setParkedInNoParkingAreaSpace(boolean parkedInNoParkingAreaSpace) {
        this.parkedInNoParkingAreaSpace = parkedInNoParkingAreaSpace;
    }

    public boolean isParkedInFireLane() {
        return parkedInFireLane;
    }

    public void setParkedInFireLane(boolean parkedInFireLane) {
        this.parkedInFireLane = parkedInFireLane;
    }

    public boolean isParkedInHandicapSpace() {
        return parkedInHandicapSpace;
    }

    public void setParkedInHandicapSpace(boolean parkedInHandicapSpace) {
        this.parkedInHandicapSpace = parkedInHandicapSpace;
    }

    public boolean isParkedInReserveredOrAssignedSpace() {
        return parkedInReserveredOrAssignedSpace;
    }

    public void setParkedInReserveredOrAssignedSpace(boolean parkedInReserveredOrAssignedSpace) {
        this.parkedInReserveredOrAssignedSpace = parkedInReserveredOrAssignedSpace;
    }

    public boolean isBlockingDrivewayAccessOrOtherVehicle() {
        return blockingDrivewayAccessOrOtherVehicle;
    }

    public void setBlockingDrivewayAccessOrOtherVehicle(boolean blockingDrivewayAccessOrOtherVehicle) {
        this.blockingDrivewayAccessOrOtherVehicle = blockingDrivewayAccessOrOtherVehicle;
    }

    public boolean isParkedIn2Spaces() {
        return parkedIn2Spaces;
    }

    public void setParkedIn2Spaces(boolean parkedIn2Spaces) {
        this.parkedIn2Spaces = parkedIn2Spaces;
    }

    public boolean isExpiredMeter() {
        return expiredMeter;
    }

    public void setExpiredMeter(boolean expiredMeter) {
        this.expiredMeter = expiredMeter;
    }

    public boolean isHasOtherProblem() {
        return hasOtherProblem;
    }

    public void setHasOtherProblem(boolean hasOtherProblem) {
        this.hasOtherProblem = hasOtherProblem;
    }

    public String getOtherProblem() {
        return otherProblem;
    }

    public void setOtherProblem(String otherProblem) {
        this.otherProblem = otherProblem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }


}
