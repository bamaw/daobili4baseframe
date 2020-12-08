package com.daobili.core.web.response;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author bamaw
 * @Date 2020-12-08  21:22
 * @Description 公共响应类
 */
public class Response<T> implements Serializable {


    /**
     * 成功或者失败的code错误码
     */
    private Integer code;

    /**
     * 请求失败返回的提示信息，给前端进行页面展示的信息
     */
    private String message;

    /**
     * 成功时返回的数据，失败时返回具体的异常信息
     */
    private T data;



    public Response() {

    }

    /**
     * 成功返回信息
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(){
        return response(ResponseInfo.SUCCESS);
    }

    /**
     * 成功返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T data){
        Response<T> resp = new Response<>();
        resp.setCode(ResponseInfo.SUCCESS.getCode());
        resp.setMessage(ResponseInfo.SUCCESS.getMessage());
        resp.setData(data);
        return resp;
    }

    /**
     * 成功返回,自定义返回消息
     * @param data
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T data, String msg){
        return response(ResponseInfo.SUCCESS.getCode(),msg,data);
    }

    /**
     * 失败返回信息
     * @param <T>
     * @return
     */
    public static <T> Response<T> faile(){
        return response(ResponseInfo.FAILE);
    }

    /**
     * 失败返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> faile(T data){
        return response(ResponseInfo.FAILE,data);
    }


    public static <T> Response<T> successMsg(String msg){
        Response<T> response =  response(ResponseInfo.SUCCESS);
        response.setMessage(msg);
        return response;
    }

    public static <T> Response<T> faileMsg(String msg){
        Response<T> response =  faileMsg(msg,ResponseInfo.OTHER_ERROR);
        return response;
    }

    public static <T> Response<T> faileMsg(String msg, Enum e){
        Response<T> response =  response(e);
        response.setMessage(response.getMessage()+":["+msg+"]");
        return response;
    }

    public static <T> Response<T> response(Integer code, String message, T data) {
        Response<T> resp = new Response<T>();
        resp.code = code;
        resp.message = message;
        resp.data = data;
        return resp;
    }

    public static <T> Response<T> response(Response resp) {
        resp.setData(null);
        return resp;
    }

    public static <T> Response<T> response(Integer code, String message){
        Response<T> resp = new Response<T>();
        resp.code = code;
        resp.message = message;
        return resp;
    }

    public static <T> Response<T> response(Enum e) {
        try {
            Class<? extends Enum> cls = e.getClass();
            Integer getCode = (Integer) cls.getMethod("getCode", null).invoke(e, null);
            String getMessage = (String) cls.getMethod("getMessage", null).invoke(e, null);
            return response(getCode,getMessage);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException e1) {
            e1.printStackTrace();
        }
        return response(ResponseInfo.ENUM_ERR);
    }

    public static <T> Response<T> response(Enum e, T data) {
        Response<T> resp = response(e);
        resp.data=data;
        return resp;
    }


    public boolean resSuccess(){
        return this.code.equals(ResponseInfo.SUCCESS.getCode());
    }
    public boolean resUnconfirmed(){
        return this.code.equals(ResponseInfo.UNCONFIRMED.getCode());
    }

    public boolean isSuccessful(){
        return this.code.equals(ResponseInfo.SUCCESS.getCode())&&null!=data;
    }

    public static Response getInstance() {
        return new Response();
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
        if(null!=message) {
            this.message = message;
        }
    }

    /**
     * @return
     * @see #get()
     */
    @Deprecated
    public T getData() {
        return data;
    }

    public T get() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
