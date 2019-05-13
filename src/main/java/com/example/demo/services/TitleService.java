package com.example.demo.services;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Title;

public interface TitleService {

	public Page<Title> getPage(int page, int size);

}
