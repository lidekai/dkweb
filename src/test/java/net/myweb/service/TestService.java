package net.myweb.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import net.myweb.model.TestModel;


public interface TestService {
	//获取test表所有数据
	public List<TestModel> getAllTest();
}
