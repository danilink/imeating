package com.danilink.fx.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.danilink.fx.model.Posts;
import com.danilink.fx.repository.PostRepository;

import lombok.AllArgsConstructor;

/**
 * Public methods for post
 *
 * @author Danilink
 * @version 1.0
 * @since 23 feb. 2017
 */
@RestController
@AllArgsConstructor
public class PostController {

    private PostRepository postRepository;
    
    @GetMapping("api/posts")
    public List<Posts> getTodosLosPost() {
        return postRepository.findAll();
    }
    
    @GetMapping("api/posts/{name}")
    public List<Posts> getPostPorAuthor(@PathVariable String name) {
        return postRepository.findByAuthor(name);
    }
}
