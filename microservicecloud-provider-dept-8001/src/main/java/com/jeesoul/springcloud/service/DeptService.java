package com.jeesoul.springcloud.service;

import com.jeesoul.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
