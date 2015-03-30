package com.java.ResturantMgmt.dto;

import java.io.Serializable;

import javax.persistence.*;

import com.java.ResturantMgmt.dto.util.GenericDTO;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBL_MENU_ITEM database table.
 * 
 */
@Entity
@Table(name="TBL_MENU_ITEM")
@NamedQuery(name="TblMenuItem.findAll", query="SELECT t FROM TblMenuItem t")
public class TblMenuItem  extends GenericDTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_MENU_ITEM_MENUITEMID_GENERATOR", sequenceName="USER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_MENU_ITEM_MENUITEMID_GENERATOR")
	@Column(name="MENU_ITEM_ID")
	private long menuItemId;

	@Column(name="MENU_ITEM_CREATED_BY")
	private String menuItemCreatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MENU_ITEM_CREATED_DATE")
	private Date menuItemCreatedDate;

	@Column(name="MENU_ITEM_DESCRIPTION")
	private String menuItemDescription;

	@Column(name="MENU_ITEM_LAST_UPDATED_BY")
	private String menuItemLastUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="MENU_ITEM_LAST_UPDATED_DATE")
	private Date menuItemLastUpdatedDate;

	@Column(name="MENU_ITEM_NAME")
	private String menuItemName;

	@Column(name="MENU_ITEM_STATUS")
	private String menuItemStatus;

	//bi-directional many-to-one association to TblCategory
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private TblCategory tblCategory;

	//bi-directional many-to-one association to TblRateMaster
	@OneToMany(mappedBy="tblMenuItem")
	private List<TblRateMaster> tblRateMasters;

	public TblMenuItem() {
	}

	public long getMenuItemId() {
		return this.menuItemId;
	}

	public void setMenuItemId(long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getMenuItemCreatedBy() {
		return this.menuItemCreatedBy;
	}

	public void setMenuItemCreatedBy(String menuItemCreatedBy) {
		this.menuItemCreatedBy = menuItemCreatedBy;
	}

	public Date getMenuItemCreatedDate() {
		return this.menuItemCreatedDate;
	}

	public void setMenuItemCreatedDate(Date menuItemCreatedDate) {
		this.menuItemCreatedDate = menuItemCreatedDate;
	}

	public String getMenuItemDescription() {
		return this.menuItemDescription;
	}

	public void setMenuItemDescription(String menuItemDescription) {
		this.menuItemDescription = menuItemDescription;
	}

	public String getMenuItemLastUpdatedBy() {
		return this.menuItemLastUpdatedBy;
	}

	public void setMenuItemLastUpdatedBy(String menuItemLastUpdatedBy) {
		this.menuItemLastUpdatedBy = menuItemLastUpdatedBy;
	}

	public Date getMenuItemLastUpdatedDate() {
		return this.menuItemLastUpdatedDate;
	}

	public void setMenuItemLastUpdatedDate(Date menuItemLastUpdatedDate) {
		this.menuItemLastUpdatedDate = menuItemLastUpdatedDate;
	}

	public String getMenuItemName() {
		return this.menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	public String getMenuItemStatus() {
		return this.menuItemStatus;
	}

	public void setMenuItemStatus(String menuItemStatus) {
		this.menuItemStatus = menuItemStatus;
	}

	public TblCategory getTblCategory() {
		return this.tblCategory;
	}

	public void setTblCategory(TblCategory tblCategory) {
		this.tblCategory = tblCategory;
	}

	public List<TblRateMaster> getTblRateMasters() {
		return this.tblRateMasters;
	}

	public void setTblRateMasters(List<TblRateMaster> tblRateMasters) {
		this.tblRateMasters = tblRateMasters;
	}

	public TblRateMaster addTblRateMaster(TblRateMaster tblRateMaster) {
		getTblRateMasters().add(tblRateMaster);
		tblRateMaster.setTblMenuItem(this);

		return tblRateMaster;
	}

	public TblRateMaster removeTblRateMaster(TblRateMaster tblRateMaster) {
		getTblRateMasters().remove(tblRateMaster);
		tblRateMaster.setTblMenuItem(null);

		return tblRateMaster;
	}

}