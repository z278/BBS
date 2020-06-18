/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */
public interface BaseDao {
    //加载指定id的持久化对象
    public Object loadById(Class clazz, Serializable id);
    //加载满足条件的持久化对象
    public Object loadObject(String hql);
    //删除指定id的持久化对象
    public void delById(Class clazz, Serializable id);
    //保存或更新指定持久化对象
    public void saveOrUpdate(Object obj);
    //装载指定类的所有持久化对象
    public List listAll(String clazz);
    //分页装载指定类的所有持久化对象
    public List listAll(String clazz, int pageNo, int pageSize);
    //统计指定类的所有持久化对象
    public int countAll(String clazz);
    //查询指定类的满足条件的持久化对象
    public List query(String hql);
    //分页查询指定类的满足条件的持久化对象
    public List query(String hql, int pageNo, int pageSize);
    //统计指定类的查询结果
    public int countQuery(String hql);
    //条件更新数据库
    public int update(String hql);
    //从连接池获取JDBC连接
    public Connection getConnection();
}
