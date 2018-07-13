package com.sshmobai.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.sshmobai.es.model.Article;

@Component("esDao")
public interface EsDao extends ElasticsearchRepository<Article, Long> {
}
