package com.taylor.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/23 22:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCommon<T> {

    private int code;
    private String message;
    private T data;

    public ResponseCommon(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
