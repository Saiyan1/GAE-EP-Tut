<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<link rel="stylesheet" href="css/themes/basicA.min.css" />
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.0/jquery.mobile.structure-1.3.0.min.css" />
		<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.3.0/jquery.mobile-1.3.0.min.js"></script>

		<script type="text/JavaScript">

			$(document).ready( function() {
					//Submitear al presionar Enter en el input de mensaje
				$('#msg').keypress(function(event){
				 	var keycode = (event.keyCode ? event.keyCode : event.which);
					if(keycode == '13'){
						$("#sendMsgForm").submit();
					} 
				});

					//Submitear al hacer click en el link JQueryMobile del Form
				$("#btnEnviar").click( function() {
					$("#sendMsgForm").submit();
				});

					//Enviar Form via Ajax
				$("#sendMsgForm").submit( function() {
					$.ajax({
					  type: "POST",
					  url: "/mensajes",
					  data: $(this).serialize(),
					  success: function (data) {
					  	reloadChat();
					  	$("#msg").val("");
					  }
					});
					return false;
				});
			});


			function ChatRefresh() {
				setTimeout("reloadChat()",5000);
			}

			function reloadChat() {
				$.ajax({
					url: "/chat"
				}).done( function(res) {
					$("#chatArea").html(res);
				});			
				ChatRefresh();
			}
			
		</script>

		<style>
			body {
				font-family: Tahoma;
				font-size: 16px;
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
	<body onLoad="reloadChat();">
		<div id="chatArea">
			<%@include file="/chat.jsp"%>
		</div>
		<br />
		<div>
			<form id="sendMsgForm" action="/mensajes" method="post">
				<input type="hidden" name="action" value="sendMsg" />
				<input type="text" id="nick" name="nick" placeholder="Nick" />
				<br />
				<input type="text" id="msg" name="msg" placeholder="Mensaje"/>
				<br />
				<a href="#" id="btnEnviar" data-role="button" data-theme="a" data-inline="true">Enviar</a>				
			</form>
		</div>
	</body>	
</html>