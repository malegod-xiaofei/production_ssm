package com.megagao.production.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import com.megagao.production.ssm.service.BranchService;

@Controller
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;

	@RequestMapping("/find")
	public String find() throws Exception {
		return "branch_list";
	}

	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows)
			throws Exception {
		EUDataGridResult result = branchService.getList(page, rows);
		return result;
	}

	// 根据订单id查找
	@RequestMapping("/search_branch_by_id")
	@ResponseBody
	public EUDataGridResult searchBranchById(Integer page, Integer rows,
			String searchValue) throws Exception {
		EUDataGridResult result = branchService.searchBranchById(page, rows,
				searchValue);
		return result;
	}

	@RequestMapping("/search_branch_by_name")
	@ResponseBody
	public EUDataGridResult searchBranchByName(Integer page, Integer rows,
			String searchValue) throws Exception {
		searchValue = new String(searchValue.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(searchValue);
		EUDataGridResult result = branchService.searchBranchById(page, rows,
				searchValue);
		return result;
	}

	@RequestMapping("/search_branch_by_short_name")
	@ResponseBody
	public EUDataGridResult searchBranchByShortName(Integer page, Integer rows,
			String searchValue) throws Exception {
		searchValue = new String(searchValue.getBytes("ISO-8859-1"), "UTF-8");
		EUDataGridResult result = branchService.searchBranchById(page, rows,
				searchValue);
		return result;
	}

}
