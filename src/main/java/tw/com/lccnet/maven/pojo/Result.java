package tw.com.lccnet.maven.pojo;

import java.time.LocalDateTime;

public class Result {
	private Integer code;
	private String msg;
	private Object data;
	
	
	
	public Result() {
		super();
	}

	public Result(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static Result success() {
		return new Result(1, "SUCCESS", LocalDateTime.now());	
	}

	public static Result success(Object data) {
		return new Result(1, "SUCCESS", data);	
	}
	
	public static Result error(String msg) {
		return new Result(0, msg, LocalDateTime.now());	
	}
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
