package com.example.mock.service;


import com.example.mock.domain.Item;

import java.util.List;

public interface ItemBusinessService {
    Item retreiveHardcodedItem();

    List<Item> retrieveAllItems();

}
