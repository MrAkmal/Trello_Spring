package uz.doston.springcrm.mapper.project;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.project.ProjectCreateDto;
import uz.doston.springcrm.dto.project.ProjectDto;
import uz.doston.springcrm.dto.project.ProjectUpdateDto;
import uz.doston.springcrm.entity.project.Project;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public ProjectDto toDto(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setId( project.getId() );
        projectDto.setName( project.getName() );
        projectDto.setTzPath( project.getTzPath() );
        projectDto.setOrganizationId( project.getOrganizationId() );
        projectDto.setClosed( project.isClosed() );
        projectDto.setCreatedAt( project.getCreatedAt() );
        projectDto.setDeadline( project.getDeadline() );

        return projectDto;
    }

    @Override
    public List<ProjectDto> toDto(List<Project> projects) {
        if ( projects == null ) {
            return null;
        }

        List<ProjectDto> list = new ArrayList<ProjectDto>( projects.size() );
        for ( Project project : projects ) {
            list.add( toDto( project ) );
        }

        return list;
    }

    @Override
    public Project fromCreateDto(ProjectCreateDto projectCreateDto) {
        if ( projectCreateDto == null ) {
            return null;
        }

        Project project = new Project();

        project.setName( projectCreateDto.getName() );
        project.setTzPath( projectCreateDto.getTzPath() );
        project.setOrganizationId( projectCreateDto.getOrganizationId() );

        return project;
    }

    @Override
    public Project fromUpdateDto(ProjectUpdateDto projectUpdateDto) {
        if ( projectUpdateDto == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( projectUpdateDto.getId() );
        project.setName( projectUpdateDto.getName() );
        project.setTzPath( projectUpdateDto.getTzPath() );
        if ( projectUpdateDto.getClosed() != null ) {
            project.setClosed( projectUpdateDto.getClosed() );
        }

        return project;
    }
}
