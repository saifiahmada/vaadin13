package com.saifiahmada.vaadin13;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class Main extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Main() {
		Button btn = new Button("Test");
		add(btn); 
	}

	
}
