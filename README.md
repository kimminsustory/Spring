다음은 `README.md` 파일의 내용을 코드 블록 형식으로 작성한 것입니다.

```markdown
# Tmax WAPL Web Application

## 프로젝트 개요
이 프로젝트는 Spring Boot를 사용하여 CentOS 9에서 Tibero7 데이터베이스와 Tomcat 웹 서버를 기반으로 하는 웹 애플리케이션입니다. Kubernetes 클러스터는 master, worker1, worker2로 구성되어 있습니다. 웹 애플리케이션은 홈 화면, 회원가입 화면, 로그인 화면, 마이페이지 화면으로 구성되며, 모든 페이지의 오른쪽 상단에 실시간 날씨 정보가 표시됩니다.

## 주요 기능
### 홈 화면
- **문구**: "I Love Tmax WAPL ♡"
- **버튼**: 회원가입, 로그인
- 회원가입 버튼을 누르면 회원가입 화면으로 이동
- 로그인 버튼을 누르면 로그인 화면으로 이동

### 회원가입 화면
- **입력 필드**: ID, PW, Email
- **기능**:
  - ID, PW, Email 입력 후 등록 버튼을 누르면 Tibero7 DB에 데이터 삽입
  - 이미 등록된 ID일 경우 "등록된 ID입니다!" 메시지를 표시하고 현재 페이지 유지
  - 등록되지 않은 ID일 경우 "회원가입완료!" 메시지를 표시하고 로그인 화면으로 이동

### 로그인 화면
- **입력 필드**: ID, PW
- **기능**:
  - ID, PW 입력 후 로그인 버튼 클릭 시 Tibero7 DB에서 해당 계정 확인
  - 계정이 존재하면 이메일로 인증번호 전송 후 2차 인증 진행
  - 인증번호가 맞으면 "환영합니다!" 메시지 표시 후 마이페이지로 이동
  - 인증번호가 틀리면 "인증번호를 확인해주세요!" 메시지 표시 후 현재 페이지 유지
  - 계정이 존재하지 않으면 "존재하지 않는 ID입니다!" 메시지 표시 후 현재 페이지 유지

### 마이페이지 화면
- **캘린더 서비스**: "My Calendar" 아래에 캘린더 서비스 제공
- **로그아웃 버튼**: 로그아웃 시 홈 화면으로 이동

## 실시간 날씨 정보
- 모든 페이지의 오른쪽 상단에 실시간 날씨 정보가 표시됩니다.
- OpenWeatherMap API를 사용하여 날씨 정보를 연동합니다.

## 기술 스택
- **Backend**: Spring Boot
- **Frontend**: JSP, JavaScript
- **Database**: Tibero7
- **Web Server**: Apache Tomcat
- **Deployment**: Kubernetes (master, worker1, worker2)

## 프로젝트 구조
```
src/
├── main/
│   ├── java/
│   │   └── com/tmax/wapl/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── model/
│   ├── resources/
│   │   ├── application.properties
│   │   ├── templates/
│   │   │   ├── home.jsp
│   │   │   ├── register.jsp
│   │   │   ├── login.jsp
│   │   │   ├── mypage.jsp
│   └── webapp/
│       ├── WEB-INF/
│       │   └── web.xml
```

## 실행 방법
1. Spring Boot 애플리케이션을 실행합니다.
2. Tomcat 서버를 실행하여 웹 애플리케이션을 배포합니다.
3. 브라우저에서 웹 애플리케이션에 접근합니다.

## 문제 해결
### 회원가입 오류
- ID가 중복된 경우, 오류 메시지가 표시되며 Tibero7 DB에 데이터가 삽입되지 않습니다.
- 등록이 완료되면 로그인 화면으로 리디렉션됩니다.

### 로그인 오류
- ID와 PW가 일치하지 않으면 오류 메시지가 표시되며, 페이지가 유지됩니다.
- 인증 번호가 올바르지 않으면 오류 메시지가 표시되며, 페이지가 유지됩니다.

### 마이페이지
- 캘린더 서비스와 로그아웃 기능이 구현되어 있습니다.

## 기타
- 프로젝트는 Kubernetes Ingress를 통해 서비스됩니다.
```
