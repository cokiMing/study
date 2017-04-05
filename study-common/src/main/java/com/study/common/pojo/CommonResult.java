package com.study.common.pojo;

public class CommonResult {
	private int status;
	private String msg;
	private Object data;
	private static CommonResult result;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static CommonResult ok(){
		result = new CommonResult();
		result.setStatus(200);
		return result;
	}
	
	public static CommonResult ok(Object data){
		result = new CommonResult();
		result.setStatus(200);
		result.setData(data);
		return result;
	}	
	
	public static CommonResult build(int status,String msg){
		result = new CommonResult();
		result.setMsg(msg);
		result.setStatus(status);
		return result;
	}	
}
