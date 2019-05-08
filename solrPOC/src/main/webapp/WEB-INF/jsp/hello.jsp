<!DOCTYPE html>
<html>
<head>
  <title>Provide Finder POC</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  #result {
   position: absolute;
   width: 100%;
   max-width:870px;
   cursor: pointer;
   overflow-y: auto;
   max-height: 400px;
   box-sizing: border-box;
   z-index: 1001;
  }
  .link-class:hover{
   background-color:#f1f1f1;
  }
  </style>
  <script type="text/javascript">
  
  $(document).ready(function(){
	  $.ajaxSetup({ cache: false });
	  $('#search').keyup(function(){
		  $('#result').html('');
		    $('#state').val('');
		    var providerName = $('#search').val();
		    $.ajax({
		    	  url: "http://localhost:8080/getProviders/"+providerName, 
		    	/* url: "http://localhost:8080/getPrefix/"+providerName,*/
				    success: function (data) {
				    	debugger;
				    	$.each(data, function(key, value){
				  	      
				  	      /*  $('#result').append('<li class="list-group-item link-class"><span class="text-muted">'+value.netowkrName+'</span></li>'); */
				  	     $('#result').append('<li class="list-group-item link-class"><span class="text-muted">'+value.name+'</span></li>');
				  	      
				  	     
				       
				    
				});
		    	
		    }
	  })
	  });
  });
</script>
</head>
<body background="https://images.pexels.com/photos/40751/running-runner-long-distance-fitness-40751.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940">
  <br /><br />
  <div class="container" style="width:900px;">
   <h2 align="center">Provider Finder Suggested Search</h2>
   <h3 align="center">Provider data</h3>   
   <br /><br />
   <div align="center">
    <input type="text" name="search" id="search" placeholder="Search Provider" class="form-control" />
   </div>
   <ul class="list-group" id="result"></ul>
   <br />
  </div>
</body>
</html>
