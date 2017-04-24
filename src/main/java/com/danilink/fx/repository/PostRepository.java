package com.danilink.fx.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.danilink.fx.model.Posts;

/**
 * 
 */
public interface PostRepository extends MongoRepository<Posts, String> {

    List<Posts> findByAuthor(String author);
}
