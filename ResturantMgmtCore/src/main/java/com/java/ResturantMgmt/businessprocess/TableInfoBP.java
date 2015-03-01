package com.java.ResturantMgmt.businessprocess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.java.ResturantMgmt.common.businessdelegate.BusinessDelegate;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.tableinfo.TableInfoVO;

public class TableInfoBP {
	BusinessDelegate objBusinessDelegate=new BusinessDelegate();

	public  String showTableInformation(){
		TTableInfo tTableInfo =new TTableInfo();
		String result="";
		StringBuilder stringBuilder =new StringBuilder();

		 tTableInfo.setAction("searchTableInformation");
		 tTableInfo.setEvent("Search");

		  stringBuilder.append("<THEAD>");
		  stringBuilder.append("<TR>");
		  stringBuilder.append("<TH><input type=\"checkbox\"></TH>");
		  stringBuilder.append("<TH>Table No</TH>");
		  stringBuilder.append("<TH>Table Description</TH>");
		  stringBuilder.append("<TH>No Of Seat</TH>");
		  stringBuilder.append("<TH>Table Status</TH>");
		  stringBuilder.append("<TH>Table Type</TH>");
		  stringBuilder.append("<TH></TH>");
		  stringBuilder.append("<TH></TH>");
		  stringBuilder.append("</TR>");
		  stringBuilder.append("</THEAD>");
	      stringBuilder.append("<TBODY>");

		 TableInfoVO tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
		 for ( TTableInfo tTableInfoOut:tableInfoVO.gettTableInfo()){
			 stringBuilder.append("<TR>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<input type=\"checkbox\">");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_NO());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_DESCRIPTION());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_NO_OF_SEAT());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_STATUS());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_TYPE());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<a href=\"javascript:editTableInfo(\'"+tTableInfoOut.getTABLE_ID()+"\')\"><img src=\"../../img/edit_property.png\" alt=\"edit property\" height=\"20\" width=\"20\"></a>");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<a href=\"javascript:deleteTableInfo(\'"+tTableInfoOut.getTABLE_ID()+"\')\"><img src=\"../../img/delete_property.png\" alt=\"delete property\" height=\"20\" width=\"20\"></a>");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("</TR>");
		 }
		  stringBuilder.append("</TBODY>");
		 return stringBuilder.toString();

	}

	public String saveTableInformation(String tableId,String tableno, String tabledescription,
			String noofseat, String tableStatus, String tabletype,String createdBy,String lastUpdatedBy) {
		// TODO Auto-generated method stub
		
		TTableInfo tTableInfo =new TTableInfo();
		String result="";
		StringBuilder stringBuilder =new StringBuilder();
		TableInfoVO tableInfoVO =new TableInfoVO();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
		String strDate = sdf.format(cal.getTime());
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.applyPattern("dd/MM/yyyy HH:mm:ss.SS");
		Date date = null;
		try {
			date = sdf1.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(tableId!=null && !tableId.equals("")){
			 tTableInfo.setAction("searchTableInformation");
			 tTableInfo.setEvent("Search");
			 tTableInfo.setTABLE_ID(Long.valueOf(tableId));
			  tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
			  tTableInfo=tableInfoVO.gettTableInfo().get(0);	
			 
		}
		
		 tTableInfo.setAction("saveTableInformation");
		 tTableInfo.setEvent("Save");
		 tTableInfo.setTABLE_NO(tableno);
		 tTableInfo.setTABLE_DESCRIPTION(tabledescription);
		 tTableInfo.setTABLE_NO_OF_SEAT(noofseat);
		 tTableInfo.setTABLE_STATUS(tableStatus);
		 tTableInfo.setTABLE_TYPE(tabletype);
		 tTableInfo.setCREATED_BY(createdBy);
		 tTableInfo.setLAST_UPDATED_BY(lastUpdatedBy);
		 tTableInfo.setLAST_UPDATED_DATE(date);
		 tTableInfo.setCREATED_DATE(date);
		 tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
		return tableInfoVO.getMessage();
	}

}
