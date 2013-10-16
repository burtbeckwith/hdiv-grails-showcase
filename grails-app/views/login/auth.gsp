<html>
<head>
<title>Login</title>
</head>

<body onload='document.f.j_username.focus();'>

	<h1>Login with Username and Password</h1>

	Use the folowing username and password:
	<ul>
		<li>david:david</li>
		<li>alex:alex</li>
		<li>tim:tim</li>
	</ul>

	<g:if test='${flash.message}'>
		<div class='login_message'>${flash.message}</div>
	</g:if>

	<g:form uri='/j_spring_security_check' name='f' autocomplete='off'>
		<p>
			<label for="j_username">User:</label>
			<input type='text' name='j_username' />
		</p>
		<p>
			<label for="j_password">Password:</label>
			<input type='password' name='j_password' />
		</p>
		<div class="centerText">
			<input name="submit" type="submit" value="Login" />
		</div>
	</g:form>
</body>
</html>
