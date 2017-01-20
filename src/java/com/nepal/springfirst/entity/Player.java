/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.entity;

/**
 *
 * @author Raju
 */
public class Player {
    private int id;
    private String firstName, lastName, email,squadPosition, ContactNo;
    private boolean status;

    public Player() {
    }

    public Player(int id, String firstName, String lastName, String email, String squadPosition, String ContactNo, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.squadPosition = squadPosition;
        this.ContactNo = ContactNo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSquadPosition() {
        return squadPosition;
    }

    public void setSquadPosition(String squadPosition) {
        this.squadPosition = squadPosition;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   /* @Override
    public String toString() {
        return "Player{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", squadPosition=" + squadPosition + ", ContactNo=" + ContactNo + ", status=" + status + '}';
    }*/
    
    
    
}
