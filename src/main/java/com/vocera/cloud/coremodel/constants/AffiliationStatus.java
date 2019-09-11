/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.constants;

/**
 * Constants @enum for Affiliation states.
 *
 * @author Rohit Phatak
 */
public enum AffiliationStatus {

    /**
     * Affiliation requested from an organization.
     * Request is in an active state to be actioned by organization on the other side.
     */
    ACTIVE_REQUEST("ACTIVE_REQUEST"),

    /**
     * Affiliation request is Accepted by the second organization and Affiliation is successful.
     * Both organizations are successfully affiliated.
     */
    AFFILIATED("AFFILIATED"),

    /**
     * Affiliation request has been declined by the organization.
     */
    REJECTED("REJECTED"),

    /**
     * Affiliation Request raised by an organization has been cancelled by that organization.
     */
    CANCELLED("CANCELLED"),

    /**
     * Affiliation revoke is successful and both organizations are no longer affiliated with each other.
     */
    REVOKED("REVOKED"),

    /**
     * Organization has been Unregistered from the affiliation network.
     */
    UNREGISTERED("UNREGISTERED"),

    /**
     * Organization has been removed using the three dots menu from Active Requests.
     * Organization can be moved to REMOVED state from CANCELLED, REJECTED, REVOKED, UNREGISTERED states.
     */
    REMOVED("REMOVED"),

    /**
     * Not Affiliated.
     */
    NONE("NONE");

    private String status;

    AffiliationStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
