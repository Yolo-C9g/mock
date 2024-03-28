package com.ada.enduser.service;

import com.ada.enduser.common.dto.Item;

import java.util.List;

public interface ItemBusinessService {
    Item retreiveHardcodedItem();

    List<Item> retrieveAllItems();

}
