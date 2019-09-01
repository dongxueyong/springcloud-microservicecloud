package com.jeesoul.springcloud.service.impl;

import com.jeesoul.springcloud.dao.DeptDao;
import com.jeesoul.springcloud.entities.Dept;
import com.jeesoul.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        boolean b = deptDao.addDept(dept);
        return b;
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
