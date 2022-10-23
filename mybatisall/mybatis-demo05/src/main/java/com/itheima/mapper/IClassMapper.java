package com.itheima.mapper;

import com.itheima.pojo.IClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: IClassMapper
 * @author: gates
 * @description:
 * @version: 1.0.0
 * @date: 2022/10/21 20:12
 */
public interface IClassMapper {

    @Select("select * from c_class where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "classname", column = "classname"),
            @Result(property = "iStudentList", column = "id", javaType = List.class, many = @Many(select = "com.itheima.mapper.IStudentMapper.selectMany"))
    })
    IClass select(Integer id);
}
