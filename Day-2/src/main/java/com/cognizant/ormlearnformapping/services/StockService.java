package com.cognizant.ormlearnformapping.services;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearnformapping.model.Stock;

@Transactional
public interface StockService {
	//handson day1 session 1 hand'on2
	@Transactional(readOnly = true)
	public List<Stock> getAllStocks();
	
	public List<Stock> getStocksOfFBInSep2019();
	
	public List<Stock> getStocksOfGoogleGT1250();
	
	public List<Stock> getTop3StocksByVolume();
	
	public List<Stock> get3LowestNetflixStocks();
}