package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author dll
 * @version 1.0
 * @description TODO
 * @date 3/11/23 4:09 PM
 */
public interface CourseCategoryService {


    List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
