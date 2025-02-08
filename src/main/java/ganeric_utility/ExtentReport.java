package ganeric_utility;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener{

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context)
	{
		String time = new Date().toString().replace(" ","_").replace(":","_");
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html"+time);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("VtigerReports");
		spark.config().setReportName("viraj");

		report=	new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Platform", "Windows");
		report.setSystemInfo("ExecutedBy", "VIRAJ");
		report.setSystemInfo("ReviewedBy", "RAM");

	}

	@Override
	public void onTestStart(ITestResult result)
	{
		test = report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());

		String screenshot= null;
		try {
			screenshot = Webdriver_Utility.TakeScreenshot(BaseClass.sdriver, screenshot);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshot);
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}

}
