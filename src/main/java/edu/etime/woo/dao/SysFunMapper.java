package edu.etime.woo.dao;

import edu.etime.woo.pojo.SysFun;
import org.springframework.stereotype.Component;

@Component
public interface SysFunMapper {
    int deleteByPrimaryKey(String funid);

    int insert(SysFun record);

    int insertSelective(SysFun record);

    SysFun selectByPrimaryKey(String funid);

    int updateByPrimaryKeySelective(SysFun record);

    int updateByPrimaryKey(SysFun record);
}