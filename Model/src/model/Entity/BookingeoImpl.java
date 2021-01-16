package model.Entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jan 16 03:48:44 AST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BookingeoImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        DateTime,
        FlightNo,
        PassangerId,
        ClassType,
        Paid,
        ClassInfo,
        Passanger;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int DATETIME = AttributesEnum.DateTime.index();
    public static final int FLIGHTNO = AttributesEnum.FlightNo.index();
    public static final int PASSANGERID = AttributesEnum.PassangerId.index();
    public static final int CLASSTYPE = AttributesEnum.ClassType.index();
    public static final int PAID = AttributesEnum.Paid.index();
    public static final int CLASSINFO = AttributesEnum.ClassInfo.index();
    public static final int PASSANGER = AttributesEnum.Passanger.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BookingeoImpl() {
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for DateTime, using the alias name DateTime.
     * @return the value of DateTime
     */
    public Timestamp getDateTime() {
        return (Timestamp) getAttributeInternal(DATETIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateTime.
     * @param value value to set the DateTime
     */
    public void setDateTime(Timestamp value) {
        setAttributeInternal(DATETIME, value);
    }

    /**
     * Gets the attribute value for FlightNo, using the alias name FlightNo.
     * @return the value of FlightNo
     */
    public String getFlightNo() {
        return (String) getAttributeInternal(FLIGHTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for FlightNo.
     * @param value value to set the FlightNo
     */
    public void setFlightNo(String value) {
        setAttributeInternal(FLIGHTNO, value);
    }

    /**
     * Gets the attribute value for PassangerId, using the alias name PassangerId.
     * @return the value of PassangerId
     */
    public BigDecimal getPassangerId() {
        return (BigDecimal) getAttributeInternal(PASSANGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PassangerId.
     * @param value value to set the PassangerId
     */
    public void setPassangerId(BigDecimal value) {
        setAttributeInternal(PASSANGERID, value);
    }

    /**
     * Gets the attribute value for ClassType, using the alias name ClassType.
     * @return the value of ClassType
     */
    public String getClassType() {
        return (String) getAttributeInternal(CLASSTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClassType.
     * @param value value to set the ClassType
     */
    public void setClassType(String value) {
        setAttributeInternal(CLASSTYPE, value);
    }

    /**
     * Gets the attribute value for Paid, using the alias name Paid.
     * @return the value of Paid
     */
    public BigDecimal getPaid() {
        return (BigDecimal) getAttributeInternal(PAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Paid.
     * @param value value to set the Paid
     */
    public void setPaid(BigDecimal value) {
        setAttributeInternal(PAID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getClassInfo() {
        return (EntityImpl) getAttributeInternal(CLASSINFO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setClassInfo(EntityImpl value) {
        setAttributeInternal(CLASSINFO, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPassanger() {
        return (EntityImpl) getAttributeInternal(PASSANGER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPassanger(EntityImpl value) {
        setAttributeInternal(PASSANGER, value);
    }

    /**
     * @param id key constituent
     * @param flightNo key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number id, String flightNo) {
        return new Key(new Object[] { id, flightNo });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.Entity.Bookingeo");
    }
    
    public Number getSequenceValue(String SequenceName) {
        SequenceImpl MySeq = new SequenceImpl(SequenceName, getDBTransaction());
        return MySeq.getSequenceNumber();
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        setId(getSequenceValue("BOOKING_SEQ"));
    }
}

