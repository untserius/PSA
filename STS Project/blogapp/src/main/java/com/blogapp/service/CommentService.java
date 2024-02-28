package com.blogapp.service;

import com.blogapp.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);
}
