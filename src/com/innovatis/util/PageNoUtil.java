package com.innovatis.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class PageNoUtil {
	public static List<?> getList(Session session,String hql,int pageSize,int pageNow){
		Query query = session.createQuery(hql);
		query.setFirstResult(pageSize*(pageNow-1));
		query.setMaxResults(pageSize);
		List<?> list = query.list();
		return list;
	};
}
