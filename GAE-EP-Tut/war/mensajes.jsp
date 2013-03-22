<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<link rel="stylesheet" href="css/themes/basicA.min.css" />
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.0/jquery.mobile.structure-1.3.0.min.css" />
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/jquery.mobile-1.3.0.min.js"></script>

		<style>
			body {
				font-family: Verdana;
				font-size: 16px;
			}
			#chatArea {
				height: 255px;
				background-color: white;
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
			span.nick {
				font-weight: bolder;
				display: inline-block;
			}
			span.msg {
				font-style: italic;
			}			
		</style>

		<script type="text/JavaScript">
			var limitMensajes = 11;
			
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
					enviarMensaje( $("#nick").val(), $("#msg").val() );
					$("#msg").val("");
					reloadChat();
					return false;
				});
			});


			function reloadChat() {
				var apiUrl = "https://gae-ep-tut.appspot.com/_ah/api/mensaje/v1/mensaje"; 				
				$.ajax({
					 url: apiUrl, 
					 dataType: 'json', 
					 contentType: 'application/json', 
					 type: "GET", 
					 success: function(data) { 
					   cargarMensajes(data);
					 },
					 error: function(xhr, ajaxOptions, thrownError) {
					   //console.error("Error listando mensajes: " + xhr.status);
					 }
				});
			}

			function cargarMensajes(data) {								
				$("#chatArea").html("");
				if (data.items.length > 0 ) {
					var mensajes 		= data.items;
					var cantMensajes 	= mensajes.length;
					var cantReal		= (cantMensajes > limitMensajes)?limitMensajes:cantMensajes;
					console.log(cantReal);
					for (var i=cantReal;i > 0;i--) {
						$("#chatArea").append("<span class='nick'>" + mensajes[i-1].nick + "</span>: ");
						$("#chatArea").append("<span class='msg'>" + mensajes[i-1].msg + "</span><br />");
					}
				}
			}

			function enviarMensaje(nick, msg) {
				//TODO
				var apiUrl   = "https://gae-ep-tut.appspot.com/_ah/api/mensaje/v1/mensaje";
				$.ajax({
					 url: apiUrl, 
					 dataType: 'json', 
					 data: JSON.stringify({ "nick": nick, "msg" : msg }),
					 type: "POST", 
					 contentType: 'application/json', 
					 success: function(data) { 
					 	reloadChat();
					   	//console.log("ok");
					 },
					 error: function(xhr, ajaxOptions, thrownError) {
					   //console.error("No se ha enviado");
					   //TODO Mostrar Error
					 }
				});				
			}

		</script>
	</head>
	<body onLoad="reloadChat();">
		<div id="chatArea">
			<div align="center">
				<img src="img/loader.gif"/>
			</div>
		</div>
		<br />
		<div>
			<form id="sendMsgForm" method="post">
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