package org.sourceforge.taglibutils;

public final class StringUtils {
	
	public static String getReverse(String s){
		return(new StringBuffer(s).reverse().toString());
	}

    public static String replaceString(String input, String searchString, String replaceString) {
        if (input.length() < 1) {
            return "";
        }
        int p = 0;

        while (p < input.length() && (p = input.indexOf(searchString, p)) >= 0) {
        	input = input.substring(0, p) + replaceString +
        	input.substring(p + searchString.length(), input.length());
            p += replaceString.length();
        }
        return input;
    }


	public static String appendString(String input, String appendString) {
		// TODO Auto-generated method stub
		return(new StringBuffer(input).append(appendString).toString());
	}
	
}
