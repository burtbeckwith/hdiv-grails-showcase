<html>

<head>
<title>Simple form using ActionForm</title>
</head>

<body>

	<showcase:relativeLink uri='../attacks.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>
	<h1>Simple form using ActionForm</h1>

	<p>Enter information into the field below. Your entries will be displayed when you Submit the form.</p>

	<hdiv:errors bean="${message}"/>
	<g:form uri='processXSS.html' contextPath='' name='message'>
		<p><b>General Goal(s):</b></p>
		<p>The user can perform reflected XSS attacks. To do this, insert the following string:
		<b>&lt;script&gt;alert('If you see this you have a potential vulnerability');&lt;/script&gt;</b>
		</p>
		<p>Enter a message (you may use html tags):<br />
			<g:textArea name='msgText' value="${message?.msgText}" cols="40" rows="6" ></g:textArea>
		</p>
		<p>
		<g:submitButton name="Submit" value="Submit" />
		</p>
	</g:form>

</body>
</html>
