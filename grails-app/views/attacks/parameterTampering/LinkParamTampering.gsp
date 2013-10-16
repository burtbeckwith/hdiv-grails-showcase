<html>

<head>
<title>Parameter Tampering Example</title>
</head>

<body>
	<showcase:relativeLink uri='../attacks.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>

	<h1>How to Exploit Link Parameters</h1>

	<p><b>General Goal(s):</b></p>
	<p>The user will be able to exploit a link parameter to obtain all users' orders.</p>
	<p>First, by clicking in the link you will visualize all the orders
	of the <b>j2ee</b> user.</p>
	<p>Then, you have to set the username link parameter value to to <b>ACID</b> to view his orders.</p>
	<showcase:relativeLink uri='processListOrdersLink.html' params='[username: "j2ee"]'>
		View Orders
	</showcase:relativeLink>

</body>
</html>
