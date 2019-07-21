package com.ebay.configs;

import com.ebay.constants.Constants;
import com.ebay.utilities.FileOperations;

public class ApplicationData {

	FileOperations fileOperations = new FileOperations();
	Constants constants = new Constants();

	public String getEbayURL(){	
		return fileOperations.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH, "ebayURL");
	}
	public String getEbayUsername(){	
		return fileOperations.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH, "ebayUserName");
	}
	public String getEbayPassword(){
		return fileOperations.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH, "ebayPassWord");
	}
}
