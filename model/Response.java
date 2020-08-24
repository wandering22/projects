package lliuyi.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.PrintWriter;
import java.io.StringWriter;

@Getter
@Setter
@ToString
public class Response {
    private boolean success;
    private String code;
    private String message;
    private Object data;
    private String stackTrace;

    public static Response error(Exception e) {
        Response response = new Response();
        response.success = true;
        response.code = "200";
        response.message = e.getMessage();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        response.stackTrace = sw.toString();
        return response;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    private Response() {

    }

    //不需要返回数据
    public static Response ok() {
        return ok(null);
    }

    //返回数据，成功响应
    public static Response ok(Object data) {
        Response response = new Response();
        response.success = true;
        response.code = "200";
        response.data = data;
        return response;
    }
}

