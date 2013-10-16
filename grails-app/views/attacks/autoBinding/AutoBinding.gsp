<html>

<head>
<title>Auto Binding</title>
</head>

<body>
	<showcase:relativeLink uri='../attacks.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to examples page" class="back" />
	</showcase:relativeLink>

	<h1>How to perform Auto Binding</h1>

	<p><b>General Goal(s):</b></p>
	<p>The user will be able to exploit a field that does not exist in the form but it does in the command. Then, Spring will make an auto binding and fill the commands field, sending it to the controller as it was a form field.</p>
	<p>First, by clicking in the 'View Unpaid Orders' button you will visualize all the unpaid orders
	of the <b>j2ee</b> user.</p>
	<p>Then, one can modify some data of the order.</p>
	<p>Once the form is posted, one can create the attribute <b>paid</b> and set it to <b>"true"</b>. This will cause the order to figure as paid.</p>

	<button onclick="javascript:window.location='${showcase.relativeUri(uri: 'processAutoBinding.html', params: [username: 'j2ee'])}'">
	View Unpaid Orders
	</button>

</body>
</html>
