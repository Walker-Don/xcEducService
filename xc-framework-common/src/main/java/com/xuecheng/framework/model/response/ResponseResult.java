package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 18:33.
 * @Modified By:
 */
@Data
@ToString
@NoArgsConstructor
public class ResponseResult implements Response {

	//操作是否成功,默认为true
	boolean success = SUCCESS;

	//操作代码，默认为10000，操作成功
	int code = SUCCESS_CODE;

	//提示信息，自定义
	String message;

	public ResponseResult(ResultCode resultCode) {
		this.success = resultCode.success();
		this.code = resultCode.code();
		this.message = resultCode.message();
	}

	public static ResponseResult SUCCESS() {
		return new ResponseResult(CommonCode.SUCCESS);
	}

	public static ResponseResult FAIL() {
		return new ResponseResult(CommonCode.FAIL);
	}

}
