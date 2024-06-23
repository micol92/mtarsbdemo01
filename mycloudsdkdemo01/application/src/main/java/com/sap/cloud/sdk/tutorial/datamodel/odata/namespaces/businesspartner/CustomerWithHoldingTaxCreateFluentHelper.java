
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class CustomerWithHoldingTaxCreateFluentHelper
    extends FluentHelperCreate<CustomerWithHoldingTaxCreateFluentHelper, CustomerWithHoldingTax>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity object that will be created in the S/4HANA system.
     * 
     */
    private final CustomerWithHoldingTax entity;

    /**
     * Creates a fluent helper object that will create a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The CustomerWithHoldingTax to create.
     */
    public CustomerWithHoldingTaxCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CustomerWithHoldingTax entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CustomerWithHoldingTax getEntity() {
        return entity;
    }

}