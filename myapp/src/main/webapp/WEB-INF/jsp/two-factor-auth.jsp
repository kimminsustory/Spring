<!DOCTYPE html>
<html>
<head>
    <title>2차 인증</title>
</head>
<body>
    <h1>2차 인증</h1>
    <p>등록하신 이메일로 인증번호를 보내드렸어요</p>
    <form action="/verify-code" method="post">
        <input type="hidden" name="username" value="${username}">
        <label for="code">인증번호:</label>
        <input type="text" id="code" name="code" required><br>
        <button type="submit">인증번호 확인</button>
    </form>
    <div id="message">
        ${message}
    </div>
    <!-- 실시간 날씨 정보 표시 -->
    <div id="weather">날씨 정보 로딩 중...</div>
</body>
</html>

