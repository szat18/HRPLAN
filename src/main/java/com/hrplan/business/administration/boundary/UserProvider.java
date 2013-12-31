/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrplan.business.administration.boundary;

import com.hrplan.business.administration.entity.User;
import com.one.business.sessions.control.Archiver;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aszatkowski
 * 
 * Class used to provide user management.
 * LDAP synchronization 
 * 
 */
@Stateless
public class UserProvider {

    @Inject
    Archiver ar;

    @PersistenceContext(name = "hrplan")
    EntityManager em;
    
    public void createSampleUser()
    {
        User.Builder ub = new User.Builder();
        User user = ub.withName("Artur").withSurname("Szatkowski").build();
        em.persist(user);
    }
}
