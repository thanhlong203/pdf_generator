package yav.offshore.skillsheet.service;

import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.orm.po.EmployeeExperienceDetail;

public interface EmployeeExperienceDetailService {
	EmployeeExperienceDetail get(int id);
	List<EmployeeExperienceDetail> getAll();
	List<EmployeeExperienceDetail> getByEmployeeID(int employeeId);
	Map<Integer, EmployeeExperienceDetail> getEmployeeExperienceMap(int employeeId);
}
