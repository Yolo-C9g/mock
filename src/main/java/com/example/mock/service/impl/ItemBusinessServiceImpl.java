package com.example.mock.service.impl;

import com.example.mock.domain.Item;
import com.example.mock.service.ItemBusinessService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author WYC
 * @version v1.0
 * @since 2024/3/28 14:39
 **/
@Component
public class ItemBusinessServiceImpl implements ItemBusinessService {
    @Override
    public Item retreiveHardcodedItem() {
        return new Item(2, "Ball1", 5, 20);
    }

    @Override
    public List<Item> retrieveAllItems() {
        return Arrays.asList(
                new Item(1, "Ball1", 10, 100),
                new Item(2, "Ball1", 51, 201)
        );
    }
}