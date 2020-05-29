<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${sessionScope.sas eq null}">
    <c:redirect url="index.jsp?expire=Session Expred Please Login Again.."/>

</c:if>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Home</title>
        <style>
            .modal-header, h4, .close {
                background-color: #5cb85c;
                color:white !important;
                text-align: center;
                font-size: 30px;
            }
            .modal-footer {
                background-color: #f9f9f9;
            }
        </style>

        <link href="style/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="usercss/mycss.css" rel="stylesheet" type="text/css"/>
        <script src="style/js/jquery-1.9.1.js" type="text/javascript"></script>



    </head>
    <body style="background-image: url(Images/indian-flag-2.jpg); background-size: cover">

        <!-- mobile view -->
        <section>
            <header>

                <div class="nav navbar-default">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle " data-toggle="collapse" data-target="#menu">
                                <span class="sr-only">toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand menu" style="color: #ffffff;font-size: large;" href="home.jsp">Criminal Record Management System</a>
                        </div>

                       

                        <!-- nav-bar links -->
                        <div class="collapse navbar-collapse" id="menu">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="menu dropdown"><a style="font-size: larger; color: whitesmoke; background: transparent"  class="glyphicon glyphicon-cog" data-toggle="dropdown" href="#"><span class="caret"></span></a>
                                    <ul class="dropdown-menu dropdown-menu-left">
                                        <li class="menu"><a href=""  data-toggle="modal" data-target="#policeprofile"><b>Account</b></a></li>
                                        <li class="menu"><a href="" data-toggle="modal" data-target="#pass"><b>Security</b></a></li>
                                    </ul>
                                </li>


                                <li class="menu dropdown " ><a style="font-size: larger; color: whitesmoke; background: transparent;" class="glyphicon glyphicon-user" data-toggle="dropdown" href="#"><span class="caret"> </span></a>
                                    <ul class="dropdown-menu dropdown-menu-right">
                                        <li><a style="font-size: large" ><b>Welcome User:</b></a></li>
                                        <li><a >${sessionScope.sas}</a></li>
                                        <li class="menu"><a class="glyphicon glyphicon-log-out" href="logout" style="font-size: large"><b> SignOut</b></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div> 
            </header>
        </section>

                                        
    <!-- Police Profile Modal start -->
                <div style="top: 10%" class="modal fade" id="policeprofile" role="dialog">
                    <div class="modal-dialog" style="width: 80%">

        <!-- Modal content-->
<sql:setDataSource var="res" driver="com.mysql.jdbc.Driver"
                                   url="jdbc:mysql://localhost:3306/ocrms"
                                   user="root" password=""/>


<sql:query var="ar" dataSource="${res}">
    SELECT * FROM registration where police_id=${sessionScope.sas}
</sql:query>
    
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Police Officer Profile</h4>
            </div>
            <div class="modal-body">
                <div class="panel-body">
                    <form action="policeprofile" method="post" role="form">
                        <c:forEach var="row" items="${ar.rows}">
                        
                       <table>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Name:</label></td>
<td style="padding: 10px;"><input  name="fname" type="text" class="form-control" placeholder="First name" disabled="ds" value="${row.fname}" style="width: 250px;margin-left: 25px;" ></td>
<td style="padding: 10px;"><input  name="mname" type="text" class="form-control" placeholder="Middle name"  disabled="ds" value="${row.mname}" style="width: 250px;" ></td>
<td style="padding: 10px;"><input  name="lname" type="text" class="form-control" placeholder="Last name" disabled="ds" value="${row.lname}" style="width: 250px;" ></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family: bold; margin-top: 10px;" >Father's Name:</label></td>
<td style="padding: 10px;"><input name="ffname" type="text" class="form-control" placeholder="First name"  disabled="ds" value="${row.ffname}" style="width: 250px;margin-left: 25px;" ></td>
<td style="padding: 10px;"><input name="fmname" type="text"  disabled="ds" class="form-control" placeholder="Middle name" value="${row.fmname}" style="width: 250px;" ></td>
<td style="padding: 10px;"><input  name="flname" type="text"  disabled="ds" class="form-control" placeholder="Last name"  value="${row.flname}"style="width: 250px;" ></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Date Of Birth :</label></td>
<td style="padding: 10px;"> <input type="date" name="dob"  disabled="ds" value="${row.dob}" class="form-control" style="width: 250px;margin-left: 25px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Email:</label></td>
<td style="padding: 10px;"><input  name="email" type="email"  class="form-control" value="${row.email}" placeholder="ex:-police@gmail.com" style="width: 250px;margin-left: 25px;" ></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:   bold; margin-top: 10px;" >Gender:</label></td>
    <td ><input type="radio"  disabled="ds" name="gender" value="Male" checked="ch" style="margin-left:35px;margin-top:10px; "/>Male
<input type="radio"   disabled="ds"  name="gender" value="Female" style="margin-left:20px;margin-top:10px;" />Female</td>
</tr>

<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Contact Number:</label></td>
<td style="padding: 10px;"><input  name="contact"value="${row.contact}" type="text" class="form-control" placeholder="9199999999" style="width: 250px; margin-left: 25px;" ></td>
</tr>
</table>
<fieldset style="margin-top: 30px; " >
<legend>Address :</legend>
<table>
 <tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Address:</label></td>
<td style="padding: 10px;"><input name="peradd" value="${row.per_address}" type="text" class="form-control" placeholder="Enter Address" style="width: 250px;margin-left: 75px;"></td>
</tr>
<tr>
<td style="padding: 10px;"><label style="font-family:  bold; margin-top: 10px;" >State:</label></td>
<td style="padding: 10px;"><input type="text" value="${row.per_state}" name="perstate" class="form-control" placeholder="Enter State" style="width: 250px;margin-left: 75px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family: bold; margin-top: 10px;" >City:</label></td>
<td style="padding: 10px;"><input type="text"value="${row.per_city}" name="percity" class="form-control" placeholder="Enter City" style="width: 250px;margin-left: 75px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Pincode:</label></td>
<td style="padding: 10px;"><input  name="ppincode" value="${row.per_pincode}" type="text" class="form-control" placeholder="802102" style="width: 250px;margin-left: 75px;" ></td>
</tr>
</table>
</fieldset>
    

    
    <fieldset style="margin-top: 30px;">

<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Service id:</label></td>
<td style="padding: 10px;"><input  name="serviceid" value="${row.police_id}"  disabled="ds" type="text" class="form-control" placeholder="802102" style="width: 250px; margin-left: 0px;"></td>

</tr>

<tr>
<td ><br><br><br></td>
<td ><br></td>
</tr>
<tr>
<td></td>
</tr>
</table>
<table>
<tr>
<td ><br><br><br></td>
<td ><br></td>
</tr>
</table>
                       </c:forEach>
                        <input type="submit" value="Update" class="btn btn-info btn-block">

        </form>
 
                </div>    

            </div>
        </div>
    </div>
</div>
                
                <!-- Police Profile modal End -->
                
                                        
                                        
                                        <%@include  file="footer.jsp" %>