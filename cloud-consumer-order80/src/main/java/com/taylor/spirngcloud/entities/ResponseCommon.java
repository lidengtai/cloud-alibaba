package com.taylor.spirngcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/25 23:02
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