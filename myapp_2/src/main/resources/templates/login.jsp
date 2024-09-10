<html>
<body>
    <form action="/login" method="post">
        ID: <input type="text" name="id"/><br/>
        PW: <input type="password" name="pw"/><br/>
        <input type="submit" value="로그인"/>
    </form>
    <p>${message}</p>

    <c:if test="${verificationSent}">
        인증번호: <input type="text" name="code"/><br/>
        <form action="/verify" method="post">
            <input type="submit" value="확인"/>
        </form>
    </c:if>
</body>
</html>

