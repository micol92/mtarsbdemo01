
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddrDepdntIntlLocNumber BPAddrDepdntIntlLocNumber} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class BPAddrDepdntIntlLocNumberUpdateFluentHelper
    extends FluentHelperUpdate<BPAddrDepdntIntlLocNumberUpdateFluentHelper, BPAddrDepdntIntlLocNumber>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddrDepdntIntlLocNumber BPAddrDepdntIntlLocNumber} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final BPAddrDepdntIntlLocNumber entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddrDepdntIntlLocNumber BPAddrDepdntIntlLocNumber} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The BPAddrDepdntIntlLocNumber to take the updated values from.
     */
    public BPAddrDepdntIntlLocNumberUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final BPAddrDepdntIntlLocNumber entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected BPAddrDepdntIntlLocNumber getEntity() {
        return entity;
    }

}