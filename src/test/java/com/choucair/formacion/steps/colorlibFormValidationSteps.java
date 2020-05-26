package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

import java.util.List;

public class colorlibFormValidationSteps {
	
	ColorlibFormValidationPage 	ColorlibFormValidationPage;

     @Step
      public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
    	  ColorlibFormValidationPage.Required(data.get(id).get(0).trim());
    	  ColorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
    	  ColorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
    	  ColorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
    	  ColorlibFormValidationPage.url(data.get(id).get(4).trim());
    	  ColorlibFormValidationPage.email(data.get(id).get(5).trim());
    	  ColorlibFormValidationPage.password(data.get(id).get(6).trim());
    	  ColorlibFormValidationPage.confirm_password(data.get(id).get(7).trim());
    	  ColorlibFormValidationPage.minimun_field_size(data.get(id).get(8).trim());
    	  ColorlibFormValidationPage.maximun_field_size(data.get(id).get(9).trim());
    	  ColorlibFormValidationPage.number(data.get(id).get(10).trim());
    	  ColorlibFormValidationPage.ip(data.get(id).get(11).trim());
    	  ColorlibFormValidationPage.date(data.get(id).get(12).trim());
    	  ColorlibFormValidationPage.date_earlier(data.get(id).get(13).trim());
    	  ColorlibFormValidationPage.validate();
    	  
    }

     @Step
 	public void verificar_ingreso_datos_formulario_exitoso() {
 		ColorlibFormValidationPage.form_sin_errores();
 	}
 	
 	@Step
 	public void verificar_ingreso_datos_formulario_con_errores() {
 		ColorlibFormValidationPage.form_con_errores();
 	}
}