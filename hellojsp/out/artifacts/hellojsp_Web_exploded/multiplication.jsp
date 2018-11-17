<jsp:include page="index.jsp"/>
<h1>Multiplication</h1>

<table>
    <%
        for (int i = 1; i <= 10; i++) {
            out.println("<tr>");
            String styl;
            for (int j = 1; j <= 10; j++) {
                if (j > i ){
                    styl = "style1";
                }else if (i > j){
                    styl = "style2";
                }else {
                    styl = "style3";
                }
                out.println("<td class=" + styl + ">");
                out.println(i * j);
                out.println("</td>");
            }
            out.println("</tr>");
        }
    %>


</table>