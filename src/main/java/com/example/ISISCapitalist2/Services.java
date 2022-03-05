/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ISISCapitalist2;

import generated.World;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Utilisateur
 */
public class Services {
    
    private World readWorldFromXml() throws JAXBException{
        JAXBContext cont = JAXBContext.newInstance(World.class);
        Unmarshaller m = cont.createUnmarshaller();
        World world;
        try {
            world = (World) m.unmarshal(new File("world.xml"));
        } catch (UnmarshalException e) {
            InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
            world = (World) m.unmarshal(input);
        }
        return world;
    }
         
                                 
    private void saveWordlToXml(String username, World world) throws FileNotFoundException, JAXBException {
        JAXBContext cont = JAXBContext.newInstance(World.class);
        Marshaller m = cont.createMarshaller();
        OutputStream os = new FileOutputStream("world.xml");
        m.marshal(world, os);
    }
    
    
    
    public World getWorld() throws JAXBException{
        World world = readWorldFromXml();
        return world;
    }
}
