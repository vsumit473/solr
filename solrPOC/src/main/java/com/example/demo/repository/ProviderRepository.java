package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.example.demo.model.Provider;

public interface ProviderRepository extends SolrCrudRepository<Provider, Integer> {
	
	@Query(value="name:?0~0.1")
	List<Provider>  findProviderNameLike(@Param("name") String name);
}
