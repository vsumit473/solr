/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AlphaPrefixNetworkDocument;
import com.example.demo.model.Provider;

/**
 * @author ag10017
 *
 */
@Repository
public interface AlphaPrefixRepo extends SolrCrudRepository<AlphaPrefixNetworkDocument, Integer> {
	
	
	@Query("ntwk_nm:*?0*")
	List<Provider> findAlphaPrefixByNameLike(String name);
}
