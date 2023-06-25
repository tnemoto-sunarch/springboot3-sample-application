package jp.co.sunarch.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.sunarch.sample.dto.ResultDetailTodofuken;
import jp.co.sunarch.sample.entity.TTodofuken;
import jp.co.sunarch.sample.repository.TodofukenRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodofukenService {

	private final TodofukenRepository todofukenRepository;
	
	public List<ResultDetailTodofuken> getTodofukenList(){
		List<TTodofuken> todofukenList = todofukenRepository.findAll();
		List<ResultDetailTodofuken> resultList = new ArrayList<ResultDetailTodofuken>();
		
		for(TTodofuken record : todofukenList) {
			ResultDetailTodofuken result = new ResultDetailTodofuken();
			result.setId(record.getId());
			result.setName(record.getName());
			resultList.add(result);
		}
		return resultList;
	}
}
