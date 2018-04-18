package yav.offshore.skillsheet.service;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yav.offshore.skillsheet.orm.po.EmployeeSkill;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-config.xml");

		EmployeeSkillService output = (EmployeeSkillService) context.getBean("employeeskillservice");
		Map<Integer, EmployeeSkill> po = output.getMapSkillDetail(116);
		System.out.println(po);
    }

}
