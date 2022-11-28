package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDeptsCare;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisDeptsCareMapper {

    /**
     * 查询【查询全部科室详细信息】列表
     *
     * @param hisDeptsCare 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare);

    /**
     * 查询【请填写功能名称】
     *
     * @param deptsId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public List<HisDeptsCare> selectHisDeptsCareById(Long deptsId);
}
