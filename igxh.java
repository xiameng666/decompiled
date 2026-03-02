import java.util.Arrays;
import java.util.Locale;

public final class igxh extends igvx implements Comparable {
    private int e;

    public igxh(igvt igvt0, int v) {
        this(igvt0, 22, v);
        this.e(new igwt(igvt0, "NumberRemainingPasses", 6));
        this.e(new igwl(igvt0, "TYP22ValueFlags", Arrays.asList(new String[]{"RFU", "RFU", "RFU", "RFU", "Stored-Tickets", "Auto-Renew"})));
        this.e(new igwm(igvt0, "ExpiryDateSP"));
        this.e(new igwm(igvt0, "ExpiryDateCurrent"));
    }

    public igxh(igvt igvt0, int v, int v1) {
        super(igvt0, String.format(Locale.UK, "IPE %1$d Value Record %2$d", v, ((int)(v1 + 1))));
        this.e = v1;
        igvv igvv0 = igvt0.e();
        igvt0.h(15);
        this.c = igvt0.c;
        igvt0.g(igvv0);
        this.e(new igwq(igvt0, "TransactionType"));
        this.e(new igwt(igvt0, "TransactionSequenceNumber", 12));
        this.e(new igwp(igvt0, "DateTimeStamp"));
        this.e(new igvy(igvt0, "ISAMIDModifier"));
        this.e(new igwt(igvt0, "ActionSequenceNumber", 8));
    }

    public igxh(igvt igvt0, int v, byte[] arr_b) {
        this(igvt0, 23, v);
        this.e(new igwt(igvt0, "CountRemainingRidesJourney", 8));
        this.e(new igwt(igvt0, "CountTransfers", 8));
        this.e(new igwl(igvt0, "TYP23ValueFlags", Arrays.asList(new String[]{"RFU", "RFU", "RFU", "RFU", "RFU", "RFU", "UsedChecked", "Auto-Renew"})));
        this.e(new igxa(igvt0, "RFU", 16));
    }

    public igxh(igvt igvt0, int v, char[] arr_c) {
        this(igvt0, 23, v);
        this.e(new igwt(igvt0, "CountRemainingRidesJourney", 8));
        this.e(new igwt(igvt0, "CountTransfers", 8));
        this.e(new igwl(igvt0, "TYP24ValueFlags", Arrays.asList(new String[]{"RFU", "RFU", "RFU", "RFU", "RFU", "RFU", "UsedChecked", "Auto-Renew"})));
        this.e(new igxa(igvt0, "RFU", 16));
    }

    public igxh(igvt igvt0, int v, short[] arr_v) {
        this(igvt0, 2, v);
        igwi igwi0 = new igwi(igvt0, "Value");
        igxd igxd0 = new igxd(igvt0, "ValueCurrencyCode");
        this.e(igwi0);
        this.e(igxd0);
        this.e(new igwt(igvt0, "CountJourneyLegs", 4));
        this.e(new igxe(igvt0, "CumulativeFare", 13));
        this.e(new igwl(igvt0, "TYP2ValueFlags", Arrays.asList(new String[]{"AutoTopUp", "IPEPriorityOverride", "AutoTopUpInternal"})));
    }

    @Override
    public final int compareTo(Object object0) {
        igxh igxh0 = (igxh)object0;
        try {
            int v = (short)(((Short)this.c("TransactionSequenceNumber").b()));
            int v1 = (short)(((Short)igxh0.c("TransactionSequenceNumber").b()));
            if(v == v1) {
                long v2 = (long)(((Long)this.c("DateTimeStamp").b()));
                long v3 = (long)(((Long)igxh0.c("DateTimeStamp").b()));
                if(v2 == v3) {
                    v = igxh0.e;
                    v1 = this.e;
                    goto label_11;
                }
                return v3 > v2 ? 1 : -1;
            }
        label_11:
            int v4 = v1 - v;
            return v4 < -150 || v4 > 150 ? v - v1 : v4;
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }
}

