package yav.offshore.skillsheet.service;

import java.util.List;

import yav.offshore.skillsheet.orm.po.SkillGroup;

public interface SkillGroupService {
	SkillGroup get(int id);
	List<SkillGroup> getAll();
}
