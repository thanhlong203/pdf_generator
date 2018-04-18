package yav.offshore.skillsheet.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.dao.EmployeeExperienceDetailDao;
import yav.offshore.skillsheet.orm.po.EmployeeExperienceDetail;
import yav.offshore.skillsheet.service.EmployeeExperienceDetailService;

public class EmployeeExperienceDetailServiceImpl implements EmployeeExperienceDetailService{
	private EmployeeExperienceDetailDao employeeExperienceDetailDao;

	public EmployeeExperienceDetail get(int id) {
		return employeeExperienceDetailDao.get(id);
	}

	public List<EmployeeExperienceDetail> getAll() {
		return employeeExperienceDetailDao.getAll();
	}

	public List<EmployeeExperienceDetail> getByEmployeeID(int employeeId) {
		return employeeExperienceDetailDao.getByEmployeeId(employeeId);
	};
	
	public Map<Integer, EmployeeExperienceDetail> getEmployeeExperienceMap(int employeeId) {
		Map<Integer, EmployeeExperienceDetail> map = new HashMap<Integer, EmployeeExperienceDetail>();
		for (EmployeeExperienceDetail e : getByEmployeeID(employeeId)) {
			map.put(e.getExperienceDetailId(), e);
		}
		return map;
	}
	
	public void setEmployeeExperienceDetailDao(EmployeeExperienceDetailDao employeeExperienceDetailDao) {
		this.employeeExperienceDetailDao = employeeExperienceDetailDao;
	}

}
