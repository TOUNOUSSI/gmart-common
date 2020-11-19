/*
 *  This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US">Creative Commons Attribution 3.0 Unported License</a>.
 *  Copyright © GMART, unpublished work. This computer program
 *  includes confidential, proprietary information and is a trade secret of GMART Inc.
 *  All use, disclosure, or reproduction is prohibited unless authorized
 *  in writing by TOUNOUSSI Youssef. All Rights Reserved.
 */
package com.gmart.common.messages.core;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gmart.common.messages.core.responses.Role;

import lombok.Data;

/**
 * @author <a href="mailto:youssef.tounoussi@gmail.com">TOUNOUSSI Youssef</a>
 * @create 16 nov. 2020
 **/

@Data
public class UserInfoDTO {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("email")
	private String email;

	@JsonProperty("firstname")
	private String firstname;

	@JsonProperty("lastname")
	private String lastname;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("roles")
	private Set<Role> roles;

	@JsonProperty("username")
	private String username;
	
	@JsonProperty("pseudoname")
	private String pseudoname;
	
	@JsonProperty("profile")
	private ProfileDTO profile;
}