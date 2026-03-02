import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class crvx {
    public final crvy a;
    public final Object b;
    private static final bboh c;

    static {
        crvx.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crvx(Context context0) {
        this.b = new Object();
        gftb.check(context0);
        this.a = new crvy(context0);
    }

    public final crwa a(Long long0) {
        byte[] arr_b2;
        byte[] arr_b1;
        String s;
        byte[] arr_b;
        crwa crwa0 = null;
        if(long0 == null) {
            return null;
        }
        synchronized(this.b) {
            this.a.g("CarrierTable");
            SQLiteDatabase sQLiteDatabase0 = this.a.c();
            if(sQLiteDatabase0 != null) {
                Cursor cursor0 = sQLiteDatabase0.query("CarrierTable", null, "carrier_id = ?", new String[]{long0.toString()}, null, null, null);
                TWR.declareResource(cursor0);
                TWR.useResource$NT(cursor0);
                if(cursor0.moveToNext()) {
                    TWR.useResource$NT(cursor0);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("carrier_id", long0);
                    int v1 = cursor0.getColumnIndex("list_cpid_endpoints_resp");
                    if(cursor0.getType(v1) == 0) {
                        TWR.useResource$NT(cursor0);
                        arr_b = null;
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        arr_b = cursor0.getBlob(v1);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("list_cpid_endpoints_resp", arr_b);
                    int v2 = cursor0.getColumnIndex("mcc_mnc");
                    if(cursor0.getType(v2) == 0) {
                        TWR.useResource$NT(cursor0);
                        s = null;
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        s = cursor0.getString(v2);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("mcc_mnc", s);
                    int v3 = cursor0.getColumnIndex("carrier_app_logo");
                    if(cursor0.getType(v3) == 0) {
                        TWR.useResource$NT(cursor0);
                        arr_b1 = null;
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        arr_b1 = cursor0.getBlob(v3);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("carrier_app_logo", arr_b1);
                    int v4 = cursor0.getColumnIndex("carrier_logo");
                    if(cursor0.getType(v4) == 0) {
                        TWR.useResource$NT(cursor0);
                        arr_b2 = null;
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        arr_b2 = cursor0.getBlob(v4);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("carrier_logo", arr_b2);
                    int v5 = cursor0.getColumnIndex("expiration_time");
                    if(v5 >= 0) {
                        TWR.useResource$NT(cursor0);
                        contentValues0.put("expiration_time", Long.valueOf(cursor0.getLong(v5)));
                        int v6 = cursor0.getColumnIndex("carrier_extra");
                        if(cursor0.getType(v6) != 0) {
                            TWR.useResource$NT(cursor0);
                            crwa0 = cursor0.getBlob(v6);
                        }
                        TWR.useResource$NT(cursor0);
                        contentValues0.put("carrier_extra", ((byte[])crwa0));
                        crwa0 = new crwa(contentValues0);
                    }
                }
            }
        }
        return crwa0;
    }

    public final crwc b(Long long0) {
        crwc crwc0;
        byte[] arr_b;
        synchronized(this.b) {
            crwc0 = null;
            SQLiteDatabase sQLiteDatabase0 = this.a.c();
            if(sQLiteDatabase0 != null) {
                try {
                    if(sQLiteDatabase0.getVersion() >= 5) {
                        goto label_11;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    a.ae(crvy.a.j(), "Cannot get db version", sQLiteException0);
                }
                return crwc0;
            label_11:
                Cursor cursor0 = sQLiteDatabase0.query("DeviceTable", null, "version_index = ?", new String[]{long0.toString()}, null, null, null);
                TWR.declareResource(cursor0);
                TWR.useResource$NT(cursor0);
                if(cursor0.moveToNext()) {
                    TWR.useResource$NT(cursor0);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("version_index", long0);
                    int v1 = cursor0.getColumnIndex("consent_record");
                    if(cursor0.getType(v1) == 0) {
                        TWR.useResource$NT(cursor0);
                        arr_b = null;
                    }
                    else {
                        TWR.useResource$NT(cursor0);
                        arr_b = cursor0.getBlob(v1);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("consent_record", arr_b);
                    int v2 = cursor0.getColumnIndex("device_info");
                    if(cursor0.getType(v2) != 0) {
                        TWR.useResource$NT(cursor0);
                        crwc0 = cursor0.getBlob(v2);
                    }
                    TWR.useResource$NT(cursor0);
                    contentValues0.put("device_info", ((byte[])crwc0));
                    crwc0 = new crwc(contentValues0);
                }
            }
        }
        return crwc0;
    }

    public final crwg c(String s) {
        crwg crwg0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        synchronized(this.b) {
            crvy crvy0 = this.a;
            if(!TextUtils.isEmpty(s)) {
                crwg0 = crvy0.e("iccid = ?", new String[]{s});
            }
        }
        return crwg0;
    }

    public final crwg d(Long long0, String s) {
        crwg crwg0 = null;
        if(long0 != null && ((long)long0) > 0L && !TextUtils.isEmpty(s)) {
            synchronized(this.b) {
                crvy crvy0 = this.a;
                if(((long)long0) > 0L && !TextUtils.isEmpty(s)) {
                    crwg0 = crvy0.e("carrier_id = ? AND cpid = ?", new String[]{long0.toString(), s});
                }
            }
            return crwg0;
        }
        return null;
    }

    public final crwi e(Long long0, String s) {
        byte[] arr_b1;
        byte[] arr_b;
        String s1;
        crwi crwi0 = null;
        if(long0 != null && s != null) {
            synchronized(this.b) {
                this.a.g("SubscriptionTable");
                SQLiteDatabase sQLiteDatabase0 = this.a.c();
                if(sQLiteDatabase0 != null) {
                    Cursor cursor0 = sQLiteDatabase0.query("SubscriptionTable", null, "carrier_id = ? AND cpid = ?", new String[]{long0.toString(), s}, null, null, null);
                    TWR.declareResource(cursor0);
                    TWR.useResource$NT(cursor0);
                    if(cursor0.moveToNext()) {
                        TWR.useResource$NT(cursor0);
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("carrier_id", long0);
                        contentValues0.put("cpid", s);
                        int v1 = cursor0.getColumnIndex("locale");
                        if(cursor0.getType(v1) == 0) {
                            TWR.useResource$NT(cursor0);
                            s1 = null;
                        }
                        else {
                            TWR.useResource$NT(cursor0);
                            s1 = cursor0.getString(v1);
                        }
                        TWR.useResource$NT(cursor0);
                        contentValues0.put("locale", s1);
                        int v2 = cursor0.getColumnIndex("data_plan");
                        if(cursor0.getType(v2) == 0) {
                            TWR.useResource$NT(cursor0);
                            arr_b = null;
                        }
                        else {
                            TWR.useResource$NT(cursor0);
                            arr_b = cursor0.getBlob(v2);
                        }
                        TWR.useResource$NT(cursor0);
                        contentValues0.put("data_plan", arr_b);
                        int v3 = cursor0.getColumnIndex("upsell_offer");
                        if(cursor0.getType(v3) == 0) {
                            TWR.useResource$NT(cursor0);
                            arr_b1 = null;
                        }
                        else {
                            TWR.useResource$NT(cursor0);
                            arr_b1 = cursor0.getBlob(v3);
                        }
                        TWR.useResource$NT(cursor0);
                        contentValues0.put("upsell_offer", arr_b1);
                        int v4 = cursor0.getColumnIndex("expiration_time");
                        if(v4 >= 0) {
                            TWR.useResource$NT(cursor0);
                            contentValues0.put("expiration_time", Long.valueOf(cursor0.getLong(v4)));
                            crwi0 = new crwi(contentValues0);
                        }
                    }
                }
            }
            return crwi0;
        }
        return null;
    }

    public final ConsentAgreementText f(Long long0) {
        crwa crwa0 = this.a(long0);
        if(crwa0 != null && crwa0.b() != null && !crwa0.b().c.isEmpty()) {
            try {
                return (ConsentAgreementText)bauc.a(crwa0.b().c.toByteArray(), ConsentAgreementText.CREATOR);
            }
            catch(batz batz0) {
                a.ae(crvx.c.i(), "Exception reading consent text byte string", batz0);
            }
        }
        return null;
    }

    public final boolean g(crwa crwa0) {
        String[] arr_s;
        if(crwa0.c() != null) {
            long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + hvko.c();
            if(crwa0.d() == null || ((long)crwa0.d()) - v > 0L || hvjq.g()) {
                crwa0.a.put("expiration_time", Long.valueOf(v));
            }
            synchronized(this.b) {
                arr_s = new String[]{crwa0.c().toString()};
                this.a.g("CarrierTable");
            }
            return this.a.f("CarrierTable", crwa0.a, "carrier_id = ?", arr_s);
        }
        return false;
    }

    public final boolean h(crwc crwc0) {
        String[] arr_s;
        if(crwc0.d() != null) {
            synchronized(this.b) {
                arr_s = new String[]{crwc0.d().toString()};
            }
            return this.a.f("DeviceTable", crwc0.a, "version_index = ?", arr_s);
        }
        return false;
    }

    public final boolean i(crwg crwg0) {
        String[] arr_s;
        if(crwg0.h() != null) {
            long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + hvko.a.q().d();
            crwg crwg1 = this.c(crwg0.h());
            Long long0 = crwg1 == null ? null : crwg1.f();
            if(crwg0.f() == null && long0 == null || crwg0.f() != null && ((long)crwg0.f()) - v > 0L || hvjq.g()) {
                crwg0.a.put("expiration_time", Long.valueOf(v));
            }
            synchronized(this.b) {
                arr_s = new String[]{crwg0.h()};
                this.a.g("SimCardTable");
            }
            return this.a.f("SimCardTable", crwg0.a, "iccid = ?", arr_s);
        }
        return false;
    }

    public final boolean j(crwi crwi0) {
        String[] arr_s;
        if(crwi0.a() != null && crwi0.c() != null) {
            long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + hvko.c();
            if(crwi0.b() == null || ((long)crwi0.b()) - v > 0L || hvjq.g()) {
                crwi0.a.put("expiration_time", Long.valueOf(v));
            }
            synchronized(this.b) {
                arr_s = new String[]{crwi0.a().toString(), crwi0.c()};
                this.a.g("SubscriptionTable");
            }
            return this.a.f("SubscriptionTable", crwi0.a, "carrier_id = ? AND cpid = ?", arr_s);
        }
        return false;
    }

    public final boolean k(String s, Long long0, String s1, long v) {
        ProtoLiteBuilder hftp0;
        crwg crwg0 = this.c(s);
        if(crwg0 != null && crwg0.d() != null) {
            hfyu hfyu0 = crwg0.d();
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfyu0));
        }
        else {
            hftp0 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
        }
        crwf crwf0 = new crwf();
        crwf0.b(long0);
        crwf0.c(s1);
        crwf0.g(s);
        long v1 = v + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfyu)hftp0.b_message).e = v1;
        crwf0.i(((hfyu)hftp0.N_build()));
        return this.i(crwf0.a());
    }
}

