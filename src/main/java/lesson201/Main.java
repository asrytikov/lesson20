package lesson201;

import lesson201.model.Comment;
import lesson201.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Hello");
        comment.setAuthor("Alexander");

        String value = service.publishComment(comment);
        logger.info(value);
    }
}