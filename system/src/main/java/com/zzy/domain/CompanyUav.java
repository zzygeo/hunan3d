package com.zzy.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class CompanyUav implements Serializable {
    private static final Long serialVersionUID = 1L;
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 无人机id
     */
    private Long uavId;
}
