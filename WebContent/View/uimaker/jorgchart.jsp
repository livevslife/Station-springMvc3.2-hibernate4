<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>jOrgChartå¼æ­¥å è½½</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/jquery.jOrgChart.css" />
<link rel="stylesheet" href="css/custom.css" />

<script type='text/javascript' src='jquery/jquery-1.10.2.min.js'></script>
<script type='text/javascript' src='js/jquery.jOrgChart.js'></script>
</head>
<body>
	<!--显示组织架构图-->
	<div id='jOrgChart'></div>


	<script type='text/javascript'>
		$(function() {
			//数据返回
			$
					.ajax({
						url : "ajaxReturn1.php",
						type : 'POST',
						dataType : 'JSON',
						data : {
							action : 'org_select'
						},
						success : function(result) {

							var showlist = $("<ul id='org' style='display:none'></ul>");
							showall(result, showlist);
							$("#jOrgChart").append(showlist);
							$("#org").jOrgChart({
								chartElement : '#jOrgChart',//指定在某个dom生成jorgchart
								dragAndDrop : false
							//设置是否可拖动
							});

						}
					});
		});

		//menu_list为json数据
		//parent为要组合成html的容器

		function showall(menu_list, parent) {
			$.each(menu_list, function(index, val) {
				if (val.childrens.length > 0) {
					var li = $("<li></li>");
					li.append(
							"<a href='javascript:void(0)' onclick=getOrgId("
									+ val.id + ");>" + val.name + "</a>")
							.append("<ul></ul>").appendTo(parent);
					//递归显示
					showall(val.childrens, $(li).children().eq(1));
				} else {
					$("<li></li>").append(
							"<a href='javascript:void(0)' onclick=getOrgId("
									+ val.id + ");>" + val.name + "</a>")
							.appendTo(parent);
				}
			});
		}
	</script>
</body>
</html>