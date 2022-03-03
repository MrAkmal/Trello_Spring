package uz.doston.springcrm.mapper.task;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.auth.AuthUserDto;
import uz.doston.springcrm.dto.task.TaskCreateDto;
import uz.doston.springcrm.dto.task.TaskDto;
import uz.doston.springcrm.dto.task.TaskUpdateDto;
import uz.doston.springcrm.entity.auth.AuthUser;
import uz.doston.springcrm.entity.task.Task;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T09:36:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskDto toDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setId( task.getId() );
        taskDto.setProjectId( task.getProjectId() );
        taskDto.setColumnId( task.getColumnId() );
        taskDto.setTaskMembers( authUserListToAuthUserDtoList( task.getTaskMembers() ) );
        taskDto.setName( task.getName() );
        taskDto.setOwnerId( task.getOwnerId() );
        taskDto.setDescription( task.getDescription() );
        taskDto.setLevel( task.getLevel() );
        taskDto.setDeadline( task.getDeadline() );
        taskDto.setPriority( task.getPriority() );
        taskDto.setCompleted( task.isCompleted() );
        taskDto.setFrozen( task.isFrozen() );

        return taskDto;
    }

    @Override
    public List<TaskDto> toDto(List<Task> tasks) {
        if ( tasks == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( tasks.size() );
        for ( Task task : tasks ) {
            list.add( toDto( task ) );
        }

        return list;
    }

    @Override
    public Task fromCreateDto(TaskCreateDto taskCreateDto) {
        if ( taskCreateDto == null ) {
            return null;
        }

        Task task = new Task();

        task.setProjectId( taskCreateDto.getProjectId() );
        task.setColumnId( taskCreateDto.getColumnId() );
        task.setName( taskCreateDto.getName() );
        task.setOwnerId( taskCreateDto.getOwnerId() );
        task.setDescription( taskCreateDto.getDescription() );

        return task;
    }

    @Override
    public Task fromUpdateDto(TaskUpdateDto taskUpdateDto) {
        if ( taskUpdateDto == null ) {
            return null;
        }

        Task task = new Task();

        task.setId( taskUpdateDto.getId() );
        task.setColumnId( taskUpdateDto.getColumnId() );
        task.setTaskMembers( authUserDtoListToAuthUserList( taskUpdateDto.getTaskMembers() ) );
        task.setName( taskUpdateDto.getName() );
        task.setDescription( taskUpdateDto.getDescription() );
        task.setLevel( taskUpdateDto.getLevel() );
        task.setDeadline( taskUpdateDto.getDeadline() );
        task.setPriority( taskUpdateDto.getPriority() );
        task.setCompleted( taskUpdateDto.isCompleted() );

        return task;
    }

    protected AuthUserDto authUserToAuthUserDto(AuthUser authUser) {
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

    protected List<AuthUserDto> authUserListToAuthUserDtoList(List<AuthUser> list) {
        if ( list == null ) {
            return null;
        }

        List<AuthUserDto> list1 = new ArrayList<AuthUserDto>( list.size() );
        for ( AuthUser authUser : list ) {
            list1.add( authUserToAuthUserDto( authUser ) );
        }

        return list1;
    }

    protected AuthUser authUserDtoToAuthUser(AuthUserDto authUserDto) {
        if ( authUserDto == null ) {
            return null;
        }

        AuthUser authUser = new AuthUser();

        authUser.setId( authUserDto.getId() );
        authUser.setUsername( authUserDto.getUsername() );
        authUser.setFirstName( authUserDto.getFirstName() );
        authUser.setLastName( authUserDto.getLastName() );
        authUser.setAge( authUserDto.getAge() );
        authUser.setEmail( authUserDto.getEmail() );
        authUser.setOrganizationId( authUserDto.getOrganizationId() );
        authUser.setRole( authUserDto.getRole() );
        authUser.setLanguage( authUserDto.getLanguage() );
        authUser.setDeleted( authUserDto.isDeleted() );

        return authUser;
    }

    protected List<AuthUser> authUserDtoListToAuthUserList(List<AuthUserDto> list) {
        if ( list == null ) {
            return null;
        }

        List<AuthUser> list1 = new ArrayList<AuthUser>( list.size() );
        for ( AuthUserDto authUserDto : list ) {
            list1.add( authUserDtoToAuthUser( authUserDto ) );
        }

        return list1;
    }
}
