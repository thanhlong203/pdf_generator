package yav.offshore.skillsheet.administrator.impl;

import java.util.Map;

import yav.offshore.skillsheet.administrator.SkillDetailAdministrator;
import yav.offshore.skillsheet.cache.SkillDetailCache;
import yav.offshore.skillsheet.orm.po.SkillDetail;
import yav.offshore.skillsheet.service.SkillDetailService;

public class SkillDetailAdministratorImpl implements SkillDetailAdministrator{
	private SkillDetailService skillDetailService;
	private SkillDetailCache skillDetailCache;
	
	public Map<Integer, SkillDetail> getSkillDetailMap() {
		return skillDetailCache.getSkillDetailMap();
	}

	public void setSkillDetailService(SkillDetailService skillDetailService) {
		this.skillDetailService = skillDetailService;
	}

	public void setSkillDetailCache(SkillDetailCache skillDetailCache) {
		this.skillDetailCache = skillDetailCache;
	}

}
