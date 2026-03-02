import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import java.util.logging.Level;

public final class crzq extends cjtm {
    public static final bboh a;
    public final SetConsentStatusRequest b;
    public Context c;
    public crwl d;
    private final crxi e;
    private crxn f;
    private hhcr g;
    private final gmcg h;

    static {
        crzq.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzq(crxi crxi0, SetConsentStatusRequest setConsentStatusRequest0, azug azug0) {
        super(0x9E, "SetConsentStatus", azug0);
        this.e = crxi0;
        if(setConsentStatusRequest0 != null && setConsentStatusRequest0.g == null) {
            crwv crwv0 = new crwv(setConsentStatusRequest0);
            crwv0.a.g = crxn.b();
            setConsentStatusRequest0 = crwv0.a;
        }
        if(setConsentStatusRequest0 != null && setConsentStatusRequest0.f == null) {
            crwv crwv1 = new crwv(setConsentStatusRequest0);
            crwv1.b(Integer.valueOf(0));
            setConsentStatusRequest0 = crwv1.a;
        }
        this.b = setConsentStatusRequest0;
        this.h = new bblp(1, 10);
    }

    public final void b(gfsx gfsx0, hhcr hhcr0) {
        gfsx gfsx1 = gfsx.m(hhcr0);
        crxn crxn0 = this.c();
        String s = this.b.a;
        Integer integer0 = this.b.f;
        Long long0 = this.b.g;
        gizg gizg0 = crxn0.D(16, "GTAF_Server", this.d.c);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        String s1 = bbqr.c(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).e = s1;
        long v = long0 == null ? 0L : ((long)long0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v;
        if(gfsx0.i()) {
            int v1 = ((Status)gfsx0.d()).i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).h = (long)v1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizy.a).v_newBuilder();
        Object object0 = ((gftm)gfsx1).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizy gizy0 = (gizy)hftp1.b_message;
        gizy0.b = ((hhcr)object0).a();
        gizy gizy1 = (gizy)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizy1.getClass();
        gizg1.z = gizy1;
        gizg1.b |= 0x8000;
        crxn0.e(((gizg)hftp0.N_build()), hhct.w, integer0);
    }

    private final crxn c() {
        synchronized(this) {
            if(this.f == null) {
                this.f = new crxn(this.c);
            }
        }
        return this.f;
    }

    private final void d(hhcr hhcr0) {
        String s = this.d == null ? "CLIENT_TestInvalid" : this.d.c;
        Level level0 = cslm.h();
        ggtj ggtj0 = crzq.a.g(level0);
        SetConsentStatusRequest setConsentStatusRequest0 = this.b;
        ggtj0.R("SetConsent <%s> for %s.", setConsentStatusRequest0.a, this.d.c);
        try {
            crxn crxn0 = this.c();
            Integer integer0 = setConsentStatusRequest0.f;
            Long long0 = setConsentStatusRequest0.g;
            gizg gizg0 = crxn0.D(16, "Local_Cache", s);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizy.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizy gizy0 = (gizy)hftp1.b_message;
            gizy0.b = hhcr0.a();
            gizy gizy1 = (gizy)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            gizy1.getClass();
            gizg1.z = gizy1;
            gizg1.b |= 0x8000;
            if(hvkk.h() && setConsentStatusRequest0 != null) {
                crxn.T(hftp0, setConsentStatusRequest0.h);
            }
            String s1 = setConsentStatusRequest0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg2 = (gizg)hftp0.b_message;
            s1.getClass();
            gizg2.e = s1;
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).t = v;
            crxn0.e(((gizg)hftp0.N_build()), hhct.u, integer0);
            this.e.g(Status.b, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            a.e(crzq.a.i(), "Unable to complete API callback for success; error: %s", new gpnd(gpnc.a, remoteException0.getMessage()), remoteException0);
        }
    }

    private final void e(Pair pair0, boolean z) {
        crzp crzp0 = new crzp(this, pair0, z);
        this.h.execute(crzp0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        hhcr hhcr5;
        this.c = context0;
        crvw crvw0 = crvw.c();
        if(crvw0 == null) {
            ((ggtj)crzq.a.j()).x("MDP_NOT_ENABLED. Cache is missing/disabled.");
            this.j(new Status(27013, "MDP_NOT_ENABLED. Cache is missing/disabled."));
            return;
        }
        bboh bboh0 = crzq.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        SetConsentStatusRequest setConsentStatusRequest0 = this.b;
        ggtj0.S("Exec SetConsent. req:{%s} enabled:%b", setConsentStatusRequest0, hvko.C());
        if(!crvw.u() && !hvko.C()) {
            ((ggtj)bboh0.j()).x("MDP_NOT_ENABLED. Feature is off.");
            this.j(new Status(27013, "MDP_NOT_ENABLED. Feature is off."));
            return;
        }
        crwl crwl0 = crwm.c().a(setConsentStatusRequest0.a, null);
        this.d = crwl0;
        if(crwl0 == null) {
            ((ggtj)bboh0.j()).x("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId");
            this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: " + setConsentStatusRequest0.a));
            return;
        }
        crxn crxn0 = this.c();
        gizg gizg0 = crxn0.D(15, "GTAF_Server", this.d.c);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h()) {
            crxn.T(hftp0, setConsentStatusRequest0.h);
        }
        String s = setConsentStatusRequest0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        s.getClass();
        gizg1.e = s;
        long v = setConsentStatusRequest0.g == null ? 0L : ((long)setConsentStatusRequest0.g);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizx.a).v_newBuilder();
        int v1 = setConsentStatusRequest0.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizx)hftp1.b_message).f = v1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjaa.a).v_newBuilder();
        long v2 = setConsentStatusRequest0.b.getUuid().getMostSignificantBits();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gjaa)hftp2.b_message).b = v2;
        long v3 = setConsentStatusRequest0.b.getUuid().getLeastSignificantBits();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gjaa)hftp2.b_message).c = v3;
        gjaa gjaa0 = (gjaa)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gjaa0.getClass();
        ((gizx)hftv0).c = gjaa0;
        ((gizx)hftv0).b |= 1;
        hhcr hhcr0 = hhcr.b(setConsentStatusRequest0.c.a);
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizx gizx0 = (gizx)hftp1.b_message;
        gizx0.d = hhcr0.a();
        Long long0 = setConsentStatusRequest0.d;
        if(long0 != null) {
            hfwn hfwn0 = hfyn.h(long0.longValue());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizx gizx1 = (gizx)hftp1.b_message;
            hfwn0.getClass();
            gizx1.e = hfwn0;
            gizx1.b |= 2;
        }
        gizx gizx2 = (gizx)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg2 = (gizg)hftp0.b_message;
        gizx2.getClass();
        gizg2.q = gizx2;
        gizg2.b |= 0x80;
        crxn0.e(((gizg)hftp0.N_build()), hhct.t, setConsentStatusRequest0.f);
        String s1 = this.d.d;
        Long long1 = crvw0.o(s1);
        if(long1 != null && ((long)long1) > 0L) {
            if(crvw.u()) {
                if(!cslm.d().booleanValue() && (setConsentStatusRequest0.c.a != 8 && setConsentStatusRequest0.c.a != 9)) {
                    ((ggtj)bboh0.j()).x("MDP_INVALID_ARGUMENT. Can only set OPT_IN, OPT_OUT unless testing.");
                    this.j(new Status(27000, "MDP_INVALID_ARGUMENT. Can only set OPT_IN, OPT_OUT unless testing."));
                    return;
                }
                crvw crvw1 = crvw.c();
                hhcr hhcr1 = hhcr.b(setConsentStatusRequest0.c.a);
                this.g = hhcr1;
                String s2 = this.d == null ? "CLIENT_TestInvalid" : this.d.c;
                long v4 = System.currentTimeMillis();
                Long long2 = v4;
                Long long3 = setConsentStatusRequest0.d == null ? long2 : setConsentStatusRequest0.d;
                long2.getClass();
                if(((long)long3) <= v4) {
                    long2.getClass();
                    if(((long)long3) >= v4 - hvjk.b()) {
                        long2 = long3;
                    }
                }
                hfys hfys0 = crvw1.l();
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hfys0).jf(5, null);
                hftp3.X(((ProtoLiteMessage)hfys0));
                hhcr hhcr2 = hhcr.b(((hfys)hftp3.b_message).g);
                if(hhcr2 == null) {
                    hhcr2 = hhcr.k;
                }
                long v5 = (long)long2;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                ((hfys)hftv1).h = v5;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hfys hfys1 = (hfys)hftp3.b_message;
                hfys1.g = hhcr1.a();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hfys)hftp3.b_message).d = s2;
                hfys hfys2 = (hfys)hftp3.N_build();
                if(!crvw1.A(hfys2)) {
                    ggtj ggtj1 = (ggtj)bboh0.i();
                    gpnd gpnd0 = new gpnd(gpnc.a, long1);
                    gpnd gpnd1 = new gpnd(gpnc.b, s1);
                    hhcr hhcr3 = hhcr.b(hfys2.g) == null ? hhcr.k : hhcr.b(hfys2.g);
                    ggtj1.X("Error in saving device consent record <%s, %s>: %s", gpnd0, gpnd1, new gpnd(gpnc.a, hhcr3));
                    this.j(new Status(27016, "MDP_INTERNAL_ERROR. Cache update failed."));
                    return;
                }
                this.d(hhcr1);
                if(!csli.t(this.c)) {
                    ((ggtj)bboh0.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                    this.b(gfsx.m(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection.")), hhcr1);
                    return;
                }
                this.g(this.c, long1, hhcr1, long2);
                boolean z = hhcr2 != hhcr.i && hhcr1 == hhcr.i;
                if(!z && !hvjt.e()) {
                    return;
                }
                this.e(new Pair(long1, this.d.d), z);
                return;
            }
            if(!cslm.d().booleanValue()) {
                int v6 = setConsentStatusRequest0.c.a;
                if(v6 != 2 && (v6 != 1 && v6 != 5)) {
                    ((ggtj)bboh0.j()).x("MDP_INVALID_ARGUMENT. Can only set CONSENTED, DECLINED or REVOKED unless testing.");
                    this.j(new Status(27000, "MDP_INVALID_ARGUMENT. Can only set CONSENTED, DECLINED or REVOKED unless testing."));
                    return;
                }
            }
            hhcr hhcr4 = hhcr.k;
            if(crvw0.k(long1, s1) == null) {
                hhcr5 = hhcr4;
            }
            else {
                hhcr5 = hhcr.b(crvw0.k(long1, s1).g);
                if(hhcr5 == null) {
                    hhcr5 = hhcr4;
                }
            }
            hhcr hhcr6 = hhcr.b(setConsentStatusRequest0.c.a);
            hhcr hhcr7 = hhcr.b;
            if(hhcr5 == hhcr7 && hhcr6 == hhcr.c) {
                hhcr6 = hhcr.f;
            }
            else {
                hhcr hhcr8 = hhcr.f;
                if(hhcr5 == hhcr8 && hhcr6 == hhcr.c) {
                    hhcr6 = hhcr8;
                }
            }
            this.g = hhcr6;
            long v7 = System.currentTimeMillis();
            Long long4 = v7;
            Long long5 = setConsentStatusRequest0.d == null ? long4 : setConsentStatusRequest0.d;
            long4.getClass();
            if(((long)long5) <= v7) {
                long4.getClass();
                if(((long)long5) >= v7 - hvjk.b()) {
                    long4 = long5;
                }
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfys.a).v_newBuilder();
            long v8 = (long)long1;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp4.b_message;
            ((hfys)hftv2).b = v8;
            if(!hftv2.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp4.b_message;
            s1.getClass();
            ((hfys)hftv3).c = s1;
            String s3 = this.d.c;
            if(!hftv3.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp4.b_message;
            ((hfys)hftv4).d = s3;
            String s4 = setConsentStatusRequest0.a;
            if(!hftv4.isImmutable()) {
                hftp4.ensureMutable();
            }
            hfys hfys3 = (hfys)hftp4.b_message;
            s4.getClass();
            hfys3.e = s4;
            String s5 = setConsentStatusRequest0.b.getUuid().toString();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp4.b_message;
            s5.getClass();
            ((hfys)hftv5).f = s5;
            if(!hftv5.isImmutable()) {
                hftp4.ensureMutable();
            }
            hfys hfys4 = (hfys)hftp4.b_message;
            hfys4.g = hhcr6.a();
            long v9 = (long)long4;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp4.b_message;
            ((hfys)hftv6).h = v9;
            int v10 = setConsentStatusRequest0.e;
            if(!hftv6.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hfys)hftp4.b_message).i = v10;
            hfys hfys5 = (hfys)hftp4.N_build();
            if(!crvw0.w(long1, s1, hfys5)) {
                ggtj ggtj2 = (ggtj)bboh0.i();
                gpnc gpnc0 = gpnc.a;
                gpnd gpnd2 = new gpnd(gpnc0, long1);
                gpnd gpnd3 = new gpnd(gpnc.b, s1);
                hhcr hhcr9 = hhcr.b(hfys5.g);
                if(hhcr9 != null) {
                    hhcr4 = hhcr9;
                }
                ggtj2.X("Error in saving consent record <%s, %s>: %s", gpnd2, gpnd3, new gpnd(gpnc0, hhcr4));
                this.j(new Status(27016, "MDP_INTERNAL_ERROR. Cache update failed."));
                return;
            }
            this.d(hhcr6);
            if((hhcr.b(hfys5.g) == null ? hhcr4 : hhcr.b(hfys5.g)) == hhcr.c && !hvjt.e()) {
                this.b(gfqx.a, hhcr6);
                return;
            }
            if(hvje.m() && hvje.k() && hvje.j() && hvje.l()) {
                cryq cryq0 = cryq.a();
                Integer integer0 = setConsentStatusRequest0.f;
                Level level0 = cslm.h();
                cryq.a.g(level0).x("handleNewConsentStatusSet");
                cryk cryk0 = new cryk(cryq0, integer0);
                cryq0.f.execute(cryk0);
                return;
            }
            if(!csli.t(context0)) {
                ((ggtj)bboh0.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                this.b(gfsx.m(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection.")), hhcr6);
                return;
            }
            this.g(context0, long1, hhcr6, long4);
            hhcr hhcr10 = hhcr.b(hfys5.g);
            if(hhcr10 != null) {
                hhcr4 = hhcr10;
            }
            boolean z1 = hhcr4 == hhcr7 && hhcr5 != hhcr7;
            if(!z1 && !hvjt.e()) {
                return;
            }
            this.e(new Pair(long1, this.d.d), z1);
            return;
        }
        ((ggtj)bboh0.j()).x("MDP_INVALID_ARGUMENT. Cannot find matching carrier.");
        this.j(new Status(27000, "MDP_INVALID_ARGUMENT. Cannot find matching carrier."));
    }

    private final void g(Context context0, Long long0, hhcr hhcr0, Long long1) {
        crzo crzo0 = new crzo(this, context0, long0, hhcr0, long1);
        this.h.execute(crzo0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Level level0 = cslm.h();
        crzq.a.g(level0).B("Error status: {%s}", status0);
        String s = this.d == null ? "CLIENT_TestInvalid" : this.d.c;
        crxn crxn0 = this.c();
        Bundle bundle0 = this.b.h;
        long v = (long)status0.i;
        hhcr hhcr0 = this.g;
        String s1 = this.b == null ? null : this.b.a;
        Integer integer0 = this.b == null ? null : this.b.f;
        Long long0 = this.b == null ? null : this.b.g;
        gizg gizg0 = crxn0.D(16, "Error", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hhcr0 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizy.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizy gizy0 = (gizy)hftp1.b_message;
            gizy0.b = hhcr0.a();
            gizy gizy1 = (gizy)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            gizy1.getClass();
            gizg1.z = gizy1;
            gizg1.b |= 0x8000;
        }
        crxn0.U(hftp0, bundle0, hhct.v, v, s1, integer0, long0);
        try {
            this.e.g(status0, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ggtj ggtj0 = (ggtj)((ggtj)crzq.a.i()).s(remoteException0);
            gpnd gpnd0 = new gpnd(gpnc.a, status0);
            ggtj0.R("Unable to complete SetConsentStatusOperation because of error %s, failure status: {%s}", new gpnd(gpnc.a, remoteException0.getMessage()), gpnd0);
        }
    }
}

