package com.zzy.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class LineTower implements Serializable {
    private static final Long serialVersionUID = 1L;
    /**
     * 线路id
     */
    private Long lineId;
    /**
     * 杆塔id
     */
    private Long towerId;
}
