/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tworope.reactor.ticket.dto;

import java.util.Date;

/**
 *
 * @author kelvinashu
 */
public class TicketDTO {
    private Date creationDate;
    private double ticketPrice;
    private Date departureDate;
    private Date arrivalDate;
    private int seatNumber;
    private String status;
    private String title;
    private String names;
    private  String surname;
    private String phoneNumber;
    private String email;
    private String gender;
    private String disability;
    private boolean hasInfant;
    private String emergencyContactNames;
    private String emergencyContactCellNumber;
    private String emergencyContactRelationship;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public boolean isHasInfant() {
        return hasInfant;
    }

    public void setHasInfant(boolean hasInfant) {
        this.hasInfant = hasInfant;
    }
    
    public String getEmergencyContactNames() {
        return emergencyContactNames;
    }

    public void setEmergencyContactNames(String emergencyContactNames) {
        this.emergencyContactNames = emergencyContactNames;
    }

    public String getEmergencyContactCellNumber() {
        return emergencyContactCellNumber;
    }

    public void setEmergencyContactCellNumber(String emergencyContactCellNumber) {
        this.emergencyContactCellNumber = emergencyContactCellNumber;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }
    
}
