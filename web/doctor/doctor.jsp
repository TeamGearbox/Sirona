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
        <style>
        </style>
        <title>Sirona</title>
        
        <!-- added the following lines of code to be able to implement a date picker.
        can be used for scheduling or appointment look up -->
        <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

        <!-- used for pie chart -->
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        
    </head>
    
    <body>
        
        <!-- Header -->
        <header class="w3-top">
            <div class="w3-bar w3-light-blue w3-top w3-left-align w3-large">
                
                <span class="w3-bar-item">Welcome, ${user.userName}!</span>
                <div class="w3-right w3-hide-small">
                    <a class="w3-bar-item w3-button w3-hover-white" href="/Sirona">Sign Out</a>
                </div> 
            </div>
        </header>

        <!-- Sidebar -->
        <nav class="w3-sidebar w3-bar-block w3-large" id="mySidebar">
            
            <h4 class="w3-bar-item"><b>Menu</b></h4>
            <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Home')" id="defaultOpen">Home</button>
            
            <!-- Message accordion -->
            <button class="accordion">Messages</button>
            <div class="panel">
                <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Compose')" id="defaultOpen">Compose</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Inbox')" id="defaultOpen">Inbox</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Sent')" id="defaultOpen">Sent</button>
            </div>
            
            <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Chart')" id="defaultOpen">Chart</button>  
            
            <!-- Patient Accordion -->
            <button class="accordion">Patient</button>
            <div class="panel">
                <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'New')">New</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Search')" id="defaultOpen">Search</button>
            </div>
            
            <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Order Prescriptions')" id="defaultOpen">Order Prescriptions</button>
            <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Order Test')" id="defaultOpen">Order Test</button>
            <button class="tablinks w3-bar-item w3-button w3-hover-light-blue" onclick="openTab(event, 'Profile')" id="defaultOpen">Profile</button>
        </nav>
        <!-- end of sidebar -->

        
        <div class="w3-row w3-padding-64">
                    
            <!-- Home Page: shift it to the right by 250 pixels -->
            <div class="w3-main" style="margin-left:250px" id="Home">

                <!-- header of home page, displaying current date -->
                <h1 class="w3-text-teal">Today is <span id="date"></span></h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
                      exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor 
                      incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>

                <!-- Home Page, under welcome paragraph, content split into 3 columns -->
                <div class="row">

                    <!-- left column -->
                    <div class="columnLeft">
                        <h1> Agenda </h1>
                        <!-- display date selector -->    
                        <p> Enter Date: <input type ="text" id ="datepicker"></p>
                        <ul><li>Nothing</li></ul>
                    </div>

                    <!-- center column -->
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

                    <!-- right column -->
                    <div class="column">
                        <div id="piechart"></div>
                    </div> 

                </div>
            </div>
            <!-- End of Home Page content-->

            <!-- Compose page content -->
            <div class="w3-main" style="margin-left:250px" id="Compose">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Compose content</h1>
                    <p>Compose form goes here</p>
                </div>
            </div>
            <!-- end of compose content -->
            
            <!-- inbox page content -->
            <div class="w3-main" style="margin-left:250px" id="Inbox">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Inbox</h1>
                    <p>Inbox page content goes here</p>
                </div>
            </div>
            <!-- end of inbox content -->
            
            <!-- sent page content -->
            <div class="w3-main" style="margin-left:250px" id="Sent">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Sent</h1>
                    <p>Sent content goes here</p>
                </div>
            </div>
            <!-- end of sent page content -->
            
            <!-- patient page content -->
            <div class="w3-main" style="margin-left:250px" id="New">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">New Patient Form</h1>
                    <p>New patient form goes here</p>
                </div>
            </div>
            <!-- end of patient content -->
            
            <!-- chart page content -->
            <div class="w3-main" style="margin-left:250px" id="Chart">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Patient Charts</h1>
                    <p>Patient chart content goes here</p>
                </div>
            </div>
            <!-- end of chart content -->
            
            <!-- patient search content -->
            <div class="w3-main" style="margin-left:250px" id="Search">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Search Patient Form</h1>
                    <p>Search patient form goes here</p>
                </div>
            </div>
            <!-- end of search page content -->
            
            <!-- profile page content -->
            <div class="w3-main" style="margin-left:250px" id="Profile">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">User Profile Page</h1>
                    <p>User profile content goes here</p>
                </div>
            </div>
            <!-- end of profile page content -->
            
            <!-- order prescription page content -->
            <div class="w3-main" style="margin-left:250px" id="Order Prescriptions">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Prescription Order Page</h1>
                    <p>prescription order content goes here</p>
                </div>
            </div>
            <!-- end of order prescription page content -->
            
            <!-- order test page content -->
            <div class="w3-main" style="margin-left:250px" id="Order Test">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Order Test Page</h1>
                    <p>order tests page content goes here</p>
                </div>
            </div>
            <!-- end of order test content -->
                
        </div>
               
        <footer id="footer">
            <div class="w3-container w3-light-blue">
                <p align="right">Powered by Team Gearbox</p>
            </div>
        </footer>
        
	<script>
            
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
            });

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
            
            function openTab(evt, tabName) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("w3-main");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablinks");
                for (i = 0; i < tablinks.length; i++) {
                    tablinks[i].className = tablinks[i].className.replace(" select", "");
                }
                document.getElementById(tabName).style.display = "block";
                evt.currentTarget.className += " select";
            }

            // Get the tab element with id="defaultOpen" and click on it
            document.getElementById("defaultOpen").click();
            
            //date function
            var dt = new Date();
            document.getElementById("date").innerHTML = dt.toLocaleDateString();
        </script>
    </body>
</html>
