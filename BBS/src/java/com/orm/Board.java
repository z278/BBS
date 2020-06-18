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
public class Board implements java.io.Serializable{
    private Integer id;
    private Board board;
    private Admin admin;
    private String name;
    private String description;
    private String boardImg;
    private Set posts = new HashSet(0);
    private Set boards = new HashSet(0);
    
    public Board(){
        
    }
    
    public Board(Admin admin, String name){
        this.admin = admin;
        this.name = name;
    }
    
    public Board(Board board, Admin admin, String name, String description, String boardImg, Set posts, Set boards){
        this.board = board;
        this.admin = admin;
        this.name = name;
        this.description = description;
        this.boardImg = boardImg;
        this.posts = posts;
        this.boards = boards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBoardImg() {
        return boardImg;
    }

    public void setBoardImg(String boardImg) {
        this.boardImg = boardImg;
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
    
    
}
