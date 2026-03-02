import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class igvx {
    public Object a;
    public ArrayList b;
    public igvr c;
    public String d;
    private final igvt e;

    public igvx(igvf igvf0, igvt igvt0) {
        this(igvf0, igvt0, "IPE 14 - Entitlement");
        this.e(new igwu(igvt0, Arrays.asList(new String[]{"RFU", "RFU", "ValidToFlag", "HalfDayOfWeek and ValidAtOrFrom", "SecondaryHolderIDFlag", "IIN"})));
        this.e(new igwt(igvt0));
        this.e(new igwt(igvt0, "ConcessionaryPassIssuerCostCentre", 16));
        this.e(new igwc(igvt0));
        this.e(new igwr(igvt0, "RoundingFlagsEnable"));
        this.e(new igwr(igvt0, "RFU"));
        this.e(new igwt(igvt0, "PassbackTime", 6));
        this.e(new igvy(igvt0, "HolderID", 0x20));
        this.e(new igwr(igvt0, "RoundingFlag"));
        this.e(new igwr(igvt0, "RoundingValueFlag"));
        this.e(new igwm(igvt0, "EntitlementExpiryDate"));
        this.e(new igxa(igvt0, "RFU", 4));
        this.e(new igxd(igvt0, "DepositCurrencyCode"));
        this.e(new igwx(igvt0, "DepositMethodOfPayment"));
        this.e(new igxf(igvt0, "DepositVATSalesTax"));
        this.e(new igxe(igvt0, "DepositAmount", 16));
        this.e(new igwt(igvt0, "EntitlementCode", 8));
        this.e(new igwt(igvt0, "ConcessionaryClass", 8));
        igxg igxg0 = new igxg(this);
        if(igxg0.a("SecondaryHolderIDFlag") == 1) {
            igxg0.b(this).e(new igvy(igvt0, "SecondaryHolderID", 0x20));
        }
        if(igxg0.a("HalfDayOfWeek and ValidAtOrFrom") == 1) {
            igvx igvx0 = igxg0.b(this);
            igvx0.e(new igwl(igvt0));
            igvx0.e(new igwv(igvt0, "ValidAtOrFrom"));
        }
        if(igxg0.a("ValidToFlag") == 1) {
            igxg0.b(this).e(new igwv(igvt0, "ValidTo"));
        }
        this.d(igxg0.a("IIN"));
    }

    public igvx(igvf igvf0, igvt igvt0, String s) {
        this(igvt0, s);
        igvt igvt1 = new igvt(igvf0.a);
        this.e(new igwr(igvt1, "oidExtensionFlag"));
        this.e(new igwt(igvt1, "oid", 13));
        this.e(new igwt(igvt1, "typ", 5));
        this.e(new igwt(igvt1, "ptyp", 5));
        this.e(new igwr(igvt1, "vgp"));
        this.e(new igwr(igvt1, "iinl"));
        this.e(new igwm(igvt1, "exp"));
    }

    public igvx(igvf igvf0, igvt igvt0, byte[] arr_b) {
        this(igvf0, igvt0, "IPE 16");
        this.e(new igwu(igvt0, Arrays.asList(new String[]{"RFU", "ValidToFlag", "HalfDayOfWeek and ValidAtOrFrom", "Name Elements", "SecondaryHolderIDFlag", "IINFlag"})));
        this.e(new igwt(igvt0));
        this.e(new igwz(igvt0, "ConcessionaryPassIssuerCostCentre"));
        this.e(new igwc(igvt0));
        this.e(new igwr(igvt0, "RoundingFlagsEnable"));
        this.e(new igwr(igvt0, "RFU"));
        this.e(new igwt(igvt0, "PassbackTime", 6));
        this.e(new igwn(igvt0));
        this.e(new igwt(igvt0, "Language", 8));
        this.e(new igvy(igvt0, "HolderID", 0x20));
        this.e(new igwr(igvt0, "RoundingFlag"));
        this.e(new igwr(igvt0, "RoundingValueFlag"));
        this.e(new igwm(igvt0, "EntitlementExpiryDate"));
        this.e(new igwx(igvt0, "DepositMethodOfPayment"));
        this.e(new igxf(igvt0, "DepositVATSalesTax"));
        this.e(new igwx(igvt0, "ShellDepositMethodOfPayment"));
        this.e(new igxf(igvt0, "ShellDepositVATSalesTax"));
        this.e(new igxd(igvt0, "DepositCurrencyCode"));
        this.e(new igxd(igvt0, "ShellDepositCurrencyCode"));
        this.e(new igxe(igvt0, "DepositAmount", 16));
        this.e(new igxe(igvt0, "ShellDeposit", 16));
        this.e(new igwt(igvt0, "EntitlementCode", 8));
        this.e(new igwt(igvt0, "ConcessionaryClass", 8));
        igxg igxg0 = new igxg(this);
        if(igxg0.a("SecondaryHolderIDFlag") == 1) {
            igxg0.b(this).e(new igvy(igvt0, "SecondaryHolderID", 0x20));
        }
        if(igxg0.a("Name Elements") == 1) {
            igvx igvx0 = igxg0.b(this);
            igvx0.e(new igwy(igvt0, "Forename"));
            igvx0.e(new igwy(igvt0, "Surname"));
        }
        if(igxg0.a("HalfDayOfWeek and ValidAtOrFrom") == 1) {
            igvx igvx1 = igxg0.b(this);
            igvx1.e(new igwl(igvt0));
            igvx1.e(new igwv(igvt0, "ValidAtOrFrom"));
        }
        if(igxg0.a("ValidToFlag") == 1) {
            igxg0.b(this).e(new igwv(igvt0, "ValidTo"));
        }
        this.d(igxg0.a("IINFlag"));
    }

    public igvx(igvf igvf0, igvt igvt0, char[] arr_c) {
        this(igvf0, igvt0, "IPE 22 Data Group");
        igvv igvv0 = igvt0.e();
        igwu igwu0 = new igwu(igvt0, Arrays.asList(new String[]{"RFU", "ConcessionaryPassIssuerCostCentre", "PassDuration", "RFU", "ValidAtOrFrom, ValidTo and RouteCode", "IIN"}));
        int v = (short)(((Short)((igvx)igwu0.b.get(2)).b()));
        if(v == 1) {
            igvt0.g(igvv0);
            igwu0 = new igwu(igvt0, Arrays.asList(new String[]{"RFU", "ConcessionaryPassIssuerCostCentre", "PassDuration", "ValidToFlag", "ValidAtOrFromFlag", "IIN"}));
            v = (short)(((Short)((igvx)igwu0.b.get(2)).b()));
        }
        this.d = String.format(Locale.UK, "IPE 22 - IFR %1$d Data Group", ((short)v));
        this.e(igwu0);
        this.e(new igwt(igvt0));
        this.e(new igwz(igvt0, "ProductRetailer"));
        this.e(new igwl(igvt0, "TYP22Flags", Arrays.asList(new String[]{"ValidPublicHoliday", "ValidPMSundays", "ValidAMSundays", "ValidPMSaturdays", "ValidAMSaturdays", "ValidPMWeekdays", "ValidAMWeekdays", "OffPeakOnly", "RFU", "PrintReceipt", "PrintTicket", "RFU", "RFU", "RFU", "RFU", "Transferable"})));
        this.e(new igxa(igvt0, "RFU", 2));
        this.e(new igwt(igvt0, "PassbackTime", 6));
        this.e(new igwm(igvt0, "IssueDate"));
        this.e(new igxb(igvt0));
        this.e(new igxa(igvt0, "RFU", 1));
        this.e(new igwt(igvt0, "AutoRenewQuantity1", 6));
        this.e(new igwt(igvt0, "Class", 3));
        this.e(new igxc(igvt0, "ValidityCode", 5));
        this.e(new igwp(igvt0, "ValidityStartDTS"));
        this.e(new igxc(igvt0, "PromotionCode", 8));
        this.e(new igwo(igvt0, "ValidOnDayCode"));
        this.e(new igwt(igvt0, "PartySizeAdult", 8));
        this.e(new igwt(igvt0, "PartySizeChild", 8));
        this.e(new igwt(igvt0, "PartySizeConcession", 8));
        this.e(new igxa(igvt0, "RFU", 4));
        this.e(new igxd(igvt0, "AmountPaidCurrencyCode"));
        if(v == 1) {
            this.e(new igxe(igvt0, "AmountPaid", 16));
            v = 1;
        }
        if(v == 2) {
            this.e(new igxe(igvt0, "AmountPaid", 0x20));
            v = 2;
        }
        this.e(new igwx(igvt0, "AmountPaidMethodOfPayment"));
        this.e(new igxf(igvt0, "AmountPaidVATSalesTax"));
        igxg igxg0 = new igxg(this);
        if(igxg0.a("ConcessionaryPassIssuerCostCentre") == 1) {
            igxg0.b(this).e(new igwt(igvt0, "ConcessionaryPassIssuerCostCentre", 16));
        }
        if(v == 1) {
            if(igxg0.a("ValidAtOrFromFlag") == 1) {
                igxg0.b(this).e(new igwv(igvt0, "ValidAtOrFrom"));
            }
            if(igxg0.a("ValidToFlag") == 1) {
                igxg0.b(this).e(new igwv(igvt0, "ValidTo"));
            }
            if(igxg0.a("PassDuration") == 1) {
                igxg0.b(this).e(new igwt(igvt0, "PassDuration", 8));
            }
        }
        if(v == 2) {
            if(igxg0.a("PassDuration") == 1) {
                igxg0.b(this).e(new igwt(igvt0, "PassDuration", 8));
            }
            if(igxg0.a("ValidAtOrFrom, ValidTo and RouteCode") == 1) {
                igvx igvx0 = igxg0.b(this);
                igvx0.e(new igxc(igvt0, "RouteCode", 40));
                igvx0.e(new igwv(igvt0, "ValidAtOrFrom"));
                igvx0.e(new igwv(igvt0, "ValidTo"));
            }
        }
        this.d(igxg0.a("IIN"));
    }

    public igvx(igvf igvf0, igvt igvt0, int[] arr_v) {
        this(igvf0, igvt0, "IPE 23 Data Group");
        igvv igvv0 = igvt0.e();
        igwu igwu0 = new igwu(igvt0, Arrays.asList(new String[]{"RFU", "RFU", "OptionalFields", "RFU", "Destination1, Origin1 and RouteCode", "IIN"}));
        int v = (short)(((Short)((igvx)igwu0.b.get(2)).b()));
        if(v == 1) {
            igvt0.g(igvv0);
            igwu0 = new igwu(igvt0, Arrays.asList(new String[]{"RFU", "RFU", "OptionalFields", "Origin1Flag", "Destination1Flag", "IIN"}));
            v = (short)(((Short)((igvx)igwu0.b.get(2)).b()));
        }
        this.d = String.format(Locale.UK, "IPE 23 - IFR %1$d Data Group", ((short)v));
        this.e(igwu0);
        this.e(new igwt(igvt0));
        this.e(new igwz(igvt0, "ProductRetailer"));
        this.e(new igwl(igvt0, "TYP23Flags", Arrays.asList(new String[]{"RFU", "PrintReceipt", "PrintTicket", "RFU", "RFU", "RFU", "UsedChecked", "RFU"})));
        this.e(new igxa(igvt0, "RFU", 2));
        this.e(new igwt(igvt0, "PassbackTime", 6));
        this.e(new igxa(igvt0, "RFU", 2));
        this.e(new igwm(igvt0, "IssueDate"));
        this.e(new igxc(igvt0, "ValidityCode", 5));
        this.e(new igxb(igvt0));
        this.e(new igxa(igvt0, "RFU", 5));
        this.e(new igwt(igvt0, "Class", 3));
        this.e(new igwt(igvt0, "PartySizeAdult", 8));
        this.e(new igwt(igvt0, "PartySizeChild", 8));
        this.e(new igwt(igvt0, "PartySizeConcession", 8));
        this.e(new igxa(igvt0, "RFU", 4));
        this.e(new igxd(igvt0, "AmountPaidCurrencyCode"));
        if(v == 2) {
            this.e(new igxe(igvt0, "AmountPaid", 0x20));
        }
        else {
            this.e(new igxe(igvt0, "AmountPaid", 16));
        }
        this.e(new igwx(igvt0, "AmountPaidMethodOfPayment"));
        this.e(new igxf(igvt0, "AmountPaidVATSalesTax"));
        this.e(new igxc(igvt0, "PhotocardNumber", 0x20));
        this.e(new igxc(igvt0, "PromotionCode", 8));
        this.e(new igwt(igvt0, "ConcessionaryPassIssuerCostCentre", 16));
        igxg igxg0 = new igxg(this);
        if(igxg0.a("OptionalFields") == 1) {
            igvx igvx0 = igxg0.b(this);
            igvx0.e(new igxa(igvt0, "RFU", 4));
            igvx0.e(new igwt(igvt0, "TYP23Mode", 4));
            igvx0.e(new igwt(igvt0, "MaxTransfers", 8));
            igvx0.e(new igwt(igvt0, "TimeLimit", 8));
            igvx0.e(new igxe(igvt0, "ValueOfRideJourney", 16));
            igvx0.e(new igxa(igvt0, "RFU", 4));
            igvx0.e(new igxd(igvt0, "ValueOfRideJourneyCurrencyCode"));
        }
        if(v == 1) {
            if(igxg0.a("Origin1Flag") == 1) {
                igxg0.b(this).e(new igwv(igvt0, "Origin1"));
            }
            if(igxg0.a("Destination1Flag") == 1) {
                igxg0.b(this).e(new igwv(igvt0, "Destination1"));
            }
        }
        if(v == 2 && igxg0.a("Destination1, Origin1 and RouteCode") == 1) {
            igvx igvx1 = igxg0.b(this);
            igvx1.e(new igxc(igvt0, "RouteCode", 40));
            igvx1.e(new igwv(igvt0, "Origin1"));
            igvx1.e(new igwv(igvt0, "Destination1"));
        }
        this.d(igxg0.a("IIN"));
    }

    public igvx(igvf igvf0, igvt igvt0, short[] arr_v) {
        this(igvf0, igvt0, "IPE 24 Data Group");
        igwu igwu0 = new igwu(igvt0, Arrays.asList(new String[]{"RFU", "RFU", "NumRes", "Numbers", "PaxDetail", "IIN"}));
        Short short0 = (Short)((igvx)igwu0.b.get(2)).b();
        this.d = String.format(Locale.UK, "IPE 24 - IFR %1$d Data Group", short0);
        this.e(igwu0);
        this.e(new igwt(igvt0));
        this.e(new igwz(igvt0, "ProductRetailer"));
        this.e(new igwl(igvt0, "TYP24Flags", Arrays.asList(new String[]{"RFU", "RFU", "AutoRenew", "CompanionPermitted", "ReservationsMandatory", "PassengerDetails", "TestOrLive", "Carnet", "UnfulfilledWarrant", "Replacement", "Duplicate", "Follow-on"})));
        this.e(new igwt(igvt0, "ProductTypeEncoding", 4));
        this.e(new igxc(igvt0, "TicketNumber", 0x20));
        this.e(new igwt(igvt0, "NumberOfAssociatedIPEs", 2));
        this.e(new igwt(igvt0, "NumberOfDiscounts", 2));
        this.e(new igwt(igvt0, "NumberOfSupplements", 2));
        this.e(new igwt(igvt0, "NumberOfTransferTypes", 2));
        this.e(new igwt(igvt0, "NumberOfInterchanges", 3));
        this.e(new igwt(igvt0, "NumberOfRestrictionTimeBands", 3));
        this.e(new igwt(igvt0, "NumberOfVehicleSpecificRestrictions", 3));
        this.e(new igwt(igvt0, "NumberOfRoutingPoints", 3));
        this.e(new igwt(igvt0, "Class", 3));
        this.e(new igwt(igvt0, "AutoRenewTimeAfterExpiry", 6));
        this.e(new igwt(igvt0, "NumberOfJourneysSold", 9));
        this.e(new igwt(igvt0, "OutPortionPeriodOfValidity", 9));
        this.e(new igwt(igvt0, "RtnPortionPeriodOfValidity", 9));
        this.e(new igxc(igvt0, "OperatorSpecificity", 16));
        this.e(new igxc(igvt0, "FaresTypeOfTicket", 24));
        this.e(new igwt(igvt0, "PartySizeAdult", 8));
        this.e(new igwt(igvt0, "PartySizeChild", 8));
        this.e(new igwt(igvt0, "PartySizeConcession", 8));
        this.e(new igxc(igvt0, "IdDocumentReference", 0x20));
        this.e(new igwv(igvt0, "Origin"));
        this.e(new igwv(igvt0, "Destination"));
        this.e(new igwv(igvt0, "AlternativeOrigin"));
        this.e(new igwv(igvt0, "AlternativeDestination"));
        this.e(new igxc(igvt0, "Route", 40));
        this.e(new igwp(igvt0, "OutPortionValidFrom"));
        this.e(new igwp(igvt0, "RtnPortionValidFrom"));
        this.e(new igxc(igvt0, "RestrictionCode", 16));
        this.e(new igwo(igvt0, "DaysTravelPermitted"));
        this.e(new igwo(igvt0, "DaysRestrictionApplies"));
        this.e(new igxd(igvt0, "AmountPaidCurrencyCode"));
        this.e(new igwx(igvt0, "AmountPaidMOP"));
        this.e(new igxe(igvt0, "AmountPaid", 0x20));
        this.e(new igwv(igvt0, "VendorLoc"));
        int v = (short)(((Short)this.c("NumberOfAssociatedIPEs").b()));
        if(v > 0) {
            igvt0.i(v);
        }
        int v1 = (short)(((Short)this.c("NumberOfDiscounts").b()));
        if(v1 > 0) {
            igvt0.i(v1 * 11);
        }
        int v2 = (short)(((Short)this.c("NumberOfSupplements").b()));
        if(v2 > 0) {
            igvt0.i(v2 * 3);
        }
        for(int v3 = (short)(((Short)this.c("NumberOfInterchanges").b())); v3 != 0; v3 = (short)(v3 - 1)) {
            new igwv(igvt0, "temp");
            new igwv(igvt0, "temp");
            igvt0.i(1);
        }
        int v4 = (short)(((Short)this.c("NumberOfTransferTypes").b()));
        if(v4 > 0) {
            igvt0.i(v4 * 3);
        }
        for(int v5 = (short)(((Short)this.c("NumberOfRestrictionTimeBands").b())); v5 != 0; v5 = (short)(v5 - 1)) {
            igvt0.i(2);
            new igwv(igvt0, "temp");
            igvt0.i(4);
        }
        for(int v6 = (short)(((Short)this.c("NumberOfVehicleSpecificRestrictions").b())); v6 != 0; v6 = (short)(v6 - 1)) {
            new igwv(igvt0, "temp");
            igvt0.i(8);
        }
        for(int v7 = (short)(((Short)this.c("NumberOfRoutingPoints").b())); v7 != 0; v7 = (short)(v7 - 1)) {
            new igwv(igvt0, "temp");
            igvt0.i(1);
        }
        int v8 = (byte)(((Byte)this.c("PaxDetail").b()));
        if(v8 != 0) {
            igvt0.i(v8 * 21);
        }
        this.d(new igxg(this).a("IIN"));
    }

    public igvx(igvf igvf0, igvt igvt0, boolean[] arr_z) {
        this(igvf0, igvt0, "IPE 2 Data Group");
        this.e(new igwu(igvt0, Arrays.asList(new String[]{"RFU", "RFU", "RFU", "RFU", "RFU", "IIN"})));
        this.e(new igwt(igvt0));
        this.e(new igwz(igvt0, "ProductRetailer"));
        this.e(new igwl(igvt0, "TYP2Flags", Arrays.asList(new String[]{"RFU", "PrintReceipt", "PrintTicket", "RFU", "RFU", "RFU", "RFU", "RFU"})));
        this.e(new igxe(igvt0, "Threshold", 16));
        this.e(new igxe(igvt0, "TopUpAmount", 16));
        this.e(new igxe(igvt0, "MaxValue2", 16));
        this.e(new igxe(igvt0, "MaximumNegativeAmount", 16));
        this.e(new igxe(igvt0, "DepositAmount", 16));
        this.e(new igwm(igvt0, "StartDateAutoTopUp"));
        this.e(new igxa(igvt0, "RFU", 14));
        this.e(new igwx(igvt0, "DepositMethodOfPayment"));
        this.e(new igxd(igvt0, "DepositCurrencyCode"));
        this.e(new igxf(igvt0, "DepositVATSalesTax"));
        this.d(new igxg(this).a("IIN"));
    }

    public igvx(igvt igvt0) {
        this(igvt0, "Transient Ticket Record");
        this.e(new igwe(igvt0, "TTLength"));
        this.e(new igwt(igvt0, "TTBitMap1", 6));
        igwt igwt0 = new igwt(igvt0, "TTFormatRevision", 4);
        this.e(igwt0);
        if(igwt0.toString().equals("1") || igwt0.toString().equals("2")) {
            this.e(new igwl(igvt0, "TTBitMap2", Arrays.asList(new String[]{"UserDefined", "RFU", "RFU", "RFU", "IINFlag", "RFU", "RC", "RFU", "ORGN", "IPEID", "DEST", "AMT"})));
        }
        if(igwt0.toString().equals("3")) {
            this.e(new igwl(igvt0, "TTBitMap2", Arrays.asList(new String[]{"UserDefined", "RFU", "RFU", "CIPE", "IINFlag", "RFU", "RC", "RFU", "ORGN", "IPEID", "DEST", "AMT"})));
        }
        if(igwt0.toString().equals("4")) {
            this.e(new igwl(igvt0, "TTBitMap2", Arrays.asList(new String[]{"UserDefined", "ENTRY_OIDFlag", "ENTRY", "CIPE", "IINFlag", "RFU", "RC", "RFU", "ORGN", "IPEID", "DEST", "AMT"})));
        }
        this.e(new igwq(igvt0, "TTTransactionType"));
        this.e(new igwp(igvt0, "DateTimeStamp"));
        igxg igxg0 = new igxg(this);
        if(igxg0.a("AMT") == 1) {
            igvx igvx0 = igxg0.b(this);
            if(igwt0.toString().equals("1")) {
                igvx0.e(new igwx(igvt0, "AmountPaidMethodOfPayment"));
                igvx0.e(new igxd(igvt0, "AmountPaidCurrencyCode"));
                igvx0.e(new igwi(igvt0, "AmountPaid"));
                igvx0.e(new igxa(igvt0, "RFU", 3));
                igvx0.e(new igwr(igvt0, "NoFareCharged"));
                igvx0.e(new igxf(igvt0, "AmountPaidVATSalesTax"));
            }
            if(igwt0.toString().equals("2") || igwt0.toString().equals("3") || igwt0.toString().equals("4")) {
                igvx0.e(new igwx(igvt0, "AmountPaidMethodOfPayment"));
                igvx0.e(new igxd(igvt0, "AmountPaidCurrencyCode"));
                igvx0.e(new igxe(igvt0, "AmountPaid", 16));
                igvx0.e(new igwr(igvt0, "CompanionTravelled"));
                igvx0.e(new igwr(igvt0, "ReturnTicket"));
                igvx0.e(new igxa(igvt0, "RFU", 1));
                igvx0.e(new igwr(igvt0, "NoFareCharged"));
                igvx0.e(new igxf(igvt0, "AmountPaidVATSalesTax"));
            }
        }
        if(igxg0.a("DEST") == 1) {
            igxg0.b(this).e(new igww(igvt0, "DestinationTT"));
        }
        if(igxg0.a("IPEID") == 1) {
            igvx igvx1 = igxg0.b(this);
            igvx1.e(new igxa(igvt0, "RFU", 3));
            igvx1.e(new igwt(igvt0, "IPEPointer", 5));
        }
        if(igxg0.a("ORGN") == 1) {
            igxg0.b(this).e(new igww(igvt0, "OriginLocation"));
        }
        if(igxg0.a("RC") == 1) {
            igxg0.b(this).e(new igww(igvt0, "RoutingCode"));
        }
        if(igxg0.a("IINFlag") == 1) {
            igxg0.b(this).e(new igvy(igvt0));
        }
        if(igwt0.toString().equals("4") && igxg0.a("CIPE") == 1) {
            igvx igvx2 = igxg0.b(this);
            igvx2.e(new igwt(igvt0, "IPEID1", 5));
            igvx2.e(new igwt(igvt0, "IPEID2", 5));
            igvx2.e(new igwt(igvt0, "IPEID3", 5));
            igvx2.e(new igwt(igvt0, "IPEID4", 5));
            igvx2.e(new igwl(igvt0, "CIPEFlags", Arrays.asList(new String[]{"RFU", "RFU", "Inspected", "Invalid Travel"})));
        }
        if(igwt0.toString().equals("4") && igxg0.a("ENTRY") == 1) {
            igvx igvx3 = igxg0.b(this);
            igvx3.e(new igvy(igvt0, "ENTRY_TT_IPE_ISAMID"));
            igvx3.e(new igvy(igvt0, "ENTRY_TT_IPE_SAMSequenceNumber", null));
            igvx3.e(new igwp(igvt0, "ENTRY_DateTimeStamp"));
        }
        if(igwt0.toString().equals("4") && igxg0.a("ENTRY_OIDFlag") == 1) {
            igvx igvx4 = igxg0.b(this);
            igvx4.e(new igwz(igvt0, "ENTRY_OID"));
            igvx4.e(new igwt(igvt0, "ENTRY_IIN_Index", 8));
        }
        if(igxg0.a("UserDefined") == 1) {
            igxg0.b(this);
        }
        this.d(0);
    }

    public igvx(igvt igvt0, int v) {
        Integer integer0 = v;
        this(igvt0, String.format(Locale.UK, "IPE 22 Value Group $1%d", integer0));
        igwj igwj0 = new igwj(igvt0);
        this.e(igwj0);
        int v1 = ((short)(((Short)((igvx)igwj0.b.get(2)).b()))) - 8;
        this.d = String.format(Locale.UK, "IPE 22 - IFR %1$d Value Group %2$d", v1, integer0);
        for(int v2 = 0; v2 < ((int)(((Integer)igwj0.b()))); ++v2) {
            this.e(new igxh(igvt0, v2));
        }
        if(igwj0.e) {
            this.e(new igvx(igvt0, null));
        }
        this.d(0);
    }

    public igvx(igvt igvt0, int v, byte[] arr_b) {
        Integer integer0 = v;
        this(igvt0, String.format(Locale.UK, "IPE 23 Value Group %1$d", integer0));
        igwj igwj0 = new igwj(igvt0);
        this.e(igwj0);
        int v1 = ((short)(((Short)((igvx)igwj0.b.get(2)).b()))) - 8;
        this.d = String.format(Locale.UK, "IPE 23 - IFR %1$d Value Group %2$d", v1, integer0);
        for(int v2 = 0; v2 < ((int)(((Integer)igwj0.b()))); ++v2) {
            this.e(new igxh(igvt0, v2, null));
        }
        if(igwj0.e) {
            this.e(new igvx(igvt0, null));
        }
        this.d(0);
    }

    public igvx(igvt igvt0, int v, char[] arr_c) {
        Integer integer0 = v;
        this(igvt0, String.format(Locale.UK, "IPE 24 Value Group %1$d", integer0));
        igwj igwj0 = new igwj(igvt0);
        this.e(igwj0);
        int v1 = ((short)(((Short)((igvx)igwj0.b.get(2)).b()))) - 8;
        this.d = String.format(Locale.UK, "IPE 24 - IFR %1$d Value Group %2$d", v1, integer0);
        for(int v2 = 0; v2 < ((int)(((Integer)igwj0.b()))); ++v2) {
            this.e(new igxh(igvt0, v2, null));
        }
        if(igwj0.e) {
            this.e(new igvx(igvt0, null));
        }
        this.d(0);
    }

    public igvx(igvt igvt0, int v, short[] arr_v) {
        this(igvt0, String.format(Locale.UK, "IPE 2 Value Group $1%d", v));
        igwj igwj0 = new igwj(igvt0);
        this.e(igwj0);
        for(int v1 = 0; v1 < ((int)(((Integer)igwj0.b()))); ++v1) {
            this.e(new igxh(igvt0, v1, null));
        }
        if(igwj0.e) {
            this.e(new igvx(igvt0, null));
        }
        this.d(0);
    }

    public igvx(igvt igvt0, String s) {
        this.a = null;
        this.b = null;
        this.e = igvt0;
        this.d = s;
    }

    public igvx(igvt igvt0, String s, byte[] arr_b) {
        this(igvt0, s);
    }

    public igvx(igvt igvt0, byte[] arr_b) {
        this(igvt0, "Value Group Extension");
        igvv igvv0 = igvt0.e();
        igwe igwe0 = new igwe(igvt0, "VGXLength");
        this.e(igwe0);
        igwt igwt0 = new igwt(igvt0, "VGXRef", 10);
        this.e(igwt0);
        switch(((short)(((Short)igwt0.b())))) {
            case 1: {
                this.e(new igwt(igvt0, "CapStrategyCode", 16));
                this.e(new igwt(igvt0, "CapAccumulator1Rule", 4));
                this.e(new igwq(igvt0, "LastFarePaid1TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator1", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator1", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator1", 16));
                this.e(new igwt(igvt0, "Cap1DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator2Rule", 4));
                this.e(new igwq(igvt0, "LastFarePaid2TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator2", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator2", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator2", 16));
                this.e(new igwt(igvt0, "Cap2DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator3Rule", 4));
                this.e(new igwq(igvt0, "LastFarePaid3TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator3", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator3", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator3", 16));
                this.e(new igwt(igvt0, "Cap3DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator4Rule", 4));
                this.e(new igwq(igvt0, "LastFarePaid4TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator4", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator4", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator4", 16));
                this.e(new igwt(igvt0, "Cap4DayCount", 16));
                this.e(new igwv(igvt0, "Location"));
                break;
            }
            case 2: {
                this.e(new igwt(igvt0, "CapStrategyCode", 16));
                this.e(new igwt(igvt0, "CapAccumulator1Rule", 4));
                this.e(new igwt(igvt0, "LastFarePaid1", 16));
                this.e(new igwq(igvt0, "LastFarePaid1TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator1", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator1", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator1", 16));
                this.e(new igwt(igvt0, "Cap1DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator2Rule", 4));
                this.e(new igwt(igvt0, "LastFarePaid2", 16));
                this.e(new igwq(igvt0, "LastFarePaid2TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator2", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator2", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator2", 16));
                this.e(new igwt(igvt0, "Cap2DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator3Rule", 4));
                this.e(new igwt(igvt0, "LastFarePaid3", 16));
                this.e(new igwq(igvt0, "LastFarePaid3TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator3", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator3", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator3", 16));
                this.e(new igwt(igvt0, "Cap3DayCount", 16));
                this.e(new igwt(igvt0, "CapAccumulator4Rule", 4));
                this.e(new igwt(igvt0, "LastFarePaid4", 16));
                this.e(new igwq(igvt0, "LastFarePaid4TransactionType"));
                this.e(new igwt(igvt0, "UncappedAccumulator4", 16));
                this.e(new igwt(igvt0, "DayCapAccumulator4", 16));
                this.e(new igwt(igvt0, "MultidayCapAccumulator4", 16));
                this.e(new igwt(igvt0, "Cap4DayCount", 16));
                this.e(new igwv(igvt0, "Location1"));
                this.e(new igwp(igvt0, "DateTimeStamp1"));
                this.e(new igwv(igvt0, "Location2"));
                this.e(new igwp(igvt0, "DateTimeStamp2"));
                this.e(new igwv(igvt0, "Location3"));
                this.e(new igwp(igvt0, "DateTimeStamp3"));
                this.e(new igwv(igvt0, "Location4"));
                this.e(new igwp(igvt0, "DateTimeStamp4"));
                break;
            }
            case 3: {
                this.e(new igwp(igvt0, "DTSOfLastValidation"));
                this.e(new igwv(igvt0, "LocationOfLastValidation"));
                this.e(new igwk(igvt0, "BookingReference", 0x40));
            }
        }
        int v = 3 - (igvt0.e().a - igvv0.a - 1) % 4;
        if(v > 0) {
            this.e(new igxa(igvt0, "VGXPadding", v * 8));
        }
        igvt0.g(igvv0);
        igvt0.h(((short)(((Short)igwe0.b()))) * 4);
        this.c = igvt0.c;
    }

    public Object a(String s, JSONObject jSONObject0) {
        Object object3;
        String s1 = s;
        JSONObject jSONObject1 = null;
        if(s1.equals("json")) {
            try {
                ArrayList arrayList0 = this.b;
                if(arrayList0 == null) {
                    return igvr.a(this);
                }
                if(arrayList0.isEmpty()) {
                    return "(empty)";
                }
                Object object0 = new JSONObject();
                for(Object object1: this.b) {
                    ((JSONObject)object0).put(((igvx)object1).d, ((igvx)object1).a(s1, jSONObject0));
                }
                return object0;
            }
            catch(JSONException unused_ex) {
                return null;
            }
        }
        Object object2 = this.b();
        if(object2 == null) {
            return null;
        }
        if(s1.equals("enum")) {
            try {
                jSONObject1 = jSONObject0.getJSONObject("extra_parameters").optJSONObject("enum_defines");
            }
            catch(JSONException unused_ex) {
            }
            if(jSONObject1 == null) {
                s1 = "string";
            }
        }
        if((object2 instanceof Byte)) {
            int v = (byte)(((Byte)object2));
            switch(s1) {
                case "bytes": {
                    try {
                        return new JSONArray(new byte[]{v});
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                case "double": {
                    return a.a(s1, "Invalid format (", ") for Byte field");
                }
                case "double0": {
                    return (double)v;
                }
                case "double1": {
                    return (double)(((double)v) / 10.0);
                }
                case "double2": {
                    return (double)(((double)v) / 100.0);
                }
                case "double3": {
                    return (double)(((double)v) / 1000.0);
                }
                case "enum": {
                    return jSONObject1.optString(object2.toString(), "Undefined code for " + object2.toString());
                }
                case "int": {
                    return v;
                }
                case "long": {
                    return (long)v;
                }
                case "string": {
                    return this.toString();
                }
            }
        }
        if((object2 instanceof Short)) {
            int v1 = (short)(((Short)object2));
            switch(s1) {
                case "bytes": {
                    try {
                        return new JSONArray(new byte[]{((byte)(v1 >> 8)), ((byte)v1)});
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                case "double": {
                    return a.a(s1, "Invalid format (", ") for Short field");
                }
                case "double0": {
                    return (double)v1;
                }
                case "double1": {
                    return (double)(((double)v1) / 10.0);
                }
                case "double2": {
                    return (double)(((double)v1) / 100.0);
                }
                case "double3": {
                    return (double)(((double)v1) / 1000.0);
                }
                case "enum": {
                    return jSONObject1.optString(object2.toString(), "Undefined code for " + object2.toString());
                }
                case "int": {
                    return v1;
                }
                case "long": {
                    return (long)v1;
                }
                case "string": {
                    return this.toString();
                }
            }
        }
        if((object2 instanceof Integer)) {
            int v2 = (int)(((Integer)object2));
            switch(s1) {
                case "bytes": {
                    try {
                        return new JSONArray(new byte[]{((byte)(v2 >> 24)), ((byte)(v2 >> 16)), ((byte)(v2 >> 8)), ((byte)v2)});
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                case "double": {
                    return a.a(s1, "Invalid format (", ") for Integer field");
                }
                case "double0": {
                    return (double)v2;
                }
                case "double1": {
                    return (double)(((double)v2) / 10.0);
                }
                case "double2": {
                    return (double)(((double)v2) / 100.0);
                }
                case "double3": {
                    return (double)(((double)v2) / 1000.0);
                }
                case "enum": {
                    return jSONObject1.optString(object2.toString(), "Undefined code for " + object2.toString());
                }
                case "int": {
                    return (Integer)object2;
                }
                case "long": {
                    return (long)v2;
                }
                case "string": {
                    return this.toString();
                }
            }
        }
        if((object2 instanceof Long)) {
            long v3 = (long)(((Long)object2));
            switch(s1) {
                case "bytes": {
                    try {
                        return new JSONArray(new byte[]{((byte)(((int)(v3 >> 56)))), ((byte)(((int)(v3 >> 0x30)))), ((byte)(((int)(v3 >> 40)))), ((byte)(((int)(v3 >> 0x20)))), ((byte)(((int)(v3 >> 24)))), ((byte)(((int)(v3 >> 16)))), ((byte)(((int)(v3 >> 8)))), ((byte)(((int)v3)))});
                    }
                    catch(JSONException unused_ex) {
                        return "JSON error returning byte[]";
                    }
                }
                case "double": {
                    return a.a(s1, "Invalid format (", ") for Long field");
                }
                case "double0": {
                    return (double)v3;
                }
                case "double1": {
                    return (double)(((double)v3) / 10.0);
                }
                case "double2": {
                    return (double)(((double)v3) / 100.0);
                }
                case "double3": {
                    return (double)(((double)v3) / 1000.0);
                }
                case "enum": {
                    return this.toString();
                }
                case "int": {
                    return a.a(s1, "Invalid format (", ") for Long field");
                }
                case "long": {
                    return (Long)object2;
                }
                case "string": {
                    return this.toString();
                }
                default: {
                    object3 = object2;
                }
            }
        }
        else {
            object3 = object2;
        }
        if((object3 instanceof Double)) {
            Double double0 = (Double)object3;
            switch(s1) {
                case "bytes": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "double": {
                    return object3;
                }
                case "double0": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "double1": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "double2": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "double3": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "enum": {
                    return this.toString();
                }
                case "int": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "long": {
                    return a.a(s1, "Invalid format (", ") for Double field");
                }
                case "string": {
                    return this.toString();
                }
            }
        }
        if((object3 instanceof byte[])) {
            byte[] arr_b = (byte[])object3;
            switch(s1.hashCode()) {
                case 0xB0F77BD1: {
                    return s1.equals("double") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0xCAD56011: {
                    return s1.equals("string") ? igvq.c(arr_b) : "Unknown format " + s1;
                }
                case 0x197EF: {
                    return s1.equals("int") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0x2F9501: {
                    return s1.equals("enum") ? igvq.c(arr_b) : "Unknown format " + s1;
                }
                case 0x32C67C: {
                    return s1.equals("long") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0x59DC06B: {
                    goto label_104;
                }
                case 0x6DF7FE7F: {
                    return s1.equals("double0") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0x6DF7FE80: {
                    return s1.equals("double1") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0x6DF7FE81: {
                    return s1.equals("double2") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
                case 0x6DF7FE82: {
                    return s1.equals("double3") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
                }
            }
            return "Unknown format " + s1;
        label_104:
            if(s1.equals("bytes")) {
                try {
                    return new JSONArray(arr_b);
                }
                catch(Exception unused_ex) {
                    return "JSON error returning byte[]";
                }
                return s1.equals("double0") ? a.a(s1, "Invalid format (", ") for byte field") : "Unknown format " + s1;
            }
        }
        return "Unknown format " + s1;
    }

    public Object b() {
        return this.a;
    }

    public final igvx c(String s) {
        if(this.d.equals(s)) {
            return this;
        }
        ArrayList arrayList0 = this.b;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                igvx igvx0 = ((igvx)arrayList0.get(v1)).c(s);
                ++v1;
                if(igvx0 != null) {
                    return igvx0;
                }
            }
        }
        return null;
    }

    public final void d(int v) {
        int v2;
        int v1;
        if(v == 0) {
            v1 = 3 - (this.e.a - 1) % 4;
            v2 = 0;
        }
        else {
            v2 = v;
            v1 = 3 - (this.e.a + 2) % 4;
        }
        if(v1 > 0) {
            this.e(new igxa(this.e, "Padding", v1 * 8));
        }
        if(v2 == 1) {
            this.e(new igvy(this.e));
        }
        this.e(new igwd(this.e));
        if(this.e.b) {
            return;
        }
        throw new Exception("Still bits left in the BitStream");
    }

    public final void e(igvx igvx0) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(igvx0);
    }

    @Override
    public String toString() {
        return this.a == null ? "" : this.a.toString();
    }
}

