package trius.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import trius.springframework.commands.UserForm;

import trius.springframework.domain.User;

@Component
public class UserFormToUser implements Converter<UserForm, User> {
    @Override
    public User convert(UserForm userForm) {
        User user = new User();
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getParola());

        return user;
    }
}
