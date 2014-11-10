package exam.shop.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.shop.dao.*;
import exam.shop.dto.*;
@Component
public class ItemCatalogImpl implements ItemCatalog {
	@Autowired
	private ItemDAOImpl itemDAOImpl;
	
	public void setItemDAOImpl(ItemDAOImpl itemDAOImpl) {
		this.itemDAOImpl = itemDAOImpl;
	}

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemDAOImpl.findAll();
		
		return list;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		System.out.println("Catalog1");
		Item item = itemDAOImpl.findByItemId(itemId);
		System.out.println("Catalog2");
		return item;
	}

}
