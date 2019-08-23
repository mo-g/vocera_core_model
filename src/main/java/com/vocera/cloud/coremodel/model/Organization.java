/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vocera.cloud.coremodel.constants.Constraints;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Entity for Organization.
 * References to @{@link Admin} and @{@link Affiliation}.
 *
 * @author Rohit Phatak
 */
@Entity
@Table(
        name = "organization",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"name", "health_system_name"},
                        name = Constraints.UK_NAME_HEALTH_SYSTEM_NAME
                ),
                @UniqueConstraint(
                        columnNames = "license_key",
                        name = Constraints.UK_LICENSE_KEY
                )
        }
)
@SequenceGenerator(name = "federation_gen", sequenceName = "organization_sequence", allocationSize = 1)
public class Organization extends BaseEntity {
    /**
     * This is the Name of Organization
     */
    @NotBlank(message = "Please enter a valid Organization Name")
    private String name;

    @Column(name = "health_system_name")
    @NotBlank(message = "Please enter a valid Health System Name")
    private String healthSystemName;

    @Column(name = "license_key")
    @NotBlank(message = "Please enter a valid license key")
    private String licenseKey;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id", foreignKey = @ForeignKey(name = Constraints.FK_ADMIN))
    private Admin admin;

    @Column(name = "active", nullable = false)
    private Boolean active = true;

    @Column(name = "address_line1")
    @NotBlank(message = "Please enter a valid Address")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @NotBlank(message = "Please enter a valid City Name")
    private String city;

    @NotBlank(message = "Please enter a valid State")
    private String state;

    @NotBlank(message = "Please enter a valid Domain name.")
    private String domain;

    @JsonIgnore
    @OneToMany(mappedBy = "affiliationFrom")
    private List<Affiliation> affiliations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthSystemName() {
        return healthSystemName;
    }

    public void setHealthSystemName(String healthSystemName) {
        this.healthSystemName = healthSystemName;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<Affiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
