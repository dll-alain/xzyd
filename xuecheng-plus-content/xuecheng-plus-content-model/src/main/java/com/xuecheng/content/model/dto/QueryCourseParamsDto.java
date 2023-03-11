package com.xuecheng.content.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author d
 * @version 1.0
 * @description TODO 接口层和业务层之间的数据 查询的key
 * @date 3/9/23 2:52 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
