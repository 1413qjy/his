package com.ruoyi.project.his.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_depts
 * 
 * @author ruoyi
 * @date 2022-11-09
 */
public class HisDepts extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    private Long hospitalId;


    /** 科室编号---deptsld */
    @Excel(name = "科室编号---deptsld")
    private Long deptsId;

    /** 科室名称---deptsName */
    @Excel(name = "科室名称---deptsName")
    private String deptsName;

    /** 科室编码---deptsCode */
    @Excel(name = "科室编码---deptsCode")
    private String deptsCode;

    /** 科室挂号量---deptsNum */
    @Excel(name = "科室挂号量---deptsNum")
    private Long deptsNum;

    /** 科室领导---deptsLeader */
    @Excel(name = "科室领导---deptsLeader")
    private String deptsLeader;

    /** 科室电话---deptsPhone */
    @Excel(name = "科室电话---deptsPhone")
    private String deptsPhone;

    /** 科室状态---status */
    @Excel(name = "科室状态---status")
    private Long status;

    public void setDeptsId(Long deptsId) 
    {
        this.deptsId = deptsId;
    }

    public Long getDeptsId() 
    {
        return deptsId;
    }
    public void setDeptsName(String deptsName) 
    {
        this.deptsName = deptsName;
    }

    public String getDeptsName() 
    {
        return deptsName;
    }
    public void setDeptsCode(String deptsCode) 
    {
        this.deptsCode = deptsCode;
    }

    public String getDeptsCode() 
    {
        return deptsCode;
    }
    public void setDeptsNum(Long deptsNum) 
    {
        this.deptsNum = deptsNum;
    }

    public Long getDeptsNum() 
    {
        return deptsNum;
    }
    public void setDeptsLeader(String deptsLeader) 
    {
        this.deptsLeader = deptsLeader;
    }

    public String getDeptsLeader() 
    {
        return deptsLeader;
    }
    public void setDeptsPhone(String deptsPhone) 
    {
        this.deptsPhone = deptsPhone;
    }

    public String getDeptsPhone() 
    {
        return deptsPhone;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deptsId", getDeptsId())
            .append("deptsName", getDeptsName())
            .append("deptsCode", getDeptsCode())
            .append("deptsNum", getDeptsNum())
            .append("deptsLeader", getDeptsLeader())
            .append("deptsPhone", getDeptsPhone())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
                .append("hospitalId",getHospitalId())
            .toString();
    }
}
