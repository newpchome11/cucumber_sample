package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("*************");
		System.out.println("Netbanking setup");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("*************");
		System.out.println("Mortgage setup");
	}
	
	
	@After
	public void teardown() {
		System.out.println("Tearing down");
		System.out.println("*************");
	}

}
