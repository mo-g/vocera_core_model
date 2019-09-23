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
     * Affiliation revoke is successful where revoke is initialized by organization_from.
     * Both organizations are no longer affiliated with each other.
     */
    REVOKED_FROM("REVOKED_FROM"),

    /**
     * Affiliation revoke is successful where revoke is initialized by organization_from.
     * Both organizations are no longer affiliated with each other.
     */
    REVOKED_TO("REVOKED_TO"),

    /**
     * Organization has been Unregistered from the affiliation network.
     * For the affiliation this unregister is performed from the organization which has initiated a request for
     * affiliation.
     */
    UNREGISTERED_FROM("UNREGISTERED_FROM"),

    /**
     * Organization has been Unregistered from the affiliation network.
     * For the affiliation this unregister is performed from the organization which has been sent an affiliation request
     */
    UNREGISTERED_TO("UNREGISTERED_TO"),

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
