package com.gil.mediaplayer.validators;

import com.gil.mediaplayer.annotations.ValidVideoFile;
import com.gil.mediaplayer.services.impl.VideoValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * Valid video file validator.
 *
 * @author Gil Ben Shimon
 */
@Component
@RequiredArgsConstructor
public class ValidVideoFileValidator implements ConstraintValidator<ValidVideoFile, MultipartFile> {

	private final VideoValidationService videoValidationService;

	@Override
	public boolean isValid(MultipartFile value, ConstraintValidatorContext context) {
		return Objects.nonNull(value)
				&& !value.isEmpty()
				&& videoValidationService.isValidContentType(value.getContentType())
				&& videoValidationService.isValidFilename(value.getOriginalFilename());
	}
}
