package cn.e3mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		//����������ѯ 
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		return tbItem;
		
//		TbItemExample example = new TbItemExample();
//		Criteria criteria = example.createCriteria();
//		//���ò�ѯ����
//		criteria.andIdEqualTo(itemId);
//		//ִ�в�ѯ
//		List<TbItem> list = itemMapper.selectByExample(example);
//		if (list != null && list.size()>0) {
//			return list.get(0);
//		}
//		return null;
	}

	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		return null;
	}

}
