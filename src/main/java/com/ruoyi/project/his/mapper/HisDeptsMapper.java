package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDepts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisDeptsMapper {
    
    /**
     * 简述
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  14:27
     * @param hisDepts   
     * @return {@link java.util.List<com.ruoyi.project.his.domain.HisDepts> }
     *
     */
    List<HisDepts> selectDeptsList(HisDepts hisDepts);

    int deleteDeptsById(Long deptsid);

    int insertHisDepts(HisDepts hisDepts);

    int updateDeptsNum(Long deptsid);
}
