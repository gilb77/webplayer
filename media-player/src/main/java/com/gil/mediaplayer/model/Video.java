package com.gil.mediaplayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Video DTO.
 *
 * @author Gil Ben Shimon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
	private String name;
	private Long size;
	private String extension;
}
