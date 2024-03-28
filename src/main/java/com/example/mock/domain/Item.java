package com.example.mock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WYC
 * @version v1.0
 * @since 2024/3/28 14:17
 **/
@Data
@AllArgsConstructor
public class Item {
    private Integer id;
    private String name;
    private Integer productNumber;
    private Integer productPrice;
}