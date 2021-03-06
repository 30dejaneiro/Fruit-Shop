<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="Home">Store</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul class="navbar-nav m-auto">
                        <c:if test="${sessionScope.user.role == 'admin'}">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Manager Account</a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link" href="Manager">Manager Product</a>
                        </li> 
                        </c:if>
                        <c:if test="${sessionScope.user != null}">
                            <li class="nav-item">
                            <a class="nav-link" href="#">Hello ${sessionScope.user.username} </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Logout">Logout</a>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.user == null}">    
                        <li class="nav-item">
                            <a class="nav-link" href="Login.jsp ">Login</a>
                        </li>
                        </c:if>
                    </ul>

                    <form action="search" method="post" class="form-inline my-2 my-lg-0">
                        <div class="input-group ">
                            <input name="txt" type="text" class="form-control" aria-label="Small" placeholder="Search...">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                        <a class="btn btn-success btn-sm ml-3" href="print">
                            <i class="fa fa-shopping-cart"></i> Cart
                            
                        </a>
                    </form>
                </div>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Fruit shop</h1>           
            </div>
        </section>
        <!--end of menu-->