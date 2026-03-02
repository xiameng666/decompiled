import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import jeb.synthetic.TWR;

public final class crvw {
    public static crvw a;
    public static final Object b;
    public static final bboh c;
    public final crvx d;
    private long e;
    private long f;

    static {
        crvw.b = new Object();
        crvw.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    private crvw() {
        this.e = -1L;
        this.f = 0L;
        this.d = new crvx(AppContextProvider.a());
    }

    public final boolean A(hfys hfys0) {
        crvx crvx0 = this.d;
        Long long0 = (long)1L;
        crwc crwc0 = crvx0.b(long0);
        if(crwc0 == null) {
            crwb crwb0 = new crwb();
            crwb0.d(long0);
            crwb0.b(hfys0);
            crwc0 = crwb0.a();
        }
        crwb crwb1 = crwc0.a();
        crwb1.b(hfys0);
        return crvx0.h(crwb1.a());
    }

    public final boolean B(hhcr hhcr0, String s) {
        ProtoLiteBuilder hftp0;
        crvx crvx0 = this.d;
        Long long0 = (long)1L;
        crwc crwc0 = crvx0.b(long0);
        if(crwc0 == null) {
            crwb crwb0 = new crwb();
            crwb0.d(long0);
            crwc0 = crwb0.a();
        }
        if(crwc0.b() == null) {
            hftp0 = ((ProtoLiteMessage)hfys.a).v_newBuilder();
        }
        else {
            hfys hfys0 = crwc0.b();
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfys0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfys0));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfys hfys1 = (hfys)hftp0.b_message;
        hfys1.g = hhcr0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfys)hftp0.b_message).d = s;
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfys)hftp0.b_message).h = v;
        crwb crwb1 = crwc0.a();
        crwb1.b(((hfys)hftp0.N_build()));
        return crvx0.h(crwb1.a());
    }

    public final boolean C(String s, gspd gspd0) {
        crwf crwf0 = new crwf();
        crwf0.b(Long.valueOf(gspd0.c));
        crwf0.g(s);
        crwg crwg0 = crwf0.a();
        crvx crvx0 = this.d;
        boolean z = crvx0.i(crwg0);
        ContentValues contentValues0 = new ContentValues();
        crvz.c(Long.valueOf(gspd0.c), contentValues0);
        crvz.d(gspd0, contentValues0);
        if(hvjq.a.c().q()) {
            crwa crwa0 = crvx0.a(Long.valueOf(gspd0.c));
            if(crwa0 != null) {
                String s1 = crwa0.a() == null ? null : crwa0.a().e;
                String s2 = gspd0.e;
                if(TextUtils.isEmpty(s2) || !s2.equals(s1)) {
                    contentValues0.put("carrier_logo", null);
                }
            }
        }
        boolean z1 = crvx0.g(crvz.a(contentValues0));
        crvz.a(contentValues0);
        return z && z1;
    }

    public final boolean D(String s, String s1, String s2) {
        ProtoLiteBuilder hftp0;
        crvx crvx0 = this.d;
        crwg crwg0 = crvx0.c(s);
        if(crwg0 != null && crwg0.d() != null) {
            hfyu hfyu0 = crwg0.d();
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfyu0));
        }
        else {
            hftp0 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
        }
        if(s1 != null && s1.length() == 3) {
            if(s2 == null) {
                return false;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfyu)hftp0.b_message).b = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfyu)hftp0.b_message).c = s2;
            crwf crwf0 = new crwf();
            crwf0.g(s);
            crwf0.i(((hfyu)hftp0.N_build()));
            return crvx0.i(crwf0.a());
        }
        return false;
    }

    public final boolean E(String s, gspg gspg0) {
        crvx crvx0 = this.d;
        if(crvx0.c(s) == null) {
            return false;
        }
        crwf crwf0 = new crwf();
        crwf0.g(s);
        crwf0.h((gspg0 == null ? null : gspg0.toBytesArray()));
        return crvx0.i(crwf0.a());
    }

    public final boolean F(String s) {
        if(crvw.u()) {
            hhcr hhcr0 = hhcr.b(crvw.c().l().g);
            if(hhcr0 == null) {
                hhcr0 = hhcr.k;
            }
            return hhcr0 == hhcr.i;
        }
        if(!hvko.C()) {
            return true;
        }
        hfys hfys0 = this.j(s);
        if(hfys0 != null) {
            return (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.b ? true : (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.d;
        }
        return false;
    }

    public final Pair a(String s) {
        crwg crwg0 = this.d.c(s);
        hfyu hfyu0 = crwg0 == null ? null : crwg0.d();
        return hfyu0 == null || hfyu0.b.isEmpty() || hfyu0.c.isEmpty() ? null : Pair.create(hfyu0.b, hfyu0.c);
    }

    public final MdpDataPlanStatusResponse b(String s) {
        Long long0 = this.o(s);
        crwi crwi0 = this.d.e(long0, s);
        if(crwi0 == null) {
            return null;
        }
        byte[] arr_b = crwi0.a.getAsByteArray("data_plan");
        return arr_b == null ? null : ((MdpDataPlanStatusResponse)gale.a(arr_b, MdpDataPlanStatusResponse.CREATOR));
    }

    public static crvw c() {
        synchronized(crvw.b) {
            if(crvw.a == null) {
                crvw.a = new crvw();
            }
        }
        return crvw.a;
    }

    public final ConsentAgreementText d(Long long0) {
        return this.d.f(long0);
    }

    public final gsnm e(String s) {
        crvx crvx0 = this.d;
        crwg crwg0 = crvx0.c(s);
        if(crwg0 == null) {
            return null;
        }
        crwa crwa0 = crvx0.a(crwg0.e());
        if(crwa0 == null) {
            crwg0.e();
            return null;
        }
        gspd gspd0 = crwa0.a();
        if(gspd0 == null) {
            crwg0.e();
            return null;
        }
        return gspd0.f == null ? gsnm.a : gspd0.f;
    }

    public final gspd f(Long long0) {
        crwa crwa0 = this.d.a(long0);
        return crwa0 == null ? null : crwa0.a();
    }

    public final gspd g(String s) {
        return this.f(this.p(s));
    }

    public final gspg h(String s) {
        crwg crwg0 = this.d.c(s);
        if(crwg0 == null) {
            Level level0 = cslm.h();
            crvw.c.g(level0).B("No database row for ICCID %s", s);
            return null;
        }
        return crwg0.b();
    }

    public final hfwn i(Long long0) {
        crwa crwa0 = this.d.a(long0);
        if(crwa0 == null) {
            return null;
        }
        hfyr hfyr0 = crwa0.b();
        if(hfyr0 == null) {
            return null;
        }
        return hfyr0.e == null ? hfwn.a : hfyr0.e;
    }

    public final hfys j(String s) {
        crwg crwg0 = this.d.c(s);
        return crwg0 == null ? null : crwg0.c();
    }

    public final hfys k(Long long0, String s) {
        crwg crwg0 = this.d.d(long0, s);
        return crwg0 == null ? null : crwg0.c();
    }

    public final hfys l() {
        crwc crwc0 = this.d.b(Long.valueOf(1L));
        return crwc0 == null ? null : crwc0.b();
    }

    public final hfyt m() {
        crwc crwc0 = this.d.b(Long.valueOf(1L));
        return crwc0 == null ? null : crwc0.c();
    }

    public final hhcr n() {
        hfys hfys0 = this.l();
        if(hfys0 == null) {
            return hhcr.g;
        }
        hhcr hhcr0 = hhcr.b(hfys0.g);
        return hhcr0 == null ? hhcr.k : hhcr0;
    }

    public final Long o(String s) {
        crwg crwg0;
        if(!TextUtils.isEmpty("cpid") && !TextUtils.isEmpty(s)) {
            synchronized(this.d.b) {
                crwg0 = TextUtils.isEmpty("cpid") || TextUtils.isEmpty(s) ? null : this.d.a.e("cpid = ?", new String[]{s});
            }
            return crwg0 == null ? null : crwg0.e();
        }
        return null;
    }

    public final Long p(String s) {
        if(hvlq.l() && this.e != -1L) {
            long v = hvlq.a.d().a();
            if((System.currentTimeMillis() - this.f) / 1000L < v) {
                return (long)this.e;
            }
        }
        crwg crwg0 = this.d.c(s);
        Long long0 = crwg0 == null ? null : crwg0.e();
        if(hvlq.l() && long0 != null) {
            this.e = (long)long0;
            this.f = System.currentTimeMillis();
        }
        return long0;
    }

    public final Long q(String s) {
        crwg crwg0 = this.d.c(s);
        if(crwg0 != null) {
            hfyu hfyu0 = crwg0.d();
            return hfyu0 == null ? null : ((long)hfyu0.e);
        }
        return null;
    }

    public final String r(String s) {
        Long long0 = this.p(s);
        crwa crwa0 = this.d.a(long0);
        if(crwa0 != null) {
            gspd gspd0 = crwa0.a();
            return gspd0 == null ? null : bbqr.b(gspd0.d);
        }
        return null;
    }

    public final String s(String s) {
        crwg crwg0 = this.d.c(s);
        return crwg0 != null && (!hvjq.h() || crwg0.d() == null || crwg0.d().e >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) ? crwg0.g() : null;
    }

    public final List t() {
        List list0;
        synchronized(this.d.b) {
            this.d.a.g("SimCardTable");
            SQLiteDatabase sQLiteDatabase0 = this.d.a.c();
            if(sQLiteDatabase0 == null) {
                list0 = Collections.EMPTY_LIST;
            }
            else {
                Cursor cursor0 = sQLiteDatabase0.query("SimCardTable", new String[]{"iccid"}, null, null, null, null, null);
                TWR.declareResource(cursor0);
                TWR.useResource$NT(cursor0);
                ArrayList arrayList0 = new ArrayList();
                while(true) {
                    TWR.useResource$NT(cursor0);
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    TWR.useResource$NT(cursor0);
                    arrayList0.add(cursor0.getString(cursor0.getColumnIndex("iccid")));
                }
                TWR.useResource$NT(cursor0);
                list0 = DesugarCollections.unmodifiableList(arrayList0);
            }
        }
        return list0;
    }

    public static boolean u() {
        return hvjw.n() && crvw.c().l() != null;
    }

    public final boolean v() {
        if(crvw.u() && this.l() != null) {
            hhcr hhcr0 = hhcr.b(this.l().g);
            if(hhcr0 == null) {
                hhcr0 = hhcr.k;
            }
            return hhcr0 == hhcr.j;
        }
        return false;
    }

    public final boolean w(Long long0, String s, hfys hfys0) {
        crvx crvx0 = this.d;
        crwg crwg0 = crvx0.d(long0, s);
        if(crwg0 == null) {
            return false;
        }
        crwf crwf0 = crwg0.a();
        crwf0.d(hfys0);
        return crvx0.i(crwf0.a());
    }

    public final boolean x(Long long0, ConsentAgreementText consentAgreementText0) {
        ProtoLiteBuilder hftp0;
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        crvx crvx0 = this.d;
        crwa crwa0 = crvx0.a(long0);
        if(crwa0 != null) {
            if(crwa0.b() == null) {
                hftp0 = ((ProtoLiteMessage)hfyr.a).v_newBuilder();
            }
            else {
                hfyr hfyr0 = crwa0.b();
                hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyr0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hfyr0));
            }
            ByteString hfsf0 = ByteString.copyFrom(bauc.n(consentAgreementText0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfyr)hftp0.b_message).c = hfsf0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfyr hfyr1 = (hfyr)hftp0.b_message;
            hfwn0.getClass();
            hfyr1.e = hfwn0;
            hfyr1.b |= 1;
            ContentValues contentValues0 = new ContentValues();
            crvz.c(long0, contentValues0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfyr hfyr2 = (hfyr)hftp0.b_message;
            hfwn0.getClass();
            hfyr2.e = hfwn0;
            hfyr2.b |= 1;
            crvz.b(((hfyr)hftp0.N_build()), contentValues0);
            return crvx0.g(crvz.a(contentValues0));
        }
        return false;
    }

    public final boolean y(String s, Long long0, String s1, long v) {
        return this.d.k(s, long0, s1, v);
    }

    public final boolean z(Long long0, hhcr hhcr0) {
        ProtoLiteBuilder hftp0;
        crvx crvx0 = this.d;
        crwa crwa0 = crvx0.a(long0);
        if(crwa0 == null) {
            return false;
        }
        if(crwa0.b() == null) {
            hftp0 = ((ProtoLiteMessage)hfyr.a).v_newBuilder();
        }
        else {
            hfyr hfyr0 = crwa0.b();
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfyr0));
        }
        ContentValues contentValues0 = new ContentValues();
        crvz.c(long0, contentValues0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfyr hfyr1 = (hfyr)hftp0.b_message;
        hfyr1.d = hhcr0.a();
        crvz.b(((hfyr)hftp0.N_build()), contentValues0);
        return crvx0.g(crvz.a(contentValues0));
    }
}

