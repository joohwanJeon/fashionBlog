package com.hwanjin.hizini.domain.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ImageDTO {
	private int id;
	private int postId;
	private String fileName;
	private String filePath;
	private LocalDateTime insertDtm;
	private char delYn;
}
