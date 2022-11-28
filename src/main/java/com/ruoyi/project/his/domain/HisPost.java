package com.ruoyi.project.his.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HisPost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 职位id */
    private Long postId;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String postName;

    /** 职位挂号金额 */
    @Excel(name = "职位挂号金额")
    private String postSum;

    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }
    public void setPostName(String postName)
    {
        this.postName = postName;
    }

    public String getPostName()
    {
        return postName;
    }
    public void setPostSum(String postSum)
    {
        this.postSum = postSum;
    }

    public String getPostSum()
    {
        return postSum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("postId", getPostId())
                .append("postName", getPostName())
                .append("postSum", getPostSum())
                .toString();
    }
}
