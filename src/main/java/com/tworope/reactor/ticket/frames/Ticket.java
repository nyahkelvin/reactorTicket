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
    
    
}
