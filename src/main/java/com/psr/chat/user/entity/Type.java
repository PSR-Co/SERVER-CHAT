package com.psr.chat.user.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {
    GENERAL("일반"),
    ENTREPRENEUR("사업자"),
    SHOW_HOST("쇼호스트"),
    MANAGER("관리자");

    private final String value;
}
