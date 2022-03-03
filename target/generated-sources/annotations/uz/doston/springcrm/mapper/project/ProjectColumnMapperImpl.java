package uz.doston.springcrm.mapper.project;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.column.ProjectColumnCreateDto;
import uz.doston.springcrm.dto.column.ProjectColumnDto;
import uz.doston.springcrm.dto.column.ProjectColumnUpdateDto;
import uz.doston.springcrm.entity.project.ProjectColumn;
import uz.doston.springcrm.entity.task.Task;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ProjectColumnMapperImpl implements ProjectColumnMapper {

    @Override
    public ProjectColumnDto toDto(ProjectColumn projectColumn) {
        if ( projectColumn == null ) {
            return null;
        }

        ProjectColumnDto projectColumnDto = new ProjectColumnDto();

        projectColumnDto.setId( projectColumn.getId() );
        projectColumnDto.setName( projectColumn.getName() );
        projectColumnDto.setProjectId( projectColumn.getProjectId() );
        projectColumnDto.setOrderNumber( projectColumn.getOrderNumber() );
        projectColumnDto.setIcon( projectColumn.getIcon() );
        projectColumnDto.setActive( projectColumn.isActive() );

        return projectColumnDto;
    }

    @Override
    public List<ProjectColumnDto> toDto(List<ProjectColumn> projectColumns) {
        if ( projectColumns == null ) {
            return null;
        }

        List<ProjectColumnDto> list = new ArrayList<ProjectColumnDto>( projectColumns.size() );
        for ( ProjectColumn projectColumn : projectColumns ) {
            list.add( toDto( projectColumn ) );
        }

        return list;
    }

    @Override
    public ProjectColumn fromCreateDto(ProjectColumnCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProjectColumn projectColumn = new ProjectColumn();

        projectColumn.setName( dto.getName() );
        projectColumn.setProjectId( dto.getProjectId() );
        projectColumn.setOrderNumber( dto.getOrderNumber() );
        List<Task> list = dto.getTasks();
        if ( list != null ) {
            projectColumn.setTasks( new ArrayList<Task>( list ) );
        }
        projectColumn.setIcon( dto.getIcon() );

        return projectColumn;
    }

    @Override
    public ProjectColumn fromUpdateDto(ProjectColumnUpdateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProjectColumn projectColumn = new ProjectColumn();

        projectColumn.setId( dto.getId() );
        projectColumn.setName( dto.getName() );
        projectColumn.setProjectId( dto.getProjectId() );
        projectColumn.setOrderNumber( dto.getOrderNumber() );
        projectColumn.setIcon( dto.getIcon() );
        projectColumn.setActive( dto.isActive() );

        return projectColumn;
    }
}
