<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>

	<script type="text/JavaScript">
		
		function ChatRefresh() {
			setTimeout("reloadChat()",5000);
		}

		function reloadChat() {
			$.ajax({
				url: "/chat"
			}).done( function(res) {
				$("#chatArea").html(res);
				console.log(res);
			});			
			ChatRefresh();
		}
		
	</script>

	<style>
		body {
			font-family: Tahoma;
			font-size: 14px;
		}
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
		#mensajesDiv span{
			font-size: 11px;
		}
	</style>
</head>
	<body onLoad="ChatRefresh();">
		<div id="chatArea">
			<%@include file="/chat.jsp"%>
		</div>
		<br />
		<div>
			<form action="/mensajes" method="post">
				<input type="hidden" name="action" value="sendMsg" />
				<input type="text" id="nick" name="nick" placeholder="Nick" />
				<br />
				<input type="text" id="msg" name="msg" placeholder="Mensaje"/>
				<br />
				<input type="submit">
			</form>
		</div>
	</body>	
</html>