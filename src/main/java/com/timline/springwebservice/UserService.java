package com.timline.springwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUser {
    private Usermapper usermapper;

    @Autowired
    UserService (
            Usermapper usermapper
    ) { this.usermapper = usermapper; }

    public List<Map<String, Object>> getUser() {
        return usermapper.getUser();
    }

}
