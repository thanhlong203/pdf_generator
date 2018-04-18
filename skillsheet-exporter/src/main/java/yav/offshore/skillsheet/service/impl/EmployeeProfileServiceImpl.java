package yav.offshore.skillsheet.service.impl;

import yav.offshore.skillsheet.dao.EmployeeProfileDao;
import yav.offshore.skillsheet.orm.po.EmployeeProfile;
import yav.offshore.skillsheet.service.EmployeeProfileService;

public class EmployeeProfileServiceImpl implements EmployeeProfileService{
	EmployeeProfileDao employeeProfileDao;
	
	@Override
	public EmployeeProfile get(int id) {
		return employeeProfileDao.get(id);
	}

	public void setEmployeeProfileDao(EmployeeProfileDao employeeProfileDao) {
		this.employeeProfileDao = employeeProfileDao;
	}
}
