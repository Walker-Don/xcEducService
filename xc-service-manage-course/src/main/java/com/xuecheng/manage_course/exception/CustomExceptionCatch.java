package com.xuecheng.manage_course.exception;

import com.xuecheng.framework.exception.ExceptionCatch;
import com.xuecheng.framework.model.response.CommonCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 课程管理自定义的异常类，其中定义异常类型所对应的错误代码
 *
 * @author Administrator
 * @version 1.0
 **/
@ControllerAdvice//控制器增强
public class CustomExceptionCatch extends ExceptionCatch {
	static {
		//todo 和父类的先后顺序,为什么用builder,不用map
		//除了CustomException以外的异常类型及对应的错误代码在这里定义,，如果不定义则统一返回固定的错误信息
		builder.put(AccessDeniedException.class, CommonCode.UNAUTHORISE);
	}
}
