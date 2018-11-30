<%-- 
    Document   : clerk
    Created on : Nov 29, 2018, 9:41:14 PM
    Author     : Geoffrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../styles/clerk.css">
	    <link rel="stylesheet" href="../styles/w3.css">
        <title>Sirona</title>
    </head>
    <body>

    <!-- Header -->
    <header class="w3-top">
      <div class="w3-bar w3-light-blue w3-top w3-left-align w3-black w3-large">
        <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Welcome, &lt;clerkUserName&gt;</a>
      </div>
    </header>

    <!-- Sidebar -->
    <nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
      <h4 class="w3-bar-item"><b>Menu</b></h4>
      <a class="w3-bar-item w3-button w3-hover-black" href="#">Home</a>
      <a class="w3-bar-item w3-button w3-hover-black" href="#">Appointments</a>
      <a class="w3-bar-item w3-button w3-hover-black" href="#">Messages</a>  
      <a class="w3-bar-item w3-button w3-hover-black" href="#">Billing</a>
      <a class="w3-bar-item w3-button w3-hover-black" href="#">Profile</a>
    </nav>

	
	<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
<div class="w3-main" style="margin-left:250px">
	<!-- Main Content -->
      <div class="w3-row w3-padding-64">
        <div class="w3-twothird w3-container">
          <h1 class="w3-text-teal">Heading</h1>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
			  exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor 
                          incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
      </div>

  <footer id="myFooter">
    <div class="w3-container w3-black">
      <p>Powered by Team Gearbox</p>
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
</script>
</body>
</html>
