import company.dao.UserDao;
import company.model.Gender;
import company.model.User;
import company.service.UserService;
import company.service.impl.MyException;
import company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyException {
        User user1=new User(1,"Bakyt",23, Gender.MALE);
        User user2=new User(2,"Nurisa",20,Gender.FEMALE);
        User user3=new User(3,"Uson",24,Gender.MALE);

        UserServiceImpl userService=new UserServiceImpl();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);


        try {
            System.out.println(userService.findById(4));
        } catch (MyException e){
            System.out.println(e.getMessage());
        }

        userService.deleteById(2);
        userService.getAllUsers();


    }
}