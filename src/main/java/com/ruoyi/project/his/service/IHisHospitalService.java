package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisHospital;
import io.swagger.models.auth.In;

import java.util.List;

public interface IHisHospitalService {

    List<HisHospital> selectHospitalList(HisHospital hisHospital, Integer userid);

    List<HisHospital> selectHospitalAllList(HisHospital hisHospital);

}
