package com.cognizant.ormlearnformapping.repository;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearnformapping.model.Stock;



@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

	@Query("SELECT s from Stock s where s.st_code='FB' and st_date like '2019-09-%'")
	List<Stock> getStocksOfFBInSep2019();
	
	@Query("SELECT s from Stock s where s.st_code='GOOGL' and st_open>1250")
	List<Stock> getStocksOfGoogleGT1250();
	
	@Query("SELECT s from Stock s order by s.st_volume DESC")
	List<Stock> getTop3StocksByVolume(Pageable pageable);
	
	@Query("SELECT s from Stock s where s.st_code='NFLX' order by s.st_close")
	List<Stock> get3LowestNetflixStocks(Pageable pageable);
}