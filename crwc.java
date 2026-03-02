import android.content.ContentValues;

public final class crwc {
    public final ContentValues a;
    public static final int b;
    private static final bboh c;

    static {
        crwc.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crwc() {
        throw null;
    }

    public crwc(ContentValues contentValues0) {
        this.a = contentValues0;
    }

    public final crwb a() {
        return new crwb(this.a);
    }

    public final hfys b() {
        byte[] arr_b = this.a.getAsByteArray("consent_record");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfys.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfys)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Error parsing ConsentRecord from Device Table", hfur0, crwc.c);
            return null;
        }
    }

    public final hfyt c() {
        byte[] arr_b = this.a.getAsByteArray("device_info");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfyt.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfyt)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Error parsing DeviceInfo from Device table", hfur0, crwc.c);
            return null;
        }
    }

    public final Long d() {
        return this.a.getAsLong("version_index");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof crwc) ? this.a.equals(((crwc)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "DeviceTableRowSet{contentValues=" + this.a.toString() + "}";
    }
}

