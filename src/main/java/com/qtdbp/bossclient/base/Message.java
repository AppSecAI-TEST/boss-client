package com.qtdbp.bossclient.base;

/**
 * 消息
 *
 * @author: caidchen
 * @create: 2017-05-11 11:13
 * To change this template use File | Settings | File Templates.
 */
public class Message {

//    private Boolean isError;//是否是错误信息
    private String errorCode;//错误代码
    private Boolean success;//请求是否成功
    private Boolean isException;//是否抛出异常，抛出异常则success为false，优先级大于success
    private String exName;//异常名称
    private String exDetails;//异常详细信息
    private String message;
    private Object data;
    /****前台分页相关*****/
    /*private Integer totalPage;//总页数
    private Integer totalCount;//总记录数
    private Integer currentPage;//当前页数
    private Integer pageSize;//分页大小
    private List roots;//记录
    private Boolean flag;//操作是否成功
    private Boolean isSessionOut;   //session是否失效标志
    private Map<String,Object> metaData;*/

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getException() {
        return isException;
    }

    public void setException(Boolean exception) {
        isException = exception;
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }

    public String getExDetails() {
        return exDetails;
    }

    public void setExDetails(String exDetails) {
        this.exDetails = exDetails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
