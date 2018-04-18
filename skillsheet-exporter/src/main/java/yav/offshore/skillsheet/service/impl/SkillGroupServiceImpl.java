package yav.offshore.skillsheet.service.impl;

import java.util.List;

import yav.offshore.skillsheet.dao.SkillGroupDao;
import yav.offshore.skillsheet.orm.po.SkillGroup;
import yav.offshore.skillsheet.service.SkillGroupService;

public class SkillGroupServiceImpl implements SkillGroupService{
	SkillGroupDao skillGroupDao;
	public SkillGroup get(int id) {
		return skillGroupDao.get(id);
	}

	public List<SkillGroup> getAll() {
		return skillGroupDao.getAll();
	}

}
