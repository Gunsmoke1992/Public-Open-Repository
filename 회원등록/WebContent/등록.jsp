<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
    <%!
	public void 회원저장(String 성명, String 주민번호, String 나이) {
    	
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1?useUnicode=true","root","1234");
			Statement statement = connection.createStatement();
			System.out.println("연결성공");
			String InputSQL = "insert into 회원(성명,주민번호, 나이) values('"+성명+"','"+주민번호+"','"+나이+"');";
			statement.executeUpdate(InputSQL);
			connection.close();
			}catch(Exception e) { e.printStackTrace(); }
	}
    %>
    
    
    
    <%
    	request.setCharacterEncoding("UTF-8");
    	String 성명 = request.getParameter("name");
    	String 주민번호 = request.getParameter("pnumber");
    	String 나이 = request.getParameter("age");

    	회원저장(성명, 주민번호, 나이);

    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입!</title>
</head>
<body>
 회원가입성공!
</body>
</html>