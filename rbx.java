import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class rbx implements ServiceConnection {
    public final gfug a;
    public final int b;
    final rbo c;
    private final rby d;
    private final gfug e;

    public rbx(rbo rbo0, rby rby0) {
        Objects.requireNonNull(rbo0);
        this.c = rbo0;
        super();
        this.a = new gfug(rbo0.p);
        this.e = new gfug(rbo0.p);
        this.d = rby0;
        this.b = 0;
    }

    public final void a(boolean z) {
        try {
            Long long0 = this.e(z);
            if(z) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgxz)hftp0.b_message).e = 5;
                ((hgxz)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hgyr)hftv0).b |= 8;
                ((hgyr)hftv0).e = false;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hgyr hgyr0 = (hgyr)hftp1.b_message;
                hgyr0.b |= 16;
                hgyr0.f = 0;
                if(long0 != null) {
                    long v = (long)long0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hgyr hgyr1 = (hgyr)hftp1.b_message;
                    hgyr1.b |= 4;
                    hgyr1.d = v;
                }
                rbo rbo0 = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxz hgxz0 = (hgxz)hftp0.b_message;
                hgyr hgyr2 = (hgyr)hftp1.N_build();
                hgyr2.getClass();
                hgxz0.d = hgyr2;
                hgxz0.c = 3;
                rbo0.h(((hgxz)hftp0.N_build()));
                return;
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgyp.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hgyc hgyc0 = (hgyc)hftp3.b_message;
            hgyc0.b |= 1;
            hgyc0.c = 0;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hgyp hgyp0 = (hgyp)hftp2.b_message;
            hgyc hgyc1 = (hgyc)hftp3.N_build();
            hgyc1.getClass();
            hgyp0.c = hgyc1;
            hgyp0.b |= 1;
            if(long0 != null) {
                long v1 = (long)long0;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyp hgyp1 = (hgyp)hftp2.b_message;
                hgyp1.b |= 2;
                hgyp1.d = v1;
            }
            this.c.h.e(((hgyp)hftp2.N_build()));
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void b(rcm rcm0) {
        synchronized(this.c.a) {
            if(this.c.b == 3) {
                return;
            }
        }
        try {
            this.d.b(rcm0);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Exception while calling onBillingSetupFinished.", throwable0);
        }
    }

    public final void c(Exception exception0, boolean z) {
        int v;
        rdk.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exception0);
        if((exception0 instanceof DeadObjectException)) {
            v = 101;
        }
        else if((exception0 instanceof RemoteException)) {
            v = 100;
        }
        else {
            v = (exception0 instanceof SecurityException) ? 102 : 42;
        }
        String s = v == 42 ? rcj.a(exception0) : null;
        rbo.o(this.c);
        this.d(rbo.b(exception0), v, s, z);
        this.b(rbo.b(exception0));
    }

    public final void d(rcm rcm0, int v, String s, boolean z) {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
            int v1 = rcm0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hgyc)hftv0).b |= 1;
            ((hgyc)hftv0).c = v1;
            String s1 = rcm0.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s1.getClass();
            ((hgyc)hftv1).b |= 2;
            ((hgyc)hftv1).d = s1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((hgyc)hftv2).e = v - 1;
            ((hgyc)hftv2).b |= 4;
            if(s != null) {
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyc hgyc0 = (hgyc)hftp0.b_message;
                hgyc0.b |= 8;
                hgyc0.f = s;
            }
            Long long0 = this.e(z);
            if(z) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((hgyr)hftv3).b |= 8;
                ((hgyr)hftv3).e = false;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hgyr hgyr0 = (hgyr)hftp1.b_message;
                hgyr0.b |= 16;
                hgyr0.f = 0;
                if(long0 != null) {
                    long v2 = (long)long0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hgyr hgyr1 = (hgyr)hftp1.b_message;
                    hgyr1.b |= 4;
                    hgyr1.d = v2;
                }
                rbo rbo0 = this.c;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgxx.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgxx hgxx0 = (hgxx)hftp2.b_message;
                hgyc hgyc1 = (hgyc)hftp0.N_build();
                hgyc1.getClass();
                hgxx0.f = hgyc1;
                hgxx0.b |= 2;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                ((hgxx)hftv4).e = 5;
                ((hgxx)hftv4).b |= 1;
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgxx hgxx1 = (hgxx)hftp2.b_message;
                hgyr hgyr2 = (hgyr)hftp1.N_build();
                hgyr2.getClass();
                hgxx1.d = hgyr2;
                hgxx1.c = 6;
                rbo0.g(((hgxx)hftp2.N_build()));
                return;
            }
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgyp.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hgyp hgyp0 = (hgyp)hftp3.b_message;
            hgyc hgyc2 = (hgyc)hftp0.N_build();
            hgyc2.getClass();
            hgyp0.c = hgyc2;
            hgyp0.b |= 1;
            if(long0 != null) {
                long v3 = (long)long0;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hgyp hgyp1 = (hgyp)hftp3.b_message;
                hgyp1.b |= 2;
                hgyp1.d = v3;
            }
            this.c.h.e(((hgyp)hftp3.N_build()));
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    private final Long e(boolean z) {
        if(z) {
            gfug gfug0 = this.a;
            if(gfug0.a) {
                gfug0.g();
                return gfug0.a(TimeUnit.MILLISECONDS);
            }
        }
        else {
            gfug gfug1 = this.e;
            if(gfug1.a) {
                gfug1.g();
                return gfug1.a(TimeUnit.MILLISECONDS);
            }
        }
        return null;
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        hgyd hgyd0;
        rck rck1;
        rdk.h("BillingClient", "Billing service died.");
        try {
            rbo rbo0 = this.c;
            if(rbo0.n()) {
                rck rck0 = rbo0.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxx.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgxx)hftp0.b_message).e = 5;
                ((hgxx)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hgyc)hftp1.b_message).e = 0x79;
                ((hgyc)hftp1.b_message).b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxx hgxx0 = (hgxx)hftp0.b_message;
                hgyc hgyc0 = (hgyc)hftp1.N_build();
                hgyc0.getClass();
                hgxx0.f = hgyc0;
                hgxx0.b |= 2;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((hgyr)hftv0).b |= 8;
                ((hgyr)hftv0).e = false;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyr hgyr0 = (hgyr)hftp2.b_message;
                hgyr0.b |= 16;
                hgyr0.f = 0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxx hgxx1 = (hgxx)hftp0.b_message;
                hgyr hgyr1 = (hgyr)hftp2.N_build();
                hgyr1.getClass();
                hgxx1.d = hgyr1;
                hgxx1.c = 6;
                rck0.a(((hgxx)hftp0.N_build()));
            }
            else {
                rck1 = rbo0.h;
                hgyd0 = hgyd.a;
                goto label_43;
            }
            goto label_65;
        }
        catch(Throwable throwable0) {
            goto label_64;
        }
        try {
        label_43:
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgyo.a).v_newBuilder();
            hgyh hgyh0 = ((rcp)rck1).b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            hgyh0.getClass();
            ((hgyo)hftv1).e = hgyh0;
            ((hgyo)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            hgyo hgyo0 = (hgyo)hftp3.b_message;
            hgyd0.getClass();
            hgyo0.d = hgyd0;
            hgyo0.c = 7;
            hgyo hgyo1 = (hgyo)hftp3.N_build();
            ((rcp)rck1).c.a(hgyo1);
            goto label_65;
        }
        catch(Throwable throwable1) {
            try {
                rdk.i("BillingLogger", "Unable to log.", throwable1);
                goto label_65;
            }
            catch(Throwable throwable0) {
            }
        }
    label_64:
        rdk.i("BillingClient", "Unable to log.", throwable0);
    label_65:
        rbo rbo1 = this.c;
        synchronized(rbo1.a) {
            if(rbo1.b != 0 && rbo1.b != 3) {
                rbo.o(rbo1);
                rbo1.l();
                goto label_71;
            }
            return;
        }
    label_71:
        try {
            this.d.lo();
        }
        catch(Throwable throwable3) {
            rdk.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", throwable3);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        rcm rcm0;
        snw snw0;
        rbo rbo0 = this.c;
        Object object0 = rbo0.a;
        synchronized(object0) {
            if(rbo0.b != 3) {
                if(iBinder0 == null) {
                    snw0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    snw0 = (iInterface0 instanceof snw) ? ((snw)iInterface0) : new snw(iBinder0);
                }
                rbo0.q = snw0;
                goto label_14;
            }
            return;
        }
    label_14:
        if(rbo0.e(new rbv(this), 30000L, new rbw(this), (Looper.myLooper() == null ? rbo0.e : new Handler(Looper.myLooper()))) == null) {
            synchronized(object0) {
                int v = 0;
                while(v < 2) {
                    if(rbo0.b != new int[]{0, 3}[v]) {
                        ++v;
                        continue;
                    }
                    rcm0 = rcn.g;
                    this.c.s(25, rcm0);
                    this.b(rcm0);
                    return;
                }
                rcm0 = rcn.e;
            }
            this.c.s(25, rcm0);
            this.b(rcm0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        rdk.h("BillingClient", "Billing service disconnected.");
        try {
            rbo rbo0 = this.c;
            if(rbo0.n()) {
                rck rck0 = rbo0.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxx.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgxx)hftp0.b_message).e = 5;
                ((hgxx)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hgyc)hftp1.b_message).e = 120;
                ((hgyc)hftp1.b_message).b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxx hgxx0 = (hgxx)hftp0.b_message;
                hgyc hgyc0 = (hgyc)hftp1.N_build();
                hgyc0.getClass();
                hgxx0.f = hgyc0;
                hgxx0.b |= 2;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((hgyr)hftv0).b |= 8;
                ((hgyr)hftv0).e = false;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyr hgyr0 = (hgyr)hftp2.b_message;
                hgyr0.b |= 16;
                hgyr0.f = 0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxx hgxx1 = (hgxx)hftp0.b_message;
                hgyr hgyr1 = (hgyr)hftp2.N_build();
                hgyr1.getClass();
                hgxx1.d = hgyr1;
                hgxx1.c = 6;
                rck0.a(((hgxx)hftp0.N_build()));
            }
            else {
                rck rck1 = rbo0.h;
                hgyq hgyq0 = hgyq.a;
                if(hgyq0 != null) {
                    try {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgyo.a).v_newBuilder();
                        hgyh hgyh0 = ((rcp)rck1).b;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp3.b_message;
                        hgyh0.getClass();
                        ((hgyo)hftv1).e = hgyh0;
                        ((hgyo)hftv1).b |= 1;
                        if(!hftv1.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((hgyo)hftp3.b_message).d = hgyq0;
                        ((hgyo)hftp3.b_message).c = 4;
                        hgyo hgyo0 = (hgyo)hftp3.N_build();
                        ((rcp)rck1).c.a(hgyo0);
                    }
                    catch(Throwable throwable1) {
                        rdk.i("BillingLogger", "Unable to log.", throwable1);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
        this.e.e();
        this.e.f();
        rbo rbo1 = this.c;
        synchronized(rbo1.a) {
            if(rbo1.b != 3) {
                rbo.o(rbo1);
                goto label_75;
            }
            return;
        }
    label_75:
        try {
            this.d.lo();
        }
        catch(Throwable throwable3) {
            rdk.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", throwable3);
        }
    }
}

