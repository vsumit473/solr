package com.example.demo.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;


@SolrDocument(collection="providers")
public class Provider
{
  @Id
  @Field("id")
  private int id;
  @Field("name")
  private String name;
  @Field("cat")
  private String cat;
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Provider [id=" + id + ", name=" + name + ", cat=" + cat + ", price=" + price + ", insStock=" + insStock
			+ ", author=" + author + ", series=" + series + ", sequence=" + sequence + ", genre=" + genre + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Field("price")
  private float price;
  @Field("insStock")
  private boolean insStock;
  @Field("author")
  private String author;
  @Field("series_t")
  private String series;
  @Field("sequence_i")
  private String sequence;
  @Field("genre_s")
  private String genre;
  
  

}

