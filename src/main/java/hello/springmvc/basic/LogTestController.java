package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("log-test")
    public String LogTest() {
        String name = "Spring";
        String name2 = "Spring2";

        System.out.println("name = " + name);

        log.trace("trace log={}, {}", name, name2); //이런 식으로 알아서 치환해주는 편리함도 있다.
        log.debug("debug log={}", name); //이런 식으로 알아서 치환해주는 편리함도 있다.
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        //로그 레벨 trace - debug - info - warn - error

        //아래처럼 사용하면 안 된다!
        log.info("info log="+name);

        return "ok";
    }
}
