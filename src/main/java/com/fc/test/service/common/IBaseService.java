package com.fc.test.service.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface IBaseService<T> {
    T selectOne(T record);

    List<T> select(T record);

    List<T> selectAll();

    int selectCount(T record);

    T selectByPrimaryKey(Object key);

    boolean existsWithPrimaryKey(Object key);

    int insert(T record);

    int insertSelective(T record);

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);

    int delete(T record);

    int deleteByPrimaryKey(Object key);

    List<T> selectByExample(Object example);

    T selectOneByExample(Object example);

    int selectCountByExample(Object example);

    int deleteByExample(Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds);

    List<T> selectByRowBounds(T record, RowBounds rowBounds);

}
