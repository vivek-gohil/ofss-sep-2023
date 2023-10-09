package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ofss.main.domain.BookDetails;
import com.ofss.main.domain.BookIssueDetails;
import com.ofss.main.domain.MemberDetails;

public class BookIssueDetailsRepository implements BookIssueDetailsRepositoryInterface {

	private List<BookIssueDetails> bookIssueDetailsList = new ArrayList<BookIssueDetails>();

	public BookIssueDetailsRepository() {
		
		BookIssueDetails bookIssueDetails = new BookIssueDetails();
		BookDetails bookDetails = new BookDetails(1, null, null, 0, 0, false);
		MemberDetails memberDetails = new MemberDetails(1, null, null, null, 0, null, false);
		bookIssueDetails.setBookIssueCode(1);
		bookIssueDetails.setIssueDate(new Date());
		bookIssueDetails.setReturnDate(new Date());
		bookIssueDetails.setBookDetails(bookDetails);
		bookIssueDetails.setMemberDetails(memberDetails);

		BookIssueDetails bookIssueDetails2 = new BookIssueDetails();
		BookDetails bookDetails2 = new BookDetails(2, null, null, 0, 0, false);
		MemberDetails memberDetails2 = new MemberDetails(2, null, null, null, 0, null, false);
		bookIssueDetails2.setBookIssueCode(2);
		bookIssueDetails2.setIssueDate(new Date());
		bookIssueDetails2.setReturnDate(new Date());
		bookIssueDetails2.setBookDetails(bookDetails2);
		bookIssueDetails2.setMemberDetails(memberDetails2);

		bookIssueDetailsList.add(bookIssueDetails);
		bookIssueDetailsList.add(bookIssueDetails2);

	}

	@Override
	public List<BookIssueDetails> getAllBookIssueDetails() {
		return bookIssueDetailsList;
	}

}
