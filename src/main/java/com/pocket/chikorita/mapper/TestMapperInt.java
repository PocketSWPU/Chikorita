package com.pocket.chikorita.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapperInt {

    @Select("select count(*) from test_table")
    String testSql();
}
