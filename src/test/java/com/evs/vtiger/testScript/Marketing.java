package com.evs.vtiger.testScript;

import java.util.Map;

import org.testng.annotations.Test;

import com.eva.marketing.Account.AcccountCreation;
import com.eva.marketing.Leads.LeadsCreation;
import com.eva.marketing.document.DocumentsClass;

public class Marketing extends BaseClass {
     
	@Test( retryAnalyzer = RetryAnalyzer.class,enabled = true)
	public void vt001AccountCreation() throws InterruptedException {
		cd.gotoMarketingAccountpage();
		cd.clickOnUniversalCreateButton();
		AcccountCreation acobj = new AcccountCreation(kw);
		String filePath = "C:\\Users\\dell\\Desktop\\ExcelDummy.xlsx";
        String sheetName = "Exceldummy";
        String testCaseName = "TC002";
        Map<String, String> testData = ExcelUtility.readTestData(filePath, sheetName, testCaseName);
		acobj.marketingAccountCreation(testData);
		//System.out.println(1/0);
		cd.savebutton();
		Thread.sleep(5000);
	}
	
	@Test(invocationCount  = 1,enabled = false)
	public void vt002LeadsCreation()
	{
	  cd.gotoMarketingLeadspage();
	  cd.clickOnUniversalCreateButton();
	  LeadsCreation ld=     new LeadsCreation(kw);
	  String filePath = "C:\\Users\\dell\\Desktop\\ExcelDummy.xlsx";
      String sheetName = "MarketingLeads";
      String testCaseName = "TC002";
      Map<String, String> testData = ExcelUtility.readTestData(filePath, sheetName, testCaseName);
        ld.marketingLeadsCreation(testData);  
	}
	
	@Test(invocationCount = 1, retryAnalyzer = RetryAnalyzer.class,enabled = false)
	public void vt003Documentcreation()
	{
		cd.gotoMarketingDocumentspage();
		cd.clickOnUniversalCreateButton();
		DocumentsClass  docu=   new DocumentsClass(kw);
		String filePath = "C:\\Users\\dell\\Desktop\\ExcelDummy.xlsx";
	      String sheetName = "Documents";
	      String testCaseName = "TC003";	
	      Map<String, String> testData = ExcelUtility.readTestData(filePath, sheetName, testCaseName);
	      docu.createDocuments(testData);
	      kw.switchoutFromeFrame();
	      cd.savebutton();
	}
     
	
	}


