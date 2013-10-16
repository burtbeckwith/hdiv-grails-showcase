<html>

<head>
<title>XSS Example</title>
</head>

<body>
	<showcase:relativeLink uri='prepareXSS.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>

	<h1>XSS Results</h1>

	<p><strong>You wrote this message:</strong></p>
	<p><%=message%></p>

</body>
</html>
