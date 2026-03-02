import android.content.ContentValues;
import java.util.ArrayList;

public final class crwg {
    public final ContentValues a;
    public static final int b;
    private static final bboh c;

    static {
        crwg.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crwg() {
        throw null;
    }

    public crwg(ContentValues contentValues0) {
        this.a = contentValues0;
    }

    public final crwf a() {
        return new crwf(this.a);
    }

    public final gspg b() {
        byte[] arr_b = this.a.getAsByteArray("notification_stats");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gspg.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gspg)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Error parsing NotificationStats from SIM table", hfur0, crwg.c);
            return null;
        }
    }

    public final hfys c() {
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
            bcnm.i(cslm.h(), "Error parsing ConsentRecord from SIM table", hfur0, crwg.c);
            return null;
        }
    }

    public final hfyu d() {
        byte[] arr_b = this.a.getAsByteArray("sim_extra");
        if(arr_b == null) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfyu.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (hfyu)hftv0;
        }
        catch(hfur hfur0) {
            bcnm.i(cslm.h(), "Error parsing SimExtra from SIM table", hfur0, crwg.c);
            return null;
        }
    }

    public final Long e() {
        return this.a.getAsLong("carrier_id");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof crwg) ? this.a.equals(((crwg)object0).a) : false;
    }

    public final Long f() {
        return this.a.getAsLong("expiration_time");
    }

    public final String g() {
        return this.a.getAsString("cpid");
    }

    public final String h() {
        return this.a.getAsString("iccid");
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("icccid", this.h(), arrayList0);
        basz.b("carrier_id", this.e(), arrayList0);
        basz.b("sim_state", this.a.getAsInteger("sim_state"), arrayList0);
        basz.b("carrier_cpid", this.g(), arrayList0);
        basz.b("exp_time", this.f(), arrayList0);
        basz.b("notification_stats", this.b(), arrayList0);
        basz.b("consent_record", this.c(), arrayList0);
        basz.b("sim_extra", this.d(), arrayList0);
        return basz.a(arrayList0, this);
    }
}

