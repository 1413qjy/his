package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface IHisDeptsService {

    /**
     * 简述 这是查询科室列表的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:32
     * @param hisDepts
     * @return {@link List< HisDepts> }
     *
     */
    List<HisDepts> selectDeptsList(HisDepts hisDepts);

    /**
     * 简述 这是根据科室id删除科室的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:32
     * @param deptsid
     * @return {@link int }
     *
     */
    int deleteDeptsById(Long deptsid);

    /**
     * 简述 这是添加科室的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:32
     * @param hisDepts
     * @return {@link int }
     *
     */
    int insertHisDepts(HisDepts hisDepts);

    /**
     * 简述 这是根据Id查询详细科室信息的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:37
     * @param deptsId
     * @return {@link List< HisDeptsCare> }
     *
     */
    List<HisDeptsCare> selectDeptsCareById(Long deptsId);

    /**
     * 查询【全部科室详细信息】列表
     *
     * @param hisDeptsCare 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare);

}
