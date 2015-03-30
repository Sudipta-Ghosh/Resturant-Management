package com.java.ResturantMgmt.dto;

import java.io.Serializable;

import javax.persistence.*;

import com.java.ResturantMgmt.dto.util.GenericDTO;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBL_CATEGORY database table.
 * 
 */
@Entity
@Table(name="TBL_CATEGORY")
@NamedQuery(name="TblCategory.findAll", query="SELECT t FROM TblCategory t")
public class TblCategory extends GenericDTO implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_CATEGORY_CATEGORYID_GENERATOR", sequenceName="USER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_CATEGORY_CATEGORYID_GENERATOR")
	@Column(name="CATEGORY_ID")
	private long categoryId;

	@Column(name="CATEGORY_CREATED_BY")
	private String categoryCreatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CATEGORY_CREATED_DATE")
	private Date categoryCreatedDate;

	@Column(name="CATEGORY_DESCRIPTION")
	private String categoryDescription;

	@Column(name="CATEGORY_LAST_UPDATED_BY")
	private String categoryLastUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CATEGORY_LAST_UPDATED_DATE")
	private Date categoryLastUpdatedDate;

	@Column(name="CATEGORY_NAME")
	private String categoryName;

	@Column(name="CATEGORY_STATUS")
	private String categoryStatus;

	//bi-directional many-to-one association to TblMenuItem
	@OneToMany(mappedBy="tblCategory")
	private List<TblMenuItem> tblMenuItems;

	public TblCategory() {
	}

	public long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCreatedBy() {
		return this.categoryCreatedBy;
	}

	public void setCategoryCreatedBy(String categoryCreatedBy) {
		this.categoryCreatedBy = categoryCreatedBy;
	}

	public Date getCategoryCreatedDate() {
		return this.categoryCreatedDate;
	}

	public void setCategoryCreatedDate(Date categoryCreatedDate) {
		this.categoryCreatedDate = categoryCreatedDate;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryLastUpdatedBy() {
		return this.categoryLastUpdatedBy;
	}

	public void setCategoryLastUpdatedBy(String categoryLastUpdatedBy) {
		this.categoryLastUpdatedBy = categoryLastUpdatedBy;
	}

	public Date getCategoryLastUpdatedDate() {
		return this.categoryLastUpdatedDate;
	}

	public void setCategoryLastUpdatedDate(Date categoryLastUpdatedDate) {
		this.categoryLastUpdatedDate = categoryLastUpdatedDate;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryStatus() {
		return this.categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public List<TblMenuItem> getTblMenuItems() {
		return this.tblMenuItems;
	}

	public void setTblMenuItems(List<TblMenuItem> tblMenuItems) {
		this.tblMenuItems = tblMenuItems;
	}

	public TblMenuItem addTblMenuItem(TblMenuItem tblMenuItem) {
		getTblMenuItems().add(tblMenuItem);
		tblMenuItem.setTblCategory(this);

		return tblMenuItem;
	}

	public TblMenuItem removeTblMenuItem(TblMenuItem tblMenuItem) {
		getTblMenuItems().remove(tblMenuItem);
		tblMenuItem.setTblCategory(null);

		return tblMenuItem;
	}

}