
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.ZonedDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BuPaAddressUsageSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BuPaAddressUsage BuPaAddressUsage} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BuPaAddressUsageByKeyFluentHelper
    extends FluentHelperByKey<BuPaAddressUsageByKeyFluentHelper, BuPaAddressUsage, BuPaAddressUsageSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BuPaAddressUsage BuPaAddressUsage} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code BuPaAddressUsage}
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BuPaAddressUsage}
     * @param validityEndDate
     *     Validity End of a Business Partner Address Usage<p>Constraints: Not nullable, Precision: 0</p>
     * @param addressUsage
     *     Address Type<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public BuPaAddressUsageByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String businessPartner, final ZonedDateTime validityEndDate, final String addressUsage, final String addressID) {
        super(servicePath, entityCollection);
        this.key.put("BusinessPartner", businessPartner);
        this.key.put("ValidityEndDate", validityEndDate);
        this.key.put("AddressUsage", addressUsage);
        this.key.put("AddressID", addressID);
    }

    @Override
    @Nonnull
    protected Class<BuPaAddressUsage> getEntityClass() {
        return BuPaAddressUsage.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
