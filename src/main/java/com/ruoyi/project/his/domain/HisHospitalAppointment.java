package com.ruoyi.project.his.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_hospital_appointment
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
public class HisHospitalAppointment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long appointmentId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hostName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hostPhone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String petName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String petAge;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hospitalId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deptsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date appointmentTime;

    public void setAppointmentId(Long appointmentId) 
    {
        this.appointmentId = appointmentId;
    }

    public Long getAppointmentId() 
    {
        return appointmentId;
    }
    public void setHostName(String hostName) 
    {
        this.hostName = hostName;
    }

    public String getHostName() 
    {
        return hostName;
    }
    public void setHostPhone(String hostPhone) 
    {
        this.hostPhone = hostPhone;
    }

    public String getHostPhone() 
    {
        return hostPhone;
    }
    public void setPetName(String petName) 
    {
        this.petName = petName;
    }

    public String getPetName() 
    {
        return petName;
    }
    public void setPetAge(String petAge) 
    {
        this.petAge = petAge;
    }

    public String getPetAge() 
    {
        return petAge;
    }
    public void setHospitalId(Long hospitalId) 
    {
        this.hospitalId = hospitalId;
    }

    public Long getHospitalId() 
    {
        return hospitalId;
    }
    public void setDeptsId(Long deptsId) 
    {
        this.deptsId = deptsId;
    }

    public Long getDeptsId() 
    {
        return deptsId;
    }
    public void setAppointmentTime(Date appointmentTime) 
    {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentTime() 
    {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("appointmentId", getAppointmentId())
            .append("hostName", getHostName())
            .append("hostPhone", getHostPhone())
            .append("petName", getPetName())
            .append("petAge", getPetAge())
            .append("hospitalId", getHospitalId())
            .append("deptsId", getDeptsId())
            .append("appointmentTime", getAppointmentTime())
            .toString();
    }
}
