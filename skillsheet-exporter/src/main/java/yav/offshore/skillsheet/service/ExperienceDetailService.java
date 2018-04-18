package yav.offshore.skillsheet.service;

import java.util.List;

import yav.offshore.skillsheet.orm.po.ExperienceDetail;

public interface ExperienceDetailService {
	ExperienceDetail getExperience(int id);
	List<ExperienceDetail> getAllExperiences();
}
