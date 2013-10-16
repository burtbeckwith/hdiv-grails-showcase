<html>

<head>
<title>SQL Injection Example</title>
</head>

<body>
	<showcase:relativeLink uri='prepareSQLInjection.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to SQL String Injection page" class="back" />
	</showcase:relativeLink>

	<h1>User account</h1>

	<table>
		<tr>
			<th>Account</th>
			<th>email</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Status</th>
			<th>Adress 1</th>
			<th>Adress 2</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
			<th>Country</th>
			<th>Phone</th>
		</tr>

		<g:each in="${userAccounts}" var="account">
			<tr align="center">
				<td>${account.userId}</td>
				<td>${account.email}</td>
				<td>${account.firstName}</td>
				<td>${account.lastName}</td>
				<td>${account.status}</td>
				<td>${account.address1}</td>
				<td>${account.address2}</td>
				<td>${account.city}</td>
				<td>${account.state}</td>
				<td>${account.zip}</td>
				<td>${account.country}</td>
				<td>${account.phone}</td>
			</tr>
		</g:each>
	</table>

	</body>
</html>
