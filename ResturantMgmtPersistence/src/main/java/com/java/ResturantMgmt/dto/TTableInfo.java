package com.java.ResturantMgmt.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.java.ResturantMgmt.dto.util.GenericDTO;
@Entity
@Table(name = "T_TABLE_INFO", schema = "LOCALUSER")
public class TTableInfo extends GenericDTO implements java.io.Serializable {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="User_Sequence")
	  @SequenceGenerator(
		    name="User_Sequence",
		    sequenceName="User_Sequence",
		    allocationSize=20
		)
	  @Column(name = "TABLE_ID", unique = true, nullable = false, precision = 38, scale = 0)
	  Long TABLE_ID;
	  @Column(name = "TABLE_NO", nullable = false, length = 50)
	  String TABLE_NO;
	  @Column(name = "TABLE_DESCRIPTION", nullable = false, length = 50)
	  String TABLE_DESCRIPTION;
	  @Column(name = "TABLE_NO_OF_SEAT", nullable = false, length = 50)
	  String TABLE_NO_OF_SEAT;
	  @Column(name = "TABLE_TYPE", nullable = false, length = 50)
	  String TABLE_TYPE;
	  @Column(name = "TABLE_STATUS", nullable = false, length = 50)
	  String TABLE_STATUS;
	  @Column(name = "CREATED_BY", nullable = false, length = 50)
	  String CREATED_BY;
	  @Column(name = "CREATED_DATE", nullable = false, length = 50)
	  Date CREATED_DATE;
	  @Column(name = "LAST_UPDATED_BY", nullable = false, length = 50)
	  String LAST_UPDATED_BY;
	  @Column(name = "LAST_UPDATED_DATE", nullable = false, length = 50)
	  Date LAST_UPDATED_DATE;
	public Long getTABLE_ID() {
		return TABLE_ID;
	}
	public void setTABLE_ID(Long tABLE_ID) {
		TABLE_ID = tABLE_ID;
	}
	public String getTABLE_NO() {
		return TABLE_NO;
	}
	public void setTABLE_NO(String tABLE_NO) {
		TABLE_NO = tABLE_NO;
	}
	public String getTABLE_DESCRIPTION() {
		return TABLE_DESCRIPTION;
	}
	public void setTABLE_DESCRIPTION(String tABLE_DESCRIPTION) {
		TABLE_DESCRIPTION = tABLE_DESCRIPTION;
	}
	public String getTABLE_NO_OF_SEAT() {
		return TABLE_NO_OF_SEAT;
	}
	public void setTABLE_NO_OF_SEAT(String tABLE_NO_OF_SEAT) {
		TABLE_NO_OF_SEAT = tABLE_NO_OF_SEAT;
	}
	public String getTABLE_TYPE() {
		return TABLE_TYPE;
	}
	public void setTABLE_TYPE(String tABLE_TYPE) {
		TABLE_TYPE = tABLE_TYPE;
	}
	public String getTABLE_STATUS() {
		return TABLE_STATUS;
	}
	public void setTABLE_STATUS(String tABLE_STATUS) {
		TABLE_STATUS = tABLE_STATUS;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getLAST_UPDATED_BY() {
		return LAST_UPDATED_BY;
	}
	public void setLAST_UPDATED_BY(String lAST_UPDATED_BY) {
		LAST_UPDATED_BY = lAST_UPDATED_BY;
	}
	public Date getLAST_UPDATED_DATE() {
		return LAST_UPDATED_DATE;
	}
	public void setLAST_UPDATED_DATE(Date lAST_UPDATED_DATE) {
		LAST_UPDATED_DATE = lAST_UPDATED_DATE;
	}
	  
	  

}
