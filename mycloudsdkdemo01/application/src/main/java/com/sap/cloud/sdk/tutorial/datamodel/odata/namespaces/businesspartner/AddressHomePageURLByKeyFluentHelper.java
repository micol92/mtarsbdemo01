
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.AddressHomePageURLSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.AddressHomePageURL AddressHomePageURL} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class AddressHomePageURLByKeyFluentHelper
    extends FluentHelperByKey<AddressHomePageURLByKeyFluentHelper, AddressHomePageURL, AddressHomePageURLSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.AddressHomePageURL AddressHomePageURL} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code AddressHomePageURL}
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param validityStartDate
     *     Valid-from date - in current Release only 00010101 possible<p>Constraints: Not nullable, Precision: 0</p>
     * @param isDefaultURLAddress
     *     Flag: this address is the default address<p>Constraints: Not nullable</p>
     * @param person
     *     Person Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code AddressHomePageURL}
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public AddressHomePageURLByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String addressID, final String person, final String ordinalNumber, final LocalDateTime validityStartDate, final Boolean isDefaultURLAddress) {
        super(servicePath, entityCollection);
        this.key.put("AddressID", addressID);
        this.key.put("Person", person);
        this.key.put("OrdinalNumber", ordinalNumber);
        this.key.put("ValidityStartDate", validityStartDate);
        this.key.put("IsDefaultURLAddress", isDefaultURLAddress);
    }

    @Override
    @Nonnull
    protected Class<AddressHomePageURL> getEntityClass() {
        return AddressHomePageURL.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}