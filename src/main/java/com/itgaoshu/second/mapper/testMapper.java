package com.itgaoshu.second.mapper;

import com.itgaoshu.second.bean.T1;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface testMapper extends Mapper<T1> {
    @Select("select * from t1")
    public List<T1> selectAll();
}
