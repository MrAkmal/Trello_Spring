package uz.doston.springcrm.mapper.comment;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import uz.doston.springcrm.dto.comment.CommentDto;
import uz.doston.springcrm.entity.comment.Comment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-01T10:17:37+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDto toDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setId( comment.getId() );
        commentDto.setText( comment.getText() );
        commentDto.setTaskId( comment.getTaskId() );
        commentDto.setCommentType( comment.getCommentType() );
        commentDto.setCreatedAt( comment.getCreatedAt() );
        commentDto.setUpdatedAt( comment.getUpdatedAt() );

        return commentDto;
    }

    @Override
    public List<CommentDto> toDto(List<Comment> comments) {
        if ( comments == null ) {
            return null;
        }

        List<CommentDto> list = new ArrayList<CommentDto>( comments.size() );
        for ( Comment comment : comments ) {
            list.add( toDto( comment ) );
        }

        return list;
    }
}
