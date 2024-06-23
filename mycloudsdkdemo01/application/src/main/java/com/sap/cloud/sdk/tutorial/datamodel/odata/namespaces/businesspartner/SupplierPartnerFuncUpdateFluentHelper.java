
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class SupplierPartnerFuncUpdateFluentHelper
    extends FluentHelperUpdate<SupplierPartnerFuncUpdateFluentHelper, SupplierPartnerFunc>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final SupplierPartnerFunc entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The SupplierPartnerFunc to take the updated values from.
     */
    public SupplierPartnerFuncUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final SupplierPartnerFunc entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected SupplierPartnerFunc getEntity() {
        return entity;
    }

}
