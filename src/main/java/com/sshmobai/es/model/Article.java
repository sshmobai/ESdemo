package com.sshmobai.es.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 
@Document注解里面的几个属性，类比mysql的话是这样： 
index –> DB 
type –> Table 
Document –> row 
@Id注解加上后，在Elasticsearch里相应于该列就是主键了，在查询时就可以直接用主键查询，后面一篇会讲到。其实和mysql非常类似，基本就是一个数据库。
 *
 */
@Document(indexName="projectname",type="article")
public class Article implements Serializable {
	@Id
    private Long id;
	private String title;  //标题
    private String abstracts;  //摘要
    private String content;  //内容
    private Date postTime;  //发表时间
    private Long clickCount;  //点击率
    private Author author;	//作者
    private Tutorial tutorial;  //所属教程
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public Long getClickCount() {
		return clickCount;
	}
	public void setClickCount(Long clickCount) {
		this.clickCount = clickCount;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Tutorial getTutorial() {
		return tutorial;
	}
	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", abstracts=" + abstracts + ", content=" + content
				+ ", postTime=" + postTime + ", clickCount=" + clickCount + ", author=" + author + ", tutorial="
				+ tutorial + "]";
	}
}
