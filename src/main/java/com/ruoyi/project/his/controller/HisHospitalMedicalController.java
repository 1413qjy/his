package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.his.domain.HisHospitalMedical;
import com.ruoyi.project.his.domain.HisPost;
import com.ruoyi.project.his.service.IHisHospitalMedicalService;
import com.ruoyi.project.his.utils.MinioUtilS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
@RestController
@Slf4j
@RequestMapping("/his/medical")
public class HisHospitalMedicalController extends BaseController
{
    @Autowired
    private IHisHospitalMedicalService hisHospitalMedicalService;
    @Autowired
    private MinioUtilS minioUtilS;
    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;

    /**
     * 查询【医生】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisHospitalMedical hisHospitalMedical)
    {
        startPage();
        List<HisHospitalMedical> list = hisHospitalMedicalService.selectHisHospitalMedicalList(hisHospitalMedical);
        return getDataTable(list);
    }

    /**
     * 新增【医生信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:add')")
    @Log(title = "新增【医生信息】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisHospitalMedical hisHospitalMedical)
    {
        return toAjax(hisHospitalMedicalService.insertHisHospitalMedical(hisHospitalMedical));
    }

    /**
     * 查询【职位】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:post:list')")
    @GetMapping("/postList")
    public TableDataInfo postList(HisPost hisPost)
    {
        startPage();
        List<HisPost> list = hisHospitalMedicalService.selectHisPostList(hisPost);
        return getDataTable(list);
    }


    /**
     * 上传图片的方法
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public Object upload(MultipartFile file){
        List<String> upload = minioUtilS.upload(new MultipartFile[]{file});
        return address+"/"+bucketName+"/"+upload.get(0);
    }
}
