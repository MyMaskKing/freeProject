package free.com.controller.bscfunction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import free.com.bean.Opinion;
import free.com.bean.bscfunction.Bsc0000ResultDto;
import free.com.bean.bscfunction.Bsc0000SearchDto;
import free.com.service.bscfunction.Bsc0000Service;
import free.com.utils.CommonConstants;

/**
 * User Information Configure
 *
 * @author cao
 *
 */

@Controller
@RequestMapping("bsc0000")
public class Bsc0000Controller {

	@Autowired
	private Bsc0000Service service;

	@Autowired
	private Opinion opinion;

	@RequestMapping("init")
	public String init(Model model) {
		Bsc0000SearchDto searchDto = new Bsc0000SearchDto();
		List<Bsc0000ResultDto> result = service.getResult(searchDto);
		model.addAttribute("bsc0000Result", result);
		return CommonConstants.FOLDER_BASIC_FUNCTION + "bsc0000";
	}

}
