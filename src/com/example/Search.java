package com.example;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class Search {

	private Browser browser;

	public Search(Browser browser) {
		this.browser = browser;
	}

	public void searchFor(String string1) throws Exception {
	
	}

	public void clickFirstResult() throws Exception {
	
	}

	public void goToGoogleHttps() throws Exception {
		browser.navigateTo("https://google.com");
	
	}

}
