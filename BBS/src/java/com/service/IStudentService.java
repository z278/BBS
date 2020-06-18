/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.orm.Student;

/**
 *
 * @author hp
 */
public interface IStudentService {
    public Student getStudentByStuNum(String StuNum);
    public boolean modifyStudent(Student student);
}
