
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first_num" value="">
            <br>
            <label>Second: </label>
            <input type="text" name="sec_num" value="">
            <br>
            <input type="submit" name="plus" value="+"><input type="submit" name="minus" value="-"><input type="submit" name="mult" value="*"><input type="submit" name="div" value="%">
        </form>
                 <h2>result: ${message}</h2>
         <a href="age">Age Calculator</a>
    </body>
</html>
