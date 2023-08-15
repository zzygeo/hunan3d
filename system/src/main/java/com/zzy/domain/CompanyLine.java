package com.zzy.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class CompanyLine implements Serializable {
    private static final Long serialVersionUID = 1L;
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 线路id
     */
    private Long lineId;
}
