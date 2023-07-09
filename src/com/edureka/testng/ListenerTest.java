package com.edureka.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	@Override
	public void onFinish(ITestContext Result) {
		
	}
	@Override
	public void onStart(ITestContext Result) {
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
	}
	@Override
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println(Result.getName()+"test case started");
		
	}
	

}

