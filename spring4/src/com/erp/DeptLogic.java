package com.erp;

import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class DeptLogic  extends MultiActionController{
	public DeptLogic deptLogic = null;
	public void setDeptLogic(DeptLogic deptLogic) {
		this.deptLogic = deptLogic;        
	}
	public List<Map<String,Object>>  deptList() {
		logger.info("deptList 호출 성공");
		List<Map<String,Object>> deptList = null;
		deptList = deptDao.deptList();
		return deptList;
	}
	

}
