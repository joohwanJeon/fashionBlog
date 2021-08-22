package com.hwanjin.hizini.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;

import com.hwanjin.hizini.domain.dto.ImageDTO;
import com.hwanjin.hizini.domain.dto.PostDTO;

public interface PostMapper {
	
	public int createPost(PostDTO post);
	public int createImage(@Param("postId") int postId, ImageDTO image);
	public List<PostDTO> selectPost(@Nullable PostDTO post);
	public int updatePost(PostDTO post);
	public int deletePost(String id);

}
