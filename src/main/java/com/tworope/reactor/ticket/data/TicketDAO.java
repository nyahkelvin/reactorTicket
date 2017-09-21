/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tworope.reactor.ticket.data;

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

            graph.commit();

            System.out.println("bid id before save " + ticket.asVertex().getId());
            return true;
        } catch (Exception e) {
            System.out.println("exception to add bid " + e);
        } finally {
            if (framedGraph != null) {
                framedGraph.shutdown();
            }
        }
        return false;

    }

}
