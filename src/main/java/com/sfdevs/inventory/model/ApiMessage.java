package com.sfdevs.inventory.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class ApiMessage {
public static final String VALIDATION_ERRORS_PROPERTY = "validationErrors";
	
	private int httpCode;
	private String httpMessage;
	private String moreInformation;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public int getHttpCode() {
		return httpCode;
	}
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}
	public String getHttpMessage() {
		return httpMessage;
	}
	public void setHttpMessage(String httpMessage) {
		this.httpMessage = httpMessage;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	@JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	
	public static ApiMessage of(HttpStatus status, String moreInformation) {
		ApiMessage apiMessage = new ApiMessage();
		apiMessage.setHttpCode(status.value());
		apiMessage.setHttpMessage(status.getReasonPhrase());
		apiMessage.setMoreInformation(moreInformation);
		return apiMessage;
	}
	
}
