package com.haessae0.springtravel.dao;

import com.haessae0.springtravel.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // mapping 파일의 SQL을 인터페이스로 호출
public interface DeptDao {
    List<Dept> selectList();

}
