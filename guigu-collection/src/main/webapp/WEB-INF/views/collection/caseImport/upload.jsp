<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<script type="text/javascript">
</script>
<style>
.easyui-linkbutton {
	background-color: #d9e9ef;
	text-color:red;
	color:black;
}
#filediv  .l-btn {
	color: #444;
	background-repeat: repeat-x;
	background: none;
	background-color: #2987cb;
	background-repeat: repeat-x;
	color:white;
}
</style>
<div>
	<form id="upload_form" class="dialog-form" method="post" enctype="multipart/form-data" novalidate>
		<input type="hidden" name="caseBatchId" value="${caseBatchId }"/>
		<%-- <input type="test" name="type" value="${type }"/> --%>
		<%-- <div>
            <label style="align:right;">模板类型:</label>
            <k:dictionary constName="CASE_TEMP_TYPE" name="type" required="true" value="1"/>
        </div>  --%>
        <br>
		<div id="filediv">
			<input id="excelFile" name="excelFile"  class="easyui-filebox" data-options="buttonText:'选择案件Excel文件',required:true" style="width:470px">
		</div>
        <div>
			</br>
			①导入前<span style="color:#ff6600;">请检查</span>excel表格内数值格式正确，如果格式不正确将无法成功导入数据
			</br>
			②已导入案件重新导入时<span style="color:#ff6600;">请保证</span>excel内案件顺序与第一次上传时一致，<span style="color:#ff6600;">不要删除</span>
			</br>
			&nbsp;&nbsp;&nbsp;原excel内案件，否则会导致数据混乱或导入失败。
			</br>
			③如需要新新增案件，请在已导入表格的<span style="color:#ff6600;">最后一行</span>开始新增，并将已导入案件的个
			</br>
			&nbsp;&nbsp;&nbsp;案序列号清空。
        </div>
		
	</form>
</div>