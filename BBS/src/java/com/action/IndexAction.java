/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.orm.Board;
import com.orm.Post;
import com.orm.Student;
import com.service.IBoardService;
import com.service.IPostService;
import com.service.IStudentService;
import java.util.List;
import javax.annotation.Resource;

/**
 *
 * @author hp
 */
public class IndexAction extends ActionSupport{
    @Resource(name="studentService")
    IStudentService studentService;
    @Resource(name="boardService")
    IBoardService boardService;
    @Resource(name="postService")
    IPostService postService;
    
    private List<Board>rootBoard;
    private int todayNum;
    private int yestNum;
    private int highestNum;
    private int total;
    private Student student;
    private List<Post>hotPosts;

    //显示板块
    public List<Board> getRootBoard() {
        return rootBoard;
    }

    //火热帖子排行榜
    public void setRootBoard(List<Board> rootBoard) {
        this.rootBoard = rootBoard;
    }

    public int getTodayNum() {
        return todayNum;
    }

    public void setTodayNum(int todayNum) {
        this.todayNum = todayNum;
    }

    public int getYestNum() {
        return yestNum;
    }

    public void setYestNum(int yestNum) {
        this.yestNum = yestNum;
    }

    public int getHighestNum() {
        return highestNum;
    }

    public void setHighestNum(int highestNum) {
        this.highestNum = highestNum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Post> getHotPosts() {
        return hotPosts;
    }

    public void setHotPosts(List<Post> hotPosts) {
        this.hotPosts = hotPosts;
    }
    
    @Override
    public String execute() throws Exception{
        try{
            //Student为持久化对象
            Student sessionStudent = (Student)ActionContext.getContext().getSession().get("student");
            if(sessionStudent != null){
                setStudent(studentService.getStudentByStuNum(sessionStudent.getStuNum()));
            }
            //加载板块
            setRootBoard(boardService.loadRootBoards());
            setHotPosts(postService.rankPosts(10));
            setTotal(postService.countTotalPost());
            setYestNum(postService.countYesteradyPost());
            setTodayNum(postService.countTodayPost());
            return SUCCESS;
        }catch(Exception e){
            e.printStackTrace();
            return ERROR;
        }
    }
    
    
}
