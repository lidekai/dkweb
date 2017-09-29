package net.myweb.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.myweb.dao.TestDao;
import net.myweb.model.TestModel;
import net.myweb.service.TestService;
@Service
@Transactional
public class TestServiceImpl implements TestService{
	
	
	public TestDao testDao;
	@Autowired
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
    
	@Override
	public List<TestModel> getAllTest() {
		// TODO Auto-generated method stub
		return testDao.getAllTest();
	}
	
}
