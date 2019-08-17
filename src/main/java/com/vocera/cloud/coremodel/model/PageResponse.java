/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.model;

import java.util.List;

/**
 * This entity is used as a DTO for any pagination request.
 * Type of the object returned is specified by the generic parameter T.
 *
 * @param <T>
 * @author Rohit Phatak
 */
public class PageResponse<T> {
    private List<T> data;
    private int page;
    private int offset;
    private long totalCount;

    public PageResponse(List<T> data, int page, int offset, long totalCount) {
        this.data = data;
        this.page = page;
        this.offset = offset;
        this.totalCount = totalCount;
    }

    public PageResponse() {
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
