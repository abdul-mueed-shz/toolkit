package com.abdul.toolkit.domain.linkedin.mapper;

import com.abdul.admin.dto.AccessToken;
import com.abdul.toolkit.domain.linkedin.model.LinkedinUserResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-03T00:34:12+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class LinkedinMapperImpl implements LinkedinMapper {

    @Override
    public LinkedinUserResponse map(com.abdul.admin.dto.LinkedinUserResponse linkedinUserResponse) {
        if ( linkedinUserResponse == null ) {
            return null;
        }

        LinkedinUserResponse linkedinUserResponse1 = new LinkedinUserResponse();

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
    public com.abdul.toolkit.domain.auth.model.AccessToken map(AccessToken accessToken) {
        if ( accessToken == null ) {
            return null;
        }

        com.abdul.toolkit.domain.auth.model.AccessToken accessToken1 = new com.abdul.toolkit.domain.auth.model.AccessToken();

        accessToken1.setToken( accessToken.getAccessToken() );
        accessToken1.setExpiresIn( accessToken.getExpiresIn() );
        accessToken1.setScope( accessToken.getScope() );
        accessToken1.setTokenType( accessToken.getTokenType() );
        accessToken1.setIdToken( accessToken.getIdToken() );

        return accessToken1;
    }
}
