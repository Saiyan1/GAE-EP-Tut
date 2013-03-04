<html>
<head>
	<style>
		#chatArea {
			height: 250px;
			background-color: #E8E3E3;
			border: thin solid #9A9898;
		}
		#nick {
			width: 100px;
		}
		#msg {
			width: 300px;
		}
	</style>
</head>
	<body>
		<div id="chatArea">
		</div>
		<br />
		<div>
			<form action="/mensajes" method="post">
				<input type="text" id="nick" name="nick" placeholder="Nick" />
				<br />
				<input type="text" id="msg" name="msg" placeholder="Mensaje"/>
				<br />
				<input type="submit">
			</form>
		</div>
	</body>	
</html>