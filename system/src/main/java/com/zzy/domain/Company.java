package com.zzy.domain;

import lombok.Data;

@Data
public class Company extends BaseEntity{
    /**
     * 公司id
     */
    private Long companyId;
    /**
     * 公司名称
     */
    private Long companyName;
}
