package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DianyingleixingEntity;
import com.entity.view.DianyingleixingView;
import com.entity.vo.DianyingleixingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 电影类型
 * 
 * @author 
 * @email 
 * @date 2021-04-29 07:29:02
 */
public interface DianyingleixingDao extends BaseMapper<DianyingleixingEntity> {
	
	List<DianyingleixingVO> selectListVO(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	DianyingleixingVO selectVO(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	List<DianyingleixingView> selectListView(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);

	List<DianyingleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	DianyingleixingView selectView(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
}
