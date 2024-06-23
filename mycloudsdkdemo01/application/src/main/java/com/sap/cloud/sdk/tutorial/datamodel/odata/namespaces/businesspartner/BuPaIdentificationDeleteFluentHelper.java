
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BuPaIdentification BuPaIdentification} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class BuPaIdentificationDeleteFluentHelper
    extends FluentHelperDelete<BuPaIdentificationDeleteFluentHelper, BuPaIdentification>
{

    /**
     * {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BuPaIdentification BuPaIdentification} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final BuPaIdentification entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BuPaIdentification BuPaIdentification} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     The entity collection to direct the update requests to.
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The BuPaIdentification to delete from the endpoint.
     */
    public BuPaIdentificationDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final BuPaIdentification entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected BuPaIdentification getEntity() {
        return entity;
    }

}
