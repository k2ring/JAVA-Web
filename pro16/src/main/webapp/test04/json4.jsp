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
                   let jsonStr = '[{"name" : "박지성" , "age" : 30 } ,{"name" : "손흥민" , "age" : 35 } ]'
                   let jsonObj=JSON.parse(jsonStr);
                     /* console.log(jsonObj); */ 
                var output = "회원 정보<br>";
	    		output += "=======<br>";
                   
                /*   for (let i in jsonObj){
                	   /* console.log(jsonObj[i]); */
                	   /* console.log(jsonObj[i].name, jsonObj[i].age); 
                	   
                	  output += "이름: " + jsonObj[i].name +"<br>";
                	  output +=  "나이: " + jsonObj[i].age +"<br>";
                   }  */
                  
                  
                  for (let item of jsonObj){
               	   /* console.log(jsonObj[i]); */
               	   /* console.log(jsonObj[i].name, jsonObj[i].age); */
               	   
               	  output += "이름--: " + item.name +"<br>";
               	  output +=  "나이--: " + item.age +"<br>";
                  } 
                     
                   $("#output").html(output); 
                 /*  $("#output").text(output);  텍스트 그대로 나옴*/
                }); 
            });

          
        </script>


    </head>

    <body>

        <a id="checkJson" style="cursor: pointer"> 출력11</a>
       

        <div id="output"></div>
    </body>

    </html>