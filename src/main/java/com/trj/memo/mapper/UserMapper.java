package com.trj.memo.mapper;


import com.trj.memo.domain.User;
import com.trj.memo.domain.UserMapperBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM UserMapperBean WHERE NAME = #{name}")
    UserMapperBean findByName(@Param("name") String name);

    @Insert("INSERT INTO UserMapperBean(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
