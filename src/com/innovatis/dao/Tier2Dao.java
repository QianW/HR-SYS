package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Tier2;

public interface Tier2Dao extends BaseDao<Tier2> {

  @Override
  public List<Tier2> findAll();
}
