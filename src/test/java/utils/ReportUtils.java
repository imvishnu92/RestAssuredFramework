package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Configuration;

public class ReportUtils {
    public static void main(String[] args){
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-reports/cucumber.json");
        jsonFiles.add("target/cucumber-reports/rerun.json");
        Configuration configuration = new Configuration(reportOutputDirectory, "API Automation");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
