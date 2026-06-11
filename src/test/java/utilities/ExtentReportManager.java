package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter("reports/ParaBankExtentReport.html");

            sparkReporter.config().setReportName("ParaBank Capstone Automation Report");
            sparkReporter.config().setDocumentTitle("ParaBank Automation Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Project", "ParaBank Capstone Automation Framework");
            extent.setSystemInfo("Application", "ParaBank");
            extent.setSystemInfo("Tester", "Manish Chaudhary");
            extent.setSystemInfo("Framework", "Hybrid Framework - POM + Data Driven");
        }

        return extent;
    }

	
}