package uz.doston.springcrm.mapper.organization;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.organization.OrganizationCreateDto;
import uz.doston.springcrm.dto.organization.OrganizationDto;
import uz.doston.springcrm.dto.organization.OrganizationDto.OrganizationDtoBuilder;
import uz.doston.springcrm.dto.organization.OrganizationUpdateDto;
import uz.doston.springcrm.entity.organization.Organization;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class OrganizationMapperImpl implements OrganizationMapper {

    @Override
    public OrganizationDto toDto(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationDtoBuilder organizationDto = OrganizationDto.childBuilder();

        organizationDto.name( organization.getName() );
        organizationDto.code( organization.getCode() );
        organizationDto.email( organization.getEmail() );
        organizationDto.logo( organization.getLogo() );
        organizationDto.location( organization.getLocation() );

        return organizationDto.build();
    }

    @Override
    public List<OrganizationDto> toDto(List<Organization> list) {
        if ( list == null ) {
            return null;
        }

        List<OrganizationDto> list1 = new ArrayList<OrganizationDto>( list.size() );
        for ( Organization organization : list ) {
            list1.add( toDto( organization ) );
        }

        return list1;
    }

    @Override
    public Organization findByCode(String code) {
        if ( code == null ) {
            return null;
        }

        Organization organization = new Organization();

        organization.setCode( code );

        return organization;
    }

    @Override
    public Organization fromCreateDto(OrganizationCreateDto organizationCreateDto) {
        if ( organizationCreateDto == null ) {
            return null;
        }

        Organization organization = new Organization();

        organization.setName( organizationCreateDto.getName() );
        organization.setLocation( organizationCreateDto.getLocation() );

        return organization;
    }

    @Override
    public Organization fromUpdateDto(OrganizationUpdateDto organizationUpdateDto, Organization organization) {
        if ( organizationUpdateDto == null ) {
            return null;
        }

        organization.setId( organizationUpdateDto.getId() );
        organization.setName( organizationUpdateDto.getName() );
        organization.setEmail( organizationUpdateDto.getEmail() );
        organization.setCode( organizationUpdateDto.getCode() );
        organization.setLocation( organizationUpdateDto.getLocation() );

        return organization;
    }
}
