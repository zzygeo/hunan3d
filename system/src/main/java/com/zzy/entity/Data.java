package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
 * @since 2023-10-11
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("data")
@ApiModel(value = "Data对象", description = "")
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("数据id")
    @TableId("data_id")
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

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("创建者")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("更新者")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
