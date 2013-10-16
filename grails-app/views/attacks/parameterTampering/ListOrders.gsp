<html>

<head>
<title>SQL Injection Example</title>
</head>

<body>
	<showcase:relativeLink uri='${back}.html'>
		<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to hidden field tampering page" class="back" />
	</showcase:relativeLink>

	<h1>How to Exploit Hidden Fields</h1>

	<h2 class="subtitle">"My" Orders</h2>
	<table>
		<tr>
			<th>Order ID</th>
			<th>User ID</th>
			<th>Order Date</th>
			<th>Ship Adress 1</th>
			<th>Ship Adress 2</th>
			<th>Ship City</th>
			<th>Ship State</th>
			<th>Ship Zip</th>
			<th>Ship Country</th>
			<th>Creadit Card</th>
			<th>Expiry Date</th>
			<th>Card type</th>
		</tr>
		<g:each in="${orderList}" var="order">
			<tr align="center">
				<td>${order.orderId}</td>
				<td>${order.username}</td>
				<td>${order.orderDate}</td>
				<td>${order.shipAddress1}</td>
				<td>${order.shipAddress2}</td>
				<td>${order.shipCity}</td>
				<td>${order.shipState}</td>
				<td>${order.shipZip}</td>
				<td>${order.shipCountry}</td>
				<td>${order.creditCard}</td>
				<td>${order.expiryDate}</td>
				<td>${order.cardType}</td>
			</tr>
		</g:each>
	</table>

</body>
</html>
