package com.ads.classroom;

import java.util.Date;
import java.util.List;

abstract class UserT implements  Crud {
    // implements all but one method of Crud
}

public class User extends UserT {
    // implements the remaining method in Crud
    String name = "";
    String password = "";
    String email = "";
    Date birthday = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void create(Object user) {
        // TODO Auto-generated method stub
    }

    @Override
    public void update(Object user) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    }

    @Override
    public Object read(int id) {
        return null;
    }

    @Override
    public List<Object> getAll() {
        return null;
    }


}
