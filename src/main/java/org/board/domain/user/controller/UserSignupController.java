package org.board.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.board.domain.user.dto.request.UserSignupRequest;
import org.board.domain.user.service.UserSignupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserSignupController {
    private final UserSignupService signupService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserSignupRequest request){
        signupService.signupService(request);
    }
}
