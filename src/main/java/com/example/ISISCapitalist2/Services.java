/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ISISCapitalist2;

import generated.World;

/**
 *
 * @author Utilisateur
 */
public class Services {
    
    private World readWorldFromXml();
         InputStream input = getClass().getClassLoader().getRessourceAsStream("ressources\world.xml");
                 
                 
                 
                 
    private void saveWordlToXml(World world);
          OutoutStream output = new FileOutputStream(file);  
    
    
    
    
    public World getWorld();
        World world = readWorldFromXml();
        return world;
}
