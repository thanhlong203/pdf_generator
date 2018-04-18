package yav.offshore.skillsheet.service.impl;

import java.util.List;

import yav.offshore.skillsheet.dao.ExperienceDetailDao;
import yav.offshore.skillsheet.orm.po.ExperienceDetail;
import yav.offshore.skillsheet.service.ExperienceDetailService;

public class ExperienceDetailServiceImpl implements ExperienceDetailService{
	private ExperienceDetailDao experienceDetailDao;
	
	public ExperienceDetail getExperience(int id) {
		return experienceDetailDao.get(id);
	}
	
	public List<ExperienceDetail> getAllExperiences() {
		return experienceDetailDao.getAll();
	}

	public void setExperienceDetailDao(ExperienceDetailDao experienceDetailDao) {
		this.experienceDetailDao = experienceDetailDao;
	}
}
