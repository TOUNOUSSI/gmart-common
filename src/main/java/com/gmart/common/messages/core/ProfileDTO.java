/*
 *  This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US">Creative Commons Attribution 3.0 Unported License</a>.
 *  Copyright © GMART, unpublished work. This computer program
 *  includes confidential, proprietary information and is a trade secret of GMART Inc.
 *  All use, disclosure, or reproduction is prohibited unless authorized
 *  in writing by TOUNOUSSI Youssef. All Rights Reserved.
 */
package com.gmart.common.messages.core;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author <a href="mailto:youssef.tounoussi@gmail.com">TOUNOUSSI Youssef</a>
 * @create 16 nov. 2020
 **/

@Data
public class ProfileDTO {
	private String pseudoname;
	private String firstname;
	private String lastname;
	private String nickname;
	private String phone;
	private String profileDescription;
	private List<PictureDTO> pictures = new ArrayList<>();
	private List<PostDTO> posts = new ArrayList<>();
}
