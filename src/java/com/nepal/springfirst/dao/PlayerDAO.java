/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.dao;
import  com.nepal.springfirst.entity.Player;
import java.util.List;

/**
 *
 * @author Raju
 */
public interface PlayerDAO {
   List<Player> getAll();
   Player getById(int id);
   int insert(Player p);   
}
