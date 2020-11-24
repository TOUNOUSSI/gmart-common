/*
 *  This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/3.0/deed.en_US">Creative Commons Attribution 3.0 Unported License</a>.
 *  Copyright © GMART, unpublished work. This computer program
 *  includes confidential, proprietary information and is a trade secret of GMART Inc.
 *  All use, disclosure, or reproduction is prohibited unless authorized
 *  in writing by TOUNOUSSI Youssef. All Rights Reserved.
 */

package com.gmart.common.messages.core.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gmart.common.enums.core.LoginStatus;
import com.gmart.common.messages.core.UserInfoDTO;

import lombok.Data;

/**
 * @author <a href="mailto:youssef.tounoussi@gmail.com">TOUNOUSSI Youssef</a>
 * @create 16 nov. 2020
 **/

@Data
public class SignInResponse {
	@JsonProperty("authenticatedUser")
	private UserInfoDTO authenticatedUser;

	@JsonProperty("error")
	private CustomError error;

	@JsonProperty("loginStatus")
	private LoginStatus loginStatus;

	@JsonProperty("token")
	private String token;
}
