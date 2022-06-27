package com.exercise.trunarrative.cloud.springrest.controller.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.exercise.trunarrative.cloud.springrest.controller.MyCompanyController;
import com.exercise.trunarrative.cloud.springrest.entities.Address;
import com.exercise.trunarrative.cloud.springrest.entities.Company;
import com.exercise.trunarrative.cloud.springrest.entities.Officers;
import com.exercise.trunarrative.cloud.springrest.services.CompanyService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(MyCompanyController.class)
public class MyCompanyControllerTests {

	@Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;
    @Spy
    List<Officers> officers = new ArrayList<Officers>();
    @Spy
    List<Company> companies;
    @Autowired
    CompanyService companyService;
    
    @Test
    public void getCompanies () {
    	Address address = new Address("Retford", "DN22 0AD", "Main Street", "Leverton", "Wales");
      officers.add(new Officers("BOXALL, Sarah Victoria", "secretary", "2008-02-11", address));
      companies.add(new Company("06500244", "ltd", "BBC LIMITED", "active", address, officers));
    }
    
  
  public void getCompanies_success() throws Exception {
	  mockMvc.perform(MockMvcRequestBuilders.get("/rest/Companies"));
  }
    
}
