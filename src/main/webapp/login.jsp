<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>OTOZ Animals - Logowanie</title>
    <script type="text/javascript" src="resources/libs/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="resources/libs/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="resources/libs/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/libs/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="resources/style/style.css" />
</head>
<body>
    <div class="modal show">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">TopTipDonation - Zaloguj</h4>
                </div>
                <form method="post" action="<c:url value="/login"></c:url>">
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="username">Login:</label>
                            <input class="form-control" type="text" id="username" name="username" placeholder="Login" autofocus="autofocus" />
                        </div>
                        <div class="form-group">
                            <label for="password">Hasło:</label>
                            <input class="form-control" type="password" id="password" name="password" placeholder="Hasło" />
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="form-group">
                            <button class="btn btn-primary" type="submit">Zaloguj</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
