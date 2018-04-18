package yav.offshore.skillsheet.service;

import java.util.List;

import yav.offshore.skillsheet.orm.po.SkillDetail;

public interface SkillDetailService {
	SkillDetail get(int id);
	List<SkillDetail> getAll();
}
