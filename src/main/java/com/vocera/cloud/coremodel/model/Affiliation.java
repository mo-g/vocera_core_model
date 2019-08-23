/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.model;

import com.vocera.cloud.coremodel.constants.AffiliationStatus;
import com.vocera.cloud.coremodel.constants.Constraints;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


/**
 * Entity for Affiliating multiple organizations.
 *
 * @author Rohit Phatak
 */
@Entity
@SequenceGenerator(name = "federation_gen", sequenceName = "affiliation_sequence", allocationSize = 1)
public class Affiliation extends BaseEntity {

    /**
     * Organization which is requesting affiliation.
     */
    @ManyToOne
    @JoinColumn(name = "affiliation_from", foreignKey = @ForeignKey(name = Constraints.FK_AFFILIATED_FROM))
    private Organization affiliationFrom;

    /**
     * Organization which is supposed to be Affiliated.
     */
    @ManyToOne
    @JoinColumn(name = "affiliation_with", foreignKey = @ForeignKey(name = Constraints.FK_AFFILIATED_WITH))
    private Organization affiliationWith;

    /**
     * Admin from the requesting organization.
     */
    @ManyToOne
    @JoinColumn(name = "requested_by", foreignKey = @ForeignKey(name = Constraints.FK_REQUESTED_BY))
    private Admin requestedBy;

    /**
     * Admin from Organization to be Affiliated.
     * Responsible for taking the respective action for the affiliation request.
     */
    @ManyToOne
    @JoinColumn(name = "actioned_by", foreignKey = @ForeignKey(name = Constraints.FK_ACTIONED_BY))
    private Admin actionedBy;

    /**
     * State of Affiliation.
     */
    @Enumerated(EnumType.STRING)
    private AffiliationStatus status;

    public Organization getAffiliationFrom() {
        return affiliationFrom;
    }

    public void setAffiliationFrom(Organization affiliationFrom) {
        this.affiliationFrom = affiliationFrom;
    }

    public Organization getAffiliationWith() {
        return affiliationWith;
    }

    public void setAffiliationWith(Organization affiliationWith) {
        this.affiliationWith = affiliationWith;
    }

    public Admin getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(Admin requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Admin getActionedBy() {
        return actionedBy;
    }

    public void setActionedBy(Admin actionedBy) {
        this.actionedBy = actionedBy;
    }

    public AffiliationStatus getStatus() {
        return status;
    }

    public void setStatus(AffiliationStatus status) {
        this.status = status;
    }
}
