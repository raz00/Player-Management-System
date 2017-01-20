/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.dao.impl;

import com.nepal.springfirst.dao.PlayerDAO;
import com.nepal.springfirst.entity.Player;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raju
 */
@Repository(value="PlayerDAO")
public class PlayerDAOImpl implements PlayerDAO{
    
    List<Player> playerList=new ArrayList<>();
    @Override
    public List<Player> getAll() {
        playerList.clear();
        playerList.add(new Player(1,"Saurya","Maharjan","saurya@gmail.com","Striker","9841234343",true));
        playerList.add(new Player(2,"Rays","Jung","rays@gmail.com", "Winger", "9849987645", false));
        playerList.add(new Player(3,"Raju", "Kunwar", "raju@gmail.com", "MidFielder", "9649693827", true));
        playerList.add(new Player(4,"Bikash", "Shrestha", "bikash@gmail.com", "Defender", "9643810292", true));
        playerList.add(new Player(5,"Avash", "K.C", "avash@gmail.com", "GoalKeeper", "9841764766", false));
        return playerList;
    }

    @Override
    public Player getById(int id) {
       for(Player p: playerList){
           if(p.getId() == id){
               return p;
           }
       }
       return null;
    }

    @Override
    public int insert(Player p) {
        playerList.add(p);
        return 1;
    }
    
}
