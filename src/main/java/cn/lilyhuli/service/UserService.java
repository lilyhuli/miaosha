package cn.lilyhuli.service;

import cn.lilyhuli.dao.UserDao;
import cn.lilyhuli.domain.User;
import cn.lilyhuli.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id) {
        return userDao.getById(id);
    }

    @Transactional
    public boolean tx() {
        User u1 = new User();
        u1.setId(2);
        u1.setName("tang");

        userDao.insert(u1);

        User u2 = new User();
        u2.setId(1);
        u2.setName("dong");

        userDao.insert(u2);

        return true;
    }
}
