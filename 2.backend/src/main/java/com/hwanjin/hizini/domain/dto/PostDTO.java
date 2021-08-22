package com.hwanjin.hizini.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostDTO {
	private int id;
	private List<ImageDTO> images;
	private String title;
	private String userId;
	private int like;
	private LocalDateTime insertDtm;
	private LocalDateTime updateDtm;
	private LocalDateTime deleteDtm;
	private int count;

	public PostDTO(int id) {
		super();
		this.id = id;
	}

}
