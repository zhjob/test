package com.atguigu.collection.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.atguigu.commons.util.DateUtil;

/**
 * 
 * @Description: 风控管理页面列表对象
 *
 * @date 2016年6月23日 上午11:40:53
 *CaseCollectViewDto.java
 */
@SuppressWarnings("serial")
public class CaseCollectViewDto extends CaseViewDto {

	@DateTimeFormat(pattern = DateUtil.DEFAULT_DATE_FORMAT)
	private Date beginDate;
	@DateTimeFormat(pattern = DateUtil.DEFAULT_DATE_FORMAT)
	private Date endDate;
	/** 剩余金额  */
	private Double surplusMoney;
	/** 业绩率  */
	private Double achieve;
	/** 最后通电时间*/
	private Date lastPhone;
	

	public Date getLastPhone() {
		return lastPhone;
	}

	public void setLastPhone(Date lastPhone) {
		this.lastPhone = lastPhone;
	}

	public Double getAchieve() {
		return achieve;
	}

	public void setAchieve(Double achieve) {
		this.achieve = achieve;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getSurplusMoney() {
		return surplusMoney;
	}

	public void setSurplusMoney(Double surplusMoney) {
		this.surplusMoney = surplusMoney;
	}
}
