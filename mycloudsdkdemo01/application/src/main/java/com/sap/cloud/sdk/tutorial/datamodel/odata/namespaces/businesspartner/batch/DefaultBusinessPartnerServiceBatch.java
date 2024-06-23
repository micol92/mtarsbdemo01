
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.batch;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.batch.BatchFluentHelperBasic;


/**
 * Default implementation of the {@link BusinessPartnerServiceBatch} interface exposed in the {@link com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService BusinessPartnerService}, allowing you to create multiple changesets and finally execute the batch request.
 * 
 */
public class DefaultBusinessPartnerServiceBatch
    extends BatchFluentHelperBasic<BusinessPartnerServiceBatch, BusinessPartnerServiceBatchChangeSet>
    implements BusinessPartnerServiceBatch
{

    @Nonnull
    private final com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService service;
    @Nonnull
    private final String servicePath;

    /**
     * Creates a new instance of this DefaultBusinessPartnerServiceBatch.
     * 
     * @param service
     *     The service to execute all operations in this changeset on.
     */
    public DefaultBusinessPartnerServiceBatch(
        @Nonnull
        final com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService service) {
        this(service, com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService.DEFAULT_SERVICE_PATH);
    }

    /**
     * Creates a new instance of this DefaultBusinessPartnerServiceBatch.
     * 
     * @param service
     *     The service to execute all operations in this changeset on.
     * @param servicePath
     *     The custom service path to operate on.
     */
    public DefaultBusinessPartnerServiceBatch(
        @Nonnull
        final com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService service,
        @Nonnull
        final String servicePath) {
        this.service = service;
        this.servicePath = servicePath;
    }

    @Nonnull
    @Override
    protected String getServicePathForBatchRequest() {
        return servicePath;
    }

    @Nonnull
    @Override
    protected DefaultBusinessPartnerServiceBatch getThis() {
        return this;
    }

    @Nonnull
    @Override
    public BusinessPartnerServiceBatchChangeSet beginChangeSet() {
        return new DefaultBusinessPartnerServiceBatchChangeSet(this, service);
    }

}
