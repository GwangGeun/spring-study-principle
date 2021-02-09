package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * Qualifier 의 () 는 문자열로 이루어져있다. 때문에,이 컴파일 시 오류를 잡을 수 없을 뿐더러
 * 매번 작성할 때마다 실수할 여지가 있다. 이를 방지하는 하나의 방법이 annotation 형태로 사용하는 것이다.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
public @interface MainDiscountPolicy {
}
