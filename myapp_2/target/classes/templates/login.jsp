<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <form action="/login" method="post">
        <label>ID:</label><input type="text" name="id"><br>
        <label>PW:</label><input type="password" name="pw"><br>
        <input type="submit" value="로그인">
    </form>
    <c:if test="${message != null}">
        <p>${message}</p>
    </c:if>
</body>
</html>

