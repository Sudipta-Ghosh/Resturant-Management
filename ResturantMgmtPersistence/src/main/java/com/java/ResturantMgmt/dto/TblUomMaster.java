package com.java.ResturantMgmt.dto;

import java.io.Serializable;

import javax.persistence.*;

import com.java.ResturantMgmt.dto.util.GenericDTO;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBL_UOM_MASTER database table.
 * 
 */
@Entity
@Table(name="TBL_UOM_MASTER")
@NamedQuery(name="TblUomMaster.findAll", query="SELECT t FROM TblUomMaster t")
public class TblUomMaster extends GenericDTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_UOM_MASTER_UOMID_GENERATOR", sequenceName="USER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_UOM_MASTER_UOMID_GENERATOR")
	@Column(name="UOM_ID")
	private long uomId;

	@Column(name="UOM_CREATED_BY")
	private String uomCreatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UOM_CREATED_DATE")
	private Date uomCreatedDate;

	@Column(name="UOM_DESCRIPTION")
	private String uomDescription;

	@Column(name="UOM_LAST_UPDATED_BY")
	private String uomLastUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UOM_LAST_UPDATED_DATE")
	private Date uomLastUpdatedDate;

	@Column(name="UOM_NAME")
	private String uomName;

	@Column(name="UOM_STATUS")
	private String uomStatus;

	//bi-directional many-to-one association to TblRateMaster
	@OneToMany(mappedBy="tblUomMaster")
	private List<TblRateMaster> tblRateMasters;

	public TblUomMaster() {
	}

	public long getUomId() {
		return this.uomId;
	}

	public void setUomId(long uomId) {
		this.uomId = uomId;
	}

	public String getUomCreatedBy() {
		return this.uomCreatedBy;
	}

	public void setUomCreatedBy(String uomCreatedBy) {
		this.uomCreatedBy = uomCreatedBy;
	}

	public Date getUomCreatedDate() {
		return this.uomCreatedDate;
	}

	public void setUomCreatedDate(Date uomCreatedDate) {
		this.uomCreatedDate = uomCreatedDate;
	}

	public String getUomDescription() {
		return this.uomDescription;
	}

	public void setUomDescription(String uomDescription) {
		this.uomDescription = uomDescription;
	}

	public String getUomLastUpdatedBy() {
		return this.uomLastUpdatedBy;
	}

	public void setUomLastUpdatedBy(String uomLastUpdatedBy) {
		this.uomLastUpdatedBy = uomLastUpdatedBy;
	}

	public Date getUomLastUpdatedDate() {
		return this.uomLastUpdatedDate;
	}

	public void setUomLastUpdatedDate(Date uomLastUpdatedDate) {
		this.uomLastUpdatedDate = uomLastUpdatedDate;
	}

	public String getUomName() {
		return this.uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	public String getUomStatus() {
		return this.uomStatus;
	}

	public void setUomStatus(String uomStatus) {
		this.uomStatus = uomStatus;
	}

	public List<TblRateMaster> getTblRateMasters() {
		return this.tblRateMasters;
	}

	public void setTblRateMasters(List<TblRateMaster> tblRateMasters) {
		this.tblRateMasters = tblRateMasters;
	}

	public TblRateMaster addTblRateMaster(TblRateMaster tblRateMaster) {
		getTblRateMasters().add(tblRateMaster);
		tblRateMaster.setTblUomMaster(this);

		return tblRateMaster;
	}

	public TblRateMaster removeTblRateMaster(TblRateMaster tblRateMaster) {
		getTblRateMasters().remove(tblRateMaster);
		tblRateMaster.setTblUomMaster(null);

		return tblRateMaster;
	}

}