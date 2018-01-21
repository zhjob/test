package com.atguigu.collection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.atguigu.collection.mapper.RegionMapper;
import com.atguigu.collection.model.RegionModel;
import com.atguigu.collection.service.RegionService;
import com.atguigu.commons.service.AbstractService;

/**
 * 区域service实现类
 * 
 * @author lisuo
 *
 */
@Service("regionServiceImpl")
@CacheConfig(cacheNames = "regionCache")
public class RegionServiceImpl extends AbstractService<RegionModel, Integer> implements RegionService {

	@Autowired
	private RegionMapper regionMapper;

	@Cacheable
	@Override
	public List<RegionModel> findByCityName(String cityName) {
		return regionMapper.findByCityName(cityName);
	}

	@Cacheable
	@Override
	public List<RegionModel> findByProvinceName(String provinceName) {
		return regionMapper.findByProvinceName(provinceName);
	}

	@Cacheable
	@Override
	public List<RegionModel> findProvince() {
		return regionMapper.findProvince();
	}

	@Override
	public List<RegionModel> findCityByProvinceId(String provinceId) {
		return regionMapper.findCityByProvinceId(provinceId);
	}

	@Override
	public List<RegionModel> findAreaByCityId(String cityId) {
		return regionMapper.findAreaByCityId(cityId);
	}

}
