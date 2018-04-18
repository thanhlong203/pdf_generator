package yav.offshore.skillsheet.service.impl;

import java.util.List;

import yav.offshore.skillsheet.dao.SkillDetailDao;
import yav.offshore.skillsheet.orm.po.SkillDetail;
import yav.offshore.skillsheet.service.SkillDetailService;


public class SkillDetailServiceImpl implements SkillDetailService{
	private SkillDetailDao skillDetailDao;

	public void setSkillDetailDao(SkillDetailDao skillDetailDao) {
		this.skillDetailDao = skillDetailDao;
	}

	public SkillDetail get(int id) {
		return skillDetailDao.get(id);
	}

	public List<SkillDetail> getAll() {
		return skillDetailDao.getAll();
	}
	
}
