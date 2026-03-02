import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import j..util.Objects;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import jeb.synthetic.FIN;

public final class ccdr extends wby implements IInterface {
    public final int a;
    public final int b;
    public clcq c;
    public final AtomicLong d;
    private final gogw e;
    private final ExecutorService f;
    private final clbs g;
    private final double h;
    private Runnable i;
    private Future j;
    private final AtomicLong k;
    private final String l;
    private int m;
    private ccdq n;

    public ccdr() {
        super("com.google.android.gms.learning.internal.http.IHttpRequestHandle");
    }

    public ccdr(byte[] arr_b, ExecutorService executorService0, clbs clbs0, int v, int v1, double f, String s) {
        super("com.google.android.gms.learning.internal.http.IHttpRequestHandle");
        this.i = new ccbu();
        this.m = 1;
        this.k = new AtomicLong(0L);
        this.d = new AtomicLong(0L);
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gogw.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.e = (gogw)hftv0;
            this.f = executorService0;
            this.g = clbs0;
            this.a = v;
            this.b = v1;
            this.h = f;
            this.l = s;
        }
        catch(hfur hfur0) {
            throw new ccbz("invalid JniHttpRequest", hfur0);
        }
    }

    public final void a() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.m != 4) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new ccbv();
    }

    public final void c(String s, Exception exception0) {
        synchronized(this) {
            int v1 = this.m;
            this.m = 4;
            hhmz hhmz0 = hhmz.p;
            if((exception0 instanceof SocketTimeoutException)) {
                hhmz0 = hhmz.e;
            }
            else if((exception0 instanceof ccby)) {
                hhmz0 = hhmz.d;
            }
            this.m(hhmz0, String.format("%s (%s)", s, exception0), v1);
        }
    }

    public final void d(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            this.a();
            gftb.check(this.n);
            try {
                ccdq ccdq0 = this.n;
                Parcel parcel0 = ccdq0.jo();
                parcel0.writeByteArray(arr_b);
                parcel0.writeInt(v);
                parcel0.writeInt(v1);
                Parcel parcel1 = ccdq0.hM(4, parcel0);
                boolean z = wbz.i(parcel1);
                parcel1.recycle();
                this.k(z);
            }
            catch(RemoteException remoteException0) {
                throw new ccbz("unexpected RemoteException", remoteException0);
            }
        }
    }

    public final void e() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.m == 4) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        gftb.check(this.n);
        this.m = 4;
        try {
            this.n.jp(6, this.n.jo());
            FIN.finallyExec$NT(v);
        }
        catch(RemoteException remoteException0) {
            throw new ccbz("unexpected RemoteException", remoteException0);
        }
    }

    public final void f(byte[] arr_b) {
        synchronized(this) {
            this.a();
            gftb.check(this.n);
            this.m = 3;
            try {
                ccdq ccdq0 = this.n;
                Parcel parcel0 = ccdq0.jo();
                parcel0.writeByteArray(arr_b);
                Parcel parcel1 = ccdq0.hM(2, parcel0);
                boolean z = wbz.i(parcel1);
                parcel1.recycle();
                this.k(z);
            }
            catch(RemoteException remoteException0) {
                throw new ccbz("unexpected RemoteException", remoteException0);
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        long v1;
        ccdq ccdq0;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ccdq0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
                    ccdq0 = (iInterface0 instanceof ccdq) ? ((ccdq)iInterface0) : new ccdq(iBinder0);
                }
                ccdr.gr(parcel0);
                this.i(ccdq0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                this.h();
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                synchronized(this) {
                    v1 = this.c == null ? 0L : this.c.b();
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gogy.a).v_newBuilder();
                double f = (double)this.k.get();
                double f1 = this.h;
                double f2 = (double)this.d.get();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gogy)hftv0).b = (long)(f * f1 + f2);
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gogy)hftp0.b_message).c = v1;
                byte[] arr_b = ((gogy)hftp0.N_build()).toBytesArray();
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            case 5: {
                synchronized(this) {
                    int v2 = this.m;
                    if(v2 != 4) {
                        this.m = 4;
                        this.m(hhmz.b, "request cancelled via close()", v2);
                        Future future0 = this.j;
                        if(future0 != null) {
                            future0.cancel(true);
                        }
                        this.i.run();
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void g(byte[] arr_b, long v, int[] arr_v) {
        synchronized(this) {
            this.a();
            gftb.check(this.n);
            try {
                ccdq ccdq0 = this.n;
                Parcel parcel0 = ccdq0.jo();
                parcel0.writeByteArray(arr_b);
                parcel0.writeLong(v);
                parcel0.writeIntArray(arr_v);
                Parcel parcel1 = ccdq0.hM(1, parcel0);
                boolean z = wbz.i(parcel1);
                parcel1.readByteArray(arr_b);
                parcel1.readIntArray(arr_v);
                parcel1.recycle();
                this.k(z);
            }
            catch(RemoteException remoteException0) {
                throw new ccbz("unexpected RemoteException", remoteException0);
            }
        }
    }

    public final void h() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Future future0 = this.j;
        if(future0 != null) {
            FIN.finallyCodeBegin$NT(v);
            try {
                future0.get();
                return;
            }
            catch(ExecutionException executionException0) {
                if((executionException0.getCause() instanceof clbw)) {
                    return;
                }
                throw new ccbz("unexpected exception", executionException0);
            }
            catch(InterruptedException interruptedException0) {
                throw new ccbz("unexpected interruption", interruptedException0);
            }
            catch(CancellationException unused_ex) {
                return;
            }
        }
        throw new IllegalStateException("must not call waitForCompletion() before perform()");
    }

    public final void i(ccdq ccdq0) {
        clcn clcn0;
        long v2;
        String s;
        gmcd gmcd0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.m == 1) {
            this.m = 2;
            this.n = ccdq0;
            if(this.l()) {
                gmcd0 = gmbx.a;
            }
            else {
                try {
                    gogw gogw0 = this.e;
                    ExecutorService executorService0 = this.f;
                    clbk clbk0 = clbk.a;
                    clbj clbj0 = clbj.a;
                    clcf clcf0 = clcg.f(gogw0.b, ckbf.b, clbk0, clbj0);
                    ccbw ccbw0 = new ccbw(this);
                    clcj clcj0 = this.g.e(clcf0, ccbw0, executorService0, -1, 0x10500);
                    switch((gogv.a(gogw0.c) == 0 ? 1 : gogv.a(gogw0.c)) - 2) {
                        case 1: {
                            s = "HEAD";
                            break;
                        }
                        case 2: {
                            s = "GET";
                            break;
                        }
                        case 3: {
                            s = "POST";
                            break;
                        }
                        case 4: {
                            s = "PUT";
                            break;
                        }
                        case 5: {
                            s = "PATCH";
                            break;
                        }
                        case 6: {
                            s = "DELETE";
                            break;
                        }
                        default: {
                            int v1 = gogv.a(this.e.c) == 0 ? 1 : gogv.a(this.e.c);
                            if(v1 == 1) {
                                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                            }
                            throw new ccbz(String.format("unexpected method: %s", ((int)(v1 - 2))));
                        }
                    }
                    clcj0.n(s);
                    clcs clcs0 = clbz.a(clbk0, clbj0);
                    gfsx gfsx0 = gfqx.a;
                    for(Object object0: gogw0.d) {
                        gogu gogu0 = (gogu)object0;
                        clcs0.a(gogu0.b, gogu0.c);
                        if(!gfqz.e("Content-Encoding", gogu0.b)) {
                            continue;
                        }
                        gfsx0 = gfsx.m(gogu0.c);
                    }
                    if(this.j("Accept-Encoding") != null) {
                        throw new ccby("cannot support Accept-Encoding header");
                    }
                    String s1 = this.l;
                    if(!s1.isEmpty()) {
                        clcs0.a("X-SERVER-TOKEN", s1);
                    }
                    String s2 = this.j("Content-Length");
                    if(s2 == null) {
                        v2 = -1L;
                    }
                    else {
                        try {
                            v2 = Long.parseLong(s2);
                        }
                        catch(NumberFormatException numberFormatException0) {
                            throw new ccby(String.format("invalid Content-Length request header value: %s", s2), numberFormatException0);
                        }
                    }
                    if(gogw0.e) {
                        if(this.j("Content-Type") == null) {
                            clcs0.a("Content-Type", "application/octet-stream");
                        }
                        clcj0.r(new ccbx(this, v2, gfsx0), executorService0, clbk.a, clbj.a);
                    }
                    else if(v2 > 0L) {
                        throw new ccby("Content-Length > 0 but no request body available");
                    }
                    clcj0.m(new clct(clcs0));
                    clcj0.l();
                    int v3 = s.length() + 1 + gogw0.b.length() + 11;
                    for(Object object1: gogw0.d) {
                        v3 += ((gogu)object1).b.length() + 2 + ((gogu)object1).c.length() + 2;
                    }
                    this.k.addAndGet(((long)(v3 + 2)));
                    clcn0 = clcj0.e();
                }
                catch(ccby ccby0) {
                    this.c("invalid request", ccby0);
                    gmcd0 = gmbx.a;
                    goto label_88;
                }
                __monitor_enter(this);
                try {
                    Objects.requireNonNull(clcn0);
                    this.i = new ccbt(clcn0);
                    gmcd0 = clcn0.a();
                }
                catch(Throwable throwable0) {
                    __monitor_exit(this);
                    throw throwable0;
                }
                FIN.finallyCodeBegin$NT(v);
            }
        label_88:
            this.j = gmcd0;
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException("must not call perform() more than once");
    }

    private final String j(String s) {
        for(Object object0: this.e.d) {
            gogu gogu0 = (gogu)object0;
            if(gfqz.e(s, gogu0.b)) {
                return gogu0.c;
            }
        }
        return null;
    }

    private final void k(boolean z) {
        if(z) {
            return;
        }
        this.m = 4;
        throw new ccbv();
    }

    private final boolean l() {
        synchronized(this) {
        }
        return this.m == 4;
    }

    private final void m(hhmz hhmz0, String s, int v) {
        if(this.n != null) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhna.a).v_newBuilder();
                int v1 = hhmz0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hhna)hftv0).b = v1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhna hhna0 = (hhna)hftp0.b_message;
                s.getClass();
                hhna0.c = s;
                byte[] arr_b = ((hhna)hftp0.N_build()).toBytesArray();
                if(v != 0) {
                    switch(v - 1) {
                        case 1: {
                            ccdq ccdq0 = this.n;
                            Parcel parcel0 = ccdq0.jo();
                            parcel0.writeByteArray(arr_b);
                            ccdq0.jp(3, parcel0);
                            return;
                        }
                        case 2: {
                            ccdq ccdq1 = this.n;
                            Parcel parcel1 = ccdq1.jo();
                            parcel1.writeByteArray(arr_b);
                            ccdq1.jp(5, parcel1);
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                throw null;
            }
            catch(RemoteException remoteException0) {
                throw new ccbz("unexpected RemoteException", remoteException0);
            }
        }
    }
}

