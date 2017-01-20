/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.service;

import com.nepal.springfirst.entity.Player;
import java.util.List;

/**
 *
 * @author Raju
 */
public interface PlayerService {
    List<Player> getAll();
    Player getById(int id);
    int insert(Player p);
    
}
