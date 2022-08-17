package com.cfl.springboottest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cfl
 * @date 2022/8/17 15:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据list
     */
    private List<?> data;
}
