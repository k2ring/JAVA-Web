<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

        <script>

          

            $(function () {
                $('#checkJson').click(function () {
                   let jsonStr = '{"name" : "박지성" , "age" : 30 }'
                   let jsonObj=JSON.parse(jsonStr);
                   /*  console.log(jsonObj); */
                   /* console.log(jsonObj.name, jsonObj.age); */
                   
                   /* for (let i in jsonObj){
                	   console.log(i, jsonObj[i]);
                	   
                   } */
                   var output ="회원 정보<br>";
       	      	output += "=======<br>";
       	      	output += "이름: " + jsonObj.name+"<br>";
       	       	output += "나이: " + jsonObj.age+"<br>";
       	      
       	      	$("#output").html(output);
                });
            });


        </script>


    </head>

    <body>

        <a id="checkJson" style="cursor: pointer"> 출력11</a>
       

        <div id="output"></div>
    </body>

    </html>