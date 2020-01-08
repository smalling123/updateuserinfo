package com.example.demo2.service;


import com.example.demo2.model.Permission.DictionaryItem;

import java.util.List;

public interface DictionaryService{
	public List<DictionaryItem> getDictionaryItems(String dictionary, String filter);

	public String convertDictionary(String dictionary, String code);

}
