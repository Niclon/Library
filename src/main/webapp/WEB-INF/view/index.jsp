<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pvychodil
  Date: 25.11.2018
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Knihovna</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/app.css">
    <link rel="stylesheet" type="text/css" href="../css/select2/select2.css">
    <script src="../js/libs/jquery.js"></script>
    <script src="../js/libs/bootstrap.js"></script>
    <script src="../js/libs/select2/select2.full.min.js"></script>
    <script src="../js/app.js"></script>
    <script src="../js/autocomplete.js"></script>

</head>
<body>

<div class="container-fluid">
    <div class="container">
        <div class="navigation">
            <nav class="navbar navbar-expand-lg  navbar-dark bg-primary">
                <div class="navbar-collapse navbar-right justify-content-md-end">
                    <div>
                        <ul class="nav navbar-nav navbar-right ">
                            <li class="nav-item"><a class="nav-link" href="#">O knihovně</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Služby</a></li>
                            <li class="nav-item"><a class="nav-link" href="#">Kontakty</a></li>
                            <c:if test="${!loggedIn}">
                                <li class="nav-item"><a class="nav-link" href="/account/loginpage">Přihlášení</a></li>
                            </c:if>
                            <c:if test="${loggedIn}">
                                <li class="nav-item"><a class="nav-link" href="/account/logout">Odhlášení</a></li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="container">
        <div class="picture">
            <div class="search-bar">
                <%--<select id="bookSearch" data-placeholder="Zadejte jméno vyhledávané knihy"></select>--%>
                <label for="bookSearch">Zadejte jméno vyhledávané knihy</label>
                <select name="bookSearch" id="bookSearch" class="js-recipient form-control select2-single"
                        data-placeholder="bookSearch"
                        data-allow-clear="false">
                </select>
            </div>
        </div>

    </div>
</div>
</body>
</html>
