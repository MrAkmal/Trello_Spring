package uz.doston.springcrm.mapper.project;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.project.member.ProjectMemberDto;
import uz.doston.springcrm.entity.project.ProjectMember;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:49+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ProjectMemberMapperImpl implements ProjectMemberMapper {

    @Override
    public List<ProjectMemberDto> toDto(List<ProjectMember> projectMembers) {
        if ( projectMembers == null ) {
            return null;
        }

        List<ProjectMemberDto> list = new ArrayList<ProjectMemberDto>( projectMembers.size() );
        for ( ProjectMember projectMember : projectMembers ) {
            list.add( projectMemberToProjectMemberDto( projectMember ) );
        }

        return list;
    }

    protected ProjectMemberDto projectMemberToProjectMemberDto(ProjectMember projectMember) {
        if ( projectMember == null ) {
            return null;
        }

        ProjectMemberDto projectMemberDto = new ProjectMemberDto();

        projectMemberDto.setId( projectMember.getId() );
        projectMemberDto.setLead( projectMember.isLead() );

        return projectMemberDto;
    }
}
