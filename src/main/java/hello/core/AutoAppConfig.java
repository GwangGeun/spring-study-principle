package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/* 참고: 컴포넌트 스캔을 사용하면 @Configuration 이 붙은 설정 정보도 자동으로 등록되기 때문에,
AppConfig, TestConfig 등 앞서 만들어두었던 설정 정보도 함께 등록되고, 실행되어 버린다.
그래서 excludeFilters 를 이용해서 설정정보는 컴포넌트 스캔 대상에서 제외했다. ( 기존에 만든 것들은 수동으로 등록하는 것을 예시로 만들었기 떄문 )
보통 설정 정보를 컴포넌트 스캔 대상에서 제외하지는 않지만, 기존 예제 코드를 최대한 남기고 유지하기 위해서 이 방법을 선택했다. */
@Configuration
/**
 * SrpingBoot 기준 -> @SpringBootApplication 에 Component Scan 이 걸려있기 때문에 따로 @ComponentScan 을 지정할 필요가 없다.
 */
@ComponentScan(
//        basePackages = "hello.core.member",
//      (default 설정) basePackageClasses = AppConfig.class, -> AppConfig.class 의 package 는 hello.core -> 때문에, hello.core 하위가 지정된다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 수동 빈 등록 vs 자동 빈 등록 : 층돌 시 수동 빈 등록이 우선권을 가진다.
    // 단, 스프링 부트를 통해 실행하면 (테스트 환경이 아닌) 에러가 뜬다.
//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
