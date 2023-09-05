package com.examly.springapp.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Item;

@Service
public class CollectionService {
    private final List<Item> itemList;

    @Autowired
    public CollectionService(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> processCollection() {
        // Implement your logic to process the itemList here
        // For example, you can sort the items
        Collections.sort(itemList);
        return itemList;
    }
}
