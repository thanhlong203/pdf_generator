package yav.offshore.skillsheet.dao.impl;

import java.util.List;

import yav.offshore.skillsheet.dao.EmployeeSkillDao;
import yav.offshore.skillsheet.orm.po.EmployeeSkill;

public class EmployeeSkillDaoImpl extends MyBatisDao<EmployeeSkill> implements EmployeeSkillDao{

	public List<EmployeeSkill> getByEmployeeId(int employeeId) {
		return getSqlSession().selectList(getStatement("getByEmployeeId"), employeeId);
	}

}
