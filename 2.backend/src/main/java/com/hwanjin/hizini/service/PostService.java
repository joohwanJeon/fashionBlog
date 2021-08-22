package com.hwanjin.hizini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hwanjin.hizini.domain.dao.PostMapper;
import com.hwanjin.hizini.domain.dto.ImageDTO;
import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.domain.dto.PostDTO;
import com.hwanjin.hizini.exception.BizException;

@Service
public class PostService {
	
	@Autowired 
	private PostMapper postmapper;
	
	public void createPost(PostDTO post) {
		postmapper.createPost(post);
		for(ImageDTO image: post.getImages()) {
			postmapper.createImage(post.getId(), image);
		}
	}

	public PostDTO getPost(int id) {
		PostDTO post = new PostDTO(id);
		List<PostDTO> posts = postmapper.selectPost(post);
		
		if(posts.isEmpty()) {
			throw new BizException("없슴둥");
		}

		return posts.get(0);
	}
	
	public List<PostDTO> getPosts(PostDTO post) {
		if(post == null) {
			post = new PostDTO();
		}
		return postmapper.selectPost(post);
	}

	
	public void updatePost(PostDTO post) {
		postmapper.updatePost(post);
	}
	
	public void deletePost(String id) {
		postmapper.deletePost(id);
	}
}
