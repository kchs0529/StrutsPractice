## **1️⃣****프로젝트 환경 설정**

### **✅ 사용 환경**

구성 요소 버전

| **JDK** | 1.8 |
| --- | --- |
| **Eclipse** | Eclipse IDE for Enterprise Java Developers |
| **Apache Tomcat** | 9.0 |
| **Struts2 버전** | 2.5.30 |

### **✅ Eclipse에서 Dynamic Web Project 생성**

1.  Eclipse 실행 → File → New → Dynamic Web Project 선택
2.  **프로젝트 이름:** StrutsProject 입력
3.  **타겟 런타임:** Apache Tomcat 9.0 선택
4.  **구성:** Default Configuration for Apache Tomcat 선택
5.  **JDK 1.8 선택 후 Finish**

🔹 **프로젝트 폴더 구조**

```
StrutsProject/
│── Java Resources/
│   ├── src/
│   │   ├── action/BoardAction.java (Action 클래스 저장)
│   │   ├── model/Board.java(VO 또는 DTO 클래스)
│   │   ├── dao/BoardDAO.java(데이터 액세스 객체, DB 처리 클래스)
│   │   ├── utils/DBConnection.java  (DB 연결 파일)
│   │   ├── struts.xml  (Struts 설정 파일)
│── WebContent/
│   ├── WEB-INF/
│   │   ├── web.xml  (웹 애플리케이션 설정)
│   │   ├── lib/ (Struts2 필수 JAR 파일)
│   ├── jsp/
│   │   ├── list.jsp  (JSP 파일)
│   │   ├── edit.jsp  (JSP 파일)
│   │   ├── view.jsp  (JSP 파일)
│   │   ├── write.jsp  (JSP 파일)
```


---

## **2️⃣****Struts2 라이브러리 추가**

Struts2 프로젝트가 정상적으로 실행되기 위해 **필수 JAR 파일을 ****WEB-INF/lib**** 폴더에 추가**해야 합니다.

라이브러리는 [Apache Struts 공식 홈](https://struts.apache.org/ "Apache Struts 공식 홈") 에서 다운로드 받을 수 있습니다.

### **✅ 필수 라이브러리 목록**

**라이브러리 이름과 설명**

| struts2-core-2.5.30.jar | Struts2 핵심 라이브러리 |
| --- | --- |
| ognl-3.1.29.jar | OGNL 표현 언어 |
| commons-fileupload-1.3.3.jar | 파일 업로드 지원 |
| commons-io-2.6.jar | IO 유틸리티 |
| log4j-api-2.12.4.jar | 로그 라이브러리 |
| log4j-core-2.12.4.jar | 로그 설정  |
| javassist-3.27.0-GA.jar | Javassist  |
| freemarker-2.3.31.jar | 템플릿 엔진 |
| commons-lang3-3.8.1.jar | 유틸리티 |
