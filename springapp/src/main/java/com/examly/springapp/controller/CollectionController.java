package com.examly.springapp.controller;

import com.examly.springapp.model.Item;
import com.examly.springapp.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CollectionController {

    private final CollectionService collectionService;

    @Autowired
    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping("/process")
    public ResponseEntity<List<Item>> processCollection() {
        List<Item> processedItems = collectionService.processCollection();
        return ResponseEntity.ok(processedItems);
    }
}
