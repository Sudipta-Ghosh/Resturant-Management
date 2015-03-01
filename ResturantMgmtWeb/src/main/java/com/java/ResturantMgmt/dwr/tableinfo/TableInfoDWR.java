package com.java.ResturantMgmt.dwr.tableinfo;

import com.java.ResturantMgmt.businessprocess.TableInfoBP;

public class TableInfoDWR {
	
	public String displayTableInformation(){
		String tableString=new TableInfoBP().showTableInformation();
		return tableString;
		
	} 
	public String saveTableInformation(String tableId,String tableno,String tabledescription,String noofseat,String tableStatus,String tabletype){
		String createdBy="Sudipta";
		String lastUpdatedBy="Sudipta";
		String tableString=new TableInfoBP().saveTableInformation(tableId, tableno, tabledescription, noofseat, tableStatus,tabletype,createdBy,lastUpdatedBy);
		return tableString;
		
	}

}
