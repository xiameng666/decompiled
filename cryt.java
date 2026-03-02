import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

final class cryt implements Callable {
    private static final bboh a;
    private final Context b;
    private final int c;
    private final long d;
    private Long e;
    private crxn f;

    static {
        cryt.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryt(Context context0, Integer integer0) {
        this.b = context0;
        this.c = (int)integer0;
        this.d = crxn.b();
    }

    public final boolean a() {
        Level level0 = cslm.h();
        cryt.a.g(level0).B("%s: runAndAwaitResult: start", "BgTaskGcoreRegister");
        try {
            return ((Boolean)evrg.n(evrg.a(new bblp(1, 10), this))).booleanValue();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            Level level1 = cslm.h();
            cryt.a.g(level1).B("%s: runAndAwaitResult: failed.", "BgTaskGcoreRegister");
            return false;
        }
    }

    private final crxn b() {
        if(this.f == null) {
            this.f = new crxn(this.b);
        }
        return this.f;
    }

    private static gizl c(gspe gspe0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizl.a).v_newBuilder();
        int v = hava.b(gspe0.c) == 0 ? 1 : hava.b(gspe0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizl gizl0 = (gizl)hftp0.b_message;
        gizl0.c = hava.a(v);
        long v1 = gspe0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizl)hftp0.b_message).d = v1;
        hfwn hfwn0 = gspe0.f == null ? hfwn.a : gspe0.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((gizl)hftv0).e = hfwn0;
        ((gizl)hftv0).b |= 1;
        hfwn hfwn1 = gspe0.g == null ? hfwn.a : gspe0.g;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hfwn1.getClass();
        ((gizl)hftv1).f = hfwn1;
        ((gizl)hftv1).b |= 2;
        long v2 = gspe0.h;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizl)hftp0.b_message).g = v2;
        return (gizl)hftp0.N_build();
    }

    @Override
    public final Object call() {
        int v4;
        gsoo gsoo1;
        boolean z5;
        String s11;
        cryd cryd1;
        hhcr hhcr1;
        String s8;
        String s2;
        bboh bboh0 = cryt.a;
        bboh0.g(cslm.h()).B("%s: call: start", "BgTaskGcoreRegister");
        Context context0 = this.b;
        crvw crvw0 = crvw.c();
        Object object0 = Boolean.valueOf(false);
        if(context0 == null) {
            bboh0.g(cslm.h()).B("%s: call: null context; quitting.", "BgTaskGcoreRegister");
            return object0;
        }
        String s = crxd.a().c(context0);
        if(TextUtils.isEmpty(s)) {
            bboh0.g(cslm.h()).B("%s: call: no GCM token.", "BgTaskGcoreRegister");
            return object0;
        }
        String s1 = crvw0.s(csli.g(context0));
        if(s1 == null) {
            s2 = "dummy_cpid_before_retrieval";
        }
        else {
            this.e = crvw0.o(s1);
            s2 = s1;
        }
        if(this.e == null) {
            this.e = crzj.b;
        }
        crvw crvw1 = crvw.c();
        giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).v_newBuilder();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv0 = (giyv)giyt0.b_message;
        s.getClass();
        giyv0.b = s;
        String s3 = hvko.u();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).c = s3;
        int v = (int)hvko.f();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).d = v;
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv1 = (giyv)giyt0.b_message;
        giyv1.g = giyu.a(2);
        String s4 = TimeZone.getDefault().getDisplayName();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv2 = (giyv)giyt0.b_message;
        s4.getClass();
        giyv2.h = s4;
        for(Object object1: csli.A(context0, 2)) {
            String s5 = ((cslv)object1).a;
            String s6 = ((cslv)object1).b;
            Long long0 = crvw1.p(s5);
            String s7 = crvw1.s(s5);
            if(long0 == null || ((long)long0) <= 0L) {
                long0 = crzj.b;
            }
            if(TextUtils.isEmpty(s7)) {
                s8 = "dummy_cpid_before_retrieval";
            }
            else {
                if(!crvw1.F(s5)) {
                    s7 = "dummy_cpid_before_consent";
                }
                s8 = s7;
            }
            gizr gizr0 = (gizr)((ProtoLiteMessage)gizs.a).v_newBuilder();
            long v1 = (long)long0;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            ((gizs)gizr0.b_message).c = v1;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs0 = (gizs)gizr0.b_message;
            s8.getClass();
            gizs0.d = s8;
            String s9 = s6.substring(0, 3);
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs1 = (gizs)gizr0.b_message;
            s9.getClass();
            gizs1.e = s9;
            String s10 = s6.substring(3);
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs2 = (gizs)gizr0.b_message;
            s10.getClass();
            gizs2.f = s10;
            boolean z = ((cslv)object1).d;
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            ((gizs)gizr0.b_message).g = z;
            hfys hfys0 = crvw.c().j(s5);
            if(hfys0 == null) {
                hhcr1 = hhcr.e;
            }
            else {
                hhcr hhcr0 = hhcr.b(hfys0.g);
                hhcr1 = hhcr0 == null ? hhcr.k : hhcr0;
            }
            if(!gizr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gizr0).ensureMutable();
            }
            gizs gizs3 = (gizs)gizr0.b_message;
            gizs3.h = hhcr1.a();
            gspg gspg0 = crvw1.h(s5);
            if(gspg0 != null) {
                long v2 = gspg0.c;
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                ((gizs)gizr0.b_message).i = v2;
                for(Object object2: gspg0.b) {
                    gizr0.a(cryt.c(((gspe)object2)));
                }
            }
            Long long1 = crvw1.q(s5);
            if(hvka.f() && long1 != null) {
                hfwn hfwn0 = hfyn.j(long1.longValue());
                if(!gizr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr0).ensureMutable();
                }
                gizs gizs4 = (gizs)gizr0.b_message;
                hfwn0.getClass();
                gizs4.k = hfwn0;
                gizs4.b |= 1;
            }
            giyt0.l(gizr0);
            crvw0 = crvw0;
        }
        gspg gspg1 = crvw1.h(csli.g(context0));
        if(gspg1 != null) {
            long v3 = gspg1.c;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).j = v3;
            for(Object object3: gspg1.b) {
                giyt0.k(cryt.c(((gspe)object3)));
            }
        }
        crxu crxu0 = new crxu();
        boolean z1 = crxu0.q();
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).l = z1;
        boolean z2 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).o = z2;
        boolean z3 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).m = z3;
        boolean z4 = crxu0.r("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        ((giyv)giyt0.b_message).n = z4;
        crxn crxn0 = this.b();
        giyv giyv3 = (giyv)((ProtoLiteBuilder)giyt0).N_build();
        Integer integer0 = (int)this.c;
        Long long2 = (long)this.d;
        crxn0.t(giyv3, integer0, long2);
        cryd cryd0 = new cryd(context0, hvko.u(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
        crze.a(context0, cryd0, crvw0, s2, this.e.longValue(), this.c);
        gsoo gsoo0 = null;
        try {
            bboh0.g(cslm.h()).Y("%s: call: ignoreDefault %b, preferSys %b, registerAll %b", "BgTaskGcoreRegister", Boolean.valueOf(true), Boolean.valueOf(hvka.d()), Boolean.valueOf(hvka.e()));
            if(hvlb.f()) {
                goto label_176;
            }
            else {
                goto label_181;
            }
            goto label_206;
        }
        catch(acse acse0) {
            cryd1 = cryd0;
            s11 = s;
            z5 = false;
            goto label_188;
        }
        catch(iapl iapl0) {
            cryd1 = cryd0;
            s11 = s;
            z5 = false;
            goto label_194;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            cryd1 = cryd0;
            s11 = s;
            z5 = false;
            goto label_202;
        }
        try {
        label_176:
            s11 = s;
            z5 = false;
            gsoo1 = cryd0.l(s11, null, null, null, integer0, long2, 2, ckjl.c);
            cryd1 = cryd0;
            goto label_206;
        label_181:
            s11 = s;
            z5 = false;
            gsoo1 = cryd0.k(s11, null, null, null, integer0, long2, 2);
            cryd1 = cryd0;
            goto label_206;
        }
        catch(acse acse0) {
            cryd1 = cryd0;
        label_188:
            Level level0 = cslm.h();
            ((ggtj)cryt.a.g(level0).s(acse0)).R("%s: call: got auth exception %s.", "BgTaskGcoreRegister", new gpnd(gpnc.a, acse0.getMessage()));
            v4 = 27009;
            goto label_208;
        }
        catch(iapl iapl0) {
            cryd1 = cryd0;
        label_194:
            Level level1 = cslm.h();
            ggtj ggtj0 = (ggtj)cryt.a.g(level1).s(iapl0);
            String s12 = crxw.a(iapl0).j;
            ggtj0.R("%s: call: got StatusException: %s", "BgTaskGcoreRegister", new gpnd(gpnc.a, s12));
            v4 = crxw.a(iapl0).i;
            goto label_208;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            cryd1 = cryd0;
        }
    label_202:
        Level level2 = cslm.h();
        ((ggtj)cryt.a.g(level2).s(illegalArgumentException0)).R("%s: call: invalid parameter(s): %s", "BgTaskGcoreRegister", new gpnd(gpnc.a, illegalArgumentException0.getMessage()));
        v4 = 27004;
        goto label_208;
    label_206:
        gsoo0 = gsoo1;
        v4 = 0;
    label_208:
        if(gsoo0 == null && v4 == 0) {
            ((ggtj)cryt.a.j()).B("%s: call: Got null response from GTAF", "BgTaskGcoreRegister");
            v4 = 27010;
        }
        if(gsoo0 != null) {
            z5 = true;
        }
        if(z5) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object4: gsoo0.b) {
                gspu gspu0 = (gspu)object4;
                gizr gizr1 = (gizr)((ProtoLiteMessage)gizs.a).v_newBuilder();
                long v5 = gspu0.c;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                ((gizs)gizr1.b_message).c = v5;
                String s13 = gspu0.f;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                gizs gizs5 = (gizs)gizr1.b_message;
                s13.getClass();
                gizs5.d = s13;
                String s14 = gspu0.d;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                gizs gizs6 = (gizs)gizr1.b_message;
                s14.getClass();
                gizs6.e = s14;
                String s15 = gspu0.e;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                gizs gizs7 = (gizs)gizr1.b_message;
                s15.getClass();
                gizs7.f = s15;
                boolean z6 = gspu0.k;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                ((gizs)gizr1.b_message).g = z6;
                hhcr hhcr2 = hhcr.b(gspu0.i) == null ? hhcr.k : hhcr.b(gspu0.i);
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                gizs gizs8 = (gizs)gizr1.b_message;
                gizs8.h = hhcr2.a();
                long v6 = (gspu0.h == null ? gspg.a : gspu0.h).c;
                if(!gizr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gizr1).ensureMutable();
                }
                ((gizs)gizr1.b_message).i = v6;
                if(hvka.f() && (gspu0.l == null ? hfwn.a : gspu0.l).b > 0L) {
                    hfwn hfwn1 = gspu0.l == null ? hfwn.a : gspu0.l;
                    if(!gizr1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gizr1).ensureMutable();
                    }
                    gizs gizs9 = (gizs)gizr1.b_message;
                    hfwn1.getClass();
                    gizs9.k = hfwn1;
                    gizs9.b |= 1;
                }
                for(Object object5: (gspu0.h == null ? gspg.a : gspu0.h).b) {
                    gizr1.a(cryt.c(((gspe)object5)));
                }
                arrayList0.add(((gizs)((ProtoLiteBuilder)gizr1).N_build()));
            }
            this.b().V(s11, 19, v4, this.c, this.d, arrayList0);
        }
        else {
            this.b().V(s11, 20, v4, this.c, this.d, null);
        }
        if(z5) {
            int v7 = this.c;
            if(gsoo0.d != v7) {
                Level level3 = cslm.h();
                cryt.a.g(level3).X("%s: call: response had different eventFlowIds. Request: %s, Response: %s", "BgTaskGcoreRegister", Integer.valueOf(v7), Integer.valueOf(gsoo0.d));
            }
            long v8 = this.d;
            if(gsoo0.c != v8) {
                Level level4 = cslm.h();
                cryt.a.g(level4).X("%s: call: response had different uniqueRequestId. Request: %s, Response: %s", "BgTaskGcoreRegister", Long.valueOf(v8), Long.valueOf(gsoo0.c));
            }
            cslu cslu0 = new cslu();
            long v9 = hfyn.h(System.currentTimeMillis()).b;
            cslu0.a(hfyq.d, v9);
        }
        if(hvjw.l()) {
            long v10 = (long)this.e;
            hhcr hhcr3 = crvw.c().n();
            crze.b(cryd1, s2, v10, this.c, hhcr3);
        }
        return Boolean.valueOf(z5);
    }
}

