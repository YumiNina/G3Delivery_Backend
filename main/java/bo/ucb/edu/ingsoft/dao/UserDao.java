package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.UserGetOrderId;
import bo.ucb.edu.ingsoft.dto.UserOrderGet;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.dto.UserGet;
import bo.ucb.edu.ingsoft.model.Order;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    //Creacion de Usuarios
    public void create(User user);

   



}
