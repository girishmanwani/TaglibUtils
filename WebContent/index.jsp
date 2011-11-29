<%@taglib prefix="tagutils" uri="/WEB-INF/SubstrDescriptor.tld"%>
<html>
<head>
    <title>JSP Custom Taglib example: Substr function</title>
</head>
<body>
	Original String : GoodMorning
	<br>
    <font color="blue">&nbsp;Substring&nbsp; 
    <tagutils:substring input="GoodMorning" start="1" end="6" action="substring"/>
    </font>
	<br>
    <font color="blue">&nbsp;Reverse&nbsp; 
    <tagutils:reverse input="GoodMorning" action="reverse"/>
    </font>
	<br>
    <font color="blue">&nbsp;Replace&nbsp; 
    <tagutils:replace input="GoodMorning" searchString="Morning" replaceString="Evening" action="replace"/>
    </font>
	<br>	
    <font color="blue">&nbsp;Append&nbsp; 
    <tagutils:append input="GoodMorning" appendString="Joe" action="append"/>
    </font>
	<br>		
</body>
</html>