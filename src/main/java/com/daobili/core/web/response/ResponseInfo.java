package com.daobili.core.web.response;

/**
 * @Author bamaw
 * @Date 2020-12-08  21:25
 * @Description 返回信息
 */
public enum ResponseInfo {

    ENUM_ERR(-1,ResponseFinal.ENUM_ERR),
    SUCCESS(0,ResponseFinal.SUCCESS),
    FAILE(1,ResponseFinal.FAILE),
    UNCONFIRMED(3,ResponseFinal.UNCONFIRMED),
    OTHER_ERROR(10001,ResponseFinal.OTHER_ERROR),
    SYSTEM_BUZY(10002,ResponseFinal.SYSTEM_BUZY),

    //数据操作
    CREATE_ERR(20002,ResponseFinal.CREATE_ERR),
    UPDATE_ERR(20003,ResponseFinal.UPDATE_ERR),
    DELETE_ERR(20004,ResponseFinal.DELETE_ERR),
    SELECT_ERR(20005,ResponseFinal.SELECT_ERR),

    //数据
    DATA_EXCEPTION(30001,ResponseFinal.DATA_EXCEPTION),
    DATA_ERR(30002,ResponseFinal.DATA_ERR),
    DATA_EXIST(30003,ResponseFinal.DATA_EXIST),
    DATA_NOTEXIST(30004,ResponseFinal.DATA_NOTEXIST),
    DATA_MULTIPLE(30005,ResponseFinal.DATA_MULTIPLE),

    //参数
    PARAM_NULL(40000,ResponseFinal.PARAM_NULL),
    PARAM_ERR(40001,ResponseFinal.PARAM_ERR),

    //权限
    AUTH_PASSWORD_ERR(50001,ResponseFinal.AUTH_PASSWORD_ERR),
    AUTH_NOTEXIST(50002,ResponseFinal.AUTH_NOTEXIST),
    SESSION_EXPIRED(50003,ResponseFinal.SESSION_EXPIRED),
    NOTFOUND_USER(50004,ResponseFinal.NOTFOUND_USER),
    NOT_LOGIN(50005,ResponseFinal.NOT_LOGIN),
    LOGIN_ERR(50006,ResponseFinal.LOGIN_ERR),

    //系统
    CLASS_MISMATCH(60001,ResponseFinal.CLASS_MISMATCH),
    CONF_ERR(60002,ResponseFinal.CONF_ERR),
    TOSTR_ERR(60003,ResponseFinal.TOSTR_ERR),

    //通用错误
    CAPTCHE_ERR(70001,ResponseFinal.CAPTCHE_ERR),

    //网络错误
    CONN_ERR(80001,ResponseFinal.CONN_ERR),
    RESP_CODE(80002,ResponseFinal.RESP_ERR),

    //文件
    FILE_NOTEXIST(90001,ResponseFinal.FILE_NOT_EXIST);

    private Integer code;
    private String message;

    ResponseInfo(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
