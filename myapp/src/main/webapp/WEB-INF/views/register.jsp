<!-- JSP (register.jsp) -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="/register" method="post">
        ID: <input type="text" name="id"><br>
        PW: <input type="password" name="pw"><br>
        Email: <input type="email" name="email"><br>
        <button type="submit">등록</button>
    </form>
    <p>${message}</p>
</body>
</html>

