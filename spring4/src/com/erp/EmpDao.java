package com.erp;

import org.apache.log4j.Logger;
import org.springframework.orm.ibatis.SqlMapTemplate;


import com.vo.EmpVO;

public class EmpDao {
	Logger logger = Logger.getLogger(EmpDao.class);
	public SqlMapTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlMapTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void empInsert(EmpVO eVO) throws DataAccessException {
		logger.info("empInsert 호출성공");
		eVO = new EmpVO();
		eVO.setEmpno(9001);
		eVO.setEname("김유신");
		sqlSessionTemplate.insert("empInsert",eVO);
		
	}
}
