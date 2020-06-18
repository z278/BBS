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
public class Student implements java.io.Serializable{
    private Integer id;
    private String stuNum;
    private String realName;
    private String nickName;
    private String password;
    private String qq;
    private String email;
    private String major;
    private String className;
    private String photoPath;
    private Set posts = new HashSet(0);
    private Set replies = new HashSet(0);
    
    public Student(){
        
    }
    
    public Student(String stuNum, String password){
        this.stuNum = stuNum;
        this.password = password;
    }
    
    public Student(String stuNum, String realName, String nickName, String password, String qq, String email, String major, String className, String photoPath, Set posts, Set replies){
        this.stuNum = stuNum;
        this.realName = realName;
        this.nickName = nickName;
        this.password = password;
        this.qq = qq;
        this.email = email;
        this.major = major;
        this.className = className;
        this.photoPath = photoPath;
        this.replies = replies;
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public Set getReplies() {
        return replies;
    }

    public void setReplies(Set replies) {
        this.replies = replies;
    }
    
    
}
