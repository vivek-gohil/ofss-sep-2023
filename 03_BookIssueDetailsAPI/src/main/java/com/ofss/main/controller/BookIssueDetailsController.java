package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.domain.MemberDetails;
import com.ofss.main.service.BookDetailsService;
import com.ofss.main.service.BookIssueDetailsServiceInterface;

@RestController
@RequestMapping("bookissuedetailsapi")
public class BookIssueDetailsController {

	private BookIssueDetailsServiceInterface bookIssueDetailsServiceInterface = new BookDetailsService();

	@RequestMapping("bookissuedetails")
	public List<BookIssueDetails> getAllBookIssued() {
		List<BookIssueDetails> bookIssueDetailsList = bookIssueDetailsServiceInterface.getAllBookIssueDetails();

		for (BookIssueDetails bookIssueDetails : bookIssueDetailsList) {
			RestTemplate restTemplate = new RestTemplate();
			String bookDetailsURL = "http://localhost:8081/bookdetailsapi/bookdetails/"
					+ bookIssueDetails.getBookDetails().getBookCode();
			String memberDetailsURL = "http://localhost:8082/memberdetailsapi/memberdetails/"
					+ bookIssueDetails.getMemberDetails().getMemberCode();
			BookDetails bookDetails = restTemplate.getForObject(bookDetailsURL, BookDetails.class);
			MemberDetails memberDetails = restTemplate.getForObject(memberDetailsURL, MemberDetails.class);

			bookIssueDetails.setBookDetails(bookDetails);
			bookIssueDetails.setMemberDetails(memberDetails);
		}

		return bookIssueDetailsList;
		// return bookIssueDetailsServiceInterface.getAllBookIssueDetails();
	}
}
