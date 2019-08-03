package com.webspringbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webspringbootexample.bSearch.SpringSearchApp;

@RestController
public class SearchController {

	@Autowired
	public SpringSearchApp searchService;
	@RequestMapping("/search/{noToBeSearched}")
	public boolean search(@PathVariable("noToBeSearched") int noToBeSearched) {
		return searchService.search(noToBeSearched);
	}
	
	@RequestMapping("/search/{sortAlgoToBeUsed}/{noToBeSearched}")
	public boolean search(@PathVariable("sortAlgoToBeUsed") String sortAlgoToBeUsed,@PathVariable("noToBeSearched") int noToBeSearched) {
		return searchService.search(sortAlgoToBeUsed,noToBeSearched);
	}
}
