package org.junit;

import org.libglobal.Libglobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Libglobal{
	public ContactPage() {
		PageFactory.initElements(gh, this);
	}
@FindBy(xpath="//a[@aria-label='Contact us']")
private WebElement cbutton;
@FindBy(id="adx_createdbycontact")
private WebElement name;
@FindBy(id="adx_contactemail")
private WebElement email;
@FindBy(id="title")
private WebElement message;
@FindBy(id="InsertButton")
private WebElement button;
public WebElement getCbutton() {
	return cbutton;
}
public WebElement getName() {
	return name;
}
public WebElement getEmail() {
	return email;
}
public WebElement getMessage() {
	return message;
}
public WebElement getButton() {
	return button;
}
public void contactpage(String name, String email, String message) throws InterruptedException {
	clickButton(getCbutton());
	insertText(getName(), name);
	insertText(getEmail(), email);
	insertText(getMessage(), message);
	Thread.sleep(4000);
	clickButton(getButton());
}

}
