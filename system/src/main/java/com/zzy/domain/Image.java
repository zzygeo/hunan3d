package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "image entity", description = "全景图类s")
public class Image extends BaseEntity{
    /**
     * 全景图id
     */
    @ApiModelProperty(value = "全景图id")
    private Long imageId;
    /**
     * 全景图名称
     */
    @ApiModelProperty(value = "全景图名称")
    private String imageName;
    /**
     * 全景图地址
     */
    @ApiModelProperty(value = "全景图地址")
    private String imageUrl;
}
