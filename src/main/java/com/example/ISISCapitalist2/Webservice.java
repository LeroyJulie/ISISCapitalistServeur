/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ISISCapitalist2;

import generated.World;
import javax.xml.bind.JAXBException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Utilisateur
 */


    @RestController
    @RequestMapping("adventureisis/generic")
    @CrossOrigin
    public class Webservice {

        Services services;

        public Webservice() {
            services = new Services();
        }

        @GetMapping(value = "world", produces = {"application/xml", "application/json"})

        public ResponseEntity<World> getWorld() throws JAXBException {
            World world = services.getWorld();
            return ResponseEntity.ok(world);
        }
    }
