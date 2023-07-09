package com.edureka.KeywoordDriven;



public class DriverScript {

	public static void main(String[] args)throws Exception {
		
		String sPath = "/Users/zaynnuritdin/Documents/Excel//DataSheet.xlsx";
		ReadExcelData.setExcelFile(sPath,"Sheet1");
		// TODO Auto-generated method stub
for (int iRow = 1; iRow <=7; iRow++) {
	
	String sActions = ReadExcelData.getCellData(iRow, 1);
	
	if(sActions.equals("openBrowser")) {
		Methods.openBrowser();
	}
	else if (sActions.equals("navigate")){
		Methods.navigate();
		
		
	}
	
	else if(sActions.equals("input_Username")) {
		Methods.input_Username();
		
		
	}
		else if (sActions.equals("Input_Password")) {
			Methods.input_Password();
			
		}
	else if (sActions.equals("click_Login")) {
		Methods.click_Login();
		
	}
	
	else if (sActions.equals("verify_login")) {
		Methods.verify_login();
		
	}
	else if (sActions.equals("CloseBrowser")) {
		Methods.closeBrowser();
		
	}
		
	}
	
}
	}


