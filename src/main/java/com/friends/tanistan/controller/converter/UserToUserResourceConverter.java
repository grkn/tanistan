package com.friends.tanistan.controller.converter;

import org.springframework.core.convert.converter.Converter;

import com.friends.tanistan.controller.resource.UserResource;
import com.friends.tanistan.entity.UserEntity;

public class UserToUserResourceConverter implements Converter<UserEntity, UserResource> {

	@Override
	public UserResource convert(UserEntity source) {
		UserResource userResource = new UserResource();
		userResource.setName(source.getName());
		userResource.setBirthDay(source.getBirthDay());
		userResource.setEmailAddress(source.getEmailAddress());
		userResource.setLastName(source.getLastName());
		userResource.setMiddleName(source.getMiddleName());
		userResource.setPhoneNumber(source.getPhoneNumber());
		userResource.setSecretQuestion(source.getSecretQuestion());
		userResource.setAccountName(source.getAccountName());
		return userResource;
	}

}
