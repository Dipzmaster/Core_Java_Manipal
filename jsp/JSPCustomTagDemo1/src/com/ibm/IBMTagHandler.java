package com.ibm;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class IBMTagHandler extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {
	    JspWriter out = getJspContext().getOut();
	    out.println(new java.util.Date().toString());
}
}