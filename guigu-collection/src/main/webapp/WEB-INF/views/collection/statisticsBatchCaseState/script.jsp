<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<script type="text/javascript" charset="utf-8">
	var _datagrid;
	var _form;
	var _search_form;
	//请求基础路径
	var baseUrl = ctx + "/collection/statisticsBatchCaseState";

	$(function() {

		_form = $('#_form').form();
		_search_form = $('#_search_form').form();
		//数据列表
		_datagrid = $('#_datagrid').datagrid({
			url : '',
			fit : true,
			method : 'GET',
			queryParams:$.serializeObject(_search_form),
			//pagination : true,//底部分页
			rownumbers : true,//显示行数
			fitColumns : false,//自适应列宽
			showFooter: true,
			striped : true,//显示条纹
			//pageSize : 50,//每页记录数
			//pageList : [ 20, 50, 100 ],
			remoteSort : true,//是否通过远程服务器对数据排序
			idField : 'id',
			columns : [ [ 
            {field : 'batch_code', title : '批次号', width : 170,sortable:true}, 
            {field : 'case_count', title : '案件数量', width : 110,sortable:true },
            {field : 'new_case_count', title : '新案数量', width : 110,sortable:true }, 
            {field : 'lose_case_count', title : '失联数量', width : 110,sortable:true }, 
            {field : 'involve_case_count', title : '涉案数量', width : 110,sortable:true }, 
            {field : 'negotiation_case_count', title : '谈判数量', width : 110,sortable:true }, 
            {field : 'family_case_count', title : '中家人数量', width : 110,sortable:true }, 
            {field : 'someone_case_count', title : '中第三人数量', width : 110,sortable:true }, 
            {field : 'oneself_case_count', title : '中本人数量', width : 110,sortable:true },
            /*  #暂停催收 25  要求退案 26 承诺 31 疑似欺诈 32 */
            {field : 'stop_case_count', title : '暂停催收数量', width : 110,sortable:true }, 
            {field : 'back_case_count', title : '要求退案数量', width : 110,sortable:true }, 
            {field : 'promise_case_count', title : '承诺数量', width : 110,sortable:true }, 
            {field : 'cheat_case_count', title : '疑似欺诈数量', width : 110,sortable:true },
            ] ],
            /* toolbar : [  {
				text : '导出所选统计数据',
				iconCls : 'eu-icon-daochusuoxuan',
				handler : function() {
					daochu(1)
				}
			}, {
				text : '导出',
				iconCls : 'eu-icon-daochusuoxuan',
				handler : function() {
					daochu(2)
				}
			} ], */
       			onLoadSuccess : function() {
       				app.unCheckAll(this);//取消所有选中
       			},
       			onRowContextMenu : function(e, rowIndex, rowData) {
       				e.preventDefault();
       				app.unCheckAll(this);//取消所有选中
       				$(this).datagrid('selectRow', rowIndex);
       				$('#_datagrid_menu').menu('show', {
       					left : e.pageX,
       					top : e.pageY
       				});
       			},
       			onDblClickRow : function(rowIndex, rowData) {
       				edit(rowIndex, rowData);
       			}
       		}).datagrid('showTooltip');

       		//  _datagrid.datagrid('showTooltip');

       	});

       	function daochu(type){
       		if(type==1){
       			excelSelect();
       		}else if(type==2){
       			exportQuery();
       		}
       	}
       	function excelSelect(){
       		 //选中的所有行
       	    var rows = _datagrid.datagrid('getSelections');
       	    //选中的行（第一次选择的行）
       	    var row = rows[0];
       		var ids = new Array();
       		//循环拿到所有的选中id
       	    $.each(rows, function (i, row) {
              	ids[i] = row.id;
              }); 
       	    if (row) {
       	        	    app.downLoadFile({
       	   	        	url:baseUrl+'/exportSelected', //请求的url
       	           		data:{'ids':ids},
       	   	        });
       	    } else {
       	    	eu.showAlertMsg("请选择要操作的数据！",'warning');
       	    }
       	}
       	
       	//导出所查件
       	function exportQuery(){
       		app.datagridHasRow(_datagrid, function(){
       			var queryParams = _datagrid.datagrid("options").queryParams;
       			app.downLoadFile({
       				url:baseUrl+'/exportQueryExcel',
       	        	data:queryParams,  
       	        });	
       		});
       	}
       	//搜索
       	function search() {
      /// 	 $("#_datagrid").datagrid({url:baseUrl + baseUrl + '/queryBatch'});
       var options = _datagrid.datagrid('options');
			//url 需要自己定义
			options.url = baseUrl + "/queryBatchCaseState";
			//触发搜索
			 //_datagrid.datagrid(options);
       		//重新加载datagrid
       		app.load(_datagrid, $.serializeObject(_search_form));
       	}
       </script>
