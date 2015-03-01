<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
	<!--

	Base template (without user's data) checked by http://validator.w3.org : "This page is valid XHTML 1.0 Transitional"
	-->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
	<title></title>

	<link rel="stylesheet" href="../../css/MainCSSStyle.css" type="text/css" media="screen" />
	<link href="../../css/form.css" type="text/css" rel="stylesheet" />
	<link rel="stylesheet" href="../../css/verticalMenuCSSStyles.css"/>
	<!--[if IE 6]><link rel="stylesheet" href="style.ie6.css" type="text/css" media="screen" /><![endif]-->
	<!--[if IE 7]><link rel="stylesheet" href="style.ie7.css" type="text/css" media="screen" /><![endif]-->

	<script type="text/javascript" src="../../js/userdefined/FormScript.js"></script>

	<script type='text/javascript' src='/ResturantMgmt/dwr/interface/TableInfoDWR.js'></script>
	<script type='text/javascript' src='/ResturantMgmt/dwr/engine.js'></script>
	<script type='text/javascript' src='/ResturantMgmt/dwr/util.js'></script>
	
	<script type="text/javascript" language="javascript" src="../../js/Jquery/jquery-1.10.2.min.js"></script>
	<script src="../../js/userdefined/MenuJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../../css/Jquery/jquery-ui.css">
	
	<script type="text/javascript" src="../../js/Jquery/jquery-ui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../../css/datatable/dataTables.jqueryui.css">
	<script type="text/javascript" language="javascript" src="../../js/datatables/jquery.dataTables.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../js/datatables/dataTables.jqueryui.js"></script>


    <script type="text/javascript">
      function update()
      {
     
          TableInfoDWR.displayTableInformation({ 
              async: false,
              callback: function(data){  
               	document.getElementById("example").innerHTML=data; 
                $('#example').dataTable();
              }
        });
          
         
          
     }
     
     $(document).ready(function () {
         $('#addrow').click(function (e) {        
              window.open("TableUpdate.jsp", 'window', 'width=800,height=800');
         });
});
   
   function editTableInfo(tableId){
   url="TableInfoController.action?tableId="+tableId+"&action="+"searchTableInformation"+"&event="+"Search";
    window.open(url, 'window', 'width=800,height=800');
   }
   
   function deleteTableInfo(tableId){
   		url="TableInfoController.action?tableId="+tableId+"&action="+"deleteTableInformation"+"&event="+"delete";
   		document.forms[0].action="TableInfoController.action";
   		
   		document.forms[0].submit();
   
   }
   
</script>
    
</head>
<body onload=" update();">
<input type="hidden" id="flag" name="flag" value="N">
<div id="art-main">
        <div class="art-sheet">
            <div class="art-sheet-tl"></div>
            <div class="art-sheet-tr"></div>
            <div class="art-sheet-bl"></div>
            <div class="art-sheet-br"></div>
            <div class="art-sheet-tc"></div>
            <div class="art-sheet-bc"></div>
            <div class="art-sheet-cl"></div>
            <div class="art-sheet-cr"></div>
            <div class="art-sheet-cc"></div>
            <div class="art-sheet-body">
                <div class="art-header">
                    <div class="art-header-jpeg"></div>
                    <div class="art-logo">
                        <h1 id="name-text" class="art-logo-name"><a href="#">Headline</a></h1>
                        <div id="slogan-text" class="art-logo-text">Slogan Text</div>
                    </div>
                </div>
      
         <jsp:include page="../Common/MultilevelResturantMenu.jsp"/>
                <div class="art-content-layout">
                    <div class="art-content-layout-row">
                        <div class="art-layout-cell art-sidebar1">
                            <div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                <div class="l"></div>
                                                <div class="r"></div>
                                                 <div class="t">Newsletter</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div><form method="get" id="newsletterform" action="javascript:void(0)">
                                                            <input type="text" value="" name="email" id="s" style="width: 95%;" />
                                                            <span class="art-button-wrapper">
                                                            	<span class="l"> </span>
                                                            	<span class="r"> </span>
                                                            	<input class="art-button" type="submit" name="search" value="Subscribe" />
                                                            </span>

                                                            </form></div>
                                            <!-- /block-content -->

                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>
                            <div class="art-block">
                                <div class="art-block-body">
                                           <jsp:include page="../Common/VericalMenu.jsp"/>
                                </div>
                            </div>
                            <div class="art-block">
                                <div class="art-block-body">
                                            <div class="art-blockheader">
                                                <div class="l"></div>
                                                <div class="r"></div>
                                                 <div class="t">Contact Info</div>
                                            </div>
                                            <div class="art-blockcontent">
                                                <div class="art-blockcontent-body">
                                            <!-- block-content -->
                                                            <div>
                                                                  <img src="images/contact.jpg" alt="an image" style="margin: 0 auto;display:block;width:95%" />
                                                            <br />
                                                            <b>Company Co.</b><br />
                                                            Las Vegas, NV 12345<br />
                                                            Email: <a href="mailto:info@company.com">info@company.com</a><br />
                                                            <br />
                                                            Phone: (123) 456-7890 <br />
                                                            Fax: (123) 456-7890
                                                            </div>
                                            <!-- /block-content -->

                                            		<div class="cleared"></div>
                                                </div>
                                            </div>
                            		<div class="cleared"></div>
                                </div>
                            </div>
                        </div>
                        <div class="art-layout-cell art-content">
                            <div class="art-post">
                                <div class="art-post-tl"></div>
                                <div class="art-post-tr"></div>
                                <div class="art-post-bl"></div>
                                <div class="art-post-br"></div>
                                <div class="art-post-tc"></div>
                                <div class="art-post-bc"></div>
                                <div class="art-post-cl"></div>
                                <div class="art-post-cr"></div>
                                <div class="art-post-cc"></div>
                                <div class="art-post-body">
                            <div class="art-post-inner art-article">
                                 		<table class="formtable" align="center" border=0 width="95%" cellspacing="1" cellpadding="0">
						<tr>
						<td class="formtable_cel">
						<table width="50%" align="center" border=0 cellspacing="1" cellpadding="0">
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<p></p>
						<div class="container">
						<table  cellpadding="0" cellspacing="0" border="0" class="display" id="example" >

						</table>
						</div>
						<table  align="center" border="0" width="50%">
						<div class="actionbtns">
						<div id="btn" class="btn_blue">
						<ul>
							<li><a href="#null" id="addrow" onclick="addNewRow()"><span><%="Add New Row"%></span></a></li>
							<li><a href="#null" onclick="savePage()"><span><%="Bulk Delete"%></span></a></li>
							<div id="dialog" title="Basic dialog">
							
							</div>
 
						</ul>
						</div>
						</div>

						</table>
						</table>
						</td></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						<tr></tr>
						</table>
                                             

                                                <!-- /article-content -->
                                            
                            </div>

                            		<div class="cleared"></div>
                                </div>
                            </div>
                           
                            </div>
                        </div>
                    </div>
                </div>
                <div class="cleared"></div><div class="art-footer">
                    <div class="art-footer-inner">
                        <a href="#" class="art-rss-tag-icon" title="RSS"></a>
                        <div class="art-footer-text">
                            <p><a href="#">Contact Us</a> | <a href="#">Terms of Use</a> | <a href="#">Trademarks</a>
                                | <a href="#">Privacy Statement</a><br />
                                Copyright &copy; 2010 ---. All Rights Reserved.</p>
                        </div>
                    </div>
                    <div class="art-footer-background"></div>
                </div>
        		<div class="cleared"></div>
            </div>
        </div>
        <div class="cleared"></div>
        <p class="art-page-footer"><a href="http://kiwitemplate.com/">Web Template</a> is XHTML valid.</p>
    </div>
    
    

</body>
</html>
