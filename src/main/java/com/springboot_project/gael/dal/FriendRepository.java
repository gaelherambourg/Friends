package com.springboot_project.gael.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_project.gael.bo.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long>{

}
