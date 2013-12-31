/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrplan.business.administration.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author aszatkowski
 */
@Stateless
@Path("sessions")
public class UserResource {

    @Inject
    UserProvider sp;

    @GET
    public JsonObject messages() {
        return Json.createObjectBuilder().add("name-json", "duke").build();
    }
}
