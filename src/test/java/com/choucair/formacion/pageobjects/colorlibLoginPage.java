package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class colorlibLoginPage extends PageObject {
   
	// campo usuario
	@FindBy (xpath= "//*[@id='login']/form/input[1]")       
	public WebElementFacade txtUsername;
	
	//Campo password
	@FindBy (xpath= "//*[@id='login']/form/input[2]")
   	public WebElementFacade txtPassword;
	
	//boton
	@FindBy (xpath= "//*[@id='login']/form/button")
	public WebElementFacade btnSignIn;

	//label de home a verficar
	@FindBy (xpath= "//*[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos(String strUsuario,String strPass) {
		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSignIn.click();
	}
	public void VerificarHome() {
		String labelv ="Bootstrap-Admin-Template";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje,containsString(labelv));
	}

}


