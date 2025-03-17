package action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
    private String message;

    public String execute() {
        message = "Hello, Struts2 with JDK 8!";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }
}