package com.xyueji.coldeye.common.job.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xyueji.coldeye.common.constant.TConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务日志
 *
 */
@TableName(TConstants.SCHEDULE_JOB_LOG)
public class ScheduleJobLogEntity {

	/**
	 * 日志id
	 */
	@TableId
	private Long logId;

	/**
	 * 任务id
	 */
	private Long jobId;

	/**
	 * spring bean名称
	 */
	private String beanName;

	/**
	 * 参数
	 */
	private String params;

	/**
	 * 任务状态    0：成功    1：失败
	 */
	private Integer status;

	/**
	 * 失败信息
	 */
	private String error;

	/**
	 * 耗时(单位：毫秒)
	 */
	private Integer times;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
