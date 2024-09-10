<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="/register" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required><br>
        <label for="pw">PW:</label>
        <input type="password" id="pw" name="pw" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <button type="submit">등록</button>
    </form>
    <div id="message">
        ${message}
    </div>
    <!-- 실시간 날씨 정보 표시 -->
    <div id="weather">날씨 정보 로딩 중...</div>
</body>
</html>

