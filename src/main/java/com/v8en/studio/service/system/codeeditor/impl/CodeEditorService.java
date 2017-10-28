package com.v8en.studio.service.system.codeeditor.impl;

import java.util.List;
import javax.annotation.Resource;

import com.v8en.studio.entity.Page;
import org.springframework.stereotype.Service;
import com.v8en.studio.dao.DaoSupport;
import com.v8en.studio.util.PageData;
import com.v8en.studio.service.system.codeeditor.CodeEditorManager;

/** 
 * 说明： 代码编辑器
 * 创建人：Simon
 * 创建时间：2017-06-11
 * @version
 */
@Service("codeeditorService")
public class CodeEditorService implements CodeEditorManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("CodeEditorMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("CodeEditorMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("CodeEditorMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("CodeEditorMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CodeEditorMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CodeEditorMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("CodeEditorMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

