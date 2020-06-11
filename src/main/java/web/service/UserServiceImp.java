/*
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.Car;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(Car car) {
        userDao.add(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List listCarsByCriteria() {
        return userDao.listCarsByCriteria();
    }
}
*/
