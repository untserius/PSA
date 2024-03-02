package com.blogapp.service;

import com.blogapp.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);

    public List<CommentDto> getALLCommentsByPostId(long id);
}
