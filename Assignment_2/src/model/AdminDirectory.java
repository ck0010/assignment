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
public class AdminDirectory {
    private ArrayList<User> adminList;
    
    public AdminDirectory(){
        this.adminList = new ArrayList<User>();
        //User Admin = new User("07071111","godapollo","god123","Chinmay","Kulkarni","godapollo@gmail.com","IS", true);
        //adminList.add(Admin);
    }

    public ArrayList<User> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<User> adminList) {
        this.adminList = adminList;
    }
    
   public User addUser(){
        User user = new User();
        adminList.add(user); //this.removed
        return user;
    }
    
    public void deleteUser(User person){
        //admin.setCreatedstatus(false); // plus Upper (User admin)
        adminList.remove(person);
    }
    
    public User searchUser(String NUID){
        for(User admin: adminList){
            if(admin.getNUID().equals(NUID)){
                return admin;
            }
        }
        return null;   
    }
}
