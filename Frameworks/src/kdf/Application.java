package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test
	public void applicationLoginTest() throws IOException {
		String[][] data = GenericMethods.getData("D:\\SelMar29\\TestData.xlsx", "Sheet2");
		for(int i = 1;i<data.length;i++) {
			switch(data[i][3]) {
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.maiximizeBrowser();
				break;
			case "impWait":
				Methods.implicitlyWait();
				break;
			case "openApplication":
				Methods.navigateToApplication(data[i][6]);
				break;
			case "enterUserID":
				Methods.enterUserName(data[i][6], data[i][5],data[i][4]);
				break;
			case "enterPassword":
				Methods.enterPassword(data[i][6], data[i][5],data[i][4]);
				break;
			case "clickLogin":
				Methods.clickSignInButton(data[i][4],data[i][5]);
				break;
			case "verifyErrMsg":
				Methods.verifyErrorMessage(data[i][5], data[i][6]);
				break;
			case "closeBrowser":
				Methods.closeApplication();
				break;
			}
		}
	}

}
