package yav.offshore.skillsheet.cache;

import java.util.Map;

import yav.offshore.skillsheet.orm.po.ExperienceDetail;

public interface ExperienceCache {
	Map<Integer, ExperienceDetail> getMapExperience();
}
