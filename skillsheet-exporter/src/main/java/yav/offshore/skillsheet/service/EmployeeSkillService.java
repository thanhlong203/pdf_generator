package yav.offshore.skillsheet.service;

import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.orm.po.EmployeeSkill;

public interface EmployeeSkillService {
	EmployeeSkill get(int id);
	List<EmployeeSkill> getAll();
	List<EmployeeSkill> getByEmployeeId(int employeeId);
	Map<Integer, EmployeeSkill> getMapSkillDetail(int employeeId);
}
