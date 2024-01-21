<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
width:600px;
}
.i{
position:relative;
left:5px;

}
.n{
position:relative;
left:51px;

}
.p{
position:relative;
left:63px;

}
.t{
position:relative;
left:51px;

}
h1{
text-align: center;
}
#karthik{
position:relative;
left:500px;
top:30px;
background-color: blue;
color:white;
width:350px;
padding-top:30px;
padding-left:30px;
height:300px;
}
#submit{
position:relative;
left:155px;
width:170px;

}


</style>
</head>
<body>
    <h1>Fill the form of user</h1>
                  
<form  id="karthik" action="saveCustomerDetails">

       
 <label>Enter Account number </label>  <input class="i" name="accountNo" type="text"><br>
 <br>
<label> Enter   username     </label> <input class="n"  name="userName" type="text"><br>
<br>
<label>  Enter  balance   </label>   <input class="p"  name="balance" type="text"><br>
 <br>
 <label> Enter  passward </label>  <input class="t"  name="passward" type="text"><br>       
     <br>   <input id="submit" type="submit">
         
       </form>
</body>
</html>