

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <!-- criminal details Modal start -->
                <div style="top: 10%" class="modal fade" id="criminaldetails" role="dialog">
                    <div class="modal-dialog" style="width: 80%">

        <!-- Modal content-->

        <sql:setDataSource var="try" driver="com.mysql.jdbc.Driver"
                                   url="jdbc:mysql://localhost:3306/ocrms"
                                   user="root" password=""/>
         <c:if test="${param.cri_id ne null}">
         <sql:query var="des" dataSource="${try}">
             SELECT * FROM crirecord where criminal_id=10
         </sql:query>
        </c:if>
        
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Criminal Details</h4>
            </div>
            <div class="modal-body">
                <div class="panel-body">
                    <form action="" method="post" role="form">
                        <table>
                            <c:forEach var="row" items="${des.rows}">
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Name:</label></td>
<td style="padding: 10px;"><input  name="fname" disabled="de" type="text" class="form-control" value="${row.fname}" placeholder="First name" style="width: 250px;margin-left: 5px;" ></td>
<td style="padding: 10px;"><input  name="mname" disabled="de" type="text" value="${row.mname}" class="form-control" placeholder="Middle name" style="width: 250px;" ></td>
<td style="padding: 10px;"><input  name="lname" type="text" disabled="de" value="${row.lname}" class="form-control" placeholder="Last name" style="width: 250px;" ></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family: bold; margin-top: 10px;" >Father's Name:</label></td>
<td style="padding: 10px;"><input name="ffname" disabled="de"  value="${row.ffname}" type="text" class="form-control" placeholder="First name" style="width: 250px;margin-left: 5px;" ></td>
<td style="padding: 10px;"><input name="fmname" disabled="de" type="text"value="${row.fmname}" class="form-control" placeholder="Middle name" style="width: 250px;" ></td>
<td style="padding: 10px;"><input  name="flname" disabled="de"  value="${row.flname}" type="text" class="form-control" placeholder="Last name" style="width: 250px;" ></td>
</tr>
 <tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Type of Crime:</label></td>
<td style="padding: 10px;"><input  name="type" disabled="de"  value="${row.tcrime}" type="text" class="form-control" placeholder="Crime Type" style="width: 250px; margin-left: 5px;" ></td>
 </tr>
 <tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Section Violation:</label></td>
<td style="padding: 10px;"><input  type="text" value="${row.violation}"  disabled="de" name="violation" class="form-control" placeholder="Ex:-Section-703" style="width: 250px; margin-left: 5px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Contact Number:</label></td>
<td style="padding: 10px;"><input  name="contact"value="${row.contact}" disabled="de"  type="text" class="form-control" placeholder="9199999999" style="width: 250px; margin-left: 5px;" ></td>
</tr>

<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Date Of Birth :</label></td>
<td style="padding: 10px;"> <input type="date" value="${row.dob}"  disabled="de" name="dob" class="form-control" style="width: 250px;margin-left: 5px;"></td>
</tr>
 
 
</table>
<fieldset style="margin-top: 30px;">
<legend> Criminal Address :</legend>
<table>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Address:</label></td>
<td style="padding: 10px;"><input name="peradd" value="${row.peradd}" disabled="de"  type="text"  class="form-control" placeholder="Enter Address" style="width: 250px;margin-left: 75px;"></td>
</tr> 
<tr>
<td style="padding: 10px;"><label style="font-family:  bold; margin-top: 10px;" >State:</label></td>
<td style="padding: 10px;"><input type="text" name="perstate" value="${row.perstate}" disabled="de" class="form-control" placeholder="Enter State" style="width: 250px;margin-left: 75px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family: bold; margin-top: 10px;" >City:</label></td>
<td style="padding: 10px;"><input type="text" name="percity" value="${row.percity}" disabled="de" class="form-control" placeholder="Enter City" style="width: 250px;margin-left: 75px;"></td>
</tr>
<tr>
<td style="padding: 10px;" ><label style="font-family:  bold; margin-top: 10px;" >Pincode:</label></td>
<td style="padding: 10px;"><input  name="ppincode" type="text" value="${row.perpincode}" disabled="de" class="form-control" placeholder="802102" style="width: 250px;margin-left: 75px;" ></td>
</tr>
</table>
</fieldset>


<tr>
<td ><br><br><br></td>
<td ><br></td>
</tr>
<tr>
<td></td><td></td>

</tr>
<tr>
<td ><br><br><br></td>
<td ><br></td>
</tr>
</c:forEach>
</table>
<a  href="home.jsp " class="btn btn-info btn-block">OK</a>

                    </form>
 
                </div>    

            </div>
        </div>
    </div>
</div>
                
                <!-- criminal details modal End -->
    </body>
</html>
