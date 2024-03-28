package com.ada.enduser.service;

import com.ada.enduser.common.dto.Item;
import com.ada.enduser.controller.ItemController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author WYC
 * @version v1.0
 * @since 2024/3/28 14:00
 **/
@RunWith(MockitoJUnitRunner.class)
public class ItemTest {

    @InjectMocks
    private ItemController itemController;

    @Mock
    private ItemBusinessService businessService;

    @Test
    public void dummyItem_basic() {
        // 测试方法
        Item item = itemController.dummyItem();
        // 预期结果
        Item expectedItem = new Item(1, "Ball1", 10, 100);
        // 断言 进行对比属性
        assertEquals(expectedItem, item);
    }

    @Test
    public void itemFromBusinessService_basic() {
        when(businessService.retreiveHardcodedItem()).thenReturn(new Item(21, "Ball1", 5, 20));
        // 测试方法
        Item item = itemController.itemFromBusinessService();
        // 预期结果
        Item expectedItem = new Item(2, "Ball1", 5, 20);
        // 断言 进行对比属性
        assertEquals(expectedItem, item);
    }

    @Test
    public void retrieveAllItems_basic() {
        List<Item> expectedItems = Arrays.asList(
                new Item(1, "Ball", 10, 100),
                new Item(2, "Ball1", 51, 201)
        );
        // 测试方法
        when(businessService.retrieveAllItems()).thenReturn(Arrays.asList(
                new Item(21, "Ball1", 10, 100),
                new Item(22, "Ball1", 51, 201)
        ));
        List<Item> items = businessService.retrieveAllItems();
        // 断言
        assertEquals(expectedItems, items);
    }
}