<%-- 
    Document   : doctor
    Created on : Nov 29, 2018, 9:36:52 PM
    Author     : Geoffrey
    Modified by: Arturo 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../styles/doctor.css">
 	<link rel="stylesheet" href="../styles/w3.css">
        <title>Sirona</title>
        
        <!-- added the following lines of code to be able to implement a date picker.
        can be used for scheduling or appointment look up -->
        <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

        <!-- used for pie chart -->
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

       
        <style>
            * {
                box-sizing: border-box;
            }
        </style>
        
    </head>
    
    <body>
        <!-- Header -->
        <header class="w3-top">
            <div class="w3-bar w3-light-blue w3-top w3-left-align w3-large">
                <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Welcome, &lt;doctorUserName&gt;</a>
                <div class="w3-right w3-hide-small">
                    <a class="w3-bar-item w3-button w3-hover-white" href="/Sirona/">Sign Out</a>
                </div> 
            </div>
        </header>

        <!-- Sidebar -->
        <nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
            <h4 class="w3-bar-item"><b>Menu</b></h4>
            <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Home</a>
      
            <!-- commenting out the Messages link to test if accordion can be added with MESSAGE specific options -->     
            <!-- <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Messages</a> -->
 
            <!-- Message accordion -->
            <button class="accordion">Messages</button>
            <div class="panel">
                <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Compose</a>
                <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Inbox</a>
                <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Sent</a>
            </div>
            
            <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Chart</a>  
            
            <!-- Patient Accordion -->
            <button class="accordion">Patient</button>
            <div class="panel">
                <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">New</a>
                <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Search</a>
            </div>
            
            <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Profile</a>
            <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Order Prescription</a>
            <a class="w3-bar-item w3-button w3-hover-light-blue" href="#">Order Test</a>
        </nav>

	
	<!-- Overlay effect when opening sidebar on small screens -->
        <div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

        <!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
        <div class="w3-main" style="margin-left:250px" id="Home">
            <!-- Main Content -->
            
            <div class="w3-row w3-padding-64">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Heading</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
			  exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor 
                          incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                </div>
            </div>
            
            
            <!-- center page columns -->
            <div class="row">
                
                <div class="columnLeft">
                    <h1> Agenda </h1>
                    <!-- display date selector -->    
                    <p> Enter Date: <input type ="text" id ="datepicker"></p>
                    <ul><li>Nothing</li></ul>
                </div>
                
                <div class="column">
                    <h3 align="center">Today's Patients</h3>
                    <table>
                        
                        <!-- hard coded appointment list to display intent -->
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Time</th>
                        </tr>
                        <tr>
                            <td>John</td>
                            <td>Smith</td>
                            <td>9:30am</td>
                        </tr>
                        <tr>
                            <td>Eve</td>
                            <td>Jackson</td>
                            <td>10:45am</td>
                        </tr>
                        <tr>
                            <td>Adam</td>
                            <td>Gomez</td>
                            <td>1:00pm</td>
                        </tr>
                    </table>
                </div>
                
                <div class="column">
                    <div id="piechart"></div>
                </div>
                
            </div>
               
            <footer id="myFooter">
                <div class="w3-container w3-light-blue">
                    <p align="right">Powered by Team Gearbox</p>
                </div>
            </footer>
	
            <!-- End of Main Content -->
        </div>
        
	<script>
            
            // Get the Sidebar
            var mySidebar = document.getElementById("mySidebar");

            // Get the DIV with overlay effect
            var overlayBg = document.getElementById("myOverlay");

            // Toggle between showing and hiding the sidebar, and add overlay effect
            function w3_open() {
                if (mySidebar.style.display === 'block') {
                    mySidebar.style.display = 'none';
                    overlayBg.style.display = "none";
                } else {
                    mySidebar.style.display = 'block';
                    overlayBg.style.display = "block";
                }
            }

            // Close the sidebar with the close button
            function w3_close() {
                mySidebar.style.display = "none";
                overlayBg.style.display = "none";
            }

            // calendar date selector
            $(function(){
                $("#datepicker").datepicker({
                    showOn: "button",
                    buttonImage: "./../images/calendar.gif",
                    buttonImageOnly: true,
                    buttonText: "Select Date"
                });
                
                // if you want to calendar to be open by default, un-comment the line below
                //$("#datepicker-13").datepicker("show");                
            })

            // added to be able to have accordion when Messages is selected
            var acc = document.getElementsByClassName("accordion");
            var i;

            for(i=0; i < acc.length; i++) {
                acc[i].addEventListener("click", function(){
                    this.classList.toggle("active");
                    var panel = this.nextElementSibling;
                    if(panel.style.maxHeight){
                        panel.style.maxHeight = null;
                    } else {
                        panel.style.maxHeight = panel.scrollHeight + "px";
                    }
                });
            }
        </script>
        
        <script type="text/javascript">
            // Load google charts
            google.charts.load('current', {'packages':['corechart']});
            google.charts.setOnLoadCallback(drawChart);

            // Draw the chart and set the chart values
            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                    ['Category', 'Count'],
                    ['Very Satisfied', 8],
                    ['Satisfied', 10],
                    ['Neither', 4],
                    ['Dissatisfied', 1],
                    ['Very Dissatisfied', 1]
                ]);

                // Optional; add a title and set the width and height of the chart
                var options = {
                    'title':'Patient satisfaction', 
                    'width':750, 
                    'height':500, 
                    is3D: 'true', 
                    'fontSize':20
                };

                // Display the chart inside the <div> element with id="piechart"
                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                chart.draw(data, options);
            }
        </script>
    </body>
</html>
