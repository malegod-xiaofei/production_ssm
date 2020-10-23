package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface BranchService {
	public List<Branch> find();

	/**
	 * 分页插件查询
	 * 
	 * 两个参数 一个是要分开的页数,另一个是行数
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	EUDataGridResult getList(int page, int rows) throws Exception;

	public EUDataGridResult searchBranchById(int page, int rows, String orderId)
			throws Exception;

	public EUDataGridResult searchBranchByName(int page, int rows, String name)
			throws Exception;

	public EUDataGridResult searchBranchByShortName(int page, int rows,
			String short_name) throws Exception;
}
