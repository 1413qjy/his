package com.ruoyi.project.his.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.service.IHisHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/his/hospital")
public class HisHospitalController extends BaseController {

    @Autowired
    private IHisHospitalService HisHospitalService;

//    @PreAuthorize("@ss.hasPermi('his:depts:list')")
    @GetMapping("/list{userid}")
    public TableDataInfo list(@PathVariable(value = "userid") Integer userid){
//        System.out.println(userid);
        if(userid == 1){
            startPage();
            List<HisHospital> list = HisHospitalService.selectHospitalAllList(new HisHospital());
            return getDataTable(list);
        }
        startPage();
        List<HisHospital> list = HisHospitalService.selectHospitalList(new HisHospital(),userid);
        return getDataTable(list);
    }
}
