package com.cuevasprojects.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
