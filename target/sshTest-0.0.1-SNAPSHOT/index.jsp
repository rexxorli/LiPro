<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>SSH DEMO</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript" src="jslib/jquery-easyui-1.3.6/jquery.min.js"></script>
  <script type="text/javascript" src="jslib/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="jslib/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
  <link rel="stylesheet" href="jslib/jquery-easyui-1.3.6/themes/metro/easyui.css" type="text/css"></link>
  <link rel="stylesheet" href="jslib/jquery-easyui-1.3.6/themes/icon.css" type="text/css"></link></head>
  
  <body class="easyui-layout">
  	<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">north region</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">west content</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center',title:'Center'"></div>
  </body>
</html>
