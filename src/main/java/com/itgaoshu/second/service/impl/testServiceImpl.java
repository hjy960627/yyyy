package com.itgaoshu.second.service.impl;

import com.itgaoshu.second.bean.T1;
import com.itgaoshu.second.mapper.testMapper;
import com.itgaoshu.second.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class testServiceImpl implements testService {
    @Autowired
    private testMapper testmapper;
    @Override
    @Cacheable("selectAll")
    public List<T1> selectAll() {

        return testmapper.selectAll();
    }

    @Override
    @Cacheable("select")//括号里尽量写该方法名
    public T1 select(Integer id) {

        return testmapper.selectByPrimaryKey(id);
    }


}

