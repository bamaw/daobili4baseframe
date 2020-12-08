package com.daobili.core.web.response;

/**
 * @Author bamaw
 * @Date 2020-12-08  21:25
 * @Description 返回具体信息归类
 */
public interface ResponseFinal {

    String ENUM_ERR="枚举类型出错";
    String SUCCESS="操作成功";
    String FAILE="操作失败";
    String UNCONFIRMED="未确认结果";
    String OTHER_ERROR="其他错误";
    String SYSTEM_BUZY="系统繁忙";

    //数据操作
    String CREATE_ERR="创建失败";
    String UPDATE_ERR="更新失败";
    String DELETE_ERR="删除失败";
    String SELECT_ERR="查询失败";

    //数据
    String DATA_EXCEPTION="数据操作异常";
    String DATA_ERR="数据错误";
    String DATA_EXIST="数据已存在";
    String DATA_NOTEXIST="数据不存在";
    String DATA_MULTIPLE="多条数据";

    //参数
    String PARAM_ERR="参数格式错误";
    String PARAM_NULL="参数为空";

    //权限
    String AUTH_PASSWORD_ERR="密码错误";
    String AUTH_NOTEXIST="没有权限";
    String SESSION_EXPIRED="您的会话已过期，请重新登录";
    String NOTFOUND_USER="没有此用户";
    String NOT_LOGIN="未登录";
    String LOGIN_ERR="登录失败";

    //系统
    String CLASS_MISMATCH="类型不匹配";
    String CONF_ERR="配置不正确";
    String TOSTR_ERR="转String异常";

    //通用错误
    String CAPTCHE_ERR="验证码错误";

    //网络错误
    String CONN_ERR="网络连接失败";
    String RESP_ERR="响应码不正确";

    //文件不存在
    String FILE_NOT_EXIST="文件不存在";
}
