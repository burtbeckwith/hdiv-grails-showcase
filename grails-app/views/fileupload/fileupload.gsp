<html>

<head>
<title>File Upload</title>
</head>

<body>

	<g:link uri='/welcome.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</g:link>

	<h1>File Upload Examples</h1>

	<!--  Simple example -->
	<h2><a href="#" class="link">Simple Example</a></h2>
	<p>Simple Fileupload form Example with one field of type 'file'.</p>

	<showcase:relativeLink uri='simple.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		Simple FileUpload Example
	</showcase:relativeLink>
	<br />

	<!--  Form binding examples -->
	<h2><a href="#" class="link">Form binding Example</a></h2>
	<p>Fileupload Form Example with binding of 'file', editable and not editable fields.</p>

	<showcase:relativeLink uri='binding.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		Form binding Example
	</showcase:relativeLink>

	<br />

</body>
</html>
