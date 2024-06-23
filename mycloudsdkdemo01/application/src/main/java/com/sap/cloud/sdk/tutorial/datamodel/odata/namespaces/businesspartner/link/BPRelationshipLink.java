
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPRelationship;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.selectable.BPRelationshipSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.businesspartner.BPRelationship BPRelationship} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class BPRelationshipLink<ObjectT extends VdmObject<?> >
    extends EntityLink<BPRelationshipLink<ObjectT> , BPRelationship, ObjectT>
    implements BPRelationshipSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public BPRelationshipLink(final String fieldName) {
        super(fieldName);
    }

    private BPRelationshipLink(final EntityLink<BPRelationshipLink<ObjectT> , BPRelationship, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected BPRelationshipLink<ObjectT> translateLinkType(final EntityLink<BPRelationshipLink<ObjectT> , BPRelationship, ObjectT> link) {
        return new BPRelationshipLink<ObjectT>(link);
    }

}
