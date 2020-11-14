package com.cuevasprojects.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
