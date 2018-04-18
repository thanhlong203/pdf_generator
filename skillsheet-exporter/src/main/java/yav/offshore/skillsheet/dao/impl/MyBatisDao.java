package yav.offshore.skillsheet.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import yav.offshore.skillsheet.dao.Dao;
import yav.offshore.skillsheet.util.Collections;


public class MyBatisDao<T> extends SqlSessionDaoSupport implements Dao<T> {
	protected final ConcurrentHashMap<String, String> statements;
	protected final Class<? extends T> actualType;
	
	public MyBatisDao() {
		this.actualType = this.detectActualType();
		this.statements = new ConcurrentHashMap<String, String>();
	}
	
	public T get(Serializable id) {
		return getSqlSession().selectOne(getStatement("get"), id);
	}
	
	public List<T> getAll(){
		return getSqlSession().selectList(getStatement("getAll"));
	}
	
	protected String getStatement(String query) {
		String r = this.statements.get(query);
		if(r == null) {
			r = this.actualType.getCanonicalName() + "." + query;
			r = Collections.putIfAbsent(this.statements, query, r);
		}
		return r;
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> detectActualType() {
		//
		Class<?> clazz = getClass();
		while(clazz.getSuperclass() != MyBatisDao.class) {
			clazz = clazz.getSuperclass();
		}
		
		//
		final Type type = clazz.getGenericSuperclass();
		return (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
	}
	
}
