package com.bit.test;

import org.junit.Ignore;
import org.junit.Test;

public class SmokeTest extends BaseTest{
	
	@Test
	public void targetScenario() throws InterruptedException {
		Scenario scenario = new Scenario(dr);
		scenario.targetSignUp();
	}
	
	@Ignore
	@Test
	public void macysScenario() throws InterruptedException {
		Scenario scenario = new Scenario(dr);
		scenario.macysPurchase();
	}

}
