package com.example.fly.mapper;

import com.example.fly.bean.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    Person Sel(int id);
}
