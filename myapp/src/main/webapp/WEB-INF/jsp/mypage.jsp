<!DOCTYPE html>
<html>
<head>
    <title>마이페이지</title>
    <link rel="stylesheet" type="text/css" href="/static/css/calendar.css"> <!-- 캘린더 스타일 -->
</head>
<body>
    <h1>마이페이지</h1>
    <div id="my-calendar">
        <h2>My Calendar</h2>
        <div id="calendar"></div>
    </div>
    <form action="/logout" method="post">
        <button type="submit">로그아웃</button>
    </form>
    <!-- 실시간 날씨 정보 표시 -->
    <div id="weather">날씨 정보 로딩 중...</div>
    <script src="/static/js/calendar.js"></script> <!-- 캘린더 기능 스크립트 -->
</body>
</html>

