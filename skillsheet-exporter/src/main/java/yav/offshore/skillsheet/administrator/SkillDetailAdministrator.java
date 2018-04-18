package yav.offshore.skillsheet.administrator;

import java.util.Map;

import yav.offshore.skillsheet.orm.po.SkillDetail;

public interface SkillDetailAdministrator {
	Map<Integer, SkillDetail> getSkillDetailMap();
}
