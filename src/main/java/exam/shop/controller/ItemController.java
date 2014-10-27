package exam.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import exam.shop.dto.Item;
import exam.shop.service.ShopService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	@Autowired
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	// 상품 전체 목록
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem() {
		
		ModelAndView mav = new ModelAndView();
		
		List<Item> listItem = shopService.getItemList();
		
		mav.setViewName("listItem");
		mav.addObject("listItem", listItem);
		
		return mav;
	}
	
	// 상품 상세 페이지
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem(@RequestParam("itemId") int itemId) {
		ModelAndView mvc = new ModelAndView();
		System.out.println("controller1");
		Item item = shopService.getItemByItemId(itemId);
		System.out.println("controller2");
		
		mvc.setViewName("detailItem");
		mvc.addObject("detailItem", item);
		
		return mvc;
	}
}
