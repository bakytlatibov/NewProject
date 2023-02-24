package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUser().add(user);

    }

    @Override
    public User findById(int id) {
        for (int i = 0; i < userDao.getUser().size(); i++) {
            if (userDao.getUser().get(i).getId() == id){
                return userDao.getUser().get(i);
            }

        }
        throw new MyException("have not user with id "+id);
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < userDao.getUser().size(); i++) {
            if (userDao.getUser().get(i).getId()==id){
               userDao.getUser().remove(userDao.getUser().get(i));
                System.out.println(userDao.getUser());
            }

        }

    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < userDao.getUser().size(); i++) {
            System.out.println(userDao.getUser().get(i));

        }


    }
}
