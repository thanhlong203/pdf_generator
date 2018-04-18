package yav.offshore.skillsheet.cache;

import java.util.Map;

import yav.offshore.skillsheet.orm.po.SkillDetail;

public interface SkillDetailCache {
	Map<Integer, SkillDetail> getSkillDetailMap();
}
