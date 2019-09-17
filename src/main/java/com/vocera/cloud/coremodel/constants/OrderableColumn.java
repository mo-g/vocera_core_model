/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.constants;

/**
 * Constants for column names which are orderable.
 *
 * @author Rohit Phatak
 */
public enum OrderableColumn {
    NAME("name"),
    HEALTH_SYSTEM_NAME("healthSystemName");
    private final String name;

    private OrderableColumn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
