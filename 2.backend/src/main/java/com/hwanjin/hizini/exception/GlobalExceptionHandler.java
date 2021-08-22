package com.hwanjin.hizini.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwanjin.hizini.domain.dto.MessageDTO;

@ControllerAdvice
public class GlobalExceptionHandler{
	
	@ExceptionHandler(BizException.class)
	public ResponseEntity<MessageDTO<String>> bizExceptionHandler(BizException message) {
		return ResponseEntity.badRequest().body(new MessageDTO<String>(message.getMessage(), "NG"));
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<MessageDTO<String>> exceptionHandler(Exception e) {
		//TO-DO 로그추가
		return ResponseEntity.badRequest().body(new MessageDTO<String>(e.getMessage(), "NG"));
	}
}
