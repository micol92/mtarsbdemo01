
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BusinessPartnerIsBankField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerIsBankSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Partner is Bank<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerIsBankType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerIsBank
    extends VdmEntity<BusinessPartnerIsBank>
{

    /**
     * Selector for all available fields of BusinessPartnerIsBank.
     * 
     */
    public final static BusinessPartnerIsBankSelectable ALL_FIELDS = () -> "*";
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
    public final static BusinessPartnerIsBankField<String> BUSINESS_PARTNER = new BusinessPartnerIsBankField<String>("BusinessPartner");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>BankKey</b></p>
     * 
     * @return
     *     Bank Keys
     */
    @SerializedName("BankKey")
    @JsonProperty("BankKey")
    @Nullable
    @ODataField(odataName = "BankKey")
    private String bankKey;
    /**
     * Use with available fluent helpers to apply the <b>BankKey</b> field to query operations.
     * 
     */
    public final static BusinessPartnerIsBankField<String> BANK_KEY = new BusinessPartnerIsBankField<String>("BankKey");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BankCountry</b></p>
     * 
     * @return
     *     Bank Country/Region Key
     */
    @SerializedName("BankCountry")
    @JsonProperty("BankCountry")
    @Nullable
    @ODataField(odataName = "BankCountry")
    private String bankCountry;
    /**
     * Use with available fluent helpers to apply the <b>BankCountry</b> field to query operations.
     * 
     */
    public final static BusinessPartnerIsBankField<String> BANK_COUNTRY = new BusinessPartnerIsBankField<String>("BankCountry");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BPMinimumReserve</b></p>
     * 
     * @return
     *     Minimum Reserve Requirement for Bank
     */
    @SerializedName("BPMinimumReserve")
    @JsonProperty("BPMinimumReserve")
    @Nullable
    @ODataField(odataName = "BPMinimumReserve")
    private String bPMinimumReserve;
    /**
     * Use with available fluent helpers to apply the <b>BPMinimumReserve</b> field to query operations.
     * 
     */
    public final static BusinessPartnerIsBankField<String> BP_MINIMUM_RESERVE = new BusinessPartnerIsBankField<String>("BPMinimumReserve");

    @Nonnull
    @Override
    public Class<BusinessPartnerIsBank> getType() {
        return BusinessPartnerIsBank.class;
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
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>BankKey</b></p>
     * 
     * @param bankKey
     *     Bank Keys
     */
    public void setBankKey(
        @Nullable
        final String bankKey) {
        rememberChangedField("BankKey", this.bankKey);
        this.bankKey = bankKey;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BankCountry</b></p>
     * 
     * @param bankCountry
     *     Bank Country/Region Key
     */
    public void setBankCountry(
        @Nullable
        final String bankCountry) {
        rememberChangedField("BankCountry", this.bankCountry);
        this.bankCountry = bankCountry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BPMinimumReserve</b></p>
     * 
     * @param bPMinimumReserve
     *     Minimum Reserve Requirement for Bank
     */
    public void setBPMinimumReserve(
        @Nullable
        final String bPMinimumReserve) {
        rememberChangedField("BPMinimumReserve", this.bPMinimumReserve);
        this.bPMinimumReserve = bPMinimumReserve;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerIsBank";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BankKey", getBankKey());
        values.put("BankCountry", getBankCountry());
        values.put("BPMinimumReserve", getBPMinimumReserve());
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
            if (values.containsKey("BankKey")) {
                final Object value = values.remove("BankKey");
                if ((value == null)||(!value.equals(getBankKey()))) {
                    setBankKey(((String) value));
                }
            }
            if (values.containsKey("BankCountry")) {
                final Object value = values.remove("BankCountry");
                if ((value == null)||(!value.equals(getBankCountry()))) {
                    setBankCountry(((String) value));
                }
            }
            if (values.containsKey("BPMinimumReserve")) {
                final Object value = values.remove("BPMinimumReserve");
                if ((value == null)||(!value.equals(getBPMinimumReserve()))) {
                    setBPMinimumReserve(((String) value));
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
    public static<T >BusinessPartnerIsBankField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerIsBankField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerIsBankField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerIsBankField<T>(fieldName, typeConverter);
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