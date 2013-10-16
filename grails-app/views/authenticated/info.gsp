<html>

<head>
<title>Authenticated Section</title>
</head>

<body>
	<g:link uri='/welcome.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</g:link>

	<h1>Authenticated Section</h1>

	<h2>User Data</h2>
	Username:
	<%
	println org.springframework.security.core.context.SecurityContextHolder.context.authentication.principal.username
	%>

	<p>
	<g:link uri='/logout.html'>Logout</g:link>
	</p>

</body>
</html>
