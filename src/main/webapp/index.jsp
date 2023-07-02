<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Hospital Management System</title>
		<link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
		<link href='http://fonts.googleapis.com/css?family=Ropa+Sans' rel='stylesheet' type='text/css'>
		 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
		<script src="js/responsiveslides.min.js"></script>
		  <script>
		 
			    $(function () {
			
			      // Slideshow 1
			      $("#slider1").responsiveSlides({
			        maxwidth: 1600,
			        speed: 600
			      });
			});
		  </script>
		 
</head>
<body >
<div class="ui container first">
    <div class="ui center aligned teal inverted segment">
        <font color="black"><h1 class="header" id="nam">Hospital Management System</h1></font>
    </div>
  <div class="clear"> </div>
			<!--start-image-slider---->
					<div class="image-slider">
						<!-- Slideshow 1 -->
					    <ul class="rslides" id="slider1">
					      <li><img src="images/hospital.jpg" alt="" width="1200" height="450"></li>
					      
					       <li><img src="http://www.pffamilymedicine.com/site_media/media/bgslider/images/thumbs/1200x450/Homepage_1.jpg" alt=""></li>
					      <li><img src="http://www.cfsmortgage.com/wp-content/uploads/2017/04/Doctor1-1200x450.jpg" alt=""></li>
					    </ul>
				
					</div>
					<!--End-image-slider---->
		    <div class="clear"> </div>
   <div class="ui  horizontal segments">
    <div class="ui  teal inverted segment">
        <div class="admin">
            <div class="ui icon">
                    <i class=" large user  icon"></i>Admin login
                    <a href="admin_login.jsp">
                   <button  class="ui blue button">LOGIN</button>
                    </a>
            </div>
        </div>
    </div> 
      
    <div class="ui  right aligned teal inverted segment">   
        <div class="user">
            <div class="ui icon">
                <i class="ui  large users icon"></i>User login
                <a href="plogin.jsp">
                    <button class="ui blue button">LOGIN</button>
                </a>
            </div>
        </div>
   


    </div>  
  </div>   

  <div class="Box-body p-6">
        <article class="markdown-body entry-content" itemprop="text"><h1>Hospital Management System</h1>
<p>This is a hospital management user interface for managing, monitoring and controlling the system in a Hospital. 
    This application is developed using java, which mainly focuses on basic operations in a hospital like adding new patient information, 
    and updating new information, assigning the doctor for patient. It features a familiar and well thought-out, an attractive online user interface,
    combined with strong management capabilities. The backend of the project is designed using MySQL, 
    Java and front end using HTML, CSS, and Bootstrap.<br>
</p>
</article>
</div>
  <br><br><footer>
    <p class="copyright">© HospDBMS | All rights reserved.</p>
</footer>
</div>   

</body>
</html>