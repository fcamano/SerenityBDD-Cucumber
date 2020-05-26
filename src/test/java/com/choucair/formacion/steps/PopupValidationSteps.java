package com.choucair.formacion.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import com.choucair.formacion.pageobjects.colorlibLoginPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	colorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	
	@Step
	public void login_colorlib(String strUsuario,String strPass) {
		// a. abrir navegador con la url de prueba
		colorlibLoginPage.open();
		/*b.Ingresa usuario demo
		c.ingresar password demo
		d.click en boton sign in*/
		colorlibLoginPage.IngresarDatos(strUsuario,strPass);
		//e.verficar la autenticacion (label en home)
		colorlibLoginPage.VerificarHome();
	}
	@Step
	public void ingresar_form_validation() {
		//colorlibMenuPage.menuFormValidation();
		colorlibMenuPage.menuForms.click();
		colorlibMenuPage.menuFormValidation.click();
		String strMensaje =colorlibMenuPage.lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
		
	}
}
