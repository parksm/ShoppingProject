package exam.shop.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import exam.shop.dto.User;
import exam.shop.service.ShopService;

@Controller
public class UserController 
{
	@Autowired
	private ShopService shopService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	public void setShopService(ShopService shopService)
	{
		this.shopService = shopService;
	}
	//처음회원가입 링크시
	@RequestMapping(value="/registerUser.shop",method=RequestMethod.GET)
	public String registerForm(ModelMap model)
	{
		model.addAttribute("user",new User());
		return "registerUser";
		
	}
	//회원가입 버튼을 눌렀을때
	@RequestMapping(value="/registerUser.shop",method=RequestMethod.POST)
	public String registerUser(@Valid User user,BindingResult result)
	{
		//회원가입 실패
		if(result.hasErrors())
		{
			return "registerUser";
		}
		//회원가입 성공
		else
		{
			shopService.registerUser(user);
			return "redirect:/listItem.shop";
		}
	}
	@RequestMapping(value="/securityLoginUser.shop")
	public String loginUser(ModelMap model)
	{
		logger.info("loger");
		model.addAttribute("user", new User());
		return "loginUser";
				
	}
	@RequestMapping(value="/loginUserProcess.shop")
	public void loginUserProcess()
	{
		logger.info("loger");				
	}
}
