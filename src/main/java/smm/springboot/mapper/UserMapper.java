package smm.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import smm.springboot.dto.UserDTO;

@Mapper
public interface UserMapper {

    void insert(UserDTO user);

    void update(UserDTO user);

    void delete(int id);

    UserDTO find(int id);
}
