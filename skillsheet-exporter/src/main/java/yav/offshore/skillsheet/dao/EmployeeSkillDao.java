package yav.offshore.skillsheet.dao;

import java.util.List;

import yav.offshore.skillsheet.orm.po.EmployeeSkill;

public interface EmployeeSkillDao extends Dao<EmployeeSkill>{
	List<EmployeeSkill> getByEmployeeId(int id);
}
