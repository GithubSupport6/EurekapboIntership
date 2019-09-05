<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css" >
    <title>Intership</title>
</head>
<body>
    <div class="title">
        <h2>Spring-not-boot is kinda hard</h2>
    </div>

    <div class = "data-container">
        <div class = "sub-container">
            <h3>Date : ${date}</h3>
        </div>

        <div class = "sub-container">
            <h3>Time : ${time}</h3>
        </div>

       <div class = "sub-container">
            <h3>Computer name : ${name}</h3>
        </div>

        <div class = "sub-container">
            <h3>Total memory : ${allMem} bytes</h3>
        </div>

        <div class = "sub-container">
            <h3>Free memory : ${freeMem} bytes</h3>
        </div>
    </div>
</body>
</html>
