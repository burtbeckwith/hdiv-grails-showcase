<html>
	<head>
		<title>Auto Binding</title>
	</head>
	<body>

		<showcase:relativeLink uri='prepareAutoBinding.html'>
			<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to SQL String Injection page" class="back" />
		</showcase:relativeLink>

		<h1>User Orders</h1>

		<h2 class="subtitle">My Unpaid Orders</h2>
		<table>
			<tr>
				<th>Order ID</th>
				<th>User ID</th>
				<th>Order Date</th>
				<th>Ship Address 1</th>
				<th>Ship Address 2</th>
				<th>Ship City</th>
				<th>Ship State</th>
				<th>Ship Zip</th>
				<th>Ship Country</th>
				<th>Credit Card</th>
				<th>Expire Date</th>
				<th>Card type</th>
				<th></th>
			</tr>
			<g:each in="${orderList}" var="order">
			<tr>
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
				<td>
					<showcase:relativeLink uri='modifyAutoBinding/${order.username}/${order.orderId}.html'>
						<img src="${resource(dir: 'images', file: 'modify.png')}" title="Modify" alt="Modify" class="icon" />
					</showcase:relativeLink>
				</td>
			</tr>
			</g:each>
		</table>
		<br/><br/>

		<h2 class="subtitle">My Paid Orders</h2>
		<table>
			<tr>
				<th>Order ID</th>
				<th>User ID</th>
				<th>Order Date</th>
				<th>Ship Address 1</th>
				<th>Ship Address 2</th>
				<th>Ship City</th>
				<th>Ship State</th>
				<th>Ship Zip</th>
				<th>Ship Country</th>
				<th>Credit Card</th>
				<th>Expire Date</th>
				<th>Card type</th>
			</tr>
			<g:each in="${paidOrderList}" var="paidOrder">
			<tr>
				<td>${paidOrder.orderId}</td>
				<td>${paidOrder.username}</td>
				<td>${paidOrder.orderDate}</td>
				<td>${paidOrder.shipAddress1}</td>
				<td>${paidOrder.shipAddress2}</td>
				<td>${paidOrder.shipCity}</td>
				<td>${paidOrder.shipState}</td>
				<td>${paidOrder.shipZip}</td>
				<td>${paidOrder.shipCountry}</td>
				<td>${paidOrder.creditCard}</td>
				<td>${paidOrder.expiryDate}</td>
				<td>${paidOrder.cardType}</td>
			</tr>
			</g:each>
		</table>
	</body>
</html>
