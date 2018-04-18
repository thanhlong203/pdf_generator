package yav.offshore.skillsheet.dao;

import java.util.List;

import yav.offshore.skillsheet.orm.po.EmployeeExperienceDetail;

public interface EmployeeExperienceDetailDao extends Dao<EmployeeExperienceDetail>{
	List<EmployeeExperienceDetail> getByEmployeeId(int employeeId);
}
