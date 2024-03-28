package com.example.mock;

import com.example.mock.controller.ItemController;
import com.example.mock.domain.Item;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author WYC
 * @version v1.0
 * @since 2024/3/28 16:40
 **/
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class Item2Test {

    @Resource
    private ItemController itemController;

    @Test
    public void dummyItem_basic() {
        // 测试方法
        Item item = itemController.dummyItem();
        // 预期结果
        Item expectedItem = new Item(1, "Ball", 10, 100);
        // 断言 进行对比属性
        assertEquals(expectedItem, item);
    }

    @Test
    public void itemFromBusinessService_basic() {
        // 测试方法
        Item item = itemController.itemFromBusinessService();
        // 预期结果
        Item expectedItem = new Item(2, "Ball1", 51, 201);
        // 断言 进行对比属性
        assertEquals(expectedItem, item);
    }

    @Test
    public void retrieveAllItems_basic() {
        // 测试方法
        List<Item> items = itemController.retrieveAllItems();
        // 预期结果
        List<Item> expectedItems = Arrays.asList(
                new Item(1, "Ball", 5, 20),
                new Item(2, "Ball1", 51, 201)
        );
        // 断言
        assertEquals(expectedItems, items);
    }
}