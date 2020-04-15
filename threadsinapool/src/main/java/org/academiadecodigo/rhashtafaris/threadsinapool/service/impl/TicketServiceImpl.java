package org.academiadecodigo.rhashtafaris.threadsinapool.service.impl;

import org.academiadecodigo.rhashtafaris.threadsinapool.model.impl.Ticket;
import org.academiadecodigo.rhashtafaris.threadsinapool.model.impl.User;
import org.academiadecodigo.rhashtafaris.threadsinapool.persistence.dao.TicketDao;
import org.academiadecodigo.rhashtafaris.threadsinapool.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketServiceImpl extends AbstractService<Ticket> implements TicketService {


    @Autowired
    public TicketServiceImpl(TicketDao dao) {
        super(dao);
    }

    @Override
    public List<User> getTicketMatchUsersListByTicketId(Integer ticketId) {

        Ticket ticket = dao.findById(ticketId);

        return ticket.getMachedUsers();
    }
}
