package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author d
 * @version 1.0
 * @description TODO 分页查询分页参数
 * @date 3/9/23 2:45 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    public static final long DEFAULT_PAGE_CURRENT = 1L;
    //每页记录数默认值
    public static final long DEFAULT_PAGE_SIZE = 10L;

    @ApiModelProperty("页码")
    private Long pageNo = DEFAULT_PAGE_CURRENT;
    @ApiModelProperty("每页记录数")
    private Long pageSize = DEFAULT_PAGE_SIZE;

}
