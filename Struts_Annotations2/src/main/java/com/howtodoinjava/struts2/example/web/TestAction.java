package com.howtodoinjava.struts2.example.web;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/default")
@ResultPath(value="/")
@Results({
	   @Result(name="success", location="WEB-INF/jsp/success.jsp"),
	   @Result(name="input", location="WEB-INF/jsp/index.jsp")
})
public class TestAction extends ActionSupport 
{
	private static final long serialVersionUID = 1L;

	private String name;

    private Date nowDate;

    @Override
    public void validate(){
        if (name==null || name.length()==0)
            addActionError(getText("error.enter.message"));
    }
    
    @Actions({
        @Action("/"),
        @Action("/test")
    })
    @Override
    public String execute() throws Exception {
        nowDate = new Date();
        return ActionSupport.SUCCESS;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNowDate() {
        return nowDate;
    }
}
