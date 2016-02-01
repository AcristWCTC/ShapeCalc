<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Shape Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Class4LabCSS.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Shape Calculator</h1>
        
        <form method ="POST" action="CalculatorController2?calcType=rectangle" name="RectangleCalculator" class="RectangleCalculator">
            <label>Enter Length and Width for a Rectangle</label>
            <span><input class="InputClass" type ="text" name="length" value="" placeholder="Enter Length"/></span>
            <span><input class="InputClass" type ="text" name="width" value="" placeholder="Enter Width"/></span>
            <span><input type="submit" name="submit" value="Calculate" class = "button"/></span>
            <img src="Sol33.jpeg" alt="" style="width:150px;height:128px;" class="img"/>
        </form>

        <form method ="POST" action="CalculatorController2?calcType=circle" name="CircleCalculator" class="CircleCalculator">
            <label>Enter the Radius for a Circle</label>
            <span><input class="InputClass" type ="text" name="radius" value="" placeholder="Enter Radius"/></span>
            <span><input type="submit" name="submit" value="Calculate" class = "button"/></span>
            <img src="circle-49_42943_lg.gif" alt="" style="width:150px;height:128px;" class="img2"/>
        </form>
        

        <form method ="POST" action="CalculatorController2?calcType=triangle" name="TriangleCalculator" class="TriangleCalculator">
            <label>Enter the Two sides for a Triangle</label>
            <span><input class="InputClass" type ="text" name="side1" value="" placeholder="Enter Side One"/></span>
            <span><input class="InputClass" type ="text" name="side2" value="" placeholder="Enter Side Two"/></span>
            <span><input type="submit" name="submit" value="Calculate" class = "button"/></span>
            <img src="triangle_pythagorean.gif" alt="" style="width:150px;height:128px;" class="img3"/>
        </form>
        
    </body>
</html>


        <p class="result">
            <%
                Object responseObj = request.getAttribute("myMsg");
                Object errObj = request.getAttribute("errorMsg");

                if (responseObj != null) {
                    out.println(responseObj.toString());
                }
                if (errObj != null) {
                    out.println(errObj.toString());
                }
            %>
        </p>
    </body>
</html>
