/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.service.impl;

import com.nepal.springfirst.dao.PlayerDAO;
import com.nepal.springfirst.entity.Player;
import com.nepal.springfirst.service.PlayerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raju
 */
@Service(value="PlayerService")
public class PlayerServiceImpl implements PlayerService {
    
     @Autowired
    private PlayerDAO playerDAO; 
     
    @Override
    public List<Player> getAll() {
     return playerDAO.getAll();
    }

    @Override
    public Player getById(int id) {
     return playerDAO.getById(id);
    }

    @Override
    public int insert(Player p) {
     return playerDAO.insert(p);
    }
    
}
