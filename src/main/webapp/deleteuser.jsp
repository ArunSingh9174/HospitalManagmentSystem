<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>patient delete</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
     <link rel="stylesheet" href="plog.css">
     <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="vendor/themify-icons/themify-icons.min.css">
		<link href="vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
		<link href="vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
		<link href="vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" href="assets/css/styles.css">
		<link rel="stylesheet" href="assets/css/plugins.css">
		<link rel="stylesheet" href="assets/css/themes/theme-1.css" id="skin_color" />
</head>
<body style="background-image:url(https://www.elegantthemes.com/blog/wp-content/uploads/2013/09/bg-9-full.jpg)">
  <!--patient login page--><br><br><br>
 		

    <div class="ui container login">
        <div class="ui red centered card">
   
                 <form class="ui  form log"  action="delete" method="post">
                         <div class="field">
                         <div  class="sixteen wide field">  
              <br>
                           <label class="header">User EmailID</label>
                           <input type="email" name="email" placeholder="Enter User email">
                         </div>
                        </div>
                         
      
                        <button type="submit" class="btn btn-primary pull-right" name="submit">
									Delete <i class="fa fa-arrow-circle-right"></i>
								</button>
								
								<button  ><a href="admin-panel.jsp">Back</a></button>
                       </form>
                       
         </div>
     </div>     

</body>
</html>