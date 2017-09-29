package net.myweb.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.myweb.model.TestModel;

public interface TestDao {
	//获取test表所有数据
	public List<TestModel> getAllTest();
}
