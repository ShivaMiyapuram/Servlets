package com.marlabs;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateStyleHandler extends SimpleTagSupport {

	private JspContext jspContext;
	private String inputDateStyle;

	// setters are called automatically

	public void setInputDateStyle(String inputDateStyle) {
		System.out.println("Inside setter for input date style");
		this.inputDateStyle = inputDateStyle;
	}

	@Override
	public void setJspContext(JspContext jspContext) {
		this.jspContext = jspContext;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		// used to create a jsp buffer
		// jspContext.getOut().println("hello");
		SimpleDateFormat dateFormat = new SimpleDateFormat(inputDateStyle);
		Date date = new Date();
		String dateStyle = dateFormat.format(date);
		jspContext.getOut().println(dateStyle);
		super.doTag();
	}

}
