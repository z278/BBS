/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.orm.Board;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IBoardService {
    //加载Board
    public Board loadBoard(int id);
    //加载子板块
    public List<Board>loadChildBoards(int parentId);
    //加载板块
    public List<Board>loadAllBoards();
    //加载根栏目
    public List<Board>loadRootBoards();
    //保存更新板块
    public boolean saveOrUpdateBoard(Board board);
}
