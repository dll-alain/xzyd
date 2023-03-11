package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author d
 * @version 1.0
 * @description TODO 课程信息管理接口
 * @date 3/9/23 7:45 PM
 */
public interface CourseBaseInfoService {

    /**
     * @description TODO
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 查询条件
     * @return 结果
     * @author dll
     * @date  3/9/23 7:45 PM
    */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 培训机构id
     * @param addCourseDto 新增课程的信息
     * @return 课程信息包括基本信息、营销信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
