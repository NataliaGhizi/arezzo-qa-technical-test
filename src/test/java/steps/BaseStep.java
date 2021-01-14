package steps;

import utils.Browser;

import utils.Utils;

import io.cucumber.java8.Scenario;

public class BaseStep implements io.cucumber.java8.En {
	
	public BaseStep() {
		Before( ( Scenario scenario) -> {

			//System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
			System.out.println("Base URL: " + Utils.getBaseUrl());
			Browser.loadPage(Utils.getBaseUrl());
		});

		After((scenario) -> {
			System.out.println("Cenário teste: " + scenario.getName());
			System.out.println("Status teste: " + scenario.getStatus());
			System.out.println("---------------------------------------------------------------------------------------------------");
			Browser.close();
		});
	}
}


