package com.zzy.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class LinePoint implements Serializable {
    private static final Long serialVersionUID = 1L;
    /**
     * 线路id
     */
    private Long lineId;
    /**
     * 点id
     */
    private Long pointId;
}
