package com.xuecheng.api.search;

import com.xuecheng.framework.domain.course.CoursePub;
import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import com.xuecheng.framework.domain.search.CourseSearchParam;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

@Api(value = "课程搜索", description = "课程搜索", tags = {"课程搜索"})
public interface ESCourseControllerApi {

	@ApiOperation("课程搜索")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "页码,第一页是1", required = true, paramType = "path", dataType = "int"),
			@ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int"),
	})
	public QueryResponseResult<CoursePub> list(int page, int size, CourseSearchParam courseSearchParam);

	@ApiOperation("根据课程id查询课程信息")
	@ApiImplicitParam(name = "id", value = "courseId", required = true, paramType = "path", dataType = "String")
	public Map<String, CoursePub> getall(String id);

	@ApiOperation("根据课程计划id查询课程媒资信息")
	@ApiImplicitParam(name = "id", value = "teachplanId", required = true, paramType = "path", dataType = "String")
	public TeachplanMediaPub getmedia(String id);
}
