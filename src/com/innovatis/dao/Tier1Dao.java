package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Tier1;

public interface Tier1Dao extends BaseDao<Tier1> {

  @Override
  public List<Tier1> findAll();
}
