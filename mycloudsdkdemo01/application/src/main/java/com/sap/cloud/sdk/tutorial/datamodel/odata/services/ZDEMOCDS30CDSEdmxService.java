
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.services;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.batch.BatchService;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30ByKeyFluentHelper;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30FluentHelper;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.batch.ZDEMOCDS30CDSEdmxServiceBatch;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>ZDEMOCDS30_CDS.edmx</td></tr></table>
 * 
 */
public interface ZDEMOCDS30CDSEdmxService
    extends BatchService<ZDEMOCDS30CDSEdmxServiceBatch>
{

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/sap/opu/odata/sap/ZDEMOCDS30_CDS";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    ZDEMOCDS30CDSEdmxService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30FluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ZDEMOCDS30FluentHelper getAllZDEMOCDS30();

    /**
     * Fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entity using key fields.
     * 
     * @param fclt_id
     *     
     * @return
     *     A fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30ByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ZDEMOCDS30ByKeyFluentHelper getZDEMOCDS30ByKey(final String fclt_id);

}
