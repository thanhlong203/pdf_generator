package yav.offshore.skillsheet.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.dao.EmployeeSkillDao;
import yav.offshore.skillsheet.orm.po.EmployeeSkill;
import yav.offshore.skillsheet.service.EmployeeSkillService;

public class EmployeeSkillServiceImpl implements EmployeeSkillService{
	private EmployeeSkillDao employeeSkillDao;
		
	public EmployeeSkill get(int id) {
		return employeeSkillDao.get(id);
	}

	public List<EmployeeSkill> getAll() {
		return employeeSkillDao.getAll();
	}

	public List<EmployeeSkill> getByEmployeeId(int employeeId) {
		return employeeSkillDao.getByEmployeeId(employeeId);
	}

	public Map<Integer, EmployeeSkill> getMapSkillDetail(int employeeId) {
		Map<Integer, EmployeeSkill> map = new HashMap<Integer, EmployeeSkill>();
		for (EmployeeSkill e : getByEmployeeId(employeeId)) {
			map.put(e.getSkillDetailId(), e);
		}
		return map;
	}

	public void setEmployeeSkillDao(EmployeeSkillDao employeeSkillDao) {
		this.employeeSkillDao = employeeSkillDao;
	}

}
