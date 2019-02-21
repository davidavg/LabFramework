package general;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("--> Listener --> Test Case start --> " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("--> Listener --> Test Case Success --> " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("--> Listener --> Test Case Failure --> " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("--> Listener --> Test Case Skipped --> " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("--> Listener --> Test Set start --> " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("--> Listener --> Test Set finish --> " + context.getName());
	}

}
