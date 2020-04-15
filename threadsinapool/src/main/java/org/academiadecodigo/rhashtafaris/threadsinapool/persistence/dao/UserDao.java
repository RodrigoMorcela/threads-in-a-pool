package org.academiadecodigo.rhashtafaris.threadsinapool.persistence.dao;

import org.academiadecodigo.rhashtafaris.threadsinapool.model.impl.Ticket;
import org.academiadecodigo.rhashtafaris.threadsinapool.model.impl.User;

public interface UserDao extends CRUDDao<User> {

    User findByUserName(String username);
    User findUserByTicket(Ticket ticket);
}
