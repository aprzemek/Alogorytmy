<jsp:include page="index.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.Random" %><%


    LinkedList list = new LinkedList();
    Random generator = new Random();


    int losownaLiczba = generator.nextInt(100);
    out.print("Wylosowana liczba to: "+ losownaLiczba+" i jest ona ");

    if (losownaLiczba>=50) {
        out.print(" większa od 50");
    }else  if (losownaLiczba == 50) {
        out.print("równa 50");
    }else {
        out.print(" mniejsza od 50");
    }

%>
