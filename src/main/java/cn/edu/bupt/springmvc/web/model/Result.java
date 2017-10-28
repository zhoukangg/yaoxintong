package cn.edu.bupt.springmvc.web.model;

public class Result {
	private boolean result;
	private Object datum;
	private String reason;
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public Object getDatum() {
		return datum;
	}
	public void setDatum(Object datum) {
		this.datum = datum;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
