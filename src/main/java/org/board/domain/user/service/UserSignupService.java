package org.board.domain.user.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.board.domain.user.dto.request.UserSignupRequest;
import org.board.domain.user.entity.User;
import org.board.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignupService {
    private final UserRepository userRepository;

    @Transactional
    public void signupService(UserSignupRequest request){
        userRepository.save(
                User.builder()
                .userId(request.getUserId())
                .password(request.getPassword())
                .build()
        );
    }
}
