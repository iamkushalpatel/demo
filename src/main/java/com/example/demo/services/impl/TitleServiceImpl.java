package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Title;
import com.example.demo.repositories.TitleRepository;
import com.example.demo.services.TitleService;

@Service
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleRepository titleRepository;

	@Override
	public Page<Title> getTitlePage(int page, int size) {
		return titleRepository.findAll(PageRequest.of(page, size));
	}

}
