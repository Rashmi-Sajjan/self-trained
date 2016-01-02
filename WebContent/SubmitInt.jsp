<jsp:useBean id="form"
			class="com.preTraining.epicor.FormBean"
			scope="request">
<jsp:setProperty name="form" property="*" />
</jsp:useBean>
<jsp:forward page="formServlet" />