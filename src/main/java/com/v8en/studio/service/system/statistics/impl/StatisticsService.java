package com.v8en.studio.service.system.statistics.impl;

import java.util.List;
import javax.annotation.Resource;

import com.v8en.studio.entity.Page;
import com.v8en.studio.service.system.statistics.StatisticsManager;
import org.springframework.stereotype.Service;
import com.v8en.studio.dao.DaoSupport;
import com.v8en.studio.util.PageData;

/** 
 * 说明： 访问统计
 * 创建人：Simon
 * 创建时间：2017-06-27
 * @version
 */
@Service("statisticsService")
public class StatisticsService implements StatisticsManager {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("StatisticsMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("StatisticsMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("StatisticsMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("StatisticsMapper.datalistPage", page);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> grlist(Page page)throws Exception{
		return (List<PageData>)dao.findForList("StatisticsMapper.grdatalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("StatisticsMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("StatisticsMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("StatisticsMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

