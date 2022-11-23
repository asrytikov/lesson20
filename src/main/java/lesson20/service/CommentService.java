package lesson20.service;

import lesson20.ToLog;
import lesson20.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publish comment:" + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Delete comment:" + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Edit comment:" + comment.getText());
    }



}
