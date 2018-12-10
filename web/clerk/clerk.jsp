<%-- 
    Document   : clerk
    Created on : Nov 29, 2018, 9:41:14 PM
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
        <link rel="stylesheet" href="../styles/clerk.css">
	<link rel="stylesheet" href="../styles/w3.css">
        <title>Sirona</title>
    </head>
    
    <body>

        <!-- Header -->
        <header class="w3-top">
            <div class="w3-bar w3-light-blue w3-top w3-left-align w3-black w3-large">
                <span class="w3-bar-item">Welcome, ${user.userName}!</span>
                <div class="w3-right w3-hide-small">
                    <a class="w3-bar-item w3-button w3-hover-white" href="/Sirona/">Sign Out</a>
                </div>
            </div>
        </header>

        <!-- Sidebar -->
        <nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
          <h4 class="w3-bar-item"><b>Menu</b></h4>
          <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Home')" id="defaultOpen">Home</button>
          <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Appointments')">Appointments</button>
          
          <!-- Message accordion -->
            <button class="accordion w3-hover-black">Messages</button>
            <div class="panel">
                <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Compose')">Compose</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Inbox')">Inbox</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Sent')">Sent</button>
            </div>
          
          <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Billing')">Billing</button>
                <button class="tablinks w3-bar-item w3-button w3-hover-black" onclick="openTab(event, 'Profile')">Profile</button>
        </nav>

        <div class="w3-row w3-padding-64">
        
            <!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
            <div class="w3-main" style="margin-left:250px"id="Home">
            
                <h1 class="w3-text-teal">Today is <span id="date"></span></h1>
                
                <!-- Main Content -->            
                <div class="w3-twothird w3-container">
                    
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
                              exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor 
                              incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                </div>
            </div>
            
            <!-- Appointments page content -->
            <div class="w3-main" style="margin-left:250px" id="Appointments">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Appointments content</h1>
                    <p>Appointments content goes here</p>
                </div>
            </div>
            <!-- end of appointments content -->
            
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
            
            <!-- billing page content -->
            <div class="w3-main" style="margin-left:250px" id="Billing">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">Billing Profile Page</h1>
                    <p>Billing content goes here</p>
                </div>
            </div>
            <!-- end of billing page content -->
            
            <!-- profile page content -->
            <div class="w3-main" style="margin-left:250px" id="Profile">
                <div class="w3-twothird w3-container">
                    <h1 class="w3-text-teal">User Profile Page</h1>
                    <p>User profile content goes here</p>
                </div>
            </div>
            <!-- end of profile page content -->
            
        </div>
        
        <footer id="myFooter">
            <div class="w3-container w3-black">
                <p align="right">Powered by Team Gearbox</p>
            </div>
        </footer>
        

        <script>
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
