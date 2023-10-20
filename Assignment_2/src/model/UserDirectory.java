/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Chinmay K 1st
 */
public class UserDirectory {
    
    private ArrayList<User> userList;
    
    public UserDirectory(){
        this.userList = new ArrayList<User>();
        User user = new User(); 
        user.setStatus(true);
        user.setNUID("");
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole("Admin");
        userList.add(user);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    //methods generation for adding, searching & deletion
    public User addUser(){
        User user = new User();
        userList.add(user);
        return user;
    }
    
    public void deleteUser(User user){
        userList.remove(user);
    }
    
    
    public User searchUser(String NUID){
        for(User user: userList){
            if(user.getNUID().equals(NUID)){
                return user;
            }
        }
        return null;
    }

    /*public void updateUserEnabledStatus(User user, boolean status){
        for(User user1 : userList){
            if(user1.getNUID().equals(user.getNUID())){
                if(status == true){
                    user1.setCreatedstatus(true);
                    break;
                } else {
                    user1.setCreatedstatus(false);
                    break;
                }
            }
        }
    }

    public void disableUserAccount(User user){
        for (User user1 : userList){
            if(user1.getNUID().equals(user.getNUID())){
                if(user.isBlockstatus()==false)
                    user1.setBlockstatus(true);
                else
                    user1.setBlockstatus(false);
            }
        }
    }*/
}
