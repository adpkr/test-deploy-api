package com.Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Main.Entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{

}
