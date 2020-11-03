<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<%@taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function submitForm(){
	document.forms[0].action = "UserAction.do?method=Add";
	document.forms[0].submit();
}
</script>
</head>
<body>
	<html:form action="UserAction">
		<bean:write name="UserForm" property="message" />
		<br>
		<html:submit value="Add" onclick="submitForm()" />
		<html:submit property="method" value="Update" />
		<html:submit property="method" value="Delete">
		<html:button property="method" value="Add">Hello</html:button></html:submit>
	</html:form>
</body>
</html>