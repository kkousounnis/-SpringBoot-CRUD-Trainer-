/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.grocerystorespring2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author George.Pasparakis
 */
@Controller
@RequestMapping(value={"/customer"})
public class Customer {
    
    @RequestMapping(value={"/customer"})
    public String showCustomer(ModelMap view) {
        view.addAttribute("projectName", "Grocery Store");
        return("customer");
    }
}
