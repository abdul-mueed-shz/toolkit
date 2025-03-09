package com.abdul.toolkit.utils.user.mapper;

import com.abdul.toolkit.utils.user.model.PermissionInfo;
import com.abdul.toolkit.utils.user.model.RoleInfo;
import com.abdul.toolkit.utils.user.model.UserInfo;
import dto.user.GithubUserInfo;
import dto.user.GoogleUserInfo;
import dto.user.LinkedinUserInfo;
import dto.user.TwitterUserInfo;
import dto.user.UserDetailResponse;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-10T01:47:14+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class UserServiceMapperImpl implements UserServiceMapper {

    @Override
    public UserInfo toUserInfo(UserDetailResponse userResponse) {
        if ( userResponse == null ) {
            return null;
        }

        UserInfo.UserInfoBuilder userInfo = UserInfo.builder();

        userInfo.id( userResponse.getId() );
        userInfo.username( userResponse.getUsername() );
        userInfo.email( userResponse.getEmail() );
        userInfo.roles( roleInfoListToRoleInfoSet( userResponse.getRoles() ) );
        userInfo.createdAt( map( userResponse.getCreatedAt() ) );
        userInfo.updatedAt( map( userResponse.getUpdatedAt() ) );
        userInfo.isActive( userResponse.getIsActive() );
        userInfo.isSystemLock( userResponse.getIsSystemLock() );
        userInfo.areCredentialsValid( userResponse.getAreCredentialsValid() );
        userInfo.firstName( userResponse.getFirstName() );
        userInfo.lastName( userResponse.getLastName() );
        userInfo.emailVerified( userResponse.getEmailVerified() );
        userInfo.googleUser( googleUserInfoToGoogleUserInfo( userResponse.getGoogleUser() ) );
        userInfo.linkedinUser( linkedinUserInfoToLinkedinUserInfo( userResponse.getLinkedinUser() ) );
        userInfo.twitterUser( twitterUserInfoToTwitterUserInfo( userResponse.getTwitterUser() ) );
        userInfo.githubUser( githubUserInfoToGithubUserInfo( userResponse.getGithubUser() ) );
        userInfo.password( userResponse.getPassword() );

        return userInfo.build();
    }

    protected PermissionInfo permissionInfoToPermissionInfo(dto.user.PermissionInfo permissionInfo) {
        if ( permissionInfo == null ) {
            return null;
        }

        PermissionInfo.PermissionInfoBuilder permissionInfo1 = PermissionInfo.builder();

        permissionInfo1.id( permissionInfo.getId() );
        permissionInfo1.name( permissionInfo.getName() );

        return permissionInfo1.build();
    }

    protected Set<PermissionInfo> permissionInfoListToPermissionInfoSet(List<dto.user.PermissionInfo> list) {
        if ( list == null ) {
            return null;
        }

        Set<PermissionInfo> set = new LinkedHashSet<PermissionInfo>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( dto.user.PermissionInfo permissionInfo : list ) {
            set.add( permissionInfoToPermissionInfo( permissionInfo ) );
        }

        return set;
    }

    protected RoleInfo roleInfoToRoleInfo(dto.user.RoleInfo roleInfo) {
        if ( roleInfo == null ) {
            return null;
        }

        RoleInfo.RoleInfoBuilder roleInfo1 = RoleInfo.builder();

        roleInfo1.id( roleInfo.getId() );
        roleInfo1.name( roleInfo.getName() );
        roleInfo1.permissions( permissionInfoListToPermissionInfoSet( roleInfo.getPermissions() ) );

        return roleInfo1.build();
    }

    protected Set<RoleInfo> roleInfoListToRoleInfoSet(List<dto.user.RoleInfo> list) {
        if ( list == null ) {
            return null;
        }

        Set<RoleInfo> set = new LinkedHashSet<RoleInfo>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( dto.user.RoleInfo roleInfo : list ) {
            set.add( roleInfoToRoleInfo( roleInfo ) );
        }

        return set;
    }

    protected com.abdul.toolkit.utils.model.GoogleUserInfo googleUserInfoToGoogleUserInfo(GoogleUserInfo googleUserInfo) {
        if ( googleUserInfo == null ) {
            return null;
        }

        com.abdul.toolkit.utils.model.GoogleUserInfo googleUserInfo1 = new com.abdul.toolkit.utils.model.GoogleUserInfo();

        googleUserInfo1.setId( googleUserInfo.getId() );
        googleUserInfo1.setAuthUserId( googleUserInfo.getAuthUserId() );
        googleUserInfo1.setGoogleId( googleUserInfo.getGoogleId() );
        googleUserInfo1.setPicture( googleUserInfo.getPicture() );
        if ( googleUserInfo.getCreatedAt() != null ) {
            googleUserInfo1.setCreatedAt( LocalDateTime.parse( googleUserInfo.getCreatedAt() ) );
        }
        if ( googleUserInfo.getUpdatedAt() != null ) {
            googleUserInfo1.setUpdatedAt( LocalDateTime.parse( googleUserInfo.getUpdatedAt() ) );
        }

        return googleUserInfo1;
    }

    protected com.abdul.toolkit.utils.linkedin.model.LinkedinUserInfo linkedinUserInfoToLinkedinUserInfo(LinkedinUserInfo linkedinUserInfo) {
        if ( linkedinUserInfo == null ) {
            return null;
        }

        com.abdul.toolkit.utils.linkedin.model.LinkedinUserInfo linkedinUserInfo1 = new com.abdul.toolkit.utils.linkedin.model.LinkedinUserInfo();

        linkedinUserInfo1.setId( linkedinUserInfo.getId() );
        linkedinUserInfo1.setPicture( linkedinUserInfo.getPicture() );
        if ( linkedinUserInfo.getCreatedAt() != null ) {
            linkedinUserInfo1.setCreatedAt( LocalDateTime.parse( linkedinUserInfo.getCreatedAt() ) );
        }
        if ( linkedinUserInfo.getUpdatedAt() != null ) {
            linkedinUserInfo1.setUpdatedAt( LocalDateTime.parse( linkedinUserInfo.getUpdatedAt() ) );
        }

        return linkedinUserInfo1;
    }

    protected com.abdul.toolkit.utils.model.TwitterUserInfo twitterUserInfoToTwitterUserInfo(TwitterUserInfo twitterUserInfo) {
        if ( twitterUserInfo == null ) {
            return null;
        }

        com.abdul.toolkit.utils.model.TwitterUserInfo twitterUserInfo1 = new com.abdul.toolkit.utils.model.TwitterUserInfo();

        twitterUserInfo1.setId( twitterUserInfo.getId() );
        twitterUserInfo1.setPicture( twitterUserInfo.getPicture() );
        if ( twitterUserInfo.getCreatedAt() != null ) {
            twitterUserInfo1.setCreatedAt( LocalDateTime.parse( twitterUserInfo.getCreatedAt() ) );
        }
        if ( twitterUserInfo.getUpdatedAt() != null ) {
            twitterUserInfo1.setUpdatedAt( LocalDateTime.parse( twitterUserInfo.getUpdatedAt() ) );
        }

        return twitterUserInfo1;
    }

    protected com.abdul.toolkit.utils.model.GithubUserInfo githubUserInfoToGithubUserInfo(GithubUserInfo githubUserInfo) {
        if ( githubUserInfo == null ) {
            return null;
        }

        com.abdul.toolkit.utils.model.GithubUserInfo githubUserInfo1 = new com.abdul.toolkit.utils.model.GithubUserInfo();

        githubUserInfo1.setId( githubUserInfo.getId() );
        if ( githubUserInfo.getHireable() != null ) {
            githubUserInfo1.setHireable( githubUserInfo.getHireable() );
        }
        githubUserInfo1.setBio( githubUserInfo.getBio() );
        githubUserInfo1.setCompany( githubUserInfo.getCompany() );
        githubUserInfo1.setBlog( githubUserInfo.getBlog() );
        githubUserInfo1.setHtmlUrl( githubUserInfo.getHtmlUrl() );
        githubUserInfo1.setAvatarUrl( githubUserInfo.getAvatarUrl() );
        if ( githubUserInfo.getCreatedAt() != null ) {
            githubUserInfo1.setCreatedAt( LocalDateTime.parse( githubUserInfo.getCreatedAt() ) );
        }
        if ( githubUserInfo.getUpdatedAt() != null ) {
            githubUserInfo1.setUpdatedAt( LocalDateTime.parse( githubUserInfo.getUpdatedAt() ) );
        }

        return githubUserInfo1;
    }
}
