package com.ads.classroom;

import java.util.List;

interface Crud {
    void create(Object user);
    void update(Object user);
    void delete(int id);
    Object read(int id);
    List<Object> getAll();
}
