package com.sc.cloud.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * TODO
 *@author 180609
 *@date 2022/4/21
 */
@Data
public class User implements Serializable {
    private String username;
    private String password;
}
