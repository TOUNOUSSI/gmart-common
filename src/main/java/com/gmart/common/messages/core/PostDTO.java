/*
 *  This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US">Creative Commons Attribution 3.0 Unported License</a>.
 *  Copyright © GMART, unpublished work. This computer program
 *  includes confidential, proprietary information and is a trade secret of GMART Inc.
 *  All use, disclosure, or reproduction is prohibited unless authorized
 *  in writing by TOUNOUSSI Youssef. All Rights Reserved.
 */
package com.gmart.common.messages.core;

import java.sql.Timestamp;
import java.util.List;

import com.gmart.common.enums.core.PostType;

import lombok.Data;



/**
 * @author <a href="mailto:youssef.tounoussi@gmail.com">TOUNOUSSI Youssef</a>
 * @create 16 nov. 2020
 **/

@Data
public class PostDTO {
	private PostType type;	
	private Timestamp postDate;
	private String description;
	private List<CommentDTO> comments;
}
