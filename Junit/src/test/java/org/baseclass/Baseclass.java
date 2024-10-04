package org.baseclass;

import org.libglobal.Libglobal;
import org.junit.ContactPage;
import org.junit.Test;

public class Baseclass {
	@Test
	public void test1() {
		Libglobal l = new Libglobal();
		l.launchbrowser();
		l.loadurl("https://etowndev01.powerappsportals.com/");
	}
		
	@Test
	public void test2() throws InterruptedException {
		ContactPage cp = new ContactPage();
		cp.getCbutton();
		cp.contactpage("Harikrishnan", "harikrishnan@katenterprise.com", "Enquiry");
		cp.getButton();
	}
}
