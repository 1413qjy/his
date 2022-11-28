package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.mapper.HisDeptsCareMapper;
import com.ruoyi.project.his.mapper.HisDeptsMapper;
import com.ruoyi.project.his.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IHisDeptsServicelmpl implements IHisDeptsService {

    @Autowired
    private HisDeptsMapper hisDeptsMapper;
    @Autowired
    private HisDeptsCareMapper hisDeptsCareMapper;

    @Override
    public List<HisDepts> selectDeptsList(HisDepts hisDepts) {
        return hisDeptsMapper.selectDeptsList(hisDepts);
    }

    @Override
    public int deleteDeptsById(Long deptsid) {
        return hisDeptsMapper.deleteDeptsById(deptsid);
    }

    /**
     * 简述 这是添加科室的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:32
     * @param hisDepts
     * @return {@link int }
     *
     */
    @Override
    public int insertHisDepts(HisDepts hisDepts) {
        return hisDeptsMapper.insertHisDepts(hisDepts);
    }

    /**
     * 简述 这是查询详细科室信息的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:37
     * @param deptsId
     * @return {@link List< HisDeptsCare> }
     *
     */
    @Override
    public List<HisDeptsCare> selectDeptsCareById(Long deptsId) {
        return hisDeptsCareMapper.selectHisDeptsCareById(deptsId);
    }

    @Override
    public List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare) {
        return hisDeptsCareMapper.selectHisDeptsCareList(hisDeptsCare);
    }

}
