/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Student;
import com.service.IStudentService;
import javax.annotation.Resource;

/**
 *
 * @author hp
 */
public class StudentServiceImpl implements IStudentService{
    
    @Resource(name="dao")
    BaseDao dao;

    @Override
    public Student getStudentByStuNum(String StuNum) {
        Student s = (Student)dao.loadObject("from Student as s where s.stuNum='"+StuNum+"' ");
        if(s!=null){
            return s;
        }
        return null;
    }

    @Override
    public boolean modifyStudent(Student student) {
        try{
            dao.saveOrUpdate(student);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
