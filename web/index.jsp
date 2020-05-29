<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="header.jsp" %>
        <style>
            .header {
                color: #999999;
                font-size: 27px;
                padding: 10px;
            }

            .bigicon {
                font-size: 30px;
                color: #666666;
            }
        </style>
        
        
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
    </head>
        <body data-spy='scroll' data-target='.nav' data-offset='50'>
        <!-- mobile view -->
        <section>
            <header class=" navbar-fixed-top">

                <div class="nav navbar-default">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle " data-toggle="collapse" data-target="#menu">
                                <span class="sr-only">toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand menu  " style="color: white;font-size: large"> Criminal Record Management System</a>
                        </div>

                        <!-- nav-bar links -->
                        <div class="collapse navbar-collapse" id="menu">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="menu"><a href="#" style="color: white">About us</a></li>
                                <li class="menu"><a href="#contact" style="color: white; background: transparent">Contact us</a></li>
                                <li style="margin-top: 4%" class="btn btn-success" ><a style="color: whitesmoke;"  data-toggle="modal" data-target="#login" href="">Get Started</a></li>

                            </ul>
                        </div>
                    </div>
                </div> 
            </header>

        </section>
        
        
        
        <div class="panel-body"  style="background-image: url(Images/indian-flag-2.jpg); background-size: cover; height: 100%" >
            
            
       <div  class="bottom" style="margin-top:40%">
        <center><a data-toggle="modal" data-target="#login" href=""><button class="btn btn-success" >GET STARTED</button></a></center>

        <!-- Modal -->
        <div class="modal fade" id="login" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header" style="padding:35px 50px;">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form action="loginpolice" method="post" role="form" data-toggle="validator">
                            <div class="form-group has-feedback">
                                <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
                                <input type="text" class="form-control" required="" data-error="Please Enter Correct Service ID" name="user" placeholder="Enter Service ID">
                                <span class="glyphicon form-control-feedback"></span>
                                <div class="help-block with-errors"></div>
                            </div>
                            <div class="form-group has-feedback">
                                <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
                                <input type="password" class="form-control" name="pass" data-minlength="6" maxlength="15" required="" data-error="Minimum of 6 Characters" placeholder="Enter password">
                                <span class="glyphicon form-control-feedback"></span>
                                <div class="help-block with-errors"></div>
                            </div>

                            <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
                        </form>

                        <!-- Incorrect Username and Password error message start -->
                        <c:if test="${param.error ne null}">    
                            <script>
                                $(document).ready(function() {
                                    $("#login").modal();

                                });
                            </script>
                            <div class="alert-danger"><h2>Incorrect Username And Password</h2></div>

                        </c:if>
                        <!-- Incorrect Username and Password error message end--> 


                        <!-- Session expire error message start -->
                        
                        <c:if test="${param.expire ne null}">    
                            <script>
                                $(document).ready(function() {
                                    $("#login").modal();

                                });
                            </script>
                         <div class="alert-danger"><h2>Session Expire Login Again.. </h2></div>
                        </c:if>

                        <!-- Session expire error message end -->
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
                        <p>Not a member? <a href="policeregistration.html">Sign Up</a></p>
                        <p><a href="#" data-toggle="modal" data-target="#forgotpass" data-dismiss="modal">Forgot Password?</a></p>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <!-- login modal end -->
    
    
    <!-- Contact Panel Start-->

<section style="background-image:url(Images/Contact-Us-Header.jpg) ; background-size: cover; margin-top: 6.5%; height: 100%" >
    <div class="container" id="contact">
        <div class="row" >
            <div class="col-md-12">
                <div style="margin-top: 7%">
                    <form class="form-horizontal" method="post" action="contact">
                        <fieldset>
                            <legend class="text-center header">Contact us</legend>

                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-user bigicon "></i></span>
                                <div class="col-md-8">
                                    <input id="fname" name="fname" type="text" placeholder="First Name" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-user bigicon"></i></span>
                                <div class="col-md-8">
                                    <input id="lname" name="lname" type="text" placeholder="Last Name" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-user bigicon "></i></span>
                                <div class="col-md-8">
                                    <input id="policeid" name="policeid" type="text" placeholder="Enter Police Id" class="form-control">
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-envelope bigicon"></i></span>
                                <div class="col-md-8">
                                    <input id="email" name="email" type="text" placeholder="Email Address" class="form-control">
                                </div>
                            </div>

                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-phone-alt bigicon"></i></span>
                                <div class="col-md-8">
                                    <input id="phone" name="phone" type="text" placeholder="Phone" class="form-control">
                                </div>
                            </div>

                            <div class="form-group">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="glyphicon glyphicon-pencil bigicon"></i></span>
                                <div class="col-md-8">
                                    <textarea class="form-control" id="message" name="message" placeholder="Enter your message for us here. We will get back to you within 2 business days." rows="7"></textarea>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-12 text-center">
                                    <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Contact Panel End-->
        <!--Registration success Modal start -->

<div style="top: 30%" class="modal fade" id="registersuccess" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Registration Successful</h4>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
            
         
<!-- registration success modal end -->


<!--Registration fail Modal start -->

<div style="top: 30%" class="modal fade" id="registerfail" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Registration Failed</h4>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
     <!-- forgot password modal start -->

<div class="modal fade" id="forgotpass" role="dialog" style="margin-top: 5%">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header" style="padding:35px 50px;">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4><span class="glyphicon glyphicon-lock"></span> Forget Password</h4>
            </div>
            <div class="modal-body" style="padding:40px 50px;">

                <div class="panel-body">
                    <form action="mail" method="post" role="form" data-toggle="validator">
                        <div class="form-group has-feedback">
                            <input type="email" name="user" required="" data-error="Please Enter Your Username" class="form-control input-sm" placeholder="Email Address">
                            <span class="glyphicon form-control-feedback"></span>
                            <div class="help-block with-errors"></div>
                        </div>
                        <input type="submit" value="Submit" class="btn btn-info btn-block">
                    </form>

                    <!-- server side validation for forgot password start-->
                    
                    <c:if test="${param.emailnull ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#forgotpass").modal();

                            });
                        </script>
                        <div class="alert-danger"><h2>Please Enter Username First..</h2></div>

                    </c:if>
                    <c:if test="${param.invalid ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#forgotpass").modal();

                            });
                        </script>
                        <div class="alert-danger"><h2>Email Id Not Valid</h2></div>

                    </c:if>
                    <c:if test="${param.valid ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#forgotpass").modal();

                            });
                        </script>
                        <div class="alert-danger"><h2>Password is send to your email</h2></div>

                    </c:if>
                    <!-- server side validation for forgot password end-->
            </div>
        </div>
    </div>
</div>
<!-- forgot password modal end  -->


       
         
<!-- registration fail modal end -->




 <!--message send success Modal start -->

<div style="top: 30%" class="modal fade" id="send" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->

        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h3 class="modal-title">Message Send Successfully</h3>
            </div>
            <div class="modal-body">

                <center><p> <input type="button" value="OK" class="btn btn-lg btn-info" data-dismiss="modal" /></p></center>

            </div>
        </div>
    </div>
</div>
            
            
         
<!-- message send success modal end -->
 <!--registration unsuccessful error message start -->

                    <c:if test="${param.failreg ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#registerfail").modal();

                            });
                        </script>
                        

                    </c:if>


                    <!--registration unsuccessful error message end -->
                    
                    
                    
                    <!--registration successful message start -->
                    
                    <c:if test="${param.successreg ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#registersuccess").modal();

                            });
                        </script>
                    </c:if>

                    <!--registration successful  message end -->

                    
                     <!--message send successful message start -->
                    
                    <c:if test="${param.send ne null}">    
                        <script>
                            $(document).ready(function() {
                                $("#send").modal();

                            });
                        </script>
                    </c:if>

                    <!--message send  successful  message end -->




    </body>
</html>
