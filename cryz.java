import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

final class cryz implements Callable {
    private static final bboh a;
    private final Context b;
    private final int c;
    private final crvw d;
    private crxn e;

    static {
        cryz.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryz(Context context0, Integer integer0) {
        this.b = context0;
        this.c = (int)integer0;
        this.d = crvw.c();
    }

    public final boolean a() {
        try {
            return ((Boolean)evrg.n(evrg.a(new bblp(1, 10), this))).booleanValue();
        }
        catch(ExecutionException | InterruptedException exception0) {
            a.ae(cryz.a.i(), "Timed out, interrupted, or failed while getting TriggeringVector from SharedPreferences.", exception0);
            return false;
        }
    }

    private final crxn b() {
        synchronized(this) {
            if(this.e == null) {
                this.e = new crxn(this.b);
            }
        }
        return this.e;
    }

    @Override
    public final Object call() {
        int v8;
        int v7;
        int v6;
        gged_interceptors gged1;
        crvw crvw1;
        boolean z1;
        int v14;
        hfys hfys2;
        Context context0 = this.b;
        if(context0 == null) {
            ((ggtj)cryz.a.j()).x("Background consent task called with null context.");
            return Boolean.valueOf(false);
        }
        crvw crvw0 = this.d;
        List list0 = crvw0.t();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = (String)object0;
            hfys hfys0 = crvw0.j(s);
            if(hfys0 != null && ((hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.c || hvjt.e()) && ((hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.d && ((hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.e && !hfys0.j && crvw0.s(s) != null))) {
                arrayList0.add(s);
            }
        }
        gged_interceptors gged0 = gged_interceptors.i(arrayList0);
        boolean z = true;
        if(!gged0.isEmpty()) {
            int v = gged0.size();
            int v1 = 0;
            int v2 = 1;
            while(v1 < v) {
                String s1 = (String)gged0.get(v1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhcu.a).v_newBuilder();
                long v3 = UUID.randomUUID().getMostSignificantBits();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hhcu)hftp0.b_message).b = v3;
                long v4 = UUID.randomUUID().getLeastSignificantBits();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hhcu)hftp0.b_message).c = v4;
                hhcu hhcu0 = (hhcu)hftp0.N_build();
                long v5 = crxn.b();
                String s2 = crvw0.s(s1);
                Long long0 = crvw0.p(s1);
                hfys hfys1 = crvw0.j(s1);
                String s3 = bbqr.d(s2) ? "MDP_INVALID_CARRIER_PLAN_ID " : "";
                if(long0 == null) {
                    s3 = s3 + "MDP_REQUIRE_CARRIER_ID ";
                }
                if(hfys1 == null) {
                    s3 = s3 + "MDP_REQUIRE_CONSENT_RECORD ";
                }
                if(s3.isEmpty()) {
                    crxn crxn0 = this.b();
                    int v9 = hfys1.i;
                    UUID uUID0 = UUID.randomUUID();
                    hhcr hhcr0 = hhcr.b(hfys1.g) == null ? hhcr.k : hhcr.b(hfys1.g);
                    crvw1 = crvw0;
                    gged1 = gged0;
                    long v10 = hfys1.h;
                    int v11 = this.c;
                    gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_BgTask");
                    v6 = v;
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)gizg0));
                    String s4 = bbqr.c(s2);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gizg)hftp1.b_message).e = s4;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gizg)hftp1.b_message).t = v5;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizx.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gizx)hftp2.b_message).f = v9;
                    hfwn hfwn0 = hfyn.h(v10);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    v7 = v1;
                    hfwn0.getClass();
                    ((gizx)hftv0).e = hfwn0;
                    ((gizx)hftv0).b |= 2;
                    if(hhcr0 != null) {
                        if(!hftv0.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gizx gizx0 = (gizx)hftp2.b_message;
                        gizx0.d = hhcr0.a();
                    }
                    if(uUID0 == null) {
                        v8 = v2;
                    }
                    else {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gjaa.a).v_newBuilder();
                        v8 = v2;
                        long v12 = uUID0.getMostSignificantBits();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gjaa)hftp3.b_message).b = v12;
                        long v13 = uUID0.getLeastSignificantBits();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gjaa)hftp3.b_message).c = v13;
                        gjaa gjaa0 = (gjaa)hftp3.N_build();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gizx gizx1 = (gizx)hftp2.b_message;
                        gjaa0.getClass();
                        gizx1.c = gjaa0;
                        gizx1.b |= 1;
                    }
                    gizx gizx2 = (gizx)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizg gizg1 = (gizg)hftp1.b_message;
                    gizx2.getClass();
                    gizg1.q = gizx2;
                    gizg1.b |= 0x80;
                    Integer integer0 = v11;
                    crxn0.e(((gizg)hftp1.N_build()), hhct.bN, integer0);
                    cryd cryd0 = new cryd(context0, hvko.u(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
                    try {
                        if(hvlb.f()) {
                            hfys2 = hfys1;
                            cryd0.n(s2, long0, 7, (hhcr.b(hfys1.g) == null ? hhcr.k : hhcr.b(hfys1.g)), hhcu0, Integer.valueOf(hfys1.i), hfyn.h(hfys1.h), integer0, Long.valueOf(v5), ckjp.b);
                        }
                        else {
                            hfys2 = hfys1;
                            cryd0.m(s2, long0, 7, (hhcr.b(hfys2.g) == null ? hhcr.k : hhcr.b(hfys2.g)), hhcu0, Integer.valueOf(hfys2.i), hfyn.h(hfys2.h), integer0, Long.valueOf(v5));
                        }
                        goto label_137;
                    }
                    catch(acse acse0) {
                        a.e(cryz.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
                        crxn crxn1 = this.b();
                        String s5 = crwm.c().d(s2, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
                        crxn1.n(hhct.bP, 27009L, "MDP_BgTask", s5, Integer.valueOf(this.c), Long.valueOf(v5));
                    }
                    catch(iapl iapl0) {
                        Status status0 = crxw.a(iapl0);
                        a.e(cryz.a.j(), "StatusException while setting consent status: %s", new gpnd(gpnc.a, status0), iapl0);
                        crxn crxn2 = this.b();
                        String s6 = crwm.c().d(s2, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
                        crxn2.n(hhct.bP, ((long)status0.i), "MDP_BgTask", s6, Integer.valueOf(this.c), Long.valueOf(v5));
                    }
                    v14 = 0;
                    goto label_166;
                label_137:
                    crxn crxn3 = this.b();
                    int v15 = this.c;
                    crxn3.i(s2, v15, v5);
                    crvw crvw2 = this.d;
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)hfys2).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)hfys2));
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((hfys)hftp4.b_message).j = true;
                    hfys hfys3 = (hfys)hftp4.N_build();
                    crvx crvx0 = crvw2.d;
                    crwg crwg0 = crvx0.c(s1);
                    if(crwg0 == null) {
                        z1 = false;
                    }
                    else {
                        crwf crwf0 = crwg0.a();
                        crwf0.d(hfys3);
                        z1 = crvx0.i(crwf0.a());
                    }
                    crxn crxn4 = this.b();
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp5.b_message;
                    ((giyo)hftv1).b = 5;
                    if(!hftv1.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((giyo)hftp5.b_message).c = z1;
                    crxn4.j(((giyo)hftp5.N_build()), "MDP_BgTask", Integer.valueOf(v15));
                    v14 = true;
                }
                else {
                    ((ggtj)cryz.a.j()).B("Failed to get data needed from cache for background SetConsent gRPC. Error: %s", new gpnd(gpnc.a, s3));
                    crvw1 = crvw0;
                    gged1 = gged0;
                    v6 = v;
                    v7 = v1;
                    v8 = v2;
                    v14 = 0;
                }
            label_166:
                v2 = v14 & v8;
                v1 = v7 + 1;
                crvw0 = crvw1;
                gged0 = gged1;
                v = v6;
            }
            z = v2;
        }
        return Boolean.valueOf(z);
    }
}

