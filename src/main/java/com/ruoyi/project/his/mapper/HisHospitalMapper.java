package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisHospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HisHospitalMapper {

    List<HisHospital> selectHospitalList(HisHospital hisHospital,@Param("userid") Integer userid);

    List<HisHospital> selectHospitalAllList(HisHospital hisHospital);


}
