package com.qczl.service;

import com.qczl.model.About;

public interface IAboutService {

	About getById(Integer id);

	About updateAbout(About about);

}
