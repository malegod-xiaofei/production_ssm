package com.megagao.production.ssm.mapper;

import java.util.List;

import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.vo.COrderVO;

public interface BranchMapper {
	public List<Branch> find();

	// 根据订单id查找订单信息
	public List<Branch> searchBranchById(String id);
	public List<Branch> searchBranchByName(String name);
	public List<Branch> searchBranchByShortName(String short_name);
}
