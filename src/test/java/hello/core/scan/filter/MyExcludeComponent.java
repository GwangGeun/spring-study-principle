package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // Class Level 
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
