package com.ruoyi.project.his.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.service.IHisDeptsService;
import com.ruoyi.project.system.domain.SysPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/his/depts")
public class HisDeptsController extends BaseController {

    @Autowired
    private IHisDeptsService hisDeptsService;

    /**
     * 简述 这是查询科室列表的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  16:27
     * @param hisDepts
     * @return {@link TableDataInfo }
     *
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDepts hisDepts){
        startPage();
        List<HisDepts> list = hisDeptsService.selectDeptsList(hisDepts);
        return getDataTable(list);
    }

    /**
     * 简述 这是根据Id查询科室详细信息的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  14:28
     * @param deptsId
     * @return {@link TableDataInfo }
     *
     */
//    @PreAuthorize("@ss.hasPermi('his:care:query')")
    @GetMapping("/{deptsId}")
    public TableDataInfo DeptsCareList(@PathVariable("deptsId") Long deptsId){
        startPage();
        List<HisDeptsCare> list = hisDeptsService.selectDeptsCareById(deptsId);
        return getDataTable(list);
    }

    /**
     * 查询【全部详细科室信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('his:care:list')")
    @GetMapping("/listCare")
    public TableDataInfo list(HisDeptsCare hisDeptsCare)
    {
        startPage();
        List<HisDeptsCare> list = hisDeptsService.selectHisDeptsCareList(hisDeptsCare);
        return getDataTable(list);
    }

    /**
     * 简述 这是新增科室的方法
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  16:28
     * @param hisDepts
     * @return {@link AjaxResult }
     *
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:add')")
    @Log(title = "【新增科室】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisDepts hisDepts)
    {
        return toAjax(hisDeptsService.insertHisDepts(hisDepts));
    }

    /**
     * 简述 添加科室
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  11:17
     * @return {@link AjaxResult }
     *
     */
//    @PreAuthorize("@ss.hasPermi('system:post:add')")
//    @Log(title = "岗位管理", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@Validated @RequestBody HisDepts hisDepts)
//    {
//        if (UserConstants.NOT_UNIQUE.equals(postService.checkPostNameUnique(post)))
//        {
//            return AjaxResult.error("新增岗位'" + post.getPostName() + "'失败，岗位名称已存在");
//        }
//        else if (UserConstants.NOT_UNIQUE.equals(postService.checkPostCodeUnique(post)))
//        {
//            return AjaxResult.error("新增岗位'" + post.getPostName() + "'失败，岗位编码已存在");
//        }
//        post.setCreateBy(SecurityUtils.getUsername());
//        return toAjax(postService.insertPost(post));
//    }


}
