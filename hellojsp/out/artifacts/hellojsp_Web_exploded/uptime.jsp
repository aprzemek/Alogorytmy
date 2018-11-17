<jsp:include page="index.jsp"/>

<%@ page import="java.time.LocalTime" %>
Time now:
<%
    LocalTime localTime1 = LocalTime.now();
    out.print(localTime1);

%>
