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
                    //  alert("hi2");
                    let jsonStr = '{ "name": ["홍일동2", "홍이동2", "홍삼동2"] }'; 
                   /*  let jsonStr = "{ 'name': ['홍일동2', '홍이동2', '홍삼동2'] }";  */ 
                    console.log(jsonStr);
                    /*   parse(): JSON 문자열을 매개변수로서 수용하고, 일치하는 자바스크립트 객체로서 변환합니다.
                    // parse(문자열 타입 ) 
                      stringify(): 객체를 매개변수로서 수용하고, JSON 문자열 형태로 변환합니다. */
                      console.log(typeof(jsonStr));
                      let jsonInfo = JSON.parse(jsonStr);
                      console.log(typeof(jsonInfo));
                      let output = "회원 이름4<br>";
                    output += "=======<br>";
                    console.log(jsonInfo);
                    console.log(jsonInfo.name);
                   /*  for (var i in jsonInfo.name) {
                        output += jsonInfo.name[i] + "<br>";
                    } */

                      for (let item of jsonInfo.name) {
                    output += item + "<br>";
                	}
                    
                    $('#output').html(output);
                    
                    console.log(output);

                });
            });


        </script>


    </head>

    <body>

        <a id="checkJson" style="cursor: pointer"> 출력9</a>
        <!-- <a id="checkJson"  > 출력</a> -->

        <div id="output"></div>
    </body>

    </html>