package jp.co.sunarch.sample.controller;

import java.util.Date;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.sunarch.sample.dto.ResponseDto;
import jp.co.sunarch.sample.service.TodofukenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SampleController {

	public final TodofukenService todofukenService;
	
	@RequestMapping("/todofuken/list")
	public ResponseEntity<ResponseDto> todofukenList() {
		ResponseDto response = new ResponseDto();
		
		try {
			response.setResultDetail(todofukenService.getTodofukenList());
			
			response.setResultCode(200);
			response.setResultMessage("処理に成功しました.");
		} catch(Exception e) {
			log.error(e.getMessage(), e);
			response.setResultCode(500);
			response.setResultMessage("処理に失敗しました.");
		} finally {
			response.setProcess(new Date());
		}
		
		return new ResponseEntity<ResponseDto>(response, HttpStatusCode.valueOf(response.getResultCode()));
	}
}
