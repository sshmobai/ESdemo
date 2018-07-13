package com.sshmobai.es.service.impl;

import java.util.Date;
import java.util.Iterator;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sshmobai.es.dao.EsDao;
import com.sshmobai.es.model.Article;
import com.sshmobai.es.model.Author;
import com.sshmobai.es.model.Tutorial;
import com.sshmobai.es.service.EsService;

@Service("esServiceImpl")
public class EsServiceImpl implements EsService {
	@Autowired
    private EsDao esDao;

	@Override
	public void query() {
		// TODO Auto-generated method stub
		String queryString = "springboot";//搜索关键字
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = esDao.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		System.out.println("query");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		Author author = new Author();
        author.setId(1L);
        author.setName("mobai");
        author.setRemark("java developer");

        Tutorial tutorial = new Tutorial();
        tutorial.setId(1L);
        tutorial.setName("elastic search");

        Article article = new Article();
        article.setId(1L);
        article.setTitle("springboot integreate elasticsearch");
        article.setAbstracts("springboot integreate elasticsearch is very easy");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("elasticsearch based on lucene,"
                + "spring-data-elastichsearch based on elaticsearch"
                + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
        article.setPostTime(new Date());
        article.setClickCount(1L);
		esDao.save(article);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

}
