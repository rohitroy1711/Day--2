package com.cognizant.ormlearnformapping.services.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearnformapping.model.Stock;
import com.cognizant.ormlearnformapping.repository.StockRepository;
import com.cognizant.ormlearnformapping.services.StockService;



@Service("stockService")
public class StockServiceImpl implements StockService {
	//handson day1 session 1 hand'on2
	@Autowired
	private StockRepository stockRepository;


	@Override
	public List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}


	@Override
	public List<Stock> getStocksOfFBInSep2019() {
		return stockRepository.getStocksOfFBInSep2019();
	}


	@Override
	public List<Stock> getStocksOfGoogleGT1250() {
		return stockRepository.getStocksOfGoogleGT1250();
	}


	@Override
	public List<Stock> getTop3StocksByVolume() {
		return stockRepository.getTop3StocksByVolume(PageRequest.of(0, 3));
	}


	@Override
	public List<Stock> get3LowestNetflixStocks() {
		return stockRepository.get3LowestNetflixStocks(PageRequest.of(0, 3));
	}

}