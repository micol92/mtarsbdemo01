
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.CustSlsAreaAddrDepdntInfoSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustSlsAreaAddrDepdntInfo CustSlsAreaAddrDepdntInfo} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CustSlsAreaAddrDepdntInfoByKeyFluentHelper
    extends FluentHelperByKey<CustSlsAreaAddrDepdntInfoByKeyFluentHelper, CustSlsAreaAddrDepdntInfo, CustSlsAreaAddrDepdntInfoSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.CustSlsAreaAddrDepdntInfo CustSlsAreaAddrDepdntInfo} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code CustSlsAreaAddrDepdntInfo}
     * @param servicePath
     *     Service path to be used to fetch a single {@code CustSlsAreaAddrDepdntInfo}
     * @param distributionChannel
     *     Distribution Channel<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Business Partner Address Number (from BUT020)<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public CustSlsAreaAddrDepdntInfoByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String customer, final String salesOrganization, final String distributionChannel, final String division, final String addressID) {
        super(servicePath, entityCollection);
        this.key.put("Customer", customer);
        this.key.put("SalesOrganization", salesOrganization);
        this.key.put("DistributionChannel", distributionChannel);
        this.key.put("Division", division);
        this.key.put("AddressID", addressID);
    }

    @Override
    @Nonnull
    protected Class<CustSlsAreaAddrDepdntInfo> getEntityClass() {
        return CustSlsAreaAddrDepdntInfo.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
