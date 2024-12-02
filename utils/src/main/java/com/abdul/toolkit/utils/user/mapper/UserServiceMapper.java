package com.abdul.toolkit.utils.user.mapper;

import com.abdul.admin.dto.UserResponse;
import com.abdul.toolkit.utils.user.model.UserInfo;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserServiceMapper {

    UserInfo toUserInfo(UserResponse userResponse);

    default LocalDateTime map(OffsetDateTime offsetDateTime) {
        return offsetDateTime == null ? null : offsetDateTime.toLocalDateTime();
    }
}
