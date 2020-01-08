package com.example.demo2.service;

import com.example.demo2.mapper.DictionaryMapper;
import com.example.demo2.model.Permission.DictionaryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService{
	@Autowired
	private DictionaryMapper m_DictionaryMapper;
	@Cacheable(value = { "getDictionaryItems" },key="#dictionary+'-'+#filter")
	public List<DictionaryItem> getDictionaryItems(String dictionary, String filter){
		return new ArrayList<DictionaryItem>();
	}
	@Cacheable(value = { "convertDictionary" },key="#dictionary+'-'+#code")
	public String convertDictionary(String dictionary, String code){
		DictionaryItem result = new DictionaryItem();
		return result==null ? "" : result.getName();
	}

}
