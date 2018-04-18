package yav.offshore.skillsheet.cache.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.cache.ExperienceCache;
import yav.offshore.skillsheet.orm.po.ExperienceDetail;
import yav.offshore.skillsheet.service.ExperienceDetailService;

public class ExperienceCacheImpl implements ExperienceCache{
	private ExperienceDetailService experienceDetailService;
	private Map<Integer, ExperienceDetail> mapExperience;
	
	public Map<Integer, ExperienceDetail> getMapExperience() {
		if (null == this.mapExperience) {
			mapExperience = new HashMap<Integer, ExperienceDetail>();
			List<ExperienceDetail> lst = experienceDetailService.getAllExperiences();
			for (ExperienceDetail e : lst) {
				mapExperience.put(e.getId(), e);
			}
		}
		return this.mapExperience;
	}

	public void setExperienceDetailService(ExperienceDetailService experienceDetailService) {
		this.experienceDetailService = experienceDetailService;
	}

}
