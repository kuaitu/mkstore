package com.mkstore.mk.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {
	@Value("${system.imgserver.url}")
	private String imageServerUrl;
	
	@Value("${system.imgserver.port}")
	private Integer imageServerPort;

	public String getImageServerUrl() {
		return imageServerUrl;
	}

	public void setImageServerUrl(String imageServerUrl) {
		this.imageServerUrl = imageServerUrl;
	}

	public Integer getImageServerPort() {
		return imageServerPort;
	}

	public void setImageServerPort(Integer imageServerPort) {
		this.imageServerPort = imageServerPort;
	}

}
