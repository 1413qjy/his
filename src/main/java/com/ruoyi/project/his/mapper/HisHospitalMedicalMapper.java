package com.ruoyi.project.his.mapper;


import com.ruoyi.project.his.domain.HisHospitalMedical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
@Mapper
public interface HisHospitalMedicalMapper 
{
    /**
     * 查询【医生】列表
     * 
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalMedical> selectHisHospitalMedicalList(HisHospitalMedical hisHospitalMedical);

    /**
     * 新增【医生信息】
     *
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 结果
     */
    public int insertHisHospitalMedical(HisHospitalMedical hisHospitalMedical);
}
