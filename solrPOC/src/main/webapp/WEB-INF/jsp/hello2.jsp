<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <h2 class="hello-title">Hello ${name}!</h2>
    <!-- <script src="/js/main.js"></script> -->
  <!--   <input type="text" name="providerName" id="autocomplete"/> -->
      <div class="ui-widget">
  <label for="city">Your city: </label>
  <input id="providerName">
  Powered by <a href="http://geonames.org">geonames.org</a>
</div>


<div class="ui-widget" style="margin-top:2em; font-family:Arial">
  Result:
  <div id="log" style="height: 200px; width: 300px; overflow: auto;" class="ui-widget-content"></div>
</div>
</body>

<script type="text/javascript">
  $("#providerName").keyup(function(){
	  $("#providerName").css("background-color", "pink");
	  $.ajax({
		    url: "http://localhost:8080/getALL",
		   
		    
		    success: function (data) {
		       alert(data);
		    }
		});
	});
  
  
  
  </script>
</html>