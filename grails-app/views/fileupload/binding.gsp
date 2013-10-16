<html>

<head>
<title>File Upload</title>
</head>

<body>

	<showcase:relativeLink uri='fileupload.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>

	<h1>File Upload Example</h1>

	<hdiv:errors bean="${message}"/>
	<g:uploadForm uri='binding.html' contextPath='' name='bean'>
		<g:if test="${message}">
			<div id="message" class="success">${message}</div>
	  	</g:if>

	  	<p>
			<label for="name">Name:</label>
			<g:select name='name' from="${['j2ee', 'ACID]}"/>
		</p>
		<p>
			<label for="search">Search:</label>
			<g:textField name='search' value="${bean?.search}"/>
		</p>
		<p>
			<label for="file">Select a file:</label>
			<input id="file" type="file" name="file" />
		</p>

		<div class="centerText">
			<p><g:submitButton name="Submit" value="Save" /></p>
		</div>

	</g:uploadForm>

</body>
</html>
