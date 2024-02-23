package com.blogapp.service.impl;

import com.blogapp.entity.Post;
import com.blogapp.payload.PostDto;
import com.blogapp.repository.PostRepository;
import com.blogapp.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    private final ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PostDto createPost(PostDto postDto){ // send details from dto to entity
        Post post = mapToEntity(postDto);

        Post savedPost = postRepository.save(post); // .save helps to save data in db using jpa

        PostDto dto = mapToDto(savedPost); // send details from entity to dto

        return dto;
    }

    @Override
    public boolean deletePost(long id) {
        // Check if the post with the given ID exists before attempting to delete it
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true; // Return true if deletion was successful
        } else {
            return false; // Return false if the post with the given ID does not exist
        }
    }

    Post mapToEntity(PostDto postDto){
        Post post = modelMapper.map(postDto, Post.class);
        return post;
    }

    PostDto mapToDto(Post post){
        PostDto dto = modelMapper.map(post, PostDto.class);
        return dto;
    }
}
