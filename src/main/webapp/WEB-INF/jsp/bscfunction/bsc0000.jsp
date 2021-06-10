<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta charset="UTF-8">
<title>网站各功能建设管理</title>

<%-- JSP Configure[Start] --%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%-- JSP Configure[End] --%>

<%-- Myself define Css[Start] --%>
<style type="text/css">
.dropdown-menu {
	top: 100%;
	left: 0;
	z-index: 1000;
	display: none;
	float: left;
	min-width: 160px;
	padding: 5px 0;
	margin: 2px 0 0;
	font-size: 14px;
	text-align: left;
	list-style: none;
	background-color: #000;
	-webkit-background-clip: padding-box;
	background-clip: padding-box;
	border: 1px solid #ccc;
	border: 1px solid rgba(68, 45, 45, 0.15);
	border-radius: 4px;
	-webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, .175);
	box-shadow: 0 6px 12px rgba(243, 16, 16, 0.175);
	width: auto;
}
</style>
<%-- Myself define Css[End] --%>

<%-- Myself define JS [Start] --%>
<script type="text/javascript">
	/**
	 * auto-create button of division page
	 */
	$(function() {
		// enable tooltip
		enableTooltip();
		/**
		 * Common: Date component
		 */
		loadDateComponent();
		// All button enable
		setSearchDisabled();
		setUpdateDisabled();
		setRegisteredEnabled("提交意见");
		setBackBtnEnabled("返回首页");
		setBackUrl('<%=request.getContextPath()%>/index/init');
	});
</script>
<%-- Myself define JS [End] --%>
<div style="padding: 10px;">
	<%-- 意见收集[Start] --%>
	<div class="col-lg-10 col-md-10 col-sm-10 col-xs-10">
		<div class="panel-group" id="accordion">
			<c:forEach items="${bsc0000Result }" var="result" varStatus="resultIndex">
			
				<c:choose>
               	 	<c:when test="${result.dmpMenuCrtEndFlg eq '1'}">
            			<div class="panel panel-success">
            		</c:when>
            		<c:when test="${result.dmpMenuCrtFlg eq '1'}">
            			<div class="panel panel-info">
            		</c:when>
            		<c:otherwise>
            			<div class="panel panel-default">
            		</c:otherwise>
            	</c:choose>
			    
			        <div class="panel-heading">
			            <h4 class="panel-title">
			                <span class="label label-info">功能建设要求：</span>
			                <a data-toggle="collapse" data-parent="#accordion" 
			                href="#collapse${resultIndex.index }">
			                ${result.dmpMenuMemo }
			                <%-- 功能建设已经结束 --%>
			                <c:choose>
			               	 	<c:when test="${result.dmpMenuCrtEndFlg eq '1'}">
			               	 		<span class="label label-success">功能建设已完成</span>
			            		</c:when>
			            		<c:when test="${result.dmpMenuCrtFlg eq '1'}">
			            			<span class="label label-primary">功能建设中</span>
			            		</c:when>
			            	</c:choose>
			                </a>
			            </h4>
			        </div>
			        <div id="collapse${resultIndex.index }" class="panel-collapse collapse">
			            <div class="panel-body">
			            	<c:choose>
			            		<c:when test="${result.dmpMenuCrtEndFlg eq '1'}">
			            			<table>
			            				<tr>
			            					<td><span class="label label-default">菜单：</span>
			            					<span class="label label-success">${result.menuGroupName}</span>
			            					<button type="button" class="btn btn-link">→</button>
			            					<span class="label label-info">${result.menuName}</span>
			            					</td>
			            				</tr>
			            				<tr>
			            					<td> <span class="label label-default">菜单功能：</span>${result.menuMemo}</td>
			            				</tr>
			            			</table>
			            		</c:when>
			            		<c:when test="${result.dmpMenuCrtFlg eq '1'}">
			            			功能还在建设中,请耐心等待。
			            		</c:when>
			            		<c:otherwise>
			            			您的功能建设要求未被采用，还请谅解，如果有疑问，请利用菜单【基础功能→用户留言】。
			            		</c:otherwise>
			            	</c:choose>
			            </div>
			        </div>
			    </div>
			</c:forEach>
		</div>
	</div>
	<%-- 意见收集[End] --%>
</div>
