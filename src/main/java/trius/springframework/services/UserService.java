package trius.springframework.services;


import org.springframework.stereotype.Service;
import trius.springframework.commands.UserForm;
import trius.springframework.domain.User;

import java.util.List;

@Service
public interface UserService {
    List<User> listAll();

    User getById(String id);

    User saveOrUpdate(User user);

    void delete(String id);

    User saveOrUpdateUserForm(UserForm userForm);
}
