package yav.offshore.skillsheet.administrator;

import java.util.Map;

import yav.offshore.skillsheet.orm.po.ExperienceDetail;

public interface ExperienceDetailAdministrator {
	Map<Integer, ExperienceDetail> getMapExperience();
}
