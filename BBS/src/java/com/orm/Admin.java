/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orm;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hp
 */
public class Admin implements java.io.Serializable{
    private Integer id;
    private String account;
    private String password;
    private int qx;
    private String nickName;
    private String name;
    private String photoPath;
    private Set posts = new HashSet(0);
    private Set boards = new HashSet(0);
    private Set replies = new HashSet(0);
    
    public Admin(){
        
    }
    
    public Admin(String account, String password, int qx){
        this.account = account;
        this.password = password;
        this.qx = qx;
    }
    
    public Admin(String account, String password, int qx, String nickName,String name, String photoPath, Set posts, Set boards, Set replies){
        this.account = account;
        this.password = password;
        this.qx = qx;
        this.nickName = nickName;
        this.name = name;
        this.photoPath = photoPath;
        this.posts = posts;
        this.replies = replies;
        this.boards = boards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQx() {
        return qx;
    }

    public void setQx(int qx) {
        this.qx = qx;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Set getPosts() {
        return posts;
    }

    public void setPosts(Set posts) {
        this.posts = posts;
    }

    public Set getBoards() {
        return boards;
    }

    public void setBoards(Set boards) {
        this.boards = boards;
    }

    public Set getReplies() {
        return replies;
    }

    public void setReplies(Set replies) {
        this.replies = replies;
    }
    
    
}
