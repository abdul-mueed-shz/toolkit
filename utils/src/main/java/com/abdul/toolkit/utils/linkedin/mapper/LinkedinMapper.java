package com.abdul.toolkit.utils.linkedin.mapper;

import com.abdul.toolkit.utils.linkedin.model.LinkedinUserResponse;
import com.abdul.toolkit.utils.model.AccessToken;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface LinkedinMapper {

    LinkedinUserResponse map(dto.user.LinkedinUserResponse linkedinUserResponse);

    @Mapping(source = "accessToken", target = "token")
    AccessToken map(dto.user.AccessToken accessToken);
}
