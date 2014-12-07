package com.mkyong.user.action;

/**
 * <pre> XML equivalent
 * <package name="user" namespace="/User" extends="struts-default">
 		<action name="Login">
 			<result>pages/login.jsp</result>
 		</action>
 	</package>
 * 
 * 
 */

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value = "/")
@Result(name = "success", location = "pages/login.jsp")
public class LoginAction extends ActionSupport {

}