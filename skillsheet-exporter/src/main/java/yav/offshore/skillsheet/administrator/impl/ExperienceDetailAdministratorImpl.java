package yav.offshore.skillsheet.administrator.impl;

import java.util.Map;

import yav.offshore.skillsheet.administrator.ExperienceDetailAdministrator;
import yav.offshore.skillsheet.cache.ExperienceCache;
import yav.offshore.skillsheet.orm.po.ExperienceDetail;
import yav.offshore.skillsheet.service.ExperienceDetailService;

public class ExperienceDetailAdministratorImpl implements ExperienceDetailAdministrator{
	private ExperienceDetailService experienceDetailService;
	private ExperienceCache experienceCache;
	
	public Map<Integer, ExperienceDetail> getMapExperience() {
		return experienceCache.getMapExperience();
	}

	public void setExperienceDetailService(ExperienceDetailService experienceDetailService) {
		this.experienceDetailService = experienceDetailService;
	}

	public void setExperienceCache(ExperienceCache experienceCache) {
		this.experienceCache = experienceCache;
	}
}
