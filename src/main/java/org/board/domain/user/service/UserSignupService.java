package org.board.domain.user.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.board.domain.user.dto.request.UserSignupRequest;
import org.board.domain.user.entity.User;
import org.board.domain.user.repository.UserRepository;
import org.board.global.exceptions.AlreayUserIdExistException;
import org.board.global.exceptions.BusinessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class UserSignupService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signupService(UserSignupRequest request){
        Boolean checkExistUserId = userRepository.existsByUserId(request.getUserId()); //helped by 도휘
        if(!checkExistUserId){
            userRepository.save(
                    User.builder()
                            .userId(request.getUserId())
                            .password(passwordEncoder.encode(request.getPassword()))
                            .build()
            );
        }else {

        }
    }
}
