package yav.offshore.skillsheet.cache.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yav.offshore.skillsheet.cache.SkillDetailCache;
import yav.offshore.skillsheet.orm.po.SkillDetail;
import yav.offshore.skillsheet.service.SkillDetailService;

public class SkillDetailCacheImpl implements SkillDetailCache{
	private SkillDetailService skillDetailService;
	private Map<Integer, SkillDetail> skillDetailMap;
	
	public Map<Integer, SkillDetail> getSkillDetailMap() {
		if (null == this.skillDetailMap) {
			this.skillDetailMap = new HashMap<Integer, SkillDetail>();
			List<SkillDetail> lst = skillDetailService.getAll();
			for (SkillDetail s : lst) {
				this.skillDetailMap.put(s.getId(), s);
			}
		}
		return this.skillDetailMap;
	}

	public void setSkillDetailService(SkillDetailService skillDetailService) {
		this.skillDetailService = skillDetailService;
	}
	
}
