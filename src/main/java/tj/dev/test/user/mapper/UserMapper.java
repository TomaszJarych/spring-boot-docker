package tj.dev.test.user.mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import tj.dev.test.user.domain.User;
import tj.dev.test.user.dto.UserDto;

@Mapper(componentModel="spring", nullValueCheckStrategy=ALWAYS)
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserDto userToUserDto(User user);
	
	@InheritInverseConfiguration
	User userDtoToUser(UserDto dto);

}
