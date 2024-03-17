package com.jobpost.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobpost.joblisting.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>
{

}
