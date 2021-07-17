package com.springboot_project.gael.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_project.gael.bo.Friend;
import com.springboot_project.gael.dal.FriendRepository;

@Service
public class FriendService {

	@Autowired
	private FriendRepository friendRepo;
	
	public List<Friend> getFriends() {
		
		return friendRepo.findAll();
	}
	
	public void addFriend(Friend friend) {
		friendRepo.save(friend);
	}
	
	public void updateFriend(Friend friend) {
		friendRepo.save(friend);
	}
	
	public Friend getFriendById(Long id) {
		return friendRepo.findById(id).get();
	}
	
	public void deleteFriend(Long id) {
		friendRepo.deleteById(id);
	}
	
}
