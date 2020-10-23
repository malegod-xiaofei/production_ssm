package com.megagao.production.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import com.megagao.production.ssm.domain.vo.COrderVO;
import com.megagao.production.ssm.mapper.BranchMapper;
import com.megagao.production.ssm.service.BranchService;

@Service
public class BranchServicelmpl implements BranchService {

	@Autowired
	private BranchMapper branchMapper;

	@Override
	public List<Branch> find() {
		return branchMapper.find();
	}

	@Override
	public EUDataGridResult getList(int page, int rows) throws Exception {

		// 分页处理
		PageHelper.startPage(page, rows);
		List<Branch> list = branchMapper.find();
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<Branch> pageInfo = new PageInfo<Branch>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchBranchById(int page, int rows, String id)
			throws Exception {
		// 分页处理
		PageHelper.startPage(page, rows);
		List<Branch> list = branchMapper.searchBranchById(id);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<Branch> pageInfo = new PageInfo<Branch>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchBranchByName(int page, int rows, String name)
			throws Exception {
		// 分页处理
		PageHelper.startPage(page, rows);
		List<Branch> list = branchMapper.searchBranchByName(name);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<Branch> pageInfo = new PageInfo<Branch>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchBranchByShortName(int page, int rows,
			String short_name) throws Exception {
		// 分页处理
		PageHelper.startPage(page, rows);
		List<Branch> list = branchMapper.searchBranchByShortName(short_name);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<Branch> pageInfo = new PageInfo<Branch>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
