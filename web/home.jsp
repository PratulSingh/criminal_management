
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="header.jsp" %>
        <title>Home</title>
        <%@include file="homeheader.jsp" %>
         <%@include file="header.jsp" %>
        <%@include file="cridetails.jsp" %>
        <%@include  file="searchfir.jsp" %> 
    </head>
    <body>
         
        
        
        

        
        <!-- change password modal start -->


<div class="modal fade" id="pass" role="dialog" style="margin-top: 5%">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header" style="padding:35px 50px;">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4><span class="glyphicon glyphicon-lock"></span> Change Password</h4>
            </div>
            <div class="modal-body" style="padding:40px 50px;">

                <div class="panel-body">
                    <form action="changepassword" method="post" role="form">
                        <div class="form-group">
                            <input type="password" name="oldpass"  class="form-control input-sm" placeholder="Enter Old Password">
                        </div>
                        <div class="form-group">
                            <input type="password" name="newpass"  class="form-control input-sm" placeholder="Enter New Password">
                        </div>
                        <div class="form-group">
                            <input type="password" name="confirmpass"  class="form-control input-sm" placeholder="Confirm Password">
                        </div>
                        <input type="submit" value="Submit" class="btn btn-info btn-block">

                    </form>
                    <c:if test="${param.incorrect ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#pass").modal();

                            });
                        </script>

                        <div class="alert-danger"><h3>Old Password Not Matched</h3></div>
                    </c:if>
                    <c:if test="${param.update ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#pass").modal();

                            });
                        </script>

                        <div class="alert-success"><h3>Password Changed Successfully</h3></div>
                    </c:if>
                </div>


            </div>
        </div>
    </div>
</div>
<!-- change password modal end  -->

<section>
    <header  style="padding-left:  5px; padding-top: 50px;"   class="panel-body">
        <div style="padding-left:  0px;" class="col-lg-2">
            <div style="padding-left:  0px;" class="container-fluid">
                <div class=" panel panel-default">
                     <div class="panel-heading">
                        <a class="panel-title" style="text-decoration: none" href="" data-toggle="modal" data-target="#searchcri">Search Criminal </a>
                    </div>
                    <div class="panel-heading">
                        <a class="panel-title" style="text-decoration: none" href="" data-toggle="modal" data-target="#fir">File FIR </a>
                    </div>
                    <div class="panel-heading">
                        <a class="panel-title" style="text-decoration: none" href=""data-toggle="modal" data-target="#searchfir" >Search FIR </a>
                    </div>
                    <div class="panel-heading">
                        <a class="panel-title" style="text-decoration: none" href="criminalreg.html">Register Criminal </a>
                    </div>
                </div>
            </div>
        </div>
         <div class="col-lg-7 ">
            <div class="panel" style="min-height: 500px">
               
                
                <sql:setDataSource var="show" driver="com.mysql.jdbc.Driver"
                                   url="jdbc:mysql://localhost:3306/ocrms"
                                   user="root" password=""/>
                <c:if test="${param.name ne null and param.city ne null and param.state ne null}">
                <sql:query var="result" dataSource="${show}">
                    SELECT fname,lname,perstate,percity,criminal_id from crirecord where fname LIKE '%${param.name}%' and percity LIKE '%${param.city}%' and perstate LIKE '%${param.state}%'
                </sql:query>
                    </c:if>
                    <c:if test="${param.name  ne null and param.city ne null}">
                <sql:query var="result" dataSource="${show}">
                    SELECT fname,lname,perstate,percity,criminal_id from crirecord where fname LIKE '%${param.name}%' and percity LIKE '%${param.city}%' 
                </sql:query>
                    </c:if>
                    <c:if test="${param.name   ne null and param.state ne null}">
                <sql:query var="result" dataSource="${show}">
                    SELECT fname,lname,perstate,percity, criminal_id from crirecord where fname LIKE '%${param.name}%'  and perstate LIKE '%${param.state}%'
                </sql:query>
                    </c:if>
                    
              <c:if test="${param.dfir ne null and param.tfir ne null}">
            <sql:query var="asd" dataSource="${show}">
                SELECT *  FROM fir where fir_date LIKE '%${param.dfir}%' and fir_type LIKE '%${param.tfir}%' 
            </sql:query>
        </c:if>
                <c:if test="${param.dfir ne null}">
                <sql:query var="asd" dataSource="${show}">
                SELECT *  FROM fir where fir_date LIKE '%${param.dfir}%' 
            </sql:query>
            </c:if>
            <c:if test="${asd ne null}">
            <c:forEach var="row" items="${asd.rows}">
                <div class="panel-heading">
                        <a class="form-control input-lg" style="border-radius:2px " href="home.jsp?fir_id=${row.fir_id}&firdetails" ><h5><label>FIR Date & Time:</label>  ${row.fir_date}   <label>Type of FIR:</label> ${row.fir_type}    </h5></a>
                    </div>
            </c:forEach>
            </c:if>
                <c:if test="${result ne null}">
                <c:forEach var="row" items="${result.rows}">
                    <div class="panel-heading">
                        <a class="form-control input-lg" style="border-radius:2px " href="home.jsp?cri_id=${row.criminal_id}&cridetails" ><h5><label>Criminal Name:</label>  ${row.fname}  ${row.lname}   <label>Criminal State:</label> ${row.perstate}    <label>Criminal City:</label>   ${row.percity}   <label>Type of crime:</label> ${row.tcrime}</h5></a>
                    </div>
                    
                </c:forEach> 
                </c:if>
                   
            </div> 
</div>
    </header>
   
</section>
                
                <!--Registration fail Modal start -->

<div style="top: 30%" class="modal fade" id="crimefail" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">criminal Registration Failed</h4>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>

 <!--Registration fail Modal end -->
 
 
        <!--Registration success Modal start -->

<div style="top: 30%" class="modal fade" id="crimesucc" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">criminal Registration Successful</h4>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
            
         
<!-- criminal registration success modal end -->


<!-- fir Registration success Modal start -->

<div style="top: 30%" class="modal fade" id="firsucc" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h3 class="modal-title">FIR FILED</h3>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
            
         
<!--  fir registration success modal end -->


<!--fir  Registration unsuccess Modal start -->

<div style="top: 30%" class="modal fade" id="firfail" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">FIR NOT FILED</h4>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
            
         
<!--fir registration unsuccess modal end -->



                <!-- FIR Modal start -->
                <div style="top: 10%" class="modal fade" id="fir" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">File FIR</h4>
            </div>
            <div class="modal-body">
                <div class="panel-body">
                    <form action="fir" method="post" role="form">
                         
                        <div class="form-group">
                            <label>Type of FIR</label>   <input type="text" required="re" name="tfir"  class="form-control input-sm" >
                        </div>
                        <div class="form-group">
                            <input type="text" name="report"  required="re" class="form-control input-lg" placeholder="Enter Report">
                        </div>
                         <div class="form-group">
                             <label>Status of FIR</label>    <input type="text" required="re" name="status"  class="form-control input-sm" >
                        </div>
                        <input type="submit" value="Submit" class="btn btn-info btn-block">

                    </form>
 
                </div>    

            </div>
        </div>
    </div>
</div>
                
                <!-- FIR modal End -->


                
                 <!-- search FIR Modal start -->
                <div style="top: 10%" class="modal fade" id="searchfir" role="dialog">
   <%-- <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Search FIR</h4>
            </div>
            <div class="modal-body">
                <div class="panel-body">
                    <form action="home.jsp" method="post" role="form">
                         
                        <div class="form-group">
                            <label>Date Of FIR</label>   <input type="text" required="re" placeholder="YYYY-MM-DD" name="dfir"  class="form-control input-sm" >
                        </div>
                   
                         <div class="form-group">
                            <label>Type Of Crime</label>   <input type="text" name="tcrime"  class="form-control input-sm" >
                        </div>
                        <input type="submit" value="Submit" class="btn btn-info btn-block">

                    </form>
 
                </div>    

            </div>
        </div>
    </div>
</div> --%>
                
                <!-- search FIR modal End -->

                
                  <!-- search criminal Modal start -->
                <div style="top: 10%" class="modal fade" id="searchcri" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Search Criminal</h4>
            </div>
            <div class="modal-body">
                <div class="panel-body">
                    <form action="home.jsp" method="get" role="form">
                        <div class="form-group">
                            <input type="text" name="name" required="re" placeholder="Enter criminal name " class="form-control input-sm">
                        </div>
                        <div class="form-group">
                            <input type="text" name="state" placeholder="Enter Crime State"  class="form-control input-sm" >
                        </div>
                        <div class="form-group">
                               <input type="text" placeholder="Enter Crime City" name="city"  class="form-control input-sm" >
                        </div>
                       
                        <input type="submit" value="Submit" class="btn btn-info btn-block">

                    </form>
 
                </div>    

            </div>
        </div>
    </div>
</div>
                
                <!-- Search criminal modal End -->
                
                
                
                
                
                
                
                
                     <!--criminal registration successful message start -->
                    
                    <c:if test="${param.crimesucc ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#crimesucc").modal();

                            });
                        </script>
                    </c:if>

                    <!--criminal registration successful  message end -->
                    
                    <!--crime registration unsuccessful error message start -->

                    <c:if test="${param.crimefail ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#crimefail").modal();

                            });
                        </script>
                        

                    </c:if>


                    <!--criminal registration unsuccessful error message end -->
                    
                    
                    

                 <!--fir registration successful message start -->
                    
                    <c:if test="${param.firsucc ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#firsucc").modal();

                            });
                        </script>
                    </c:if>

                    <!--fir registration successful  message end -->
                
                
                    
                 <!--fir registration unsuccessful message start -->
                    
                    <c:if test="${param.firfail ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#firfail").modal();

                            });
                        </script>
                    </c:if>

                    <!--fir registration unsuccessful  message end -->
                
                
                    
                    <!--criminal details modal start -->
                    
                    <c:if test="${param.cridetails ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#criminaldetails").modal();

                            });
                        </script>
                    </c:if>

                    <!--criminal details modal end -->
                    
                    
                     <!--fir details modal start -->
                    
                    <c:if test="${param.firdetails ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#firdetails").modal();

                            });
                        </script>
                    </c:if>

                    <!--firdetails modal end -->
                
                
    </body>
</html>
