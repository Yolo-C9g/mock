package com.ada.enduser.service.impl;

import com.ada.enduser.common.dto.Item;
import com.ada.enduser.service.ItemBusinessService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author WYC
 * @version v1.0
 * @description TODO
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
        List<Item> expectedItems = Arrays.asList(
                new Item(1, "Ball1", 10, 100),
                new Item(2, "Ball1", 51, 201)
        );
        return expectedItems;
    }
}