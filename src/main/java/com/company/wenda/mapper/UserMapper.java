package com.company.wenda.mapper;

import com.company.wenda.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    String TABLE_NAME = " user ";
    String INSERT_FIELDS = " name, password, salt, head_url ";
    String SELECT_FIELDS = " id " + INSERT_FIELDS;
    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);

    @Select({"select ", SELECT_FIELDS, "from ", TABLE_NAME, "where id = #{id}"})
    User selectUserById(Integer id);

    @Update({"update", TABLE_NAME, "set password = #{password} where id = #{id}"})
    int updatePassword(User user);

    @Delete({"delete from", TABLE_NAME, "where id = #{id}"})
    int deleteUserById(Integer id);

}
