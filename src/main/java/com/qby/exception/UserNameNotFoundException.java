package com.qby.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author qby
 * @date 2020/7/12 23:04
 */
@ResponseStatus(reason = "用户登陆被拒绝", value = HttpStatus.NOT_ACCEPTABLE)
public class UserNameNotFoundException extends RuntimeException {
}
