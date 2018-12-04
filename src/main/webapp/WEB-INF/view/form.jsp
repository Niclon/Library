<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pvychodil
  Date: 28.11.2018
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/app.css">
    <link rel="stylesheet" type="text/css" href="../css/select2/select2.css">
    <script src="../js/libs/jquery.js"></script>
    <script src="../js/libs/bootstrap.js"></script>
    <script src="../js/libs/select2/select2.full.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="container">
        <div class="navigation">
            <nav class="navbar navbar-expand-lg  navbar-dark bg-primary">
                <div class="navbar-collapse navbar-right justify-content-md-end">
                    <div>
                        <ul class="nav navbar-nav navbar-right ">
                            <li class="nav-item"><a class="nav-link" href="http://localhost:8090/">O knihovně</a></li>
                            <li class="nav-item"><a class="nav-link" href="http://localhost:8090/formpage">Služby</a></li>
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
        jméno knihy <input type="text"/>
        <br>
        Autor <input type="text"/>
        <br>
        ISBN <input type="text"/>
        <br>
        Rok vydání <input type="text"/>
        <br>
        <button>Odeslat</button>
        <br>
    </div>
</div>
</body>
</html>
