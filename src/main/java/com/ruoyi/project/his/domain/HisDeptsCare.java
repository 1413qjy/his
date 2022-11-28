package com.ruoyi.project.his.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HisDeptsCare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 科室详细id */
    private Long deptsCareId;

    /** 科室id */
    @Excel(name = "科室id")
    private Long deptsId;

    /** 科室详细名称 */
    @Excel(name = "科室详细名称")
    private String deptsName;

    /** 科室挂号费用 */
    @Excel(name = "科室挂号费用")
    private String deptsSum;

    public void setDeptsCareId(Long deptsCareId)
    {
        this.deptsCareId = deptsCareId;
    }

    public Long getDeptsCareId()
    {
        return deptsCareId;
    }
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
    public void setDeptsSum(String deptsSum)
    {
        this.deptsSum = deptsSum;
    }

    public String getDeptsSum()
    {
        return deptsSum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("deptsCareId", getDeptsCareId())
                .append("deptsId", getDeptsId())
                .append("deptsName", getDeptsName())
                .append("deptsSum", getDeptsSum())
                .toString();
    }
}