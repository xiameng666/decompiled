import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Pair;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import java.util.List;
import jeb.synthetic.FIN;

public final class fxrb {
    private static final ggeo a;
    private static final ggeo b;
    private final ayud c;
    private final Context d;
    private final ayvm e;
    private final IntentFilter f;

    static {
        ggek ggek0 = new ggek();
        ggek0.i("com.google.android.gms", gzwl.b);
        ggek0.i("com.google.android.gms.udc", gzwl.c);
        ggek0.i("com.google.android.apps.fitness", gzwl.d);
        ggek0.i("com.google.android.googlequicksearchbox", gzwl.e);
        ggek0.i("com.google.android.apps.photos", gzwl.f);
        ggek0.i("com.google.android.apps.plus", gzwl.g);
        ggek0.i("com.google.android.gm", gzwl.h);
        ggek0.i("com.google.android.apps.maps", gzwl.i);
        ggek0.i("com.google.android.apps.gmm", gzwl.j);
        ggek0.i("com.google.android.apps.gmm.fishfood", gzwl.k);
        ggek0.i("com.google.android.apps.gmm.dev", gzwl.l);
        ggek0.i("com.google.android.apps.gmm.qp", gzwl.m);
        ggek0.i("com.ridewith", gzwl.n);
        ggek0.i("com.google.android.apps.mahlzeit", gzwl.o);
        ggek0.i("com.google.android.apps.kids.familylink", gzwl.p);
        ggek0.i("com.waze", gzwl.q);
        ggek0.i("com.google.android.apps.emergencyassist", gzwl.r);
        ggek0.i("com.google.android.apps.ridematch", gzwl.s);
        ggek0.i("com.google.android.apps.ridematch.us", gzwl.t);
        ggek0.i("com.google.android.apps.tycho", gzwl.u);
        ggek0.i("com.google.android.apps.youtube.music", gzwl.v);
        fxrb.a = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i(gzwj.a, gzww.cS);
        ggek1.i(gzwj.b, gzww.cT);
        ggek1.i(gzwj.c, gzww.cU);
        ggek1.i(gzwj.d, gzww.cV);
        ggek1.i(gzwj.e, gzww.cW);
        ggek1.i(gzwj.f, gzww.cX);
        ggek1.i(gzwj.g, gzww.cY);
        ggek1.i(gzwj.h, gzww.cZ);
        ggek1.i(gzwj.k, gzww.da);
        ggek1.i(gzwj.l, gzww.db);
        fxrb.b = ggek1.b();
    }

    public fxrb(Context context0) {
        ayud ayud0 = new aytt(context0.getApplicationContext(), "USER_LOCATION_REPORTING").a();
        super();
        this.d = context0.getApplicationContext();
        this.e = fhbe.b(context0, new fxre());
        this.c = ayud0;
        this.f = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    private final void A(gzww gzww0, gzod gzod0, String s) {
        synchronized(this) {
            ayuc ayuc0 = this.c.j(((MessageLite)gzod0), this.e);
            ayuc0.k(gzww0.dA);
            ayuc0.o(s);
            ayuc0.d();
        }
    }

    private final void B(gzww gzww0, ProtoLiteBuilder hftp0) {
        synchronized(this) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzoe.a).v_newBuilder();
            Context context0 = this.d;
            int v1 = bbms.a(context0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gzoe)hftv0).b |= 16;
            ((gzoe)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzoe gzoe0 = (gzoe)hftp1.b_message;
            gzoe0.b |= 0x20;
            gzoe0.d = 0L;
            int v2 = 2;
            Intent intent0 = jwe.b(context0, null, this.f, 2);
            if(intent0 != null) {
                int v3 = Math.round(((float)(intent0.getIntExtra("level", -1) * 100)) / ((float)intent0.getIntExtra("scale", -1)));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzoe gzoe1 = (gzoe)hftp1.b_message;
                gzoe1.b |= 0x20000;
                gzoe1.f = v3;
                int v4 = intent0.getIntExtra("status", -1);
                switch(v4) {
                    case 2: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).g = 2;
                        ((gzoe)hftp1.b_message).b |= 0x40000;
                        break;
                    }
                    case 3: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).g = 1;
                        ((gzoe)hftp1.b_message).b |= 0x40000;
                        break;
                    }
                    case 4: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).g = 4;
                        ((gzoe)hftp1.b_message).b |= 0x40000;
                        break;
                    }
                    default: {
                        if(v4 == 5) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gzoe)hftp1.b_message).g = 3;
                        }
                        else {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gzoe)hftp1.b_message).g = 0;
                        }
                        ((gzoe)hftp1.b_message).b |= 0x40000;
                    }
                }
                switch(intent0.getIntExtra("plugged", -1)) {
                    case 1: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).h = 3;
                        ((gzoe)hftp1.b_message).b |= 0x80000;
                        break;
                    }
                    case 2: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).h = 2;
                        ((gzoe)hftp1.b_message).b |= 0x80000;
                        break;
                    }
                    case 4: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).h = 4;
                        ((gzoe)hftp1.b_message).b |= 0x80000;
                        break;
                    }
                    default: {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gzoe)hftp1.b_message).h = 0;
                        ((gzoe)hftp1.b_message).b |= 0x80000;
                    }
                }
            }
            PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
            if(powerManager0 == null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gzoe)hftp1.b_message).e = 0;
            }
            else {
                if(!powerManager0.isPowerSaveMode()) {
                    v2 = 3;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gzoe)hftp1.b_message).e = v2 - 1;
            }
            ((gzoe)hftp1.b_message).b |= 0x10000;
            fxrb.C(hftp1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp0.b_message;
            gzoe gzoe2 = (gzoe)hftp1.N_build();
            gzoe2.getClass();
            gzod0.e = gzoe2;
            gzod0.b |= 1;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ayuc ayuc0 = this.c.j(((MessageLite)hftv1), this.e);
            ayuc0.k(gzww0.dA);
            ayuc0.d();
        }
    }

    private static void C(ProtoLiteBuilder hftp0) {
        int v = gzwh.a(((int)hzen.b()));
        if(v != 0) {
            switch(v - 1) {
                case 1: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzoe)hftp0.b_message).i = 1;
                    ((gzoe)hftp0.b_message).b |= 0x100000;
                    return;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzoe)hftp0.b_message).i = 2;
                    ((gzoe)hftp0.b_message).b |= 0x100000;
                    return;
                }
                case 3: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzoe)hftp0.b_message).i = 3;
                    ((gzoe)hftp0.b_message).b |= 0x100000;
                    return;
                }
                case 4: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzoe)hftp0.b_message).i = 4;
                    ((gzoe)hftp0.b_message).b |= 0x100000;
                    return;
                }
                default: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzoe)hftp0.b_message).i = 0;
                    ((gzoe)hftp0.b_message).b |= 0x100000;
                    return;
                }
            }
        }
        throw null;
    }

    public final void a() {
        synchronized(this) {
            gzkr gzkr0 = gzkr.a;
            gzww gzww0 = gzww.ag;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp0.b_message;
            gzkr0.getClass();
            gzod0.d = gzkr0;
            gzod0.c = 90;
            this.B(gzww0, hftp0);
        }
    }

    public final void b(gzwj gzwj0, String s, String s1, int v) {
        synchronized(this) {
            if(!hzek.k()) {
                return;
            }
            this.y(gzwj0, fxrb.z(gzwj0, s, s1, v));
        }
    }

    public final void c(Account account0, gzuo gzuo0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlo.a).v_newBuilder();
            float f = gzuo0.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gzlo)hftv0).b |= 2;
            ((gzlo)hftv0).d = f;
            float f1 = gzuo0.f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzlo gzlo0 = (gzlo)hftp0.b_message;
            gzlo0.b |= 4;
            gzlo0.e = f1;
            int v1 = gzuo0.i.size() + gzuo0.k.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gzlo)hftv1).b |= 8;
            ((gzlo)hftv1).f = v1 + 1;
            switch((gzun.a(gzuo0.d) == 0 ? 1 : gzun.a(gzuo0.d)) - 1) {
                case 1: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 1;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                case 2: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 2;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                case 3: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 3;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                case 4: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 4;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                case 5: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 5;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                case 6: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 6;
                    ((gzlo)hftp0.b_message).b |= 1;
                    break;
                }
                default: {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gzlo)hftp0.b_message).c = 0;
                    ((gzlo)hftp0.b_message).b |= 1;
                }
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzoe.a).v_newBuilder();
            long v2 = System.currentTimeMillis();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzoe gzoe0 = (gzoe)hftp1.b_message;
            gzoe0.b |= 0x400000;
            gzoe0.k = v2;
            gzoe gzoe1 = (gzoe)hftp1.N_build();
            gzww gzww0 = gzww.dz;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp2.b_message;
            gzoe1.getClass();
            gzod0.e = gzoe1;
            gzod0.b |= 1;
            gzlo gzlo1 = (gzlo)hftp0.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gzod gzod1 = (gzod)hftp2.b_message;
            gzlo1.getClass();
            gzod1.d = gzlo1;
            gzod1.c = 106;
            this.A(gzww0, ((gzod)hftp2.N_build()), account0.name);
        }
    }

    public final void d(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlp.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzlp gzlp0 = (gzlp)hftp0.b_message;
            gzlp0.b |= 1;
            gzlp0.c = z;
            gzlp gzlp1 = (gzlp)hftp0.N_build();
            gzww gzww0 = gzww.cQ;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gzlp1.getClass();
            gzod0.d = gzlp1;
            gzod0.c = 102;
            this.B(gzww0, hftp1);
        }
    }

    final void e(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gznu)hftv0).c = 6;
            ((gznu)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bF : gzww.bG;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    public final void f(gzlq gzlq0, gzww gzww0, List list0) {
        synchronized(this) {
            for(Object object0: list0) {
                Account account0 = (Account)((Pair)object0).first;
                int v1 = (int)(((Integer)((Pair)object0).second));
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzoe.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzoe gzoe0 = (gzoe)hftp0.b_message;
                gzoe0.b |= 0x200000;
                gzoe0.j = v1;
                long v2 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzoe gzoe1 = (gzoe)hftp0.b_message;
                gzoe1.b |= 0x400000;
                gzoe1.k = v2;
                fxrb.C(hftp0);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzod gzod0 = (gzod)hftp1.b_message;
                gzoe gzoe2 = (gzoe)hftp0.N_build();
                gzoe2.getClass();
                gzod0.e = gzoe2;
                gzod0.b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzod gzod1 = (gzod)hftp1.b_message;
                gzlq0.getClass();
                gzod1.d = gzlq0;
                gzod1.c = 105;
                this.A(gzww0, ((gzod)hftp1.N_build()), account0.name);
            }
        }
    }

    final void g(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gznu)hftv0).c = 1;
            ((gznu)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bp : gzww.bq;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    final void h(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v1 = 3;
            ((gznu)hftv0).c = 3;
            ((gznu)hftv0).b |= 1;
            if(z) {
                v1 = 2;
            }
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = v1 - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bx : gzww.by;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    public final void i(boolean z) {
        gzww gzww0;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(z) {
                gzlw gzlw0 = gzlw.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzod gzod0 = (gzod)hftp0.b_message;
                gzlw0.getClass();
                gzod0.d = gzlw0;
                gzod0.c = 82;
                gzww0 = gzww.cD;
            }
            else {
                gzlr gzlr0 = gzlr.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzod gzod1 = (gzod)hftp0.b_message;
                gzlr0.getClass();
                gzod1.d = gzlr0;
                gzod1.c = 83;
                gzww0 = gzww.cH;
            }
            this.B(gzww0, hftp0);
        }
    }

    public final void j(boolean z) {
        gzww gzww0;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(z) {
                gzlx gzlx0 = gzlx.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzod gzod0 = (gzod)hftp0.b_message;
                gzlx0.getClass();
                gzod0.d = gzlx0;
                gzod0.c = 84;
                gzww0 = gzww.cF;
            }
            else {
                gzls gzls0 = gzls.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzod gzod1 = (gzod)hftp0.b_message;
                gzls0.getClass();
                gzod1.d = gzls0;
                gzod1.c = 85;
                gzww0 = gzww.cJ;
            }
            this.B(gzww0, hftp0);
        }
    }

    public final void k(Boolean boolean0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznm.a).v_newBuilder();
            int v1 = fxrc.v(boolean0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznm)hftp0.b_message).c = v1 - 1;
            ((gznm)hftp0.b_message).b |= 4;
            gznm gznm0 = (gznm)hftp0.N_build();
            gzww gzww0 = gzww.b;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznm0.getClass();
            gzod0.d = gznm0;
            gzod0.c = 0x5F;
            this.B(gzww0, hftp1);
        }
    }

    final void l(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gznu)hftv0).c = 5;
            ((gznu)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bl : gzww.bm;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    final void m(gzwj gzwj0, String s, String s1, UploadRequest uploadRequest0, UploadRequestResult uploadRequestResult0) {
        synchronized(this) {
            if(!hzek.k()) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzkt.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = fxrb.z(gzwj0, s, s1, uploadRequestResult0.a);
            if(uploadRequestResult0.a != 4) {
                String s2 = uploadRequest0.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzkt gzkt0 = (gzkt)hftp0.b_message;
                s2.getClass();
                gzkt0.b |= 1;
                gzkt0.c = s2;
                String s3 = uploadRequest0.f;
                if(!gfta.c(s3)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzkt gzkt1 = (gzkt)hftp0.b_message;
                    s3.getClass();
                    gzkt1.b |= 2;
                    gzkt1.d = s3;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzks gzks0 = (gzks)hftp1.b_message;
            gzkt gzkt2 = (gzkt)hftp0.N_build();
            gzkt2.getClass();
            gzks0.d = gzkt2;
            gzks0.c = 8;
            this.y(gzwj0, hftp1);
        }
    }

    final void n(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gznu)hftv0).c = 4;
            ((gznu)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bB : gzww.bC;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    final void o(boolean z) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gznu)hftv0).c = 2;
            ((gznu)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznu)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((gznu)hftp0.b_message).b |= 2;
            gznu gznu0 = (gznu)hftp0.N_build();
            gzww gzww0 = z ? gzww.bt : gzww.bu;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu0.getClass();
            gzod0.d = gznu0;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
        }
    }

    public final void p(int v, Boolean boolean0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzop.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzop gzop0 = (gzop)hftp0.b_message;
            gzop0.b |= 1;
            gzop0.c = v;
            int v2 = fxrc.v(boolean0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gzop)hftp0.b_message).d = v2 - 1;
            ((gzop)hftp0.b_message).b |= 2;
            gzop gzop1 = (gzop)hftp0.N_build();
            gzww gzww0 = gzww.q;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gzop1.getClass();
            gzod0.d = gzop1;
            gzod0.c = 87;
            this.B(gzww0, hftp1);
        }
    }

    public final void q() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gznt.b(((gznt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznt)hftp0.b_message).e = 6;
            ((gznt)hftp0.b_message).b |= 1;
            gznt gznt0 = (gznt)hftp0.N_build();
            gzww gzww0 = gzww.bE;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznt0.getClass();
            gzod0.d = gznt0;
            gzod0.c = 92;
            this.B(gzww0, hftp1);
        }
    }

    public final void r() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gznt.b(((gznt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznt)hftp0.b_message).e = 1;
            ((gznt)hftp0.b_message).b |= 1;
            gznt gznt0 = (gznt)hftp0.N_build();
            gzww gzww0 = gzww.bo;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznt0.getClass();
            gzod0.d = gznt0;
            gzod0.c = 92;
            this.B(gzww0, hftp1);
        }
    }

    public final void s() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gznt.b(((gznt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznt)hftp0.b_message).e = 3;
            ((gznt)hftp0.b_message).b |= 1;
            gznt gznt0 = (gznt)hftp0.N_build();
            gzww gzww0 = gzww.bw;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznt0.getClass();
            gzod0.d = gznt0;
            gzod0.c = 92;
            this.B(gzww0, hftp1);
        }
    }

    public final void t(long v, long v1, long v2) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzns.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gzns)hftv0).b |= 1;
            ((gzns)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gzns)hftv1).b |= 2;
            ((gzns)hftv1).d = v1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzns gzns0 = (gzns)hftp0.b_message;
            gzns0.b |= 4;
            gzns0.e = v2;
            gzns gzns1 = (gzns)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gznt.b(((gznt)hftp1.b_message));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((gznt)hftv2).e = 5;
            ((gznt)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            gznt gznt0 = (gznt)hftp1.b_message;
            gzns1.getClass();
            gznt0.d = gzns1;
            gznt0.c = 3;
            gznt gznt1 = (gznt)hftp1.N_build();
            gzww gzww0 = gzww.bk;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp2.b_message;
            gznt1.getClass();
            gzod0.d = gznt1;
            gzod0.c = 92;
            this.B(gzww0, hftp2);
        }
    }

    public final void u() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gznt.b(((gznt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznt)hftp0.b_message).e = 4;
            ((gznt)hftp0.b_message).b |= 1;
            gznt gznt0 = (gznt)hftp0.N_build();
            gzww gzww0 = gzww.bA;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznt0.getClass();
            gzod0.d = gznt0;
            gzod0.c = 92;
            this.B(gzww0, hftp1);
        }
    }

    public final void v() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gznt.b(((gznt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gznt)hftp0.b_message).e = 2;
            ((gznt)hftp0.b_message).b |= 1;
            gznt gznt0 = (gznt)hftp0.N_build();
            gzww gzww0 = gzww.bs;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznt0.getClass();
            gzod0.d = gznt0;
            gzod0.c = 92;
            this.B(gzww0, hftp1);
        }
    }

    final void w(int v) {
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gznu)hftv0).c = 1;
        ((gznu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gznu)hftv1).d = 2;
        ((gznu)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gznu gznu0 = (gznu)hftp0.b_message;
        if(v != 0) {
            gznu0.e = v - 1;
            gznu0.b |= 4;
            gznu gznu1 = (gznu)hftp0.N_build();
            gzww gzww0 = gzww.bq;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu1.getClass();
            gzod0.d = gznu1;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
            FIN.finallyCodeBegin$NT(v1);
            return;
        }
        throw null;
    }

    public final void x(int v) {
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gznu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gznu)hftv0).c = 5;
        ((gznu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gznu)hftv1).d = 2;
        ((gznu)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gznu gznu0 = (gznu)hftp0.b_message;
        if(v != 0) {
            gznu0.e = v - 1;
            gznu0.b |= 4;
            gznu gznu1 = (gznu)hftp0.N_build();
            gzww gzww0 = gzww.bm;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gznu1.getClass();
            gzod0.d = gznu1;
            gzod0.c = 93;
            this.B(gzww0, hftp1);
            FIN.finallyCodeBegin$NT(v1);
            return;
        }
        throw null;
    }

    final void y(gzwj gzwj0, ProtoLiteBuilder hftp0) {
        synchronized(this) {
            if(!hzek.k()) {
                return;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzod.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzod gzod0 = (gzod)hftp1.b_message;
            gzks gzks0 = (gzks)hftp0.N_build();
            gzks0.getClass();
            gzod0.d = gzks0;
            gzod0.c = 104;
            this.B(((gzww)fxrb.b.getOrDefault(gzwj0, gzww.a)), hftp1);
        }
    }

    static final ProtoLiteBuilder z(gzwj gzwj0, String s, String s1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzks.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gzks)hftp0.b_message).e = gzwj0.m;
        ((gzks)hftp0.b_message).b |= 1;
        if(s != null) {
            gzwl gzwl0 = (gzwl)fxrb.a.get(s);
            if(gzwl0 == null) {
                gzwl gzwl1 = gzwl.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gzks)hftp0.b_message).f = gzwl1.w;
                ((gzks)hftp0.b_message).b |= 2;
                int v1 = s.hashCode();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzks gzks0 = (gzks)hftp0.b_message;
                gzks0.b |= 4;
                gzks0.g = v1;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gzks)hftp0.b_message).f = gzwl0.w;
                ((gzks)hftp0.b_message).b |= 2;
            }
        }
        if(s1 == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzks gzks3 = (gzks)hftp0.b_message;
            gzks3.b |= 8;
            gzks3.h = false;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzks gzks1 = (gzks)hftp0.b_message;
            gzks1.b |= 8;
            gzks1.h = true;
            gzwl gzwl2 = (gzwl)fxrb.a.get(s1);
            if(gzwl2 == null) {
                gzwl gzwl3 = gzwl.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gzks)hftp0.b_message).i = gzwl3.w;
                ((gzks)hftp0.b_message).b |= 16;
                int v2 = s1.hashCode();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gzks gzks2 = (gzks)hftp0.b_message;
                gzks2.b |= 0x20;
                gzks2.j = v2;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gzks)hftp0.b_message).i = gzwl2.w;
                ((gzks)hftp0.b_message).b |= 16;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzks gzks4 = (gzks)hftp0.b_message;
        gzks4.b |= 0x40;
        gzks4.k = v;
        return hftp0;
    }
}

