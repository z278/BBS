/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orm;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Reply implements java.io.Serializable{
    private Integer id;
    private Admin admin;
    private Student student;
    private Post post;
    private String content;
    private Date publishTime;
    
    public Reply(){
        
    }
    
    public Reply(Post post, String content){
        this.post = post;
        this.content = content;
    }
    
    public Reply(Admin admin, Student student, Post post, String content, Date publishTime){
        this.admin = admin;
        this.student = student;
        this.post = post;
        this.content = content;
        this.publishTime = publishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    
    
}
