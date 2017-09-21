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
        TicketDTO dto = new TicketDTO();
        dto.setCreationDate(new Date());
        
        t.saveTicket(dto);
    }
    
}
