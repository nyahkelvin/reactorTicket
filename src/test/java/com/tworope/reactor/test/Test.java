/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tworope.reactor.test;

import com.tworope.reactor.ticket.data.TicketDAO;
import com.tworope.reactor.ticket.dto.TicketDTO;
import java.util.Date;

/**
 *
 * @author kelvinashu
 */
public class Test {
    
    public static void main(String [] args){
        TicketDAO t = new TicketDAO();
        Test test = new Test();
        
        t.saveTicket(test.createTicketDTO());
    }
    
    public TicketDTO createTicketDTO(){
        
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setArrivalDate(new Date());
        ticketDTO.setDepartureDate(new Date());
        ticketDTO.setTicketPrice(50.99);
        ticketDTO.setSeatNumber(01);
        ticketDTO.setStatus("pending");
        ticketDTO.setTitle("Mr");
        ticketDTO.setNames("Val");
        ticketDTO.setSurname("Tobah");
        ticketDTO.setEmail("abc@gmail.com");
        ticketDTO.setPhoneNumber("1472583690");
        ticketDTO.setGender("male");
        ticketDTO.setDisability("none");
        ticketDTO.setHasInfant(true);
        ticketDTO.setEmergencyContactNames("Mbaka");
        ticketDTO.setEmergencyContactCellNumber("1234567890");
        ticketDTO.setEmergencyContactRelationship("brother");
        
        return ticketDTO;
    }
    
}
