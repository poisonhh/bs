package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.NewsMapper;
import com.qczl.model.News;
import com.qczl.service.INewsService;
@Service("newsService")
public class NewsServiceImpl implements INewsService {

	private NewsMapper newsMapper;
	
	public NewsMapper getNewsMapper() {
		return newsMapper;
	}
	@Autowired
	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		if(newsMapper.insertSelective(news)>0){
			return true;
		}
		return false;
		
	}
	public List<News> findAllNews() {
		// TODO Auto-generated method stub
		return newsMapper.findAllNews();
	}
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(newsMapper.deleteByPrimaryKey(id)>0){
			return true;
		}
		return false;
	}
	public News findById(Integer id) {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(id);
	}
	public News updateNews(News news) {
		// TODO Auto-generated method stub
		newsMapper.updateByPrimaryKey(news);
		return null;
	}

}
