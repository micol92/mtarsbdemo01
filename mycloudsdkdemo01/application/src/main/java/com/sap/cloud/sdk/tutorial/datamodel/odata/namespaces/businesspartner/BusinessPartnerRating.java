
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
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.field.BusinessPartnerRatingField;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BusinessPartnerRatingSelectable;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Ratings<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerRatingType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerRating
    extends VdmEntity<BusinessPartnerRating>
{

    /**
     * Selector for all available fields of BusinessPartnerRating.
     * 
     */
    public final static BusinessPartnerRatingSelectable ALL_FIELDS = () -> "*";
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
    public final static BusinessPartnerRatingField<String> BUSINESS_PARTNER = new BusinessPartnerRatingField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingProcedure</b></p>
     * 
     * @return
     *     Rating Procedure
     */
    @Key
    @SerializedName("BusinessPartnerRatingProcedure")
    @JsonProperty("BusinessPartnerRatingProcedure")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingProcedure")
    private String businessPartnerRatingProcedure;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingProcedure</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<String> BUSINESS_PARTNER_RATING_PROCEDURE = new BusinessPartnerRatingField<String>("BusinessPartnerRatingProcedure");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityEndDate</b></p>
     * 
     * @return
     *     Valid-to Date for Rating
     */
    @Key
    @SerializedName("BPRatingValidityEndDate")
    @JsonProperty("BPRatingValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPRatingValidityEndDate;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingValidityEndDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<LocalDateTime> BP_RATING_VALIDITY_END_DATE = new BusinessPartnerRatingField<LocalDateTime>("BPRatingValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingGrade</b></p>
     * 
     * @return
     *     Rating
     */
    @SerializedName("BusinessPartnerRatingGrade")
    @JsonProperty("BusinessPartnerRatingGrade")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingGrade")
    private String businessPartnerRatingGrade;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingGrade</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<String> BUSINESS_PARTNER_RATING_GRADE = new BusinessPartnerRatingField<String>("BusinessPartnerRatingGrade");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingTrend</b></p>
     * 
     * @return
     *     Trend
     */
    @SerializedName("BusinessPartnerRatingTrend")
    @JsonProperty("BusinessPartnerRatingTrend")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingTrend")
    private String businessPartnerRatingTrend;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingTrend</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<String> BUSINESS_PARTNER_RATING_TREND = new BusinessPartnerRatingField<String>("BusinessPartnerRatingTrend");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityStartDate</b></p>
     * 
     * @return
     *     Valid-from Date for Rating
     */
    @SerializedName("BPRatingValidityStartDate")
    @JsonProperty("BPRatingValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPRatingValidityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingValidityStartDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<LocalDateTime> BP_RATING_VALIDITY_START_DATE = new BusinessPartnerRatingField<LocalDateTime>("BPRatingValidityStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingCreationDate</b></p>
     * 
     * @return
     *     Entered-on Date for Rating
     */
    @SerializedName("BPRatingCreationDate")
    @JsonProperty("BPRatingCreationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPRatingCreationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPRatingCreationDate;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingCreationDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<LocalDateTime> BP_RATING_CREATION_DATE = new BusinessPartnerRatingField<LocalDateTime>("BPRatingCreationDate");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingComment</b></p>
     * 
     * @return
     *     Text for Ratings
     */
    @SerializedName("BusinessPartnerRatingComment")
    @JsonProperty("BusinessPartnerRatingComment")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRatingComment")
    private String businessPartnerRatingComment;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingComment</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<String> BUSINESS_PARTNER_RATING_COMMENT = new BusinessPartnerRatingField<String>("BusinessPartnerRatingComment");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsAllowed</b></p>
     * 
     * @return
     *     Rating Allowed
     */
    @SerializedName("BusinessPartnerRatingIsAllowed")
    @JsonProperty("BusinessPartnerRatingIsAllowed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingIsAllowed")
    private Boolean businessPartnerRatingIsAllowed;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingIsAllowed</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<Boolean> BUSINESS_PARTNER_RATING_IS_ALLOWED = new BusinessPartnerRatingField<Boolean>("BusinessPartnerRatingIsAllowed");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BPRatingIsValidOnKeyDate</b></p>
     * 
     * @return
     *     Business Partner Rating is valid on Key Date
     */
    @SerializedName("BPRatingIsValidOnKeyDate")
    @JsonProperty("BPRatingIsValidOnKeyDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BPRatingIsValidOnKeyDate")
    private Boolean bPRatingIsValidOnKeyDate;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingIsValidOnKeyDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<Boolean> BP_RATING_IS_VALID_ON_KEY_DATE = new BusinessPartnerRatingField<Boolean>("BPRatingIsValidOnKeyDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingKeyDate</b></p>
     * 
     * @return
     *     Key Date of Accessing Business Partner Rating Data
     */
    @SerializedName("BusinessPartnerRatingKeyDate")
    @JsonProperty("BusinessPartnerRatingKeyDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingKeyDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime businessPartnerRatingKeyDate;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingKeyDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<LocalDateTime> BUSINESS_PARTNER_RATING_KEY_DATE = new BusinessPartnerRatingField<LocalDateTime>("BusinessPartnerRatingKeyDate");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsExpired</b></p>
     * 
     * @return
     *     Rating Validity is Expired according to Permitted Period
     */
    @SerializedName("BusinessPartnerRatingIsExpired")
    @JsonProperty("BusinessPartnerRatingIsExpired")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BusinessPartnerRatingIsExpired")
    private Boolean businessPartnerRatingIsExpired;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRatingIsExpired</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<Boolean> BUSINESS_PARTNER_RATING_IS_EXPIRED = new BusinessPartnerRatingField<Boolean>("BusinessPartnerRatingIsExpired");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>BPRatingLongComment</b></p>
     * 
     * @return
     *     Longtext for Rating
     */
    @SerializedName("BPRatingLongComment")
    @JsonProperty("BPRatingLongComment")
    @Nullable
    @ODataField(odataName = "BPRatingLongComment")
    private String bPRatingLongComment;
    /**
     * Use with available fluent helpers to apply the <b>BPRatingLongComment</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRatingField<String> BP_RATING_LONG_COMMENT = new BusinessPartnerRatingField<String>("BPRatingLongComment");

    @Nonnull
    @Override
    public Class<BusinessPartnerRating> getType() {
        return BusinessPartnerRating.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingProcedure</b></p>
     * 
     * @param businessPartnerRatingProcedure
     *     Rating Procedure
     */
    public void setBusinessPartnerRatingProcedure(
        @Nullable
        final String businessPartnerRatingProcedure) {
        rememberChangedField("BusinessPartnerRatingProcedure", this.businessPartnerRatingProcedure);
        this.businessPartnerRatingProcedure = businessPartnerRatingProcedure;
    }

    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityEndDate</b></p>
     * 
     * @param bPRatingValidityEndDate
     *     Valid-to Date for Rating
     */
    public void setBPRatingValidityEndDate(
        @Nullable
        final LocalDateTime bPRatingValidityEndDate) {
        rememberChangedField("BPRatingValidityEndDate", this.bPRatingValidityEndDate);
        this.bPRatingValidityEndDate = bPRatingValidityEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingGrade</b></p>
     * 
     * @param businessPartnerRatingGrade
     *     Rating
     */
    public void setBusinessPartnerRatingGrade(
        @Nullable
        final String businessPartnerRatingGrade) {
        rememberChangedField("BusinessPartnerRatingGrade", this.businessPartnerRatingGrade);
        this.businessPartnerRatingGrade = businessPartnerRatingGrade;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingTrend</b></p>
     * 
     * @param businessPartnerRatingTrend
     *     Trend
     */
    public void setBusinessPartnerRatingTrend(
        @Nullable
        final String businessPartnerRatingTrend) {
        rememberChangedField("BusinessPartnerRatingTrend", this.businessPartnerRatingTrend);
        this.businessPartnerRatingTrend = businessPartnerRatingTrend;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingValidityStartDate</b></p>
     * 
     * @param bPRatingValidityStartDate
     *     Valid-from Date for Rating
     */
    public void setBPRatingValidityStartDate(
        @Nullable
        final LocalDateTime bPRatingValidityStartDate) {
        rememberChangedField("BPRatingValidityStartDate", this.bPRatingValidityStartDate);
        this.bPRatingValidityStartDate = bPRatingValidityStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPRatingCreationDate</b></p>
     * 
     * @param bPRatingCreationDate
     *     Entered-on Date for Rating
     */
    public void setBPRatingCreationDate(
        @Nullable
        final LocalDateTime bPRatingCreationDate) {
        rememberChangedField("BPRatingCreationDate", this.bPRatingCreationDate);
        this.bPRatingCreationDate = bPRatingCreationDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingComment</b></p>
     * 
     * @param businessPartnerRatingComment
     *     Text for Ratings
     */
    public void setBusinessPartnerRatingComment(
        @Nullable
        final String businessPartnerRatingComment) {
        rememberChangedField("BusinessPartnerRatingComment", this.businessPartnerRatingComment);
        this.businessPartnerRatingComment = businessPartnerRatingComment;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsAllowed</b></p>
     * 
     * @param businessPartnerRatingIsAllowed
     *     Rating Allowed
     */
    public void setBusinessPartnerRatingIsAllowed(
        @Nullable
        final Boolean businessPartnerRatingIsAllowed) {
        rememberChangedField("BusinessPartnerRatingIsAllowed", this.businessPartnerRatingIsAllowed);
        this.businessPartnerRatingIsAllowed = businessPartnerRatingIsAllowed;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BPRatingIsValidOnKeyDate</b></p>
     * 
     * @param bPRatingIsValidOnKeyDate
     *     Business Partner Rating is valid on Key Date
     */
    public void setBPRatingIsValidOnKeyDate(
        @Nullable
        final Boolean bPRatingIsValidOnKeyDate) {
        rememberChangedField("BPRatingIsValidOnKeyDate", this.bPRatingIsValidOnKeyDate);
        this.bPRatingIsValidOnKeyDate = bPRatingIsValidOnKeyDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BusinessPartnerRatingKeyDate</b></p>
     * 
     * @param businessPartnerRatingKeyDate
     *     Key Date of Accessing Business Partner Rating Data
     */
    public void setBusinessPartnerRatingKeyDate(
        @Nullable
        final LocalDateTime businessPartnerRatingKeyDate) {
        rememberChangedField("BusinessPartnerRatingKeyDate", this.businessPartnerRatingKeyDate);
        this.businessPartnerRatingKeyDate = businessPartnerRatingKeyDate;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerRatingIsExpired</b></p>
     * 
     * @param businessPartnerRatingIsExpired
     *     Rating Validity is Expired according to Permitted Period
     */
    public void setBusinessPartnerRatingIsExpired(
        @Nullable
        final Boolean businessPartnerRatingIsExpired) {
        rememberChangedField("BusinessPartnerRatingIsExpired", this.businessPartnerRatingIsExpired);
        this.businessPartnerRatingIsExpired = businessPartnerRatingIsExpired;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>BPRatingLongComment</b></p>
     * 
     * @param bPRatingLongComment
     *     Longtext for Rating
     */
    public void setBPRatingLongComment(
        @Nullable
        final String bPRatingLongComment) {
        rememberChangedField("BPRatingLongComment", this.bPRatingLongComment);
        this.bPRatingLongComment = bPRatingLongComment;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartnerRating";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BusinessPartnerRatingProcedure", getBusinessPartnerRatingProcedure());
        result.put("BPRatingValidityEndDate", getBPRatingValidityEndDate());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BusinessPartnerRatingProcedure", getBusinessPartnerRatingProcedure());
        values.put("BPRatingValidityEndDate", getBPRatingValidityEndDate());
        values.put("BusinessPartnerRatingGrade", getBusinessPartnerRatingGrade());
        values.put("BusinessPartnerRatingTrend", getBusinessPartnerRatingTrend());
        values.put("BPRatingValidityStartDate", getBPRatingValidityStartDate());
        values.put("BPRatingCreationDate", getBPRatingCreationDate());
        values.put("BusinessPartnerRatingComment", getBusinessPartnerRatingComment());
        values.put("BusinessPartnerRatingIsAllowed", getBusinessPartnerRatingIsAllowed());
        values.put("BPRatingIsValidOnKeyDate", getBPRatingIsValidOnKeyDate());
        values.put("BusinessPartnerRatingKeyDate", getBusinessPartnerRatingKeyDate());
        values.put("BusinessPartnerRatingIsExpired", getBusinessPartnerRatingIsExpired());
        values.put("BPRatingLongComment", getBPRatingLongComment());
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
            if (values.containsKey("BusinessPartnerRatingProcedure")) {
                final Object value = values.remove("BusinessPartnerRatingProcedure");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingProcedure()))) {
                    setBusinessPartnerRatingProcedure(((String) value));
                }
            }
            if (values.containsKey("BPRatingValidityEndDate")) {
                final Object value = values.remove("BPRatingValidityEndDate");
                if ((value == null)||(!value.equals(getBPRatingValidityEndDate()))) {
                    setBPRatingValidityEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingGrade")) {
                final Object value = values.remove("BusinessPartnerRatingGrade");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingGrade()))) {
                    setBusinessPartnerRatingGrade(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingTrend")) {
                final Object value = values.remove("BusinessPartnerRatingTrend");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingTrend()))) {
                    setBusinessPartnerRatingTrend(((String) value));
                }
            }
            if (values.containsKey("BPRatingValidityStartDate")) {
                final Object value = values.remove("BPRatingValidityStartDate");
                if ((value == null)||(!value.equals(getBPRatingValidityStartDate()))) {
                    setBPRatingValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BPRatingCreationDate")) {
                final Object value = values.remove("BPRatingCreationDate");
                if ((value == null)||(!value.equals(getBPRatingCreationDate()))) {
                    setBPRatingCreationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingComment")) {
                final Object value = values.remove("BusinessPartnerRatingComment");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingComment()))) {
                    setBusinessPartnerRatingComment(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingIsAllowed")) {
                final Object value = values.remove("BusinessPartnerRatingIsAllowed");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingIsAllowed()))) {
                    setBusinessPartnerRatingIsAllowed(((Boolean) value));
                }
            }
            if (values.containsKey("BPRatingIsValidOnKeyDate")) {
                final Object value = values.remove("BPRatingIsValidOnKeyDate");
                if ((value == null)||(!value.equals(getBPRatingIsValidOnKeyDate()))) {
                    setBPRatingIsValidOnKeyDate(((Boolean) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingKeyDate")) {
                final Object value = values.remove("BusinessPartnerRatingKeyDate");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingKeyDate()))) {
                    setBusinessPartnerRatingKeyDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerRatingIsExpired")) {
                final Object value = values.remove("BusinessPartnerRatingIsExpired");
                if ((value == null)||(!value.equals(getBusinessPartnerRatingIsExpired()))) {
                    setBusinessPartnerRatingIsExpired(((Boolean) value));
                }
            }
            if (values.containsKey("BPRatingLongComment")) {
                final Object value = values.remove("BPRatingLongComment");
                if ((value == null)||(!value.equals(getBPRatingLongComment()))) {
                    setBPRatingLongComment(((String) value));
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
    public static<T >BusinessPartnerRatingField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerRatingField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerRatingField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerRatingField<T>(fieldName, typeConverter);
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
