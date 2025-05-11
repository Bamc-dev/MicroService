package com.example.bookshelf.services.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "book")
public interface BookClient {

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String getBook();

}
