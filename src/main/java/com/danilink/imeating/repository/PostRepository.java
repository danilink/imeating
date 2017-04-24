package com.danilink.imeating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danilink.imeating.model.Posts;

/**
 * 
 */
public interface PostRepository extends MongoRepository<Posts, String> {

    List<Posts> findByAuthor(String author);
}
