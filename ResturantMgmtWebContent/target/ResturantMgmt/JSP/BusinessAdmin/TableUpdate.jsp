<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Table Master</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Fancy Sliding Form with jQuery" />
        <meta name="keywords" content="jquery, form, sliding, usability, css3, validation, javascript"/>
        <link rel="stylesheet" href="../../css/CreateFormStyle.css" type="text/css" media="screen"/>
        <script src="../../js/Jquery/jquery-1.10.2.min.js"></script>	
	<script type="text/javascript" src="../../js/userdefined/sliding.form.js"></script>
	
	<link rel="stylesheet" href="../../css/validationEngine.jquery.css" type="text/css">
	<link rel="stylesheet" href="../../css/template.css" type="text/css">
	<script src="../../js/Jquery/jquery-1.8.2.min.js" type="text/javascript">	</script>
	<script src="../../js/Jquery/jquery.validationEngine-en.js" type="text/javascript" charset="utf-8">	</script>
	<script src="../../js/Jquery/jquery.validationEngine.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="../../js/userdefined/FormScript.js"></script>
	<script type='text/javascript' src='/ResturantMgmt/dwr/interface/TableInfoDWR.js'></script>
	<script type='text/javascript' src='/ResturantMgmt/dwr/engine.js'></script>
	<script type='text/javascript' src='/ResturantMgmt/dwr/util.js'></script>
    </head>
    <style>
        span.reference{
            position:fixed;
            left:5px;
            top:5px;
            font-size:10px;
            text-shadow:1px 1px 1px #fff;
        }
        span.reference a{
            color:#555;
            text-decoration:none;
			text-transform:uppercase;
        }
        span.reference a:hover{
            color:#000;

        }
        h1{
            color:#ccc;
            font-size:36px;
            text-shadow:1px 1px 1px #fff;
            padding:20px;
        }
    </style>
    <script>
    
    	$().ready(function() {
    		jQuery("#formElem").validationEngine();
    	});
    	
    	function updateTable(){
 		var tableno=document.getElementById("tableno").value; 
		var tabledescription=document.getElementById("tabledescription").value; 
		var noofseats=document.getElementById("noofseats").value; 
		var tablestatus=document.getElementById("tablestatus").value; 
		var tabletype=document.getElementById("tabletype").value; 
		var tableId=document.getElementById("tableId").value; 
		 TableInfoDWR.saveTableInformation(tableId,tableno,tabledescription,noofseats,tablestatus,tabletype,{ 
			     async: false,
			     callback: function(data){  	              
				 window.opener.location.reload();
				 window.close();
			      }
			});
        }
	</script>
    <body>
       
        <div id="content">
            <h1>Table Update</h1>
            <div id="wrapper">
                <div id="steps">
                    <form id="formElem" name="formElem"  method="post">
                        <fieldset class="step">
			<legend>Table Master</legend>
			<p>
				<label for="tableno">Table No</label>
				<input id="tableno" name="tableno"  class="validate[required] minSize[6]" type="text" value="${requestScope.tableInfo.TABLE_NO}" />
			</p>
			<p>
				<label for="tabledescription">Table Description</label>
				<input id="tabledescription" name="tabledescription"  class="validate[required] text-input" type="text" value= "${requestScope.tableInfo.TABLE_DESCRIPTION}" />
			</p>
			<p>
				<label for="noofseats">No Of Seats</label>
				<input id="noofseats" name="noofseats" class="validate[required] text-input" type="text" value= "${requestScope.tableInfo.TABLE_NO_OF_SEAT}" />
			</p>
			<p>
				<label for="tablestatus">Table Status</label>
				<select id="tablestatus" name="tablestatus" >
					<option>Active</option>
					<option>Inactive</option>					
				</select>
			</p>				
			<p>
				<label for="tabletype">Table Type</label>
				<input id="tabletype" name="tabletype"  class="validate[required] text-input" type="text" value= "${requestScope.tableInfo.TABLE_TYPE}"/>
			</p>
                        </fieldset>
                        
                        <input type="hidden" name="tableId" id="tableId" value="${requestScope.tableInfo.TABLE_ID}">
                       
			<fieldset class="step">
                            <legend>Confirm</legend>
							<p>
								Everything in the form was correctly filled
								if all the steps have a green checkmark icon.
								A red checkmark icon indicates that some field
								is missing or filled out with invalid data. In this
								last step the user can confirm the submission of
								the form.
							</p>
                            <p class="submit">
                                <button id="registerButton" type="submit" onclick="javascript:updateTable();" >Save</button>
                            </p>
                        </fieldset>
                    </form>
                </div>
                <div id="navigation" style="display:none;">
                    <ul>
                        <li class="selected">
                            <a href="#">Table Data</a>
                        </li>
 			<li>
                            <a href="#">Confirm</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>