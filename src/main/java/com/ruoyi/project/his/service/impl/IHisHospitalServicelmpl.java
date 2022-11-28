package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.mapper.HisHospitalMapper;
import com.ruoyi.project.his.service.IHisHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IHisHospitalServicelmpl implements IHisHospitalService {

    @Autowired
    private HisHospitalMapper hisHospitalMapper;

    @Override
    public List<HisHospital> selectHospitalList(HisHospital hisHospital, Integer userid) {
        return hisHospitalMapper.selectHospitalList(hisHospital,userid);
    }

    @Override
    public List<HisHospital> selectHospitalAllList(HisHospital hisHospital) {
        return hisHospitalMapper.selectHospitalAllList(hisHospital);
    }
}
