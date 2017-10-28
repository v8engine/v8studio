package com.v8en.studio.service.web.aboutus.impl;

import java.util.List;
import javax.annotation.Resource;

import com.v8en.studio.entity.Page;
import org.springframework.stereotype.Service;
import com.v8en.studio.dao.DaoSupport;
import com.v8en.studio.util.PageData;
import com.v8en.studio.service.web.aboutus.AboutusManager;

/** 
 * 说明： 关于我们
 * 创建人：Simon
 * 创建时间：2017-01-07
 * @version
 */
@Service("aboutusService")
public class AboutusService implements AboutusManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("AboutusMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("AboutusMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("AboutusMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("AboutusMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("AboutusMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AboutusMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("AboutusMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

