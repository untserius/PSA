package com.blogapp.controller;

import com.blogapp.entity.Post;
import com.blogapp.payload.PostDto;
import com.blogapp.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService){

        this.postService = postService;
    }

    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto){
        if(postDto.getTitle().length()<3){
            return new ResponseEntity<>("Title should be 3 characters or more", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(postDto.getDescription().length()<5){
            return new ResponseEntity<>("Description should be 5 characters or more", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/posts/2
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
            if (postService.deletePost(id)) {
                return new ResponseEntity<>("Post is Deleted",HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Id not found",HttpStatus.NOT_FOUND);
            }
    }
}
