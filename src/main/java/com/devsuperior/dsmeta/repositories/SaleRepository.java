package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT obj FROM Sale obj "
			+ "WHERE obj.date >= :min "
			+ "AND obj.date <= :max "
			+ "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%'))")	
	Page<Sale> searchSales(LocalDate min, LocalDate max, String name, Pageable pageable);

	@Query("SELECT obj FROM Sale obj JOIN FETCH obj.seller WHERE obj in :sales")
	List<Sale>searchSalesWithSellers(List<Sale> sales);
}
