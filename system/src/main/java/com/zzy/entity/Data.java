package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzy.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("data")
@ApiModel(value = "Data对象", description = "")
public class Data extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "data_id", type = IdType.AUTO)
    private Long dataId;

    @ApiModelProperty("数据名称")
    @TableField("data_name")
    private String dataName;

    @ApiModelProperty("数据封面图片地址")
    @TableField("cover")
    private String cover;

    @ApiModelProperty("数据地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("文件md5标识符")
    @TableField("md5_str")
    private String md5Str;

    @ApiModelProperty("数据类型，即文件拓展名")
    @TableField("data_type")
    private String dataType;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
