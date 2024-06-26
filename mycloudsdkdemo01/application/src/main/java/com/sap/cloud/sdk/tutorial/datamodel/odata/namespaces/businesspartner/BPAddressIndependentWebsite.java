
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BPAddressIndependentWebsiteField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BPAddressIndependentWebsiteSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Address Independent Website<p></p><p>Original entity name from the Odata EDM: <b>A_BPAddressIndependentWebsiteType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BPAddressIndependentWebsite
    extends VdmEntity<BPAddressIndependentWebsite>
{

    /**
     * Selector for all available fields of BPAddressIndependentWebsite.
     * 
     */
    public final static BPAddressIndependentWebsiteSelectable ALL_FIELDS = () -> "*";
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
    public final static BPAddressIndependentWebsiteField<String> BUSINESS_PARTNER = new BPAddressIndependentWebsiteField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @return
     *     Address Number
     */
    @Key
    @SerializedName("AddressID")
    @JsonProperty("AddressID")
    @Nullable
    @ODataField(odataName = "AddressID")
    private String addressID;
    /**
     * Use with available fluent helpers to apply the <b>AddressID</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<String> ADDRESS_ID = new BPAddressIndependentWebsiteField<String>("AddressID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @return
     *     Person Number
     */
    @Key
    @SerializedName("Person")
    @JsonProperty("Person")
    @Nullable
    @ODataField(odataName = "Person")
    private String person;
    /**
     * Use with available fluent helpers to apply the <b>Person</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<String> PERSON = new BPAddressIndependentWebsiteField<String>("Person");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @return
     *     Sequence Number
     */
    @Key
    @SerializedName("OrdinalNumber")
    @JsonProperty("OrdinalNumber")
    @Nullable
    @ODataField(odataName = "OrdinalNumber")
    private String ordinalNumber;
    /**
     * Use with available fluent helpers to apply the <b>OrdinalNumber</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<String> ORDINAL_NUMBER = new BPAddressIndependentWebsiteField<String>("OrdinalNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @return
     *     Flag: this address is the default address
     */
    @SerializedName("IsDefaultURLAddress")
    @JsonProperty("IsDefaultURLAddress")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultURLAddress")
    private Boolean isDefaultURLAddress;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultURLAddress</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<Boolean> IS_DEFAULT_URL_ADDRESS = new BPAddressIndependentWebsiteField<Boolean>("IsDefaultURLAddress");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @return
     *     The uRLFieldLength contained in this entity.
     */
    @SerializedName("URLFieldLength")
    @JsonProperty("URLFieldLength")
    @Nullable
    @ODataField(odataName = "URLFieldLength")
    private Integer uRLFieldLength;
    /**
     * Use with available fluent helpers to apply the <b>URLFieldLength</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<Integer> URL_FIELD_LENGTH = new BPAddressIndependentWebsiteField<Integer>("URLFieldLength");
    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @return
     *     The websiteURL contained in this entity.
     */
    @SerializedName("WebsiteURL")
    @JsonProperty("WebsiteURL")
    @Nullable
    @ODataField(odataName = "WebsiteURL")
    private String websiteURL;
    /**
     * Use with available fluent helpers to apply the <b>WebsiteURL</b> field to query operations.
     * 
     */
    public final static BPAddressIndependentWebsiteField<String> WEBSITE_URL = new BPAddressIndependentWebsiteField<String>("WebsiteURL");

    @Nonnull
    @Override
    public Class<BPAddressIndependentWebsite> getType() {
        return BPAddressIndependentWebsite.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressID
     *     Address Number
     */
    public void setAddressID(
        @Nullable
        final String addressID) {
        rememberChangedField("AddressID", this.addressID);
        this.addressID = addressID;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param person
     *     Person Number
     */
    public void setPerson(
        @Nullable
        final String person) {
        rememberChangedField("Person", this.person);
        this.person = person;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @param ordinalNumber
     *     Sequence Number
     */
    public void setOrdinalNumber(
        @Nullable
        final String ordinalNumber) {
        rememberChangedField("OrdinalNumber", this.ordinalNumber);
        this.ordinalNumber = ordinalNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @param isDefaultURLAddress
     *     Flag: this address is the default address
     */
    public void setIsDefaultURLAddress(
        @Nullable
        final Boolean isDefaultURLAddress) {
        rememberChangedField("IsDefaultURLAddress", this.isDefaultURLAddress);
        this.isDefaultURLAddress = isDefaultURLAddress;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @param uRLFieldLength
     *     The uRLFieldLength to set.
     */
    public void setURLFieldLength(
        @Nullable
        final Integer uRLFieldLength) {
        rememberChangedField("URLFieldLength", this.uRLFieldLength);
        this.uRLFieldLength = uRLFieldLength;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @param websiteURL
     *     The websiteURL to set.
     */
    public void setWebsiteURL(
        @Nullable
        final String websiteURL) {
        rememberChangedField("WebsiteURL", this.websiteURL);
        this.websiteURL = websiteURL;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPAddressIndependentWebsite";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("AddressID", getAddressID());
        result.put("Person", getPerson());
        result.put("OrdinalNumber", getOrdinalNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("AddressID", getAddressID());
        values.put("Person", getPerson());
        values.put("OrdinalNumber", getOrdinalNumber());
        values.put("IsDefaultURLAddress", getIsDefaultURLAddress());
        values.put("URLFieldLength", getURLFieldLength());
        values.put("WebsiteURL", getWebsiteURL());
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
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressID()))) {
                    setAddressID(((String) value));
                }
            }
            if (values.containsKey("Person")) {
                final Object value = values.remove("Person");
                if ((value == null)||(!value.equals(getPerson()))) {
                    setPerson(((String) value));
                }
            }
            if (values.containsKey("OrdinalNumber")) {
                final Object value = values.remove("OrdinalNumber");
                if ((value == null)||(!value.equals(getOrdinalNumber()))) {
                    setOrdinalNumber(((String) value));
                }
            }
            if (values.containsKey("IsDefaultURLAddress")) {
                final Object value = values.remove("IsDefaultURLAddress");
                if ((value == null)||(!value.equals(getIsDefaultURLAddress()))) {
                    setIsDefaultURLAddress(((Boolean) value));
                }
            }
            if (values.containsKey("URLFieldLength")) {
                final Object value = values.remove("URLFieldLength");
                if ((value == null)||(!value.equals(getURLFieldLength()))) {
                    setURLFieldLength(((Integer) value));
                }
            }
            if (values.containsKey("WebsiteURL")) {
                final Object value = values.remove("WebsiteURL");
                if ((value == null)||(!value.equals(getWebsiteURL()))) {
                    setWebsiteURL(((String) value));
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
    public static<T >BPAddressIndependentWebsiteField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BPAddressIndependentWebsiteField<T>(fieldName);
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
    public static<T,DomainT >BPAddressIndependentWebsiteField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BPAddressIndependentWebsiteField<T>(fieldName, typeConverter);
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
