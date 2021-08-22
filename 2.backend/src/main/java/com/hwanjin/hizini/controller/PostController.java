package com.hwanjin.hizini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.domain.dto.PostDTO;
import com.hwanjin.hizini.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value="/createPost", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO> createPost(@RequestBody PostDTO post) {
		postService.createPost(post);
		return ResponseEntity.ok(new MessageDTO<>("OK"));
	}
	
	@RequestMapping(value="/getPost", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<PostDTO>> getPost(@RequestParam int id) {
		PostDTO post = postService.getPost(id);
		return ResponseEntity.ok(new MessageDTO<>(post, "OK"));
	}
	
	@RequestMapping(value="/getPosts", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<List<PostDTO>>> getPosts(PostDTO post) {
		List<PostDTO> posts = postService.getPosts(post);
		return ResponseEntity.ok(new MessageDTO<>(posts, "OK"));
	}
	
	@RequestMapping(value="/updatePost", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO> updatePost(@RequestBody PostDTO post) {
		postService.updatePost(post);
		return ResponseEntity.ok(new MessageDTO<>("OK"));
	}
	
	@RequestMapping(value="/deletePost", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO> deletePost(@RequestBody String id) {
		postService.deletePost(id);
		return ResponseEntity.ok(new MessageDTO<>("OK"));  
	}

	

}
