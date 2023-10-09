package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.repository.BookIssueDetailsRepository;
import com.ofss.main.repository.BookIssueDetailsRepositoryInterface;

public class BookDetailsService implements BookIssueDetailsServiceInterface {

	private BookIssueDetailsRepositoryInterface bookIssueDetailsRepositoryInterface 
														= new BookIssueDetailsRepository();

	@Override
	public List<BookIssueDetails> getAllBookIssueDetails() {
		return bookIssueDetailsRepositoryInterface.getAllBookIssueDetails();
	}

}
