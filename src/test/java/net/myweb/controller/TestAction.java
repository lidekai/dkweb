package net.myweb.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import net.myweb.model.TestModel;
import net.myweb.service.TestService;

@Controller
@RequestMapping(value="/show")
public class TestAction {
	public TestService testServiceImpl;
	@Autowired
	public void setTestService(TestService testServiceImpl) {
		this.testServiceImpl = testServiceImpl;
	}
	/**
	 * 功能：获取test表的所有数据
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/date")
    public String editItemsQuery(Model model) throws Exception{
		List<TestModel> itemsList = testServiceImpl.getAllTest();
		model.addAttribute("itemsList", itemsList);
		return "show";
	}
}
