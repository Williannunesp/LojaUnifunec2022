/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unifunec.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author willi
 */
public class EntityManagerUtil {
        static EntityManagerFactory emf = null;
    
    public static EntityManager getEntityManeger(){
        if(emf == null){
            try{
                emf = Persistence.createEntityManagerFactory("LojaUnifunec2022PU");
            }
            catch(Exception e){
                
            } 
        }
       
        return emf.createEntityManager();
    }
}
