package com.examly.springapp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.examly.springapp.controller.CollectionController;
import com.examly.springapp.model.Item;
import com.examly.springapp.service.CollectionService;

@RunWith(SpringRunner.class)
@WebMvcTest(CollectionController.class)
public class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CollectionService collectionService; // Mock the service

	@Test
	public void testProcessCollection() throws Exception {
		// Mock the behavior of the service method
		List<Item> mockItemList = Arrays.asList(new Item("Item 1"), new Item("Item 2"));
		when(collectionService.processCollection()).thenReturn(mockItemList);

		// Perform the GET request
		mockMvc.perform(get("/api/process"))
				.andExpect(status().isOk()); // Check that the response status is OK
	}
}
