package net.myweb.model;

public class TestModel {
	public Integer testID;
	public String testName;
	public String testSex;
	public Integer testAge;
	
	public TestModel() {
		super();
	}
	public TestModel(Integer testID, String testName, String testSex, Integer testAge) {
		super();
		this.testID = testID;
		this.testName = testName;
		this.testSex = testSex;
		this.testAge = testAge;
	}
  
	public Integer getTestID() {
		return testID;
	}
	public void setTestID(Integer testID) {
		this.testID = testID;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestSex() {
		return testSex;
	}
	public void setTestSex(String testSex) {
		this.testSex = testSex;
	}
	public Integer getTestAge() {
		return testAge;
	}
	public void setTestAge(Integer testAge) {
		this.testAge = testAge;
	}
	
	
}