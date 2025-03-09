package com.abdul.toolkit.utils.linkedin.mapper;

import com.abdul.toolkit.utils.model.AccessToken;
import dto.user.LinkedinUserResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-10T01:47:14+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class LinkedinMapperImpl implements LinkedinMapper {

    @Override
    public com.abdul.toolkit.utils.linkedin.model.LinkedinUserResponse map(LinkedinUserResponse linkedinUserResponse) {
        if ( linkedinUserResponse == null ) {
            return null;
        }

        com.abdul.toolkit.utils.linkedin.model.LinkedinUserResponse linkedinUserResponse1 = new com.abdul.toolkit.utils.linkedin.model.LinkedinUserResponse();

        linkedinUserResponse1.setSub( linkedinUserResponse.getSub() );
        linkedinUserResponse1.setEmailVerified( linkedinUserResponse.getEmailVerified() );
        linkedinUserResponse1.setName( linkedinUserResponse.getName() );
        linkedinUserResponse1.setPicture( linkedinUserResponse.getPicture() );
        linkedinUserResponse1.setGivenName( linkedinUserResponse.getGivenName() );
        linkedinUserResponse1.setFamilyName( linkedinUserResponse.getFamilyName() );
        linkedinUserResponse1.setEmail( linkedinUserResponse.getEmail() );

        return linkedinUserResponse1;
    }

    @Override
    public AccessToken map(dto.user.AccessToken accessToken) {
        if ( accessToken == null ) {
            return null;
        }

        AccessToken accessToken1 = new AccessToken();

        accessToken1.setToken( accessToken.getAccessToken() );
        accessToken1.setExpiresIn( accessToken.getExpiresIn() );
        accessToken1.setScope( accessToken.getScope() );
        accessToken1.setTokenType( accessToken.getTokenType() );
        accessToken1.setIdToken( accessToken.getIdToken() );

        return accessToken1;
    }
}
