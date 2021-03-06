package exam.shop.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.shop.dto.*;
@Component
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ItemCatalog itemCatalog;
	@Autowired
	private UserCatalog userCatalog;
	
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemCatalog.getItemList();
		
		return list;
	}
	public void setUserCatalog(UserCatalog userCatalog) {
		this.userCatalog = userCatalog;
	}
	
	@Override
	public Item getItemByItemId(int itemId) {
		System.out.println("Service");
		Item item = itemCatalog.getItemByItemId(itemId);
		System.out.println("Service2");
		return item;
	}

	@Override
	public User getUserByUserId(String UserId, String userPwd) {
		return null;
	}

	@Override
	public void registerUser(User user) {
		userCatalog.registerUser(user);
	}

}
