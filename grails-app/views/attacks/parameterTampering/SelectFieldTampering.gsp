<html>

<head>
<title>Parameter Tampering Example</title>
</head>

<body>
	<showcase:relativeLink uri='../attacks.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>

	<h1>How to Exploit Form Fields</h1>

	<p><b>General Goal(s):</b></p>
	<p>The user will be able to exploit a select field to obtain all users' orders.</p>
	<p>First, by clicking in the 'View Orders' button you will visualize all the orders
	of the <b>j2ee</b> user.</p>
	<p>Then, you have to set the username parameter to the following value when you post
	the form: <b>ACID</b></p>

	<g:hasErrors bean="${order}">
	<ul class="error" role="alert">
		<g:eachError bean="${order}" var="error">
		<li><g:message error="${error}"/></li>
		</g:eachError>
	</ul>
	</g:hasErrors>
	<g:form uri='processListOrdersSelect.html' contextPath='' name='order'>
		<p>
			<label for="username">Select Username:</label>
			<g:select name='username' from="${['j2ee']}"/>
		</p>

		<g:submitButton name="Submit" value="View Orders" />
	</g:form>

</body>
</html>
