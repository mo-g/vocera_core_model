/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

/**
 * Entity for Admin details.
 * An admin is associated with @{@link Organization}.
 * Organization entity contains foreign key reference to this entity.
 *
 * @author Rohit Phatak
 */
@Entity
@SequenceGenerator(name = "federation_gen", sequenceName = "admin_sequence", allocationSize = 1)
public class Admin extends BaseEntity{

    @NotBlank(message = "Please enter a valid Admin name")
    private String name;
    @NotBlank(message = "Please enter a valid Title")
    private String title;
    @NotBlank(message = "Please enter a valid email")
    private String email;
    @NotBlank(message = "Please enter a valid Phone Number")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
