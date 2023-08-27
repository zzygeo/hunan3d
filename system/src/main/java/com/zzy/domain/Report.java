package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "report entity", description = "台账报告类")
public class Report extends BaseEntity{
    /**
     * 报告id
     */
    @ApiModelProperty(value = "报告id")
    private Long reportId;
    /**
     * 报告名字
     */
    @ApiModelProperty(value = "报告名字")
    private String reportName;
    /**
     * 报告地址
     */
    @ApiModelProperty(value = "报告地址")
    private String reportUrl;
}
