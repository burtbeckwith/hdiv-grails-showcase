<html>
	<head>
		<title>Auto Binding</title>
	</head>
	<body>

		<showcase:relativeLink uri='../../processAutoBinding.html' params='[username: "j2ee"]'>
			<img src="${resource(dir: 'images', file: 'back-icon.png')}" alt="Return to Auto Binding page" class="back" />
		</showcase:relativeLink>

		<h1>Modify Order</h1>

		<h2 class="subtitle">${order.username}'s  ${order.orderId}  Order</h2>

		<g:form uri="${showcase.relativeUri(uri: '../../updateAutoBinding.html')}" contextPath=''>
			<fieldset>
				<p>
					<label>Order Date:</label>
					${order.orderDate}
				</p>
				<p>
					<label for="shipAddress1">Ship Address 1:</label>
					<g:textField name='shipAddress1' value="${order?.shipAddress1}"/>
				</p>
				<p>
					<label for="shipAddress2">Ship Address 2:</label>
					<g:textField name='shipAddress2' value="${order?.shipAddress2}"/>
				</p>
				<p>
					<label for="shipCity">Ship City:</label>
					<g:textField name='shipCity' value="${order?.shipCity}"/>
				</p>
				<p>
					<label for="shipState">Ship State:</label>
					<g:textField name='shipState' value="${order?.shipState}"/>
				</p>
				<p>
					<label for="shipZip">Ship Zip:</label>
					<g:textField name='shipZip' value="${order?.shipZip}"/>
				</p>
				<p>
					<label for="shipCountry">Ship Country:</label>
					<g:textField name='shipCountry' value="${order?.shipCountry}"/>
				</p>
				<p>
					<label for="creditCard">Credit Card:</label>
					<g:textField name='creditCard' value="${order?.creditCard}"/>
				</p>
				<p>
					<label for="expiryDate">Expire Date:</label>
					<g:textField name='expiryDate' value="${order?.expiryDate}"/>
				</p>
				<p>
					<label for="cardType">Card type:</label>
					<g:textField name='cardType' value="${order?.cardType}"/>
				</p>
			</fieldset>

			<div class="centerText">
				<p>Once the form is posted, create the attribute <b>paid</b> and set it to <b>"true"</b>. This will cause the order to figure as paid.</p>

				<g:submitButton name="Submit" value="Save" />
			</div>

			<g:hiddenField name='username' value='${order?.username}'/>
			<g:hiddenField name='orderId' value='${order?.orderId}'/>
		</g:form>
	</body>
</html>
