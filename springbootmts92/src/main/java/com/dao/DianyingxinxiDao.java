package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DianyingxinxiEntity;
import com.entity.view.DianyingxinxiView;
import com.entity.vo.DianyingxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 电影信息
 * 
 * @author 
 * @email 
 * @date 2021-04-29 07:29:02
 */
public interface DianyingxinxiDao extends BaseMapper<DianyingxinxiEntity> {
	
	List<DianyingxinxiVO> selectListVO(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	DianyingxinxiVO selectVO(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	List<DianyingxinxiView> selectListView(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);

	List<DianyingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
	DianyingxinxiView selectView(@Param("ew") Wrapper<DianyingxinxiEntity> wrapper);
	
}
