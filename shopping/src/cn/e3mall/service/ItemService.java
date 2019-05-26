package cn.e3mall.service;

import org.springframework.stereotype.Service;

import cn.e3mall.pojo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;


public interface ItemService {

	public TbItem getItemById(long itemId);
	
	public EasyUIDataGridResult getItemList(Integer page,Integer rows);

}
