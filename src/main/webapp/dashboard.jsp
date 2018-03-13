<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="incl/header.jspf" %>
<sec:authorize access="isAuthenticated()">
    <%@ include file="incl/menu.jspf" %>
    <!-- Contents -->
    <h1>Dashboard</h1>
</sec:authorize>
<%@ include file="incl/footer.jspf" %>
