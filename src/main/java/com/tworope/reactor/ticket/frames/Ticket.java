/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tworope.reactor.ticket.frames;

import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.VertexFrame;
import java.util.Date;

/**
 *
 * @author kelvinashu
 */
public interface Ticket extends VertexFrame {

    @Property("creation_date")
    public Date getCreationDate();

    @Property("creation_date")
    public void setCreationDate(Date creationDate);
    
    @Property("ticket_price")
    public double getTicketPrice();
    
    @Property("ticket_price")
    public void setTicketPrice(double ticketPrice);
    
    @Property("departure_date")
    public Date getDepartureDate();
    
    @Property("departure_date")
    public void setDepartureDate(Date departureDate);
    
    @Property("arrival_date")
    public Date getArrivalDate();
    
    @Property("arrival_date")
    public void setArrivalDate(Date arrivalDate);
    
    @Property("seat_number")
    public int getSeatNumber();
    
    @Property("seat_number")
    public void setSeatNumber(int seatNumber);
    
    @Property("status")
    public String getStatus();
    
    @Property("status")
    public void setStatus(String status);
    
    @Property("title")
    public String getTitle();
    
    @Property("title")
    public void setTitle(String title);
    
    @Property("names")
    public String getNames();
    
    @Property("names")
    public void setNames(String names);
    
    @Property("surname")
    public String getSurname();
    
    @Property("surname")
    public void setSurname(String surname);
    
    @Property("phone_number")
    public String getPhoneNumber();
    
    @Property("phone_number")
    public void setPhoneNumber(String phoneNumber);
    
    @Property("email")
    public String getEmail();
    
    @Property("email")
    public void setEmail(String email);
    
    @Property("gender")
    public String getGender();
    
    @Property("gender")
    public void setGender(String gender);
    
    @Property("disability")
    public String getDisability();
    
    @Property("disability")
    public void setDisability(String disability);
    
    @Property("emergency_contact_names")
    public String getEmergencyContactNames();
    
    @Property("emergency_contact_names")
    public void setEmergencyContactNames(String emergencyContactNames);
    
    @Property("emergency_contact_cell_number")
    public String getEmergencyContactCellNumber();
    
    @Property("emergency_contact_cell_number")
    public void setEmergencyContactCellNumber(String emergencyContactCellNumber);
    
    @Property("emergency_contact_relationship")
    public String getEmergencyContactRelationship();
    
    @Property("emergency_contact_relationship")
    public void setEmergencyContactRelationship(String emergencyContactRelationship);
    
    @Property("has_infant")
    public boolean gethasInfant();
    
    @Property("disability")
    public void setHasInfant(boolean hasInfant);
    
    
}
