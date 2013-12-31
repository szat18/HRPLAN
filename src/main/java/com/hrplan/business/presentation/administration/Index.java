/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrplan.business.presentation.administration;

import com.hrplan.business.administration.boundary.UserProvider;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author aszatkowski
 */
@Model
public class Index {

    @Inject
    UserProvider provider;

    public void handleCreate() {
        provider.createSampleUser();
    }
    
}
