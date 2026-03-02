import android.content.ContentValues;

public final class crwa {
    public final ContentValues a;
    public static final int b;
    private static final bboh c;

    static {
        crwa.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crwa() {
        throw null;
    }

    public crwa(ContentValues contentValues0) {
        this.a = contentValues0;
    }

    public final gspd a() {
        byte[] arr_b = this.a.getAsByteArray("list_cpid_endpoints_resp");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gspd.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gspd)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Parsing ListCpidEndpointsResponse from database carrier table error", hfur0, crwa.c);
            return null;
        }
    }

    public final hfyr b() {
        byte[] arr_b = this.a.getAsByteArray("carrier_extra");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfyr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfyr)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Error parsing CarrierExtra from SIM table", hfur0, crwa.c);
            return null;
        }
    }

    public final Long c() {
        return this.a.getAsLong("carrier_id");
    }

    public final Long d() {
        return this.a.getAsLong("expiration_time");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof crwa) ? this.a.equals(((crwa)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "CarrierTableRowSet{contentValues=" + this.a.toString() + "}";
    }
}

