package annotest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yzy on 2017/07/13 下午 4:42.
 * email: mia5121@163.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Access {

	//
	Role level() default Role.Admin;

}
