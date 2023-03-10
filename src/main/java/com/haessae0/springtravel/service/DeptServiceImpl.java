package com.haessae0.springtravel.service;

import com.haessae0.springtravel.model.Dept;
import com.haessae0.springtravel.repository.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public List<Dept> selectList() {
        return deptDao.selectList();
    }
}
