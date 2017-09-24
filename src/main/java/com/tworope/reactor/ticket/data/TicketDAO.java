/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tworope.reactor.ticket.data;

import com.orientechnologies.orient.core.id.ORecordId;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;
import com.tinkerpop.frames.FramedGraph;
import com.tinkerpop.frames.FramedGraphFactory;
import com.tinkerpop.frames.modules.javahandler.JavaHandlerModule;
import com.tworope.reactor.ticket.dto.TicketDTO;
import com.tworope.reactor.ticket.frames.Ticket;
import com.tworope.reactor.ticket.util.ReactiveFrame;
import java.util.Date;

/**
 *
 * @author kelvinashu
 */
public class TicketDAO {

    public boolean saveTicket(TicketDTO ticketDTO) {
        OrientGraphFactory factory = new ReactiveFrame().getOrientGraphFactory();
        FramedGraph<OrientGraph> framedGraph = null;
        try {

            OrientGraph graph = factory.getTx();
            framedGraph = new FramedGraphFactory(new JavaHandlerModule()).create(graph);

            Ticket ticket = framedGraph.addVertex("class:Ticket", Ticket.class);
            ticket.setCreationDate(new Date());
            ticket.setTicketPrice(ticketDTO.getTicketPrice());
            ticket.setDepartureDate(ticketDTO.getDepartureDate());
            ticket.setArrivalDate(ticketDTO.getArrivalDate());
            ticket.setSeatNumber(ticketDTO.getSeatNumber());
            ticket.setStatus(ticketDTO.getStatus());
            ticket.setTitle(ticketDTO.getTitle());
            ticket.setNames(ticketDTO.getNames());
            ticket.setSurname(ticketDTO.getSurname());
            ticket.setEmail(ticketDTO.getEmail());
            ticket.setPhoneNumber(ticketDTO.getPhoneNumber());
            ticket.setGender(ticketDTO.getGender());
            ticket.setDisability(ticketDTO.getDisability());
            ticket.setHasInfant(ticketDTO.getHasInfant());
            ticket.setEmergencyContactNames(ticketDTO.getEmergencyContactNames());
            ticket.setEmergencyContactCellNumber(ticketDTO.getEmergencyContactCellNumber());
            ticket.setEmergencyContactRelationship(ticketDTO.getEmergencyContactRelationship());

            graph.commit();

            System.out.println("Ticket id before save " + ticket.asVertex().getId());
            
            return true;
            
        } catch (Exception e) {
            System.out.println("exception to add Ticket " + e);
        } finally {
            if (framedGraph != null) {
                framedGraph.shutdown();
            }
        }
        return false;

    }

    public TicketDTO getAllTickets() {

        OrientGraphFactory factory = new ReactiveFrame().getOrientGraphFactory();
        FramedGraph<OrientGraph> framedGraph = null;
        TicketDTO ticketDTO = null;
        
        try {

            OrientGraph graph = factory.getTx();
            framedGraph = new FramedGraphFactory(new JavaHandlerModule()).create(graph);

            ORecordId orid = new ORecordId("#24:0");

            Ticket ticket = framedGraph.getVertex(orid, Ticket.class);

            ticketDTO = saveTicketDTO(ticket);
            System.out.println("Ticket details " + ticketDTO);
            
        } catch (Exception e) {
            System.out.println("exception to retrieve Ticket " + e);
        } finally {
            if (framedGraph != null) {
                framedGraph.shutdown();
            }
        }
        return ticketDTO;
    }

    public static TicketDTO saveTicketDTO(Ticket ticket) {

        TicketDTO ticketDTO = new TicketDTO();
        
        ticketDTO.setCreationDate(new Date());
        ticketDTO.setTicketPrice(ticket.getTicketPrice());
        ticketDTO.setDepartureDate(ticket.getDepartureDate());
        ticketDTO.setArrivalDate(ticket.getArrivalDate());
        ticketDTO.setSeatNumber(ticket.getSeatNumber());
        ticketDTO.setStatus(ticket.getStatus());
        ticketDTO.setTitle(ticket.getTitle());
        ticketDTO.setNames(ticket.getNames());
        ticketDTO.setSurname(ticket.getSurname());
        ticketDTO.setEmail(ticket.getEmail());
        ticketDTO.setPhoneNumber(ticket.getPhoneNumber());
        ticketDTO.setGender(ticket.getGender());
        ticketDTO.setDisability(ticket.getDisability());
        ticketDTO.setHasInfant(ticket.getHasInfant());
        ticketDTO.setEmergencyContactNames(ticket.getEmergencyContactNames());
        ticketDTO.setEmergencyContactCellNumber(ticket.getEmergencyContactCellNumber());
        ticketDTO.setEmergencyContactRelationship(ticket.getEmergencyContactRelationship());
        
        return ticketDTO;
    }
}
