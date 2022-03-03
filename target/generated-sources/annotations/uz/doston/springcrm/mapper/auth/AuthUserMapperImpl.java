package uz.doston.springcrm.mapper.auth;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.auth.AuthUserCreateDto;
import uz.doston.springcrm.dto.auth.AuthUserDto;
import uz.doston.springcrm.entity.auth.AuthUser;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class AuthUserMapperImpl implements AuthUserMapper {

    @Override
    public AuthUserDto toDto(AuthUser authUser) {
        if ( authUser == null ) {
            return null;
        }

        AuthUserDto authUserDto = new AuthUserDto();

        authUserDto.setId( authUser.getId() );
        authUserDto.setUsername( authUser.getUsername() );
        authUserDto.setFirstName( authUser.getFirstName() );
        authUserDto.setLastName( authUser.getLastName() );
        authUserDto.setAge( authUser.getAge() );
        authUserDto.setEmail( authUser.getEmail() );
        authUserDto.setOrganizationId( authUser.getOrganizationId() );
        authUserDto.setRole( authUser.getRole() );
        authUserDto.setLanguage( authUser.getLanguage() );
        authUserDto.setDeleted( authUser.isDeleted() );

        return authUserDto;
    }

    @Override
    public List<AuthUserDto> toDto(List<AuthUser> authUsers) {
        if ( authUsers == null ) {
            return null;
        }

        List<AuthUserDto> list = new ArrayList<AuthUserDto>( authUsers.size() );
        for ( AuthUser authUser : authUsers ) {
            list.add( toDto( authUser ) );
        }

        return list;
    }

    @Override
    public AuthUser fromCreateDto(AuthUserCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        AuthUser authUser = new AuthUser();

        authUser.setUsername( dto.getUsername() );
        authUser.setFirstName( dto.getFirstName() );
        authUser.setLastName( dto.getLastName() );
        authUser.setAge( dto.getAge() );
        authUser.setEmail( dto.getEmail() );
        authUser.setPassword( dto.getPassword() );
        authUser.setCode( dto.getCode() );
        authUser.setOrganizationId( dto.getOrganizationId() );

        return authUser;
    }
}
