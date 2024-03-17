package com.jobpost.joblisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobpost.joblisting.model.Post;
import com.jobpost.joblisting.repository.PostRepository;
import com.jobpost.joblisting.repository.SearchRepositoryImpl;

@RestController
@RequestMapping("get")
@CrossOrigin(origins = "http://localhost:3000")
public class PostController 
{
	@Autowired
	PostRepository repo;
	
	@Autowired
	SearchRepositoryImpl srepo;
	
	
	
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Post> getAllPosts()
	{
		return repo.findAll();
	}
	
	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Post> search(@PathVariable String text)
	{
		return srepo.findByText(text);
	}
	
	@PostMapping("/posts")
	@CrossOrigin
	public String addPost(@RequestBody Post post)
	{
		repo.save(post);
		return "success";
	}
}
