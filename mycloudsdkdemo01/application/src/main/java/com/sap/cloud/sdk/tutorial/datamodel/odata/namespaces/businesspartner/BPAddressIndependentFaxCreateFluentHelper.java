
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddressIndependentFax BPAddressIndependentFax} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class BPAddressIndependentFaxCreateFluentHelper
    extends FluentHelperCreate<BPAddressIndependentFaxCreateFluentHelper, BPAddressIndependentFax>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddressIndependentFax BPAddressIndependentFax} entity object that will be created in the S/4HANA system.
     * 
     */
    private final BPAddressIndependentFax entity;

    /**
     * Creates a fluent helper object that will create a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPAddressIndependentFax BPAddressIndependentFax} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The BPAddressIndependentFax to create.
     */
    public BPAddressIndependentFaxCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final BPAddressIndependentFax entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected BPAddressIndependentFax getEntity() {
        return entity;
    }

}
