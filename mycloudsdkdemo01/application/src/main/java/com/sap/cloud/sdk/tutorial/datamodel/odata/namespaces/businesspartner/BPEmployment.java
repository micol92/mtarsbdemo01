
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BPEmploymentField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BPEmploymentSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Employment Overview<p></p><p>Original entity name from the Odata EDM: <b>A_BPEmploymentType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BPEmployment
    extends VdmEntity<BPEmployment>
{

    /**
     * Selector for all available fields of BPEmployment.
     * 
     */
    public final static BPEmploymentSelectable ALL_FIELDS = () -> "*";
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
    public final static BPEmploymentField<String> BUSINESS_PARTNER = new BPEmploymentField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentStartDate</b></p>
     * 
     * @return
     *     Employed from
     */
    @Key
    @SerializedName("BPEmploymentStartDate")
    @JsonProperty("BPEmploymentStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPEmploymentStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPEmploymentStartDate;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentStartDate</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<LocalDateTime> BP_EMPLOYMENT_START_DATE = new BPEmploymentField<LocalDateTime>("BPEmploymentStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentEndDate</b></p>
     * 
     * @return
     *     Employed Until
     */
    @SerializedName("BPEmploymentEndDate")
    @JsonProperty("BPEmploymentEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPEmploymentEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPEmploymentEndDate;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentEndDate</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<LocalDateTime> BP_EMPLOYMENT_END_DATE = new BPEmploymentField<LocalDateTime>("BPEmploymentEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BPEmploymentStatus</b></p>
     * 
     * @return
     *     Employment Status
     */
    @SerializedName("BPEmploymentStatus")
    @JsonProperty("BPEmploymentStatus")
    @Nullable
    @ODataField(odataName = "BPEmploymentStatus")
    private String bPEmploymentStatus;
    /**
     * Use with available fluent helpers to apply the <b>BPEmploymentStatus</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<String> BP_EMPLOYMENT_STATUS = new BPEmploymentField<String>("BPEmploymentStatus");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusPartEmplrIndstryCode</b></p>
     * 
     * @return
     *     Industry
     */
    @SerializedName("BusPartEmplrIndstryCode")
    @JsonProperty("BusPartEmplrIndstryCode")
    @Nullable
    @ODataField(odataName = "BusPartEmplrIndstryCode")
    private String busPartEmplrIndstryCode;
    /**
     * Use with available fluent helpers to apply the <b>BusPartEmplrIndstryCode</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<String> BUS_PART_EMPLR_INDSTRY_CODE = new BPEmploymentField<String>("BusPartEmplrIndstryCode");
    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>BusinessPartnerEmployerName</b></p>
     * 
     * @return
     *     Name of Employer of a Natural Person
     */
    @SerializedName("BusinessPartnerEmployerName")
    @JsonProperty("BusinessPartnerEmployerName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerEmployerName")
    private String businessPartnerEmployerName;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerEmployerName</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<String> BUSINESS_PARTNER_EMPLOYER_NAME = new BPEmploymentField<String>("BusinessPartnerEmployerName");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerOccupationGroup</b></p>
     * 
     * @return
     *     Occupation/group
     */
    @SerializedName("BusinessPartnerOccupationGroup")
    @JsonProperty("BusinessPartnerOccupationGroup")
    @Nullable
    @ODataField(odataName = "BusinessPartnerOccupationGroup")
    private String businessPartnerOccupationGroup;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerOccupationGroup</b> field to query operations.
     * 
     */
    public final static BPEmploymentField<String> BUSINESS_PARTNER_OCCUPATION_GROUP = new BPEmploymentField<String>("BusinessPartnerOccupationGroup");

    @Nonnull
    @Override
    public Class<BPEmployment> getType() {
        return BPEmployment.class;
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
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentStartDate</b></p>
     * 
     * @param bPEmploymentStartDate
     *     Employed from
     */
    public void setBPEmploymentStartDate(
        @Nullable
        final LocalDateTime bPEmploymentStartDate) {
        rememberChangedField("BPEmploymentStartDate", this.bPEmploymentStartDate);
        this.bPEmploymentStartDate = bPEmploymentStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPEmploymentEndDate</b></p>
     * 
     * @param bPEmploymentEndDate
     *     Employed Until
     */
    public void setBPEmploymentEndDate(
        @Nullable
        final LocalDateTime bPEmploymentEndDate) {
        rememberChangedField("BPEmploymentEndDate", this.bPEmploymentEndDate);
        this.bPEmploymentEndDate = bPEmploymentEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BPEmploymentStatus</b></p>
     * 
     * @param bPEmploymentStatus
     *     Employment Status
     */
    public void setBPEmploymentStatus(
        @Nullable
        final String bPEmploymentStatus) {
        rememberChangedField("BPEmploymentStatus", this.bPEmploymentStatus);
        this.bPEmploymentStatus = bPEmploymentStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusPartEmplrIndstryCode</b></p>
     * 
     * @param busPartEmplrIndstryCode
     *     Industry
     */
    public void setBusPartEmplrIndstryCode(
        @Nullable
        final String busPartEmplrIndstryCode) {
        rememberChangedField("BusPartEmplrIndstryCode", this.busPartEmplrIndstryCode);
        this.busPartEmplrIndstryCode = busPartEmplrIndstryCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>BusinessPartnerEmployerName</b></p>
     * 
     * @param businessPartnerEmployerName
     *     Name of Employer of a Natural Person
     */
    public void setBusinessPartnerEmployerName(
        @Nullable
        final String businessPartnerEmployerName) {
        rememberChangedField("BusinessPartnerEmployerName", this.businessPartnerEmployerName);
        this.businessPartnerEmployerName = businessPartnerEmployerName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerOccupationGroup</b></p>
     * 
     * @param businessPartnerOccupationGroup
     *     Occupation/group
     */
    public void setBusinessPartnerOccupationGroup(
        @Nullable
        final String businessPartnerOccupationGroup) {
        rememberChangedField("BusinessPartnerOccupationGroup", this.businessPartnerOccupationGroup);
        this.businessPartnerOccupationGroup = businessPartnerOccupationGroup;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPEmployment";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPEmploymentStartDate", getBPEmploymentStartDate());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPEmploymentStartDate", getBPEmploymentStartDate());
        values.put("BPEmploymentEndDate", getBPEmploymentEndDate());
        values.put("BPEmploymentStatus", getBPEmploymentStatus());
        values.put("BusPartEmplrIndstryCode", getBusPartEmplrIndstryCode());
        values.put("BusinessPartnerEmployerName", getBusinessPartnerEmployerName());
        values.put("BusinessPartnerOccupationGroup", getBusinessPartnerOccupationGroup());
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
            if (values.containsKey("BPEmploymentStartDate")) {
                final Object value = values.remove("BPEmploymentStartDate");
                if ((value == null)||(!value.equals(getBPEmploymentStartDate()))) {
                    setBPEmploymentStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPEmploymentEndDate")) {
                final Object value = values.remove("BPEmploymentEndDate");
                if ((value == null)||(!value.equals(getBPEmploymentEndDate()))) {
                    setBPEmploymentEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPEmploymentStatus")) {
                final Object value = values.remove("BPEmploymentStatus");
                if ((value == null)||(!value.equals(getBPEmploymentStatus()))) {
                    setBPEmploymentStatus(((String) value));
                }
            }
            if (values.containsKey("BusPartEmplrIndstryCode")) {
                final Object value = values.remove("BusPartEmplrIndstryCode");
                if ((value == null)||(!value.equals(getBusPartEmplrIndstryCode()))) {
                    setBusPartEmplrIndstryCode(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerEmployerName")) {
                final Object value = values.remove("BusinessPartnerEmployerName");
                if ((value == null)||(!value.equals(getBusinessPartnerEmployerName()))) {
                    setBusinessPartnerEmployerName(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerOccupationGroup")) {
                final Object value = values.remove("BusinessPartnerOccupationGroup");
                if ((value == null)||(!value.equals(getBusinessPartnerOccupationGroup()))) {
                    setBusinessPartnerOccupationGroup(((String) value));
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
    public static<T >BPEmploymentField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BPEmploymentField<T>(fieldName);
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
    public static<T,DomainT >BPEmploymentField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BPEmploymentField<T>(fieldName, typeConverter);
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