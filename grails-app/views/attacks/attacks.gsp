<html>

<head>
<title>Vulnerable Section</title>
</head>

<body>
	<g:link uri='/welcome.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</g:link>

	<g:if test='${request.requestURI.contains("/attacks/")}'>
	<h1>Vulnerable Section</h1>
	</g:if>
	<g:if test='${request.requestURI.contains("/secure/")}'>
	<h1>Secured Section</h1>
	</g:if>

	<!--  Injection Flaws examples -->
	<g:render template='/attacks/SQLInjection/SQLInjection' />
	<showcase:relativeLink uri='SQLInjection/prepareSQLInjection.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		How to perform String SQL Injection
	</showcase:relativeLink>
	<br />

	<!--  Parameter Tampering examples -->
	<g:render template='/attacks/parameterTampering/ParameterTampering' />
	<showcase:relativeLink uri='parameterTampering/prepareSelectFieldTampering.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		How to Exploit Select Form fields
	</showcase:relativeLink>
	<br />
	<showcase:relativeLink uri='parameterTampering/prepareHiddenFieldTampering.html'>
		<img src="../images/Play.png" class="play" />
		How to Exploit Hidden Form fields
	</showcase:relativeLink>
	<br />
	<showcase:relativeLink uri='parameterTampering/prepareLinkTampering.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		How to Exploit Link Parameters
	</showcase:relativeLink>
	<br />

	<!--  Cross Site Scripting (XSS) -->
	<g:render template='/attacks/xss/XSS' />
	<showcase:relativeLink uri='xss/prepareXSS.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		How to Perform Cross Site Scripting (XSS)
	</showcase:relativeLink>
	<br />

	<!--  Auto-Binding -->
	<g:render template='/attacks/autoBinding/AutoBindingExplain' />
	<showcase:relativeLink uri='autoBinding/prepareAutoBinding.html'>
		<img src="${resource(dir: 'images', file: 'Play.png')}" class="play" />
		How to Perform an Auto Binding Injection
	</showcase:relativeLink>
	<br />
</body>
</html>
