package com.erp;

import org.apache.log4j.Logger;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class DeptDao {
	Logger logger = Logger.getLogger(DeptDao.class);
	public void deptInsert(Object object) {
		logger.info("DeptInsert 호출성공");
	}
	public void deptInsert(DeptVO dVO) throws DataAccessException {
		logger.info("deptInsert 호출성공");
		dVO = new DeptVO();
		dVO.setDeptno(9001);
		dVO.setDname("김유신");
		sqlSessionTemplate.insert("deptInsert",dVO);
		
	}
}
