<%--
  Created by IntelliJ IDEA.
  User: pvychodil
  Date: 28.11.2018
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Knihovna</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap/bootstrap.css">
    <script src="../js/libs/jquery.js"></script>
    <script src="../js/login.js"></script>
</head>
<body>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signin my-5">
                <div class="card-body">
                    <h5 class="card-title text-center">Sign In</h5>
                    <form class="form-signin" action="javascript:" onsubmit="createAjaxLoginRequest()">
                        <div class="form-label-group">
                            <input type="text" id="email" class="form-control" placeholder="Email address" required autofocus>
                            <label for="email">Email address</label>
                        </div>

                        <div class="form-label-group">
                            <input type="text" id="password" class="form-control" placeholder="Password" required>
                            <label for="email">Password</label>
                        </div>
                        <button id="sign-in" class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" >Sign in</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</body>
</html>
