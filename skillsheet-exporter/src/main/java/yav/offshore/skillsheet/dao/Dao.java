package yav.offshore.skillsheet.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {
	T get(Serializable id);
	List<T> getAll();
}
