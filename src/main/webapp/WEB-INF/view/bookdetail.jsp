<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pvychodil
  Date: 25.11.2018
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Knihovna</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/bookInfo.css">
    <script src="../js/libs/jquery.js"></script>
    <script src="../js/libs/bootstrap.js"></script>


    <script>
        var bookId = ${bookId};
        <%--var avability = ${avalibility};--%>
    </script>
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
        <div class="book-info">
            <div class="row">
                <div class="col-md-3 centering">
                    <img src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_1674c8f737d%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_1674c8f737d%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2274.4296875%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" class="img-thumbnail">
                </div>
                <div class="col-md-6">
                    <h3> <strong>Jméno:</strong> ${name}</h3>
                    <p> <strong>Autor:</strong> ${autor}</p>
                    <p> <strong>Popis:</strong> ${description}</p>

                </div>
                <div class="col-md-2">
                    <button class="btn btn-primary btn-lg btn-block myButton"  ${disability}>Sledování</button>
                    <button class="btn btn-primary btn-lg btn-block myButton"  ${disability}>Rezervace</button>
                    <%--<p> Stav: ${avalibility} dodělat!!!!</p>--%>
                </div>

            </div>
        </div>

    </div>
</div>


</body>
</html>
