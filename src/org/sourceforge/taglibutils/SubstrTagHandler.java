package org.sourceforge.taglibutils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SubstrTagHandler extends TagSupport {
	private String input;

	private int start;

	private int end;

	private String action;

	private String searchString;

	private String replaceString;

	private String appendString;

	@Override
	public int doStartTag() throws JspException {

		try {
			// Get the writer object for output.
			JspWriter out = pageContext.getOut();

			if (action.equals("substring"))
				// Perform substr operation on string.
				out.println(input.substring(start, end));

			if (action.equals("reverse"))
				// Perform substr operation on string.
				out.println(StringUtils.getReverse(input));

			if (action.equals("replace"))
				// Perform substr operation on string.
				out.println(StringUtils.replaceString(input, searchString,
						replaceString));

			if (action.equals("append"))
				// Perform substr operation on string.
				out.println(StringUtils.appendString(input, appendString));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getReplaceString() {
		return replaceString;
	}

	public void setReplaceString(String replaceString) {
		this.replaceString = replaceString;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getAppendString() {
		return appendString;
	}

	public void setAppendString(String appendString) {
		this.appendString = appendString;
	}
}
