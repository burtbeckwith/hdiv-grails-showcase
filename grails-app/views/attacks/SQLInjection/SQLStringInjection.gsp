<html>

<head>
<title>SQL Injection Example</title>
</head>

<body>
	<showcase:relativeLink uri='../attacks.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>
	<h1>How to perform String SQL Injection</h1>

	<p><b>General Goal(s):</b></p>
	<p>The form below allows a user to view account values. Try to inject an SQL string that results
	in all the accounts being displayed.</p>
	<p>First, you must insert the username <b>ACID</b>. You will only see the data related to the username ACID.</p>
	<p>Then, inserting the value <b>ACID' or '1'='1</b>, you will be able to see all the accounts.</p>

	<g:hasErrors bean="${account}">
	<ul class="error" role="alert">
		<g:eachError bean="${account}" var="error">
		<li><g:message error="${error}"/></li>
		</g:eachError>
	</ul>
	</g:hasErrors>
	<g:form uri='processSQLStringInjection.html' contextPath='' name='account'>
		<p>
			<label for="userId">Enter your last name:</label>
			<g:textField name="userId" value="${account?.userId}"/>
			<g:submitButton name="Submit" value="GO!" />
		</p>
	</g:form>

</body>
</html>
