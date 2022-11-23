package lesson201.service;

import lesson201.ToLog;
import lesson201.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publish comment:" + comment.getText());
        return "SUCCESS";
    }

}
