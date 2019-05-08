/**
 * 
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Provider;
import com.example.demo.repository.AlphaPrefixRepo;
import com.example.demo.repository.ProviderRepository;

/**
 * @author ag10017
 *
 */
@RestController

public class ProviderController
{
  @Autowired
  private ProviderRepository providerRepository;
  @Autowired
  private AlphaPrefixRepo repo;
  
  
 @PostConstruct
  public void AddData() {
	  Provider p = new Provider();
	  p.setId(55);
	  p.setName("Sumit Verma");
	  Provider p2 = new Provider();
	  p2.setId(56);
	  p2.setName("Ayush Parmar");
	  Provider p3 = new Provider();
	  p3.setId(57);
	  p3.setName("Sumit ");
	  Provider p4 = new Provider();
	  p4.setId(58);
	  p4.setName("Ayush");
	  Provider p5 = new Provider();
	  p5.setId(59);
	  p5.setName("Manas Behara Ranjan");
	  Provider p6 = new Provider();
	  p6.setId(60);
	  p6.setName("Vijay Reddy");
	  Provider p7 = new Provider();
	  p7.setId(61);
	  p7.setName("Vijay Prakash Vyas");
	  Provider p8 = new Provider();
	  p8.setId(62);
	  p8.setName("Suresh");
	  Provider p9 = new Provider();
	  p9.setId(63);
	  p9.setName("Surajit");
	  Provider p10 = new Provider();
	  p10.setId(64);
	  p10.setName("Sandhya");
	  Provider p11 = new Provider();
	  p11.setId(65);
	  p11.setName("Senthil");
	  List<Provider> providers = new ArrayList<>();
	  providers.add(p);
	  providers.add(p2);
	  providers.add(p3);
	  providers.add(p4);
	  providers.add(p5);
	  providers.add(p6);
	  providers.add(p7);
	  providers.add(p8);
	  providers.add(p9);
	  providers.add(p10);
	  providers.add(p11);
	  
	  
	  
	  providerRepository.saveAll(providers);
	  
  }
  
/*  @GetMapping({"/getALL"})
  public Iterable<Provider> getProviders()
  {
    Iterable<Provider> findAll = this.providerRepository.findAll();
    
    Iterator<Provider> iterator = findAll.iterator();
    List<Provider> list = new ArrayList();
    while (iterator.hasNext())
    {
      Provider p = (Provider)iterator.next();
      if (p.name() != null) {
        list.add(p);
      }
    }
    Provider p = new Provider();
    p.setId(1);
    p.setName("Sumit");
    
    
    return findAll;
  }*/
  
  @GetMapping({"/getProviders/{name}"})
  public Iterable<Provider> getProvidersLikeByName(@PathVariable("name") String name  )
  {
    Iterable<Provider> findAll = this.providerRepository.findProviderNameLike(name);
  
    return findAll;
  }
  
  
  @GetMapping({"/getPrefix/{name}"})
  public Iterable<Provider> getAlphaPrefixByName(@PathVariable("name") String name  )
  {
    Iterable<Provider> findAll = this.repo.findAlphaPrefixByNameLike(name);
  
    return findAll;
  }
  
 
}
