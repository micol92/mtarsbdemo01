
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.selectable.ZDEMOCDS30Selectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ZDEMOCDS30ByKeyFluentHelper
    extends FluentHelperByKey<ZDEMOCDS30ByKeyFluentHelper, ZDEMOCDS30, ZDEMOCDS30Selectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.zdemocds30cdsedmx.ZDEMOCDS30 ZDEMOCDS30} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code ZDEMOCDS30}
     * @param fclt_id
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code ZDEMOCDS30}
     */
    public ZDEMOCDS30ByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String fclt_id) {
        super(servicePath, entityCollection);
        this.key.put("fclt_id", fclt_id);
    }

    @Override
    @Nonnull
    protected Class<ZDEMOCDS30> getEntityClass() {
        return ZDEMOCDS30 .class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}