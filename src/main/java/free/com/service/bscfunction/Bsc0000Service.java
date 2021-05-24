package free.com.service.bscfunction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import free.com.bean.bscfunction.Bsc0000ResultDto;
import free.com.bean.bscfunction.Bsc0000SearchDto;
import free.com.dao.bscfunction.Bsc0000Dao;

@Service
public class Bsc0000Service {

	@Autowired
	private Bsc0000Dao dao;


	public List<Bsc0000ResultDto> getResult(Bsc0000SearchDto searchDto) {
		return dao.getResult(searchDto);
	}

}
