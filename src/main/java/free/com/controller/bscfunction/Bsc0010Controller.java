package free.com.controller.bscfunction;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

import free.com.bean.Opinion;
import free.com.bean.bscfunction.Bsc0010From;
import free.com.bean.bscfunction.Bsc0010SearchDto;
import free.com.common.CommonUtil;
import free.com.service.bscfunction.Bsc0010Service;
import free.com.utils.CommonConstants;
import free.com.utils.StringUtils;

/**
 * User Information Configure
 *
 * @author cao
 *
 */

@Controller
@RequestMapping("bsc0010")
public class Bsc0010Controller {

	@Autowired
	private Bsc0010Service service;

	@Autowired
	private Opinion opinion;

	@RequestMapping("init")
	public String init(Model model) {
		return CommonConstants.FOLDER_BASIC_FUNCTION + "bsc0010";
	}

	@RequestMapping("registered")
	public String registered(HttpServletRequest request, HttpServletResponse response, Model model) {
		Bsc0010From from = CommonUtil.getBean(Bsc0010From.class, request);
		opinion.setOpinionContent(from.getOpinionText().trim());
		opinion.setUpdUserId(CommonUtil.getUserInfo().getUserId());
		opinion.setUpdDate(CommonUtil.getSysDate());
		opinion.setInsUserId(CommonUtil.getUserInfo().getUserId());
		opinion.setInsDate(CommonUtil.getSysDate());
		service.registered(opinion);
		model.addAttribute("submitMark", CommonConstants.SUCCESS);
		return CommonConstants.FOLDER_BASIC_FUNCTION + "bsc0010";
	}

	@RequestMapping("result")
	public String getResult(HttpServletRequest request, HttpServletResponse response, Model model) {
		Bsc0010SearchDto searchDto = CommonUtil.getBean(Bsc0010SearchDto.class, request);
		Map<String, Object> map = CommonUtil.getBean(request);
		List<Bsc0010From> result = service.getResult(searchDto);
		model.addAttribute("bsc0010From", result);
		//更新或删除前的确认画面
		if (!StringUtils.isEmpty(searchDto.getDataId())) {
			if (map.containsKey("flg") && map.get("flg").equals("upd")) {
				StringBuffer markBuf = new StringBuffer(result.get(0).getOpinionText());
				markBuf.append("\r\n-----------------------------------------------------------\r\n");
				result.get(0).setOpinionText(markBuf.toString());
				model.addAttribute("bsc0010Result", result.get(0));
				return CommonConstants.FOLDER_BASIC_FUNCTION + "bsc001002";
			}
			response.setCharacterEncoding("utf-8");
			try {
				JSONObject jsonObj = new JSONObject();
				jsonObj.put("bsc0010UpdOrDelDto", result);
				response.getWriter().print(jsonObj);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		return CommonConstants.FOLDER_BASIC_FUNCTION + "bsc001001";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model) {
		Bsc0010SearchDto searchDto = CommonUtil.getBean(Bsc0010SearchDto.class, request);
		Opinion opinion = new Opinion();
		opinion.setId(Integer.valueOf(searchDto.getDataId()));
		service.delete(opinion);
		return "redirect:/bsc0010/result";
	}

	@RequestMapping("update")
	public String update(HttpServletRequest request, HttpServletResponse response, Model model) {
		Opinion opinion = CommonUtil.getBean(Opinion.class, request);
		StringBuffer bf = new StringBuffer(opinion.getOpinionContent());
		if (opinion.getOpinionContent().contains("-----------------------------------------------------------")) {
			bf.append("\r\n回复者：" + CommonUtil.getUserInfo().getAccountName());
			bf.append("    回复时间：" + CommonUtil.getSysDateText());
		}
		opinion.setOpinionContent(bf.toString());
		service.update(opinion);
		return "redirect:/bsc0010/result";
	}
}
