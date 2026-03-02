import android.content.Context;
import com.google.android.gms.mobiledataplan.CellularInfo;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetAuthResultResponse;
import j..time.Duration;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cryy implements Callable {
    public static final bboh a;
    csml b;
    private final Context c;
    private final Integer d;
    private cslg e;

    static {
        cryy.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryy(Context context0, Integer integer0) {
        this.c = context0;
        this.d = (int)(integer0 == null ? crxn.a() : ((int)integer0));
    }

    private static String a(String s) {
        return gfta.b(s).replaceAll("[0-9]", "0");
    }

    private final void b(int v, long v1, crxn crxn0) {
        crxn0.s(((long)v), hhct.dd, this.d, Long.valueOf(v1));
    }

    private final boolean c(String s, long v, String s1) {
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0;
        int v4;
        Object object0;
        Integer integer1;
        Context context0 = this.c;
        crxn crxn0 = new crxn(context0);
        int v1 = !hvlm.h() || gfta.c(s1) ? 33 : 0x20;
        Integer integer0 = this.d;
        crxn0.L(v1, hhct.db, integer0, Long.valueOf(v));
        int v2 = csli.a(s, context0);
        if(v2 == -1) {
            this.b(27002, v, crxn0);
            return false;
        }
        if(this.b == null) {
            this.b = new csml(context0, new csmb());
        }
        csng csng0 = new csng();
        csng0.a = v2;
        csng0.b();
        csng0.b = "ap2010";
        csng0.c();
        csng0.c = (int)integer0;
        csng0.d = v;
        if(hvlm.h()) {
            ((ggtj)cryy.a.h()).R("%s: Cached token found %s", "BgTaskGetMeteredness", cryy.a(s1));
            if(!gfta.c(s1)) {
                csng0.g = s1;
            }
        }
        evql evql0 = this.b.e(csng0.a());
        try {
            evrg.n(evql0);
        }
        catch(ExecutionException executionException0) {
            if((executionException0.getCause() instanceof aztb)) {
                if(((aztb)executionException0.getCause()).b() == 27059) {
                    ((ggtj)((ggtj)cryy.a.j()).s(executionException0)).R("%s: error occurred attempting TS.43 with message %s", "BgTaskGetMeteredness", ((aztb)executionException0.getCause()).getMessage());
                    if(!gfta.c(s1)) {
                        this.b(27059, v, crxn0);
                        return this.c(s, v, null);
                    }
                    this.b(27007, v, crxn0);
                    return false;
                }
                this.b(((aztb)executionException0.getCause()).b(), v, crxn0);
            }
            else {
                this.b(27016, v, crxn0);
            }
            a.e(cryy.a.j(), "%s: error attempting TS.43", "BgTaskGetMeteredness", executionException0);
            return false;
        }
        catch(InterruptedException unused_ex) {
            crxn0.s(14L, hhct.dd, this.d, Long.valueOf(v));
            return false;
        }
        GetAuthResultResponse getAuthResultResponse0 = (GetAuthResultResponse)evql0.j();
        if(getAuthResultResponse0 == null) {
            this.b(27007, v, crxn0);
            return false;
        }
        try {
            Long long0 = (long)0L;
            ArrayList arrayList0 = new ArrayList();
            JSONArray jSONArray0 = new JSONObject(getAuthResultResponse0.a).getJSONObject("ap2010").getJSONArray("DataPlanInfo");
            int v3 = 0;
            while(v3 < jSONArray0.length()) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v3).getJSONObject("DataPlanInfoDetails");
                String s2 = jSONObject0.getString("AccessType");
                String s3 = jSONObject0.getString("DataPlanType");
            alab1:
                switch(s2) {
                    case "4": {
                        integer1 = (int)3;
                        goto label_59;
                    }
                    case "5": {
                        integer1 = (int)5;
                    label_59:
                        switch(s3) {
                            case "Metered": {
                                object0 = new CellularInfo(integer1, ((int)2));
                                break alab1;
                            }
                            case "Unmetered": {
                                object0 = new CellularInfo(integer1, ((int)1));
                                break alab1;
                            }
                            default: {
                                object0 = null;
                                break alab1;
                            }
                        }
                    }
                    default: {
                        object0 = null;
                    }
                }
                if(object0 != null) {
                    arrayList0.add(object0);
                }
                ++v3;
            }
            CellularInfo[] arr_cellularInfo = (CellularInfo[])arrayList0.toArray(new CellularInfo[0]);
            if(this.e.a(crvd.a(null, null, null, null, null, null, null, long0, arr_cellularInfo, null, null), s)) {
                goto label_76;
            }
            else {
                v4 = 0x69B0;
            }
        }
        catch(JSONException unused_ex) {
            v4 = 27008;
        }
        goto label_77;
    label_76:
        v4 = 0;
    label_77:
        if(v4 != 0) {
            this.b(v4, v, crxn0);
            return false;
        }
        Integer integer2 = this.d;
        Long long1 = v;
        crxn0.L(5, hhct.dc, integer2, long1);
        if(!gfta.c(s1)) {
            crxn0.L(5, hhct.df, integer2, long1);
        }
        if(hvlm.h()) {
            String s4 = getAuthResultResponse0.f;
            if(!Objects.equals(s1, s4)) {
                crvx crvx0 = crvw.c().d;
                if(crvx0.c(s) != null && crvx0.c(s).d() != null) {
                    hfyu hfyu0 = crvx0.c(s).d();
                    hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hfyu0));
                }
                else {
                    hftp0 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
                }
                crwf crwf0 = new crwf();
                crwf0.g(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hfyu hfyu1 = (hfyu)hftp0.b_message;
                s4.getClass();
                hfyu1.f = s4;
                crwf0.i(((hfyu)hftp0.N_build()));
                crvx0.i(crwf0.a());
                String s5 = getAuthResultResponse0.g;
                if(!gfta.c(s5)) {
                    long v5 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + Long.parseLong(s5);
                    Long long2 = v5;
                    if(crvx0.c(s) != null && crvx0.c(s).d() != null) {
                        hfyu hfyu2 = crvx0.c(s).d();
                        hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu2).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)hfyu2));
                    }
                    else {
                        hftp1 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
                    }
                    crwf crwf1 = new crwf();
                    crwf1.g(s);
                    long2.getClass();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hfyu)hftp1.b_message).g = v5;
                    crwf1.i(((hfyu)hftp1.N_build()));
                    crvx0.i(crwf1.a());
                    ((ggtj)cryy.a.h()).X("%s: updated sim card cache with  token : %s && expirationTime : %o", "BgTaskGetMeteredness", cryy.a(s4), long2);
                }
            }
        }
        return true;
    }

    @Override
    public final Object call() {
        boolean z;
        if(this.e == null) {
            this.e = new cslg(this.c);
        }
        Context context0 = this.c;
        int v = 1;
        for(Object object0: csli.A(context0, 3)) {
            cslv cslv0 = (cslv)object0;
            String s = cslv0.a;
            if(csli.p(context0, s)) {
                hvks hvks0 = hvks.a;
                int v1 = 0;
                if(!hvks0.f().v() || (!hvks.h() || !hvks0.f().h().b.contains(cslv0.b))) {
                    crxn crxn1 = new crxn(context0);
                    Long long2 = crxn.b();
                    Integer integer0 = this.d;
                    crxn1.L(23, hhct.db, integer0, long2);
                    String s2 = crwm.c().d("cpid_static_meteredness", "AIzaSyD5cCj3gK6IKFQCHRf1pYAt9nDKUzfxmPg");
                    crvb crvb0 = new crvb();
                    crvb0.a(s2);
                    crvb0.a.e = cslv0.b;
                    crvb0.a.f = s;
                    crvb0.b(integer0);
                    crvb0.c(long2);
                    cryd cryd0 = new cryd(context0, hvko.u(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
                    try {
                        MdpDataPlanStatusResponse mdpDataPlanStatusResponse0 = hvlb.f() ? cryd0.b("cpid_static_meteredness", crvb0.a, ckjm.c) : cryd0.a("cpid_static_meteredness", crvb0.a);
                        z = this.e.a(mdpDataPlanStatusResponse0, s);
                        if(z) {
                            crxn1.L(5, hhct.dc, integer0, long2);
                        }
                        else {
                            crxn1.s(0x69B0L, hhct.dd, integer0, long2);
                        }
                    }
                    catch(iapl iapl0) {
                        crxn1.s(((long)crxw.a(iapl0).i), hhct.dd, this.d, long2);
                        goto label_64;
                    }
                    catch(acse unused_ex) {
                        crxn1.s(27009L, hhct.dd, this.d, long2);
                        goto label_64;
                    }
                    v1 = z;
                }
                else if(hvks0.f().p() && !csli.r(context0, csli.a(s, context0))) {
                    crxn crxn0 = new crxn(context0);
                    Long long0 = crxn.b();
                    crxn0.L(29, hhct.de, this.d, long0);
                }
                else {
                    long v2 = crxn.b();
                    String s1 = null;
                    if(hvlm.h()) {
                        crvx crvx0 = crvw.c().d;
                        crwg crwg0 = crvx0.c(s);
                        Long long1 = crwg0 == null || crwg0.d() == null ? null : ((long)crwg0.d().g);
                        int v3 = 0x1F;
                        if(long1 != null && ((long)long1) > 0L) {
                            if(Duration.ofSeconds(long1.longValue()).compareTo(Duration.ofMillis(System.currentTimeMillis()).plusSeconds(5L)) > 0) {
                                crwg crwg1 = crvx0.c(s);
                                if(crwg1 != null && crwg1.d() != null) {
                                    s1 = crwg1.d().f;
                                }
                                v3 = gfta.c(s1) ? 35 : 36;
                            }
                            else {
                                v3 = 34;
                            }
                        }
                        new crxn(context0).L(v3, hhct.db, this.d, Long.valueOf(v2));
                    }
                    v1 = this.c(s, v2, s1);
                }
            label_64:
                v &= v1;
            }
        }
        return Boolean.valueOf(((boolean)v));
    }
}

