package com.imooc.vo;

import lombok.Data;

import java.io.Serializable;

/**http请求返回的最外层对象
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/28 15:38
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -8349181922768084604L;

    /** 错误码. */
    private Integer code;
    /** 提示信息. */
    private String msg;
    /* 具体内容. **/
    private T data;
}
