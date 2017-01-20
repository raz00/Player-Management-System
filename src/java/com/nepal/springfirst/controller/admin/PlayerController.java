/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.controller.admin;


import com.nepal.springfirst.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Raju
 */
@Controller
@RequestMapping("/admin/player")
public class PlayerController {
    @Autowired
   // private PlayerDAO playerDAO;
    private PlayerService playerService;
    @RequestMapping(method = RequestMethod.GET)
    public String Index( ModelMap map){
       /* playerDAO.getAll().clear();
        playerDAO.insert(new Player(1,"Saurya","Maharjan","saurya@gmail.com","Striker","9841234343",true));
        playerDAO.insert(new Player(2,"Rays","Jung","rays@gmail.com", "Winger", "9849987645", false));
        playerDAO.insert(new Player(3, "Raju", "Kunwar", "raju@gmail.com", "MidFielder", "9649693827", true));
        playerDAO.insert(new Player(4, "Bikash", "Shrestha", "bikash@gmail.com", "Defender", "9643810292", true));
        playerDAO.insert(new Player(5, "Avash", "K.C", "avash@gmail.com", "GoalKeeper", "9841764766", false));*/
       // map.addAttribute("players",playerDAO.getAll());
       map.addAttribute("players",playerService.getAll());
        return"admin/player/index";
    }
    
     @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id")int id, ModelMap map){
       /* playerDAO.getAll().clear();
        playerDAO.insert(new Player(1,"Saurya","Maharjan","saurya@gmail.com","Striker","9841234343",true));
        playerDAO.insert(new Player(2,"Rays","Jung","rays@gmail.com", "Winger", "9849987645", false));
        playerDAO.insert(new Player(3, "Raju", "Kunwar", "raju@gmail.com", "MidFielder", "9649693827", true));
        playerDAO.insert(new Player(4, "Bikash", "Shrestha", "bikash@gmail.com", "Defender", "9643810292", true));
        playerDAO.insert(new Player(5, "Avash", "K.C", "avash@gmail.com", "GoalKeeper", "9841764766", false));*/
       // map.addAttribute("player",playerDAO.getById(id));
        map.addAttribute("player",playerService.getById(id));
        return "admin/player/edit";
    }
}
