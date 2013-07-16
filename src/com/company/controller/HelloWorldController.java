/**
 * 
 */
package com.company.controller;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * Copyright ® 2012 Sky Sci.&Tech.Co.,Ltd
 * All right reserved.
 * 项目名称：WebCoreProject   
 * 类名：HelloWorldController.java
 * 类描述：
 * 作者：SuShiting email: sshiting@gmail.com   
 * 创建日期：2013-7-15 下午4:20:13   
 * 修改者：
 * 修改日期：
 * @version    
 */
@Controller
@RemoteProxy
public class HelloWorldController {
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model){
		model.addAttribute("message","Hello World");
		return "index";
	}
	@RequestMapping("/redirect")
	public String print(){
		System.out.println("redirect:index");
		return "redirect:/index.jsp";
	}
	@RemoteMethod
	public String testDwr(){
		System.out.println("dwr testing");
		return "test";
	}
}	

