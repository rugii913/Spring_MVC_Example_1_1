package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

//지난 커밋의 요청 매핑을 API로 만드는 예시 - 데이터가 넘어가는 부분은 생략하고 URL 매핑만
@RestController
@RequestMapping("/mapping/users") //메서드 매핑 url에서 겹치는 부분을 컨트롤러 위로 옮겨줄 수 있다.
public class MappingClassController {
    /** 전체 요약
     * * 회원 목록 조회: GET    "/users"
     * * 회원 등록:     POST   "/users"
     * * 회원 조회:     GET    "/users/{userId}"
     * * 회원 수정:     PATCH  "/users/{userId}"
     * * 회원 삭제:     DELETE "/users/{userId}"
     * 같은 url인데 HTTP 메서드로 기능을 구분할 수 있다.
     * -> REST API는 매핑하기 편리하다
     */

    /**
     * GET /mapping/users
     */
    @GetMapping
    public String users() {
        return "get users";
    }

    /**
     * POST /mapping/users
     */
    @PostMapping
    public String addUser() {
        return "post user";
    }

    /**
     * GET /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId=" + userId;
    }

    /**
     * PATCH /mapping/users/{userId}
     */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    /**
     * DELETE /mapping/users/{userId}
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }

}
