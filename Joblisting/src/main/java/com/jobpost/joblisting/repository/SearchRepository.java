package com.jobpost.joblisting.repository;

import java.util.List;


import com.jobpost.joblisting.model.Post;

public interface SearchRepository 
{
	
	
	List<Post>findByText(String text);
}
