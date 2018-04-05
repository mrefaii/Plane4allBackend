package com.plane4all.model.assets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author MR
 * @version 1.0
 * @created 04-Apr-2018 12:07:24 AM
 */

@Entity
public class Motor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String motorName;
	
	@Column
	private String alias;
	
	@Column
	private String series;
	
	@Column
	private String kv;
	
	@Column
	private String batteryType;
	
	@Column
	private String propellerType;
	
	@Column
	private String weight;
	
	@Column
	private String RPMPerVolt;
	
	@Column
	private String maxEffic;
	
	@Column
	private String maxEfficCurr;
	
	@Column
	private String noLoadCurr;
	
	@Column
	private String currCpct;
	
	@Column
	private String internalRes;
	
	@Column
	private String dimensions;
	
	@Column
	private String shaftDiameter;
	
	@Column
	private String generalInfo;
	
	@Column
	private String motorDiameter;
	
	@Column
	private String motorHeight;
	
	@Column
	private String bearings;
	
	@Column
	private String cableLength;
	
	@Column
	private String bottomMountHoles;
	
	@Column
	private String topMountHoles;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	public Company m_Company;

	public Motor() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotorName() {
		return motorName;
	}

	public void setMotorName(String motorName) {
		this.motorName = motorName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getKv() {
		return kv;
	}

	public void setKv(String kv) {
		this.kv = kv;
	}

	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public String getPropellerType() {
		return propellerType;
	}

	public void setPropellerType(String propellerType) {
		this.propellerType = propellerType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getRPMPerVolt() {
		return RPMPerVolt;
	}

	public void setRPMPerVolt(String rPMPerVolt) {
		RPMPerVolt = rPMPerVolt;
	}

	public String getMaxEffic() {
		return maxEffic;
	}

	public void setMaxEffic(String maxEffic) {
		this.maxEffic = maxEffic;
	}

	public String getMaxEfficCurr() {
		return maxEfficCurr;
	}

	public void setMaxEfficCurr(String maxEfficCurr) {
		this.maxEfficCurr = maxEfficCurr;
	}

	public String getNoLoadCurr() {
		return noLoadCurr;
	}

	public void setNoLoadCurr(String noLoadCurr) {
		this.noLoadCurr = noLoadCurr;
	}

	public String getCurrCpct() {
		return currCpct;
	}

	public void setCurrCpct(String currCpct) {
		this.currCpct = currCpct;
	}

	public String getInternalRes() {
		return internalRes;
	}

	public void setInternalRes(String internalRes) {
		this.internalRes = internalRes;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getShaftDiameter() {
		return shaftDiameter;
	}

	public void setShaftDiameter(String shaftDiameter) {
		this.shaftDiameter = shaftDiameter;
	}

	public String getGeneralInfo() {
		return generalInfo;
	}

	public void setGeneralInfo(String generalInfo) {
		this.generalInfo = generalInfo;
	}

	public String getMotorDiameter() {
		return motorDiameter;
	}

	public void setMotorDiameter(String motorDiameter) {
		this.motorDiameter = motorDiameter;
	}

	public String getMotorHeight() {
		return motorHeight;
	}

	public void setMotorHeight(String motorHeight) {
		this.motorHeight = motorHeight;
	}

	public String getBearings() {
		return bearings;
	}

	public void setBearings(String bearings) {
		this.bearings = bearings;
	}

	public String getCableLength() {
		return cableLength;
	}

	public void setCableLength(String cableLength) {
		this.cableLength = cableLength;
	}

	public String getBottomMountHoles() {
		return bottomMountHoles;
	}

	public void setBottomMountHoles(String bottomMountHoles) {
		this.bottomMountHoles = bottomMountHoles;
	}

	public String getTopMountHoles() {
		return topMountHoles;
	}

	public void setTopMountHoles(String topMountHoles) {
		this.topMountHoles = topMountHoles;
	}

	public Company getM_Company() {
		return m_Company;
	}

	public void setM_Company(Company m_Company) {
		this.m_Company = m_Company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kv == null) ? 0 : kv.hashCode());
		result = prime * result + ((motorName == null) ? 0 : motorName.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motor other = (Motor) obj;
		if (kv == null) {
			if (other.kv != null)
				return false;
		} else if (!kv.equals(other.kv))
			return false;
		if (motorName == null) {
			if (other.motorName != null)
				return false;
		} else if (!motorName.equals(other.motorName))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public void finalize() throws Throwable {

	}
}// end Motor