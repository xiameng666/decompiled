import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

public final class crze {
    public final Context a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final int f;
    public final long g;
    public final int h;
    private static final bboh i;
    private crxn j;
    private final Object k;

    static {
        crze.i = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crze(crzd crzd0) {
        this.k = new Object();
        this.a = crzd0.a;
        this.c = (long)crzd0.c;
        this.d = crzd0.d;
        this.e = crzd0.e;
        this.b = crzd0.b;
        this.h = crzd0.h;
        this.f = crzd0.f == null ? 0 : ((int)crzd0.f);
        Long long0 = crzd0.g;
        this.g = long0 == null ? crxn.b() : ((long)long0);
    }

    public static void a(Context context0, cryd cryd0, crvw crvw0, String s, long v, int v1) {
        if(hvjw.a.e().j()) {
            long v2 = System.currentTimeMillis();
            hfyt hfyt0 = crvw.c().m();
            if(hfyt0 != null && (hfyt0.b & 1) != 0) {
                hfys hfys0 = crvw.c().l();
                if(hfys0 != null) {
                    long v3 = hfyn.b((hfyt0.c == null ? hfwn.a : hfyt0.c));
                    if((hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.h && v2 - v3 >= hvjw.d()) {
                        crvw crvw1 = crvw.c();
                        hfyt hfyt1 = crvw.c().m();
                        cslv cslv0 = null;
                        Long long0 = hfyt1 == null ? null : ((long)hfyt1.d);
                        if(long0 == null) {
                            ((ggtj)crze.i.j()).x("Carrier id does not exist in device info");
                        }
                        else {
                            List list0 = csli.A(context0, 2);
                            if(list0 != null && !list0.isEmpty()) {
                                for(Object object0: list0) {
                                    cslv cslv1 = (cslv)object0;
                                    String s1 = cslv1.a;
                                    if(crvw1.s(s1) != null) {
                                        if(long0.equals(crvw1.p(s1))) {
                                            cslv0 = cslv1;
                                            goto label_32;
                                        }
                                        cslv0 = cslv1;
                                    }
                                }
                                if(cslv0 == null) {
                                    crxn.c().O(hhct.cH, 20, "GTAF_Server", "MDP_BgTask");
                                }
                            }
                            else {
                                ((ggtj)crze.i.j()).x("No supported sim card in device");
                            }
                        }
                    label_32:
                        if(hvjq.d() && cslv0 != null) {
                            s = crvw0.s(cslv0.a);
                            v = (long)crvw0.p(cslv0.a);
                        }
                        crvw crvw2 = crvw.c();
                        hhcr hhcr0 = hhcr.i;
                        boolean z = crvw2.B(hhcr0, "CLIENT_BackgroundService");
                        crxn crxn0 = crxn.c();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((giyo)hftv0).b = 5;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giyo)hftp0.b_message).c = z;
                        crxn0.j(((giyo)hftp0.N_build()), "CLIENT_BackgroundService", Integer.valueOf(v1));
                        if(!z) {
                            ((ggtj)crze.i.j()).x("setOptInToCache failed and hence not sending to GTAF");
                            return;
                        }
                        crze.b(cryd0, s, v, v1, hhcr0);
                    }
                }
            }
        }
    }

    public static void b(cryd cryd0, String s, long v, int v1, hhcr hhcr0) {
        hfwn hfwn0;
        String s1;
        int v6;
        long v2 = System.currentTimeMillis();
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
        try {
            hfys hfys0 = crvw.c().l();
            v6 = hfys0 == null ? 0 : hfys0.i;
            s1 = s;
            hfwn0 = hfyn.h(v2);
            s1 = s;
            goto label_21;
        }
        catch(acse acse0) {
            s1 = s;
            goto label_24;
            try {
            label_21:
                cryd0.m(s1, Long.valueOf(v), 7, hhcr0, hhcu0, Integer.valueOf(v6), hfwn0, Integer.valueOf(v1), Long.valueOf(v5));
                goto label_35;
            }
            catch(acse acse0) {
            }
            catch(iapl iapl0) {
                goto label_30;
            }
        label_24:
            a.e(crze.i.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
            crxn crxn0 = crxn.c();
            String s2 = crwm.c().d(s1, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
            crxn0.n(hhct.bP, 27009L, "MDP_BgTask", s2, Integer.valueOf(v1), Long.valueOf(v5));
        }
        catch(iapl iapl0) {
        label_30:
            Status status0 = crxw.a(iapl0);
            a.e(crze.i.j(), "StatusException while setting consent status: %s", new gpnd(gpnc.a, status0), iapl0);
            crxn crxn1 = crxn.c();
            String s3 = crwm.c().d(s1, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
            crxn1.n(hhct.bP, ((long)status0.i), "MDP_BgTask", s3, Integer.valueOf(v1), Long.valueOf(v5));
        }
    label_35:
        crxn.c().i(s1, v1, v5);
        crxn.c().O(hhct.bY, 20, "GTAF_Server", "MDP_BgTask");
    }

    public final boolean c() {
        String s13;
        String s10;
        cryd cryd2;
        int v15;
        int v9;
        long v4;
        gsoo gsoo0;
        String s4;
        cryd cryd1;
        int v3;
        bboh bboh0 = crze.i;
        ggtj ggtj0 = bboh0.g(cslm.h());
        long v = this.c;
        Long long0 = v;
        Boolean boolean0 = Boolean.valueOf(hvko.G());
        Boolean boolean1 = Boolean.valueOf(hvko.C());
        String s = this.d;
        ggtj0.Y("Exec GcoreRegister. req: <%s, %s> gcm:%b consentEnabled:%b", long0, s, boolean0, boolean1);
        if(!hvko.G()) {
            ((ggtj)bboh0.j()).x("GCM is not enabled on device.");
            return false;
        }
        Context context0 = this.a;
        String s1 = crxd.a().c(context0);
        if(TextUtils.isEmpty(s1)) {
            ((ggtj)bboh0.j()).x("Unable to get a GCM token.");
            return false;
        }
        crvw crvw0 = crvw.c();
        String s2 = hvko.u();
        int v1 = (int)hvko.f();
        String s3 = this.e ? s : "dummy_cpid_before_consent";
        cryd cryd0 = new cryd(context0, s2, this.b, v1);
        int v2 = this.f;
        crze.a(context0, cryd0, crvw0, s, v, v2);
        try {
            if(hvlb.f()) {
                v3 = v1;
                cryd1 = cryd0;
                s4 = s3;
                gsoo0 = cryd1.l(s1, long0, s4, s, Integer.valueOf(v2), Long.valueOf(this.g), this.h, ckjl.b);
            }
            else {
                goto label_45;
            }
            goto label_68;
        }
        catch(acse acse0) {
            v3 = v1;
            cryd1 = cryd0;
            s4 = s3;
            goto label_51;
        }
        catch(iapl iapl0) {
            v3 = v1;
            cryd1 = cryd0;
            s4 = s3;
            goto label_56;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            v3 = v1;
            cryd1 = cryd0;
            s4 = s3;
            goto label_63;
        }
        try {
            gsoo0 = cryd1.l(s1, long0, s4, s, Integer.valueOf(v2), Long.valueOf(this.g), this.h, ckjl.b);
            goto label_68;
        label_45:
            v3 = v1;
            cryd1 = cryd0;
            s4 = s3;
            gsoo0 = cryd1.k(s1, long0, s4, s, Integer.valueOf(v2), Long.valueOf(this.g), this.h);
            goto label_68;
        }
        catch(acse acse0) {
        label_51:
            Level level0 = cslm.h();
            ((ggtj)crze.i.g(level0).s(acse0)).B("GCoreRegister attempt got auth exception %s.", new gpnd(gpnc.a, acse0.getMessage()));
            v4 = 27009L;
            gsoo0 = null;
            goto label_69;
        }
        catch(iapl iapl0) {
        label_56:
            Level level1 = cslm.h();
            ggtj ggtj1 = (ggtj)crze.i.g(level1).s(iapl0);
            String s5 = crxw.a(iapl0).j;
            ggtj1.B("GCoreRegister attempt got StatusException: %s", new gpnd(gpnc.a, s5));
            v4 = (long)crxw.a(iapl0).i;
            gsoo0 = null;
            goto label_69;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
        }
    label_63:
        Level level2 = cslm.h();
        ((ggtj)crze.i.g(level2).s(illegalArgumentException0)).B("GCoreRegister attempt with invalid parameter(s): %s", new gpnd(gpnc.a, illegalArgumentException0.getMessage()));
        v4 = 27005L;
        gsoo0 = null;
        goto label_69;
    label_68:
        v4 = 0L;
    label_69:
        if(gsoo0 == null && v4 == 0L) {
            ((ggtj)crze.i.j()).x("Got null response when attempting GcoreRegister");
            v4 = 27010L;
        }
        if(gsoo0 != null) {
            int v5 = this.f;
            if(gsoo0.d != v5) {
                ggtj ggtj2 = (ggtj)crze.i.j();
                gpnd gpnd0 = new gpnd(gpnc.a, ((int)gsoo0.d));
                ggtj2.R("In GCoreRegistration, gRPC response had different eventFlowId from request. Request ID: %s, Response ID: %s", new gpnd(gpnc.a, v5), gpnd0);
            }
            long v6 = this.g;
            if(gsoo0.c != v6) {
                ggtj ggtj3 = (ggtj)crze.i.j();
                gpnd gpnd1 = new gpnd(gpnc.a, ((long)gsoo0.c));
                ggtj3.R("In GCoreRegistration, gRPC response had different uniqueRequestId from request. Request ID: %s, Response ID: %s", new gpnd(gpnc.a, v6), gpnd1);
            }
        }
        int v7 = Long.compare(v4, 0L);
        int v8 = v7 == 0 ? 1 : 0;
        String s6 = "GTAF_Server";
        if(hvka.e() && v8 != 0 && gsoo0 != null && gsoo0.b.size() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Iterator iterator0 = gsoo0.b.iterator(); true; iterator0 = iterator0) {
                v9 = 2;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                gspu gspu0 = (gspu)object0;
                gizr gizr0 = (gizr)((ProtoLiteMessage)gizs.a).v_newBuilder();
                long v10 = gspu0.c;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                ((gizs)gizr0.b_message).c = v10;
                String s7 = gspu0.f;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs0 = (gizs)gizr0.b_message;
                s7.getClass();
                gizs0.d = s7;
                String s8 = gspu0.d;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs1 = (gizs)gizr0.b_message;
                s8.getClass();
                gizs1.e = s8;
                String s9 = gspu0.e;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs2 = (gizs)gizr0.b_message;
                s9.getClass();
                gizs2.f = s9;
                boolean z = gspu0.k;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                ((gizs)gizr0.b_message).g = z;
                hhcr hhcr0 = hhcr.b(gspu0.i) == null ? hhcr.k : hhcr.b(gspu0.i);
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs3 = (gizs)gizr0.b_message;
                gizs3.h = hhcr0.a();
                long v11 = (gspu0.h == null ? gspg.a : gspu0.h).c;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                ((gizs)gizr0.b_message).i = v11;
                if(hvka.f() && (gspu0.l == null ? hfwn.a : gspu0.l).b > 0L) {
                    hfwn hfwn0 = gspu0.l == null ? hfwn.a : gspu0.l;
                    if(!gizr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gizr0).ensureMutable();
                    }
                    gizs gizs4 = (gizs)gizr0.b_message;
                    hfwn0.getClass();
                    gizs4.k = hfwn0;
                    gizs4.b |= 1;
                }
                Iterator iterator1 = (gspu0.h == null ? gspg.a : gspu0.h).b.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizl.a).v_newBuilder();
                    int v12 = hava.b(((gspe)object1).c);
                    if(v12 == 0) {
                        v12 = 1;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gizl gizl0 = (gizl)hftp0.b_message;
                    gizl0.c = hava.a(v12);
                    long v13 = ((gspe)object1).d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gizl)hftp0.b_message).d = v13;
                    hfwn hfwn1 = ((gspe)object1).f;
                    if(hfwn1 == null) {
                        hfwn1 = hfwn.a;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    hfwn1.getClass();
                    ((gizl)hftv0).e = hfwn1;
                    ((gizl)hftv0).b |= 1;
                    hfwn hfwn2 = ((gspe)object1).g;
                    if(hfwn2 == null) {
                        hfwn2 = hfwn.a;
                    }
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    hfwn2.getClass();
                    ((gizl)hftv1).f = hfwn2;
                    ((gizl)hftv1).b |= 2;
                    long v14 = ((gspe)object1).h;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gizl)hftp0.b_message).g = v14;
                    gizr0.a(((gizl)hftp0.N_build()));
                    s1 = s1;
                    iterator1 = iterator1;
                    cryd1 = cryd1;
                }
                arrayList0.add(((gizs)((ProtoLiteBuilder)gizr0).N_build()));
                v7 = v7;
                v8 = v8;
            }
            v15 = v8;
            cryd2 = cryd1;
            crxn crxn0 = this.d();
            long v16 = this.c;
            int v17 = this.f;
            long v18 = this.g;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyv.a).v_newBuilder();
            int v19 = this.h;
            s10 = s1;
            String s11 = cslm.k(bbqr.c(s1));
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            giyv giyv0 = (giyv)((giyt)hftp1).b_message;
            s11.getClass();
            giyv0.b = s11;
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            ((giyv)((giyt)hftp1).b_message).c = s2;
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            ((giyv)((giyt)hftp1).b_message).d = v3;
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            ((giyv)((giyt)hftp1).b_message).e = v16;
            String s12 = bbqr.c(s4);
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            ((giyv)((giyt)hftp1).b_message).f = s12;
            if(v19 != 0) {
                v9 = v19;
            }
            if(!((giyt)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((giyt)hftp1))).ensureMutable();
            }
            giyv giyv1 = (giyv)((giyt)hftp1).b_message;
            giyv1.g = giyu.a(v9);
            if(!bbnh.k(arrayList0)) {
                ((giyt)hftp1).a(arrayList0);
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((giyz)hftp2.b_message).c = 3;
            giyv giyv2 = (giyv)((ProtoLiteBuilder)(((giyt)hftp1))).N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giyz giyz0 = (giyz)hftp2.b_message;
            giyv2.getClass();
            giyz0.i = giyv2;
            giyz0.b |= 4;
            giyz giyz1 = (giyz)hftp2.N_build();
            gizg gizg0 = crxn0.D(17, "GTAF_Server", "MDP_PeriodicService");
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)gizg0));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gizg)hftp3.b_message).t = v18;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp3.b_message;
            giyz1.getClass();
            ((gizg)hftv2).r = giyz1;
            ((gizg)hftv2).b |= 0x100;
            if(v7 != 0) {
                if(!hftv2.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gizg)hftp3.b_message).h = v4;
            }
            crxn0.e(((gizg)hftp3.N_build()), hhct.be, Integer.valueOf(v17));
            s13 = s4;
        }
        else {
            v15 = v8;
            cryd2 = cryd1;
            s10 = s1;
            crxn crxn1 = this.d();
            long v20 = this.c;
            int v21 = v15 == 0 ? 6 : 5;
            long v22 = this.g;
            Integer integer0 = (int)this.f;
            Long long1 = v22;
            giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).v_newBuilder();
            String s14 = cslm.k(bbqr.c(s10));
            int v23 = this.h;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv3 = (giyv)giyt0.b_message;
            s14.getClass();
            giyv3.b = s14;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).c = s2;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).d = v3;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).e = v20;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv4 = (giyv)giyt0.b_message;
            s4.getClass();
            s13 = s4;
            giyv4.f = s13;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv5 = (giyv)giyt0.b_message;
            giyv5.g = giyu.a(v23);
            giyv giyv6 = (giyv)((ProtoLiteBuilder)giyt0).N_build();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp4.b_message;
            ((giyz)hftv3).c = v21 - 2;
            if(!hftv3.isImmutable()) {
                hftp4.ensureMutable();
            }
            giyz giyz2 = (giyz)hftp4.b_message;
            giyv6.getClass();
            giyz2.i = giyv6;
            giyz2.b |= 4;
            giyz giyz3 = (giyz)hftp4.N_build();
            if(v21 == 6) {
                s6 = "Error";
            }
            gizg gizg1 = crxn1.D(17, s6, "MDP_PeriodicService");
            ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg1).jf(5, null);
            hftp5.X(((ProtoLiteMessage)gizg1));
            long1.getClass();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ((gizg)hftp5.b_message).t = v22;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp5.b_message;
            giyz3.getClass();
            ((gizg)hftv4).r = giyz3;
            ((gizg)hftv4).b |= 0x100;
            if(v7 != 0) {
                if(!hftv4.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((gizg)hftp5.b_message).h = v4;
            }
            crxn1.e(((gizg)hftp5.N_build()), hhct.be, integer0);
        }
        long v24 = this.c;
        Level level3 = cslm.h();
        crze.i.g(level3).B("Register new CPID on gcm token:{%s}", s10);
        if(v15 == 0) {
            return false;
        }
        cslu cslu0 = new cslu();
        long v25 = hfyn.h(System.currentTimeMillis()).b;
        cslu0.a(hfyq.d, v25);
        Context context1 = this.a;
        String s15 = csli.g(context1);
        crxd.a();
        hfwn hfwn3 = hfyn.l();
        if(hvli.b().b.isEmpty()) {
            Level level4 = cslm.h();
            crxd.a.g(level4).x("There are no known SDK Application targets defined.");
        }
        for(Object object2: hvli.b().b) {
            String s16 = (String)object2;
            if(cslp.a(context1, s16)) {
                Intent intent0 = new Intent("com.google.android.libraries.cloud.telco.subgraph.impl.SDK_CPID_UPDATE");
                intent0.setPackage(s16);
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)fgvz.a).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp6.b_message;
                hfwn3.getClass();
                ((fgvz)hftv5).c = hfwn3;
                ((fgvz)hftv5).b |= 1;
                if(!hftv5.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp6.b_message;
                ((fgvz)hftv6).e = s15;
                if(!hftv6.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp6.b_message;
                s13.getClass();
                ((fgvz)hftv7).d = s13;
                if(!hftv7.isImmutable()) {
                    hftp6.ensureMutable();
                }
                fgvz fgvz0 = (fgvz)hftp6.b_message;
                s16.getClass();
                fgvz0.f = s16;
                intent0.putExtra("notification_cpid", ((fgvz)hftp6.N_build()).toBytesArray());
                Level level5 = cslm.h();
                crxd.a.g(level5).Y("Sending current CPID to Application with Subgraph SDK integrated: destinationPackageName: %s, iccid: %s, cpid: %s, time in seconds: %s", s16, s15, s13, Long.valueOf(hfwn3.b));
                context1.startForegroundService(intent0);
                s13 = s13;
            }
        }
        if(hvjw.l()) {
            hhcr hhcr1 = crvw.c().n();
            crze.b(cryd2, this.d, v24, this.f, hhcr1);
        }
        return true;
    }

    private final crxn d() {
        synchronized(this.k) {
            if(this.j == null) {
                this.j = new crxn(this.a);
            }
        }
        return this.j;
    }
}

