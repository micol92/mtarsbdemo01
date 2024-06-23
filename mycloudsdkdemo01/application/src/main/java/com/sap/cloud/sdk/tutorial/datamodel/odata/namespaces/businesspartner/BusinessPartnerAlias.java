
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BusinessPartnerAliasField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerAliasSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Additional Names<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerAliasType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerAlias
    extends VdmEntity<BusinessPartnerAlias>
{

    /**
     * Selector for all available fields of BusinessPartnerAlias.
     * 
     */
    public final static BusinessPartnerAliasSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartner")
    @JsonProperty("BusinessPartner")
    @Nullable
    @ODataField(odataName = "BusinessPartner")
    private String businessPartner;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartner</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAliasField<String> BUSINESS_PARTNER = new BusinessPartnerAliasField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BPAliasPositionNumber</b></p>
     * 
     * @return
     *     Items with Business Partner Name/Alias
     */
    @Key
    @SerializedName("BPAliasPositionNumber")
    @JsonProperty("BPAliasPositionNumber")
    @Nullable
    @ODataField(odataName = "BPAliasPositionNumber")
    private String bPAliasPositionNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPAliasPositionNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAliasField<String> BP_ALIAS_POSITION_NUMBER = new BusinessPartnerAliasField<String>("BPAliasPositionNumber");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>BusinessPartnerAliasName</b></p>
     * 
     * @return
     *     Business Partner Alias
     */
    @SerializedName("BusinessPartnerAliasName")
    @JsonProperty("BusinessPartnerAliasName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerAliasName")
    private String businessPartnerAliasName;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerAliasName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAliasField<String> BUSINESS_PARTNER_ALIAS_NAME = new BusinessPartnerAliasField<String>("BusinessPartnerAliasName");

    @Nonnull
    @Override
    public Class<BusinessPartnerAlias> getType() {
        return BusinessPartnerAlias.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @param businessPartner
     *     Business Partner Number
     */
    public void setBusinessPartner(
        @Nullable
        final String businessPartner) {
        rememberChangedField("BusinessPartner", this.businessPartner);
        this.businessPartner = businessPartner;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BPAliasPositionNumber</b></p>
     * 
     * @param bPAliasPositionNumber
     *     Items with Business Partner Name/Alias
     */
    public void setBPAliasPositionNumber(
        @Nullable
        final String bPAliasPositionNumber) {
        rememberChangedField("BPAliasPositionNumber", this.bPAliasPositionNumber);
        this.bPAliasPositionNumber = bPAliasPositionNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>BusinessPartnerAliasName</b></p>
     * 
     * @param businessPartnerAliasName
     *     Business Partner Alias
     */
    public void setBusinessPartnerAliasName(
        @Nullable
        final String businessPartnerAliasName) {
        rememberChangedField("BusinessPartnerAliasName", this.businessPartnerAliasName);
        this.businessPartnerAliasName = businessPartnerAliasName;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerAlias";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPAliasPositionNumber", getBPAliasPositionNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPAliasPositionNumber", getBPAliasPositionNumber());
        values.put("BusinessPartnerAliasName", getBusinessPartnerAliasName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("BPAliasPositionNumber")) {
                final Object value = values.remove("BPAliasPositionNumber");
                if ((value == null)||(!value.equals(getBPAliasPositionNumber()))) {
                    setBPAliasPositionNumber(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerAliasName")) {
                final Object value = values.remove("BusinessPartnerAliasName");
                if ((value == null)||(!value.equals(getBusinessPartnerAliasName()))) {
                    setBusinessPartnerAliasName(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >BusinessPartnerAliasField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerAliasField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >BusinessPartnerAliasField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerAliasField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public Destination getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final Destination destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (com.sap.cloud.sdk.tutorial.datamodel.odata.services.BusinessPartnerService.DEFAULT_SERVICE_PATH);
    }

}
