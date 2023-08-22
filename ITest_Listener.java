package tutorial_selenium;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITest_Listener implements ITestListener {
	public void onTestFailure(ITestResult result){
		System.out.println("One test case has failed!!");
	}
	public void onTestSuccess(ITestResult result){
		System.out.println("One test case has passed!!");
	}
}
