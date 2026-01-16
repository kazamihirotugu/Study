package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;  // テスト対象

    @Mock
    private UserMapper userMapper;    // モック化

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // @Mock を初期化
    }

    @Test
    void searchAll_期待値が返るか() {
        // Arrange（準備）
        UserEntity user1 = new UserEntity();
        user1.setId(1);
        user1.setName("テスト太郎");

        UserEntity user2 = new UserEntity();
        user2.setId(2);
        user2.setName("テスト花子");

        List<UserEntity> mockList = Arrays.asList(user1, user2);

        // モックの挙動を設定
        when(userMapper.findAll()).thenReturn(mockList);

        // Act（実行）
        List<UserEntity> result = userService.searchAll();

        // Assert（検証）
        assertEquals(2, result.size());
        assertEquals("テスト太郎", result.get(0).getName());
        assertEquals("テスト花子", result.get(1).getName());
    }
}
