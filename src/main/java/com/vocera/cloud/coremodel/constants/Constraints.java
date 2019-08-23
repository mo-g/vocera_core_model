/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.constants;

/**
 * Database constraints.
 *
 * @author Rohit Phatak
 */
public interface Constraints {

    /**
     * Foreign key from @{@link com.vocera.cloud.coremodel.model.Affiliation} to
     * {@link com.vocera.cloud.coremodel.model.Organization} for column affiliation_with.
     */
    String FK_AFFILIATED_WITH = "fk_affiliation_with";

    /**
     * Foreign key from @{@link com.vocera.cloud.coremodel.model.Affiliation} to
     * {@link com.vocera.cloud.coremodel.model.Organization} for column affiliation_from.
     */
    String FK_AFFILIATED_FROM = "fk_affiliation_from";

    /**
     * Foreign key from @{@link com.vocera.cloud.coremodel.model.Affiliation} to
     * {@link com.vocera.cloud.coremodel.model.Admin} for column requested_by.
     */
    String FK_REQUESTED_BY = "fk_requested_by";

    /**
     * Foreign key from @{@link com.vocera.cloud.coremodel.model.Affiliation} to
     * {@link com.vocera.cloud.coremodel.model.Admin} for column actioned_by.
     */
    String FK_ACTIONED_BY = "fk_actioned_by";

    /**
     * Foreign key from @{@link com.vocera.cloud.coremodel.model.Organization} to
     * {@link com.vocera.cloud.coremodel.model.Admin} for column admin.
     */
    String FK_ADMIN = "fk_admin";

    /**
     * Unique key constraint for @{@link com.vocera.cloud.coremodel.model.Organization} on column name and
     * health_system_name.
     */
    String UK_NAME_HEALTH_SYSTEM_NAME = "UK_name_health_system_name";

    /**
     * Unique key constraint for @{@link com.vocera.cloud.coremodel.model.Organization} on column license_key
     */
    String UK_LICENSE_KEY = "UK_license_key";

}
