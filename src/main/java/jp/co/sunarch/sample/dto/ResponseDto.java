package jp.co.sunarch.sample.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {

	private int resultCode;
	private String resultMessage;
	private Date process;
	
	private Object resultDetail;
}
