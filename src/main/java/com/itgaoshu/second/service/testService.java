package com.itgaoshu.second.service;

import com.itgaoshu.second.bean.T1;

import java.util.List;

public interface testService {
    public List<T1> selectAll();
    public T1 select(Integer id);
}
