package com.springboot_project.gael.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_project.gael.bo.Friend;
import com.springboot_project.gael.services.FriendService;

@RestController
@CrossOrigin
public class FriendController {

	@Autowired
	private FriendService service;
	
	@ModelAttribute("listeFriends")
	public ArrayList<Friend> initListeFriend(){
		return new ArrayList<Friend>();
	}
	
	@GetMapping("/friends")
	public String getFriends(Model modele){
		modele.addAttribute("listeFriends", service.getFriends());
		return "home";
	}
	
	@GetMapping("/friendss")
	public List<Friend> getFriendss(){
		return service.getFriends();
	}
	
	@PostMapping("/friends/addnew")
	public void addFriend(@RequestBody Friend friend) {
		service.addFriend(friend);
	}
	
	@GetMapping("/friends/{id}")
	public Friend getFriendById(@PathVariable("id") Long id) {
		return service.getFriendById(id);
	}
	
	@PutMapping("/friends/{id}/edit")
	public void updateFriend(@PathVariable("id") Long id, @RequestBody Friend friend) {
		service.updateFriend(friend);
	}
	
	@DeleteMapping("/friends/{id}/delete")
	public void deleteFriend(@PathVariable("id") Long id) {
		service.deleteFriend(id);
	}
	
	@GetMapping("/message")
    public List<Friend> message() {
		return service.getFriends();
    }
	
}
