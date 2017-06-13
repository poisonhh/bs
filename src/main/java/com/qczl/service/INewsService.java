package com.qczl.service;

import java.util.List;

import com.qczl.model.News;

public interface INewsService {

	boolean addNews(News news);

	List<News> findAllNews();

	boolean deleteById(Integer id);

	News findById(Integer id);

	News updateNews(News news);

}
