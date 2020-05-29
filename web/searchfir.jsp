<%--
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="vas" driver="com.mysql.jdbc.Driver"
                                   url="jdbc:mysql://localhost:3306/ocrms"
                                   user="root" password=""/>
        <c:if test="${param.fir_id ne null}">
            <sql:query var="asd" dataSource="${vas}">
                SELECT *  FROM fir where fir_id=10
            </sql:query>
        </c:if>
            
            
                  <!-- FIR details Modal start -->
                <div style="top: 10%" class="modal fade" id="firdetails" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">FIR Details</h4>
            </div>
            
            <div class="modal-body">
                <div class="panel-body">
                    <form  role="form">
                         <c:forEach var="row" items="${asd.rows}">
                        <div class="form-group">
                            <label>Date & Time of FIR</label>   <input type="datetime" value='${row.fir_date}' disabled="de"  class="form-control input-sm" >
                        </div>
                        <div class="form-group">
                            <label>FIR Filed by Officer</label>   <input type="text" value='${row.fir_officer}' disabled="de"   class="form-control input-sm" >
                        </div>
                        <div class="form-group">
                            <label>Type of FIR</label>   <input type="text" value='${row.fir_type}' disabled="de" class="form-control input-sm" >
                        </div>
                        <div class="form-group">
                            <input type="text" value="${row.report}" disabled="de" class="form-control input-lg" >
                        </div>
                         <div class="form-group">
                             <label>Status of FIR</label>    <input type="text" value='${row.fir_status}'   disabled="de" class="form-control input-sm" >
                        </div>
                        </c:forEach>
                        <a href="home.jsp" class="btn btn-info btn-block">OK</a>
                        
                    </form>
 
                </div>    

            </div>
        </div>
    </div>
</div>
                
                <!-- FIR details modal End -->

            
    </body>
</html>
-->