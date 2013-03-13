<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
	
	<c:forEach var="mensaje" items="${mensajes}">		
		<div id="mensajesDiv">
			<span><fmt:formatDate pattern="dd/MM HH:mm" value="${mensaje.fecha}" /></span> - <b>${mensaje.nick}:</b> ${mensaje.msg}
		</div>
	</c:forEach>
	
</body>