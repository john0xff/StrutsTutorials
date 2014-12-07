package com.mkyong.user.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

/**
 * XML equivalent
 * <pre>
 * <package name="user" namespace="/User" extends="struts-default">
   		<action name="Welcome" class="com.mkyong.user.action.WelcomeUserAction">
			<result name="SUCCESS">pages/welcome_user.jsp</result>
   		</action>
	</package>
 * 
 * 
 * @author Bart88
 *
 */
@Namespace("/User")
@ResultPath(value = "/")
public class WelcomeUserAction extends ActionSupport {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Action(value = "Welcome", results = { @Result(name = "success", location = "pages/welcome_user.jsp") })
	public String execute() {

		return SUCCESS;

	}
}