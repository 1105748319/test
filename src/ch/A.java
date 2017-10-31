package ch;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

/**
 * Created by 004410 on 2017/10/21.
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface A{
        String author() default "LIUYUN";
        String date() default "2017-10-21";
        int revision() default 1;
        String comments() default "这是我的作业！";

    }



