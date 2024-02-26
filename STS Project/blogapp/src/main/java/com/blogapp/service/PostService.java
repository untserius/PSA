package com.blogapp.service;

import com.blogapp.payload.PostDto;

import java.util.List;

public interface PostService {

    public PostDto createPost(PostDto postDto);

    boolean deletePost(long id);

    List<PostDto> fetchAllPosts(int pageNo, int pageSize, String sortBy);
}
