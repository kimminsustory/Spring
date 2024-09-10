<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <form action="/register" method="post">
        <label>ID:</label><input type="text" name="id"><br>
        <label>PW:</label><input type="password" name="pw"><br>
        <label>Email:</label><input type="email" name="email"><br>
        <input type="submit" value="등록">
    </form>
    <c:if test="${message != null}">
        <p>${message}</p>
    </c:if>
</body>
</html>

