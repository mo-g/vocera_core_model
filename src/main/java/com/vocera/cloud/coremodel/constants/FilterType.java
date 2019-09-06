/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.constants;

/**
 * Enum for filtering through organizations.
 *
 * @author Rohit Phatak
 */
public enum FilterType {
    ALL("all"),

    /**
     * Organizations whom an affiliation request can be sent.
     */
    UNAFFILIATED("unaffiliated"),

    /**
     * Organizations which are affiliates to a particular organization.
     */
    AFFILIATES("affiliates"),

    /**
     * Organizations which have sent an affiliation request to my organization or
     * those organizations who have been requested affiliation from my organization.
     */
    ACTIVE_REQUESTS("active_requests");

    private final String name;

    FilterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}