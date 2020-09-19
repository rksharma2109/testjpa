package testjpa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseBean {
	
	private String statusCode;
	private String statusDesc;
	private String body;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		 this.body = body;
	}

}
