package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.LoginDetails;
import com.ofss.main.repository.LoginRepository;

@RestController
@RequestMapping("loginapi")
public class LoginController {

	private LoginRepository loginRepository = new LoginRepository();

	@RequestMapping(value = "new", method = RequestMethod.POST)
	public boolean addNew(@RequestBody LoginDetails loginDetails) {
		return loginRepository.addNewUser(loginDetails);
	}

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<LoginDetails> getAllLogins() {
		return loginRepository.getAllLoginDetails();
	}

	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public boolean validateLogin(@RequestBody LoginDetails loginDetails) {
		return loginRepository.validateUser(loginDetails);
	}

	@RequestMapping(value = "reset", method = RequestMethod.POST)
	public boolean reset(@RequestBody LoginDetails loginDetails) {
		return loginRepository.reset(loginDetails.getLoginId());
	}
}
