package com.java.ResturantMgmt.dto;

import java.io.Serializable;

import javax.persistence.*;

import com.java.ResturantMgmt.dto.util.GenericDTO;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBL_RATE_MASTER database table.
 * 
 */
@Entity
@Table(name="TBL_RATE_MASTER")
@NamedQuery(name="TblRateMaster.findAll", query="SELECT t FROM TblRateMaster t")
public class TblRateMaster extends GenericDTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_RATE_MASTER_RATEID_GENERATOR", sequenceName="USER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_RATE_MASTER_RATEID_GENERATOR")
	@Column(name="RATE_ID")
	private long rateId;

	@Column(name="RATE_AMOUNT")
	private BigDecimal rateAmount;

	@Column(name="RATE_CODE")
	private String rateCode;

	@Column(name="RATE_CREATED_BY")
	private String rateCreatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="RATE_CREATED_DATE")
	private Date rateCreatedDate;

	@Column(name="RATE_DESCRIPTION")
	private String rateDescription;

	@Column(name="RATE_ITEM_FOR")
	private String rateItemFor;

	@Column(name="RATE_LAST_UPDATED_BY")
	private String rateLastUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="RATE_LAST_UPDATED_DATE")
	private Date rateLastUpdatedDate;

	@Column(name="RATE_PLACE")
	private String ratePlace;

	@Column(name="RATE_STATUS")
	private String rateStatus;

	@Column(name="RATE_VAT_PERCENTAGE")
	private BigDecimal rateVatPercentage;

	@Column(name="RATE_VOLUME_PER_ML")
	private BigDecimal rateVolumePerMl;

	//bi-directional many-to-one association to TblUomMaster
	@ManyToOne
	@JoinColumn(name="UOM_ID")
	private TblUomMaster tblUomMaster;

	//bi-directional many-to-one association to TblMenuItem
	@ManyToOne
	@JoinColumn(name="MENU_ITEM_ID")
	private TblMenuItem tblMenuItem;

	public TblRateMaster() {
	}

	public long getRateId() {
		return this.rateId;
	}

	public void setRateId(long rateId) {
		this.rateId = rateId;
	}

	public BigDecimal getRateAmount() {
		return this.rateAmount;
	}

	public void setRateAmount(BigDecimal rateAmount) {
		this.rateAmount = rateAmount;
	}

	public String getRateCode() {
		return this.rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getRateCreatedBy() {
		return this.rateCreatedBy;
	}

	public void setRateCreatedBy(String rateCreatedBy) {
		this.rateCreatedBy = rateCreatedBy;
	}

	public Date getRateCreatedDate() {
		return this.rateCreatedDate;
	}

	public void setRateCreatedDate(Date rateCreatedDate) {
		this.rateCreatedDate = rateCreatedDate;
	}

	public String getRateDescription() {
		return this.rateDescription;
	}

	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}

	public String getRateItemFor() {
		return this.rateItemFor;
	}

	public void setRateItemFor(String rateItemFor) {
		this.rateItemFor = rateItemFor;
	}

	public String getRateLastUpdatedBy() {
		return this.rateLastUpdatedBy;
	}

	public void setRateLastUpdatedBy(String rateLastUpdatedBy) {
		this.rateLastUpdatedBy = rateLastUpdatedBy;
	}

	public Date getRateLastUpdatedDate() {
		return this.rateLastUpdatedDate;
	}

	public void setRateLastUpdatedDate(Date rateLastUpdatedDate) {
		this.rateLastUpdatedDate = rateLastUpdatedDate;
	}

	public String getRatePlace() {
		return this.ratePlace;
	}

	public void setRatePlace(String ratePlace) {
		this.ratePlace = ratePlace;
	}

	public String getRateStatus() {
		return this.rateStatus;
	}

	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}

	public BigDecimal getRateVatPercentage() {
		return this.rateVatPercentage;
	}

	public void setRateVatPercentage(BigDecimal rateVatPercentage) {
		this.rateVatPercentage = rateVatPercentage;
	}

	public BigDecimal getRateVolumePerMl() {
		return this.rateVolumePerMl;
	}

	public void setRateVolumePerMl(BigDecimal rateVolumePerMl) {
		this.rateVolumePerMl = rateVolumePerMl;
	}

	public TblUomMaster getTblUomMaster() {
		return this.tblUomMaster;
	}

	public void setTblUomMaster(TblUomMaster tblUomMaster) {
		this.tblUomMaster = tblUomMaster;
	}

	public TblMenuItem getTblMenuItem() {
		return this.tblMenuItem;
	}

	public void setTblMenuItem(TblMenuItem tblMenuItem) {
		this.tblMenuItem = tblMenuItem;
	}

}