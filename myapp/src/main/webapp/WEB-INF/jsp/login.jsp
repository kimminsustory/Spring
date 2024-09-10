<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <h1>로그인</h1>
    <form action="/login" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required><br>
        <label for="pw">PW:</label>
        <input type="password" id="pw" name="pw" required><br>
        <button type="submit">로그인</button>
    </form>
    <div id="message">
        ${message}
    </div>
    <!-- 실시간 날씨 정보 표시 -->
    <div id="weather">날씨 정보 로딩 중...</div>
</body>
</html>

