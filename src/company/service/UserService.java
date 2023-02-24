package company.service;

import company.model.User;
import company.service.impl.MyException;

public interface UserService {
     void addUser(User user);
     User findById(int id) ;
     void deleteById(int id);
     void getAllUsers();
}
