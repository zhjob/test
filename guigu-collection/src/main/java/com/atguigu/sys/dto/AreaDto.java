package com.atguigu.sys.dto;

import com.atguigu.sys.model.AreaModel;
import com.atguigu.sys.model.CityModel;
import com.atguigu.sys.model.ProvinceModel;

/**
 * 外访区域 Dto
 * 
 * @author wcy
 * @date 2016年6月23日10:54:45
 *
 */
@SuppressWarnings("serial")
public class AreaDto extends AreaModel{
	
	/** 省份表*/
	private ProvinceModel provinceModel;
	/** 城市表*/
	private CityModel cityModel;

	public ProvinceModel getProvinceModel() {
		return provinceModel;
	}

	public void setProvinceModel(ProvinceModel provinceModel) {
		this.provinceModel = provinceModel;
	}

	public CityModel getCityModel() {
		return cityModel;
	}

	public void setCityModel(CityModel cityModel) {
		this.cityModel = cityModel;
	}
	
	
	
	

}
