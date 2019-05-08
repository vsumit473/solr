/**
 * 
 */
package com.example.demo.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @author ag10017
 *
 */
@SolrDocument(collection="core_alphaprefix_ntwks_read")
public class AlphaPrefixNetworkDocument
{
  @Id
  private Integer rowID;
  @Field("ntwk_cd")
  private String networkCode;
  @Field("ntwk_nm")
  private String netowkrName;
  @Field("alph_prfx_cd")
  private String alphaPrefix;
  @Field("prod_plan_key")
  private String planIdentifier;
  
  public Integer getRowID()
  {
    return this.rowID;
  }
  
  public void setRowID(Integer rowID)
  {
    this.rowID = rowID;
  }
  
  public String getNetworkCode()
  {
    return this.networkCode;
  }
  
  public void setNetworkCode(String networkCode)
  {
    this.networkCode = networkCode;
  }
  
  public String getNetowkrName()
  {
    return this.netowkrName;
  }
  
  public void setNetworkTypeCode(String netowkrName)
  {
    this.netowkrName = netowkrName;
  }
  
  public String getAlphaPrefix()
  {
    return this.alphaPrefix;
  }
  
  public void setAlphaPrefix(String alphaPrefix)
  {
    this.alphaPrefix = alphaPrefix;
  }
  
  public String getPlanIdentifier()
  {
    return this.planIdentifier;
  }
  
  public void setPlanIdentifier(String planIdentifier)
  {
    this.planIdentifier = planIdentifier;
  }
}

