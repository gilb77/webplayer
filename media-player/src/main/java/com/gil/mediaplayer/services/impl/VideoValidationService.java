package com.gil.mediaplayer.services.impl;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Video validation service.
 *
 * @author Gil Ben Shimon
 */
@Service
public class VideoValidationService {


	public boolean isValidFilename(String value) {
		return Objects.nonNull(value)
				&& !value.isEmpty()
				&& value.length() <= 256
				&& !StringUtils.containsAny(value, "\\", "/", "*", "?", "%");
	}

	public boolean isValidContentType(String contentType) {
		return Objects.nonNull(contentType)
				&& "video/mp4".equals(contentType);
	}
}
