
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerBank BusinessPartnerBank} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class BusinessPartnerBankDeleteFluentHelper
    extends FluentHelperDelete<BusinessPartnerBankDeleteFluentHelper, BusinessPartnerBank>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerBank BusinessPartnerBank} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final BusinessPartnerBank entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BusinessPartnerBank BusinessPartnerBank} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     The entity collection to direct the update requests to.
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The BusinessPartnerBank to delete from the endpoint.
     */
    public BusinessPartnerBankDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final BusinessPartnerBank entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected BusinessPartnerBank getEntity() {
        return entity;
    }

}
