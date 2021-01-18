package free.com.service.bscfunction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import free.com.bean.Opinion;
import free.com.bean.bscfunction.Bsc0010From;
import free.com.bean.bscfunction.Bsc0010ResultDto;
import free.com.bean.bscfunction.Bsc0010SearchDto;
import free.com.dao.bscfunction.Bsc0010Dao;

@Service
public class Bsc0010Service {

	@Autowired
	private Bsc0010Dao dao;

	public void registered(Opinion opinion) {
		dao.registered(opinion);
	}

	public List<Bsc0010From> getResult(Bsc0010SearchDto searchDto) {
		List<Bsc0010ResultDto> result = dao.getResult(searchDto);
		List<Bsc0010From> fromList = new ArrayList<Bsc0010From>();
		for(Bsc0010ResultDto dto : result) {
			Bsc0010From from = new Bsc0010From();
			BeanUtils.copyProperties(dto, from);
			fromList.add(from);
		}
		return fromList;
	}

	public void delete(Opinion opinion) {
		dao.delete(opinion);
	}
	public void update(Opinion opinion) {
		dao.update(opinion);
	}
}
