package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomTag extends SimpleTagSupport{

	
	public void doTag() throws IOException, JspException{
		
		JspWriter out = getJspContext().getOut();
		out.println("Hello from simple tag");
		//getJspBody().invoke(null);
		
		throw new SkipPageException();
		
		
		
	}
	
	
}
