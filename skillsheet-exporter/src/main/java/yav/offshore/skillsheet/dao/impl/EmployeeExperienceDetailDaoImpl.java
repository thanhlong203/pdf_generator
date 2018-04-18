package yav.offshore.skillsheet.dao.impl;

import java.util.List;

import yav.offshore.skillsheet.dao.EmployeeExperienceDetailDao;
import yav.offshore.skillsheet.orm.po.EmployeeExperienceDetail;

public class EmployeeExperienceDetailDaoImpl extends MyBatisDao<EmployeeExperienceDetail> implements EmployeeExperienceDetailDao{

	public List<EmployeeExperienceDetail> getByEmployeeId(int employeeId) {
		return getSqlSession().selectList(getStatement("getByEmployeeId"), employeeId);
	}
	
}
