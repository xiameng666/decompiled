import android.os.ParcelFileDescriptor;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class akvp implements akzu, gelg {
    public static final bboh a;
    public final ScheduledExecutorService b;
    public final Object c;
    public final aliu d;
    public alit e;
    public akzp f;
    public akty g;
    public int h;
    public int i;
    public boolean j;
    private final String k;
    private final gekx l;
    private final gelh m;
    private final akzz n;
    private final Set o;
    private final List p;

    static {
        akvp.a = alis.a("BleSecureChannel");
    }

    public akvp(gelz gelz0) {
        String s = gelz0.f();
        bbll bbll0 = new bbll(1, 10);
        super();
        this.j = false;
        this.k = s;
        this.l = gelz0;
        this.b = bbll0;
        akzz akzz0 = new akzz(bbll0, this);
        this.n = akzz0;
        this.o = new HashSet();
        this.p = new ArrayList();
        this.c = new Object();
        this.d = new aliu();
        this.h = 1;
        this.i = 0;
        this.m = new gemh(gelz0, akzz0);
    }

    @Override  // akzu
    public final int a() {
        return 1;
    }

    @Override  // akzu
    public final int b() {
        synchronized(this.c) {
        }
        return this.h;
    }

    @Override  // akzu
    public final String c() {
        String s;
        synchronized(this.c) {
            akty akty0 = this.g;
            s = null;
            if(akty0 == null) {
                return null;
            }
            RemoteDevice remoteDevice0 = ((akzp)akty0).a;
            if(remoteDevice0 != null) {
                s = remoteDevice0.b;
            }
        }
        return s;
    }

    public final void d(akzt akzt0) {
        synchronized(this.c) {
            this.o.add(akzt0);
        }
    }

    public final void e(int v) {
        synchronized(this.c) {
            int v2 = this.h;
            if(v2 == v) {
                return;
            }
            ((ggtj)akvp.a.h()).R("Connection status changed from %s to %s.", ConnectionInfo.a(v2), ConnectionInfo.a(v));
            this.h = v;
            for(Object object1: this.o) {
                ((akzt)object1).h(this, v2, v);
            }
        }
    }

    public final void f() {
        synchronized(this.c) {
            this.i = 0;
        }
    }

    @Override  // akzu
    public final void g() {
        synchronized(this.c) {
            this.m.a();
        }
    }

    @Override  // gelg
    public final void h() {
    }

    @Override  // gelg
    public final void i() {
        synchronized(this.c) {
            ((ggtj)akvp.a.h()).B("uWeave socket has disconnected from %s.", this.k);
            this.e(0);
            this.p.clear();
            this.l.b();
        }
    }

    @Override  // gelg
    public final void j(IOException iOException0) {
        synchronized(this.c) {
            ((ggtj)((ggtj)akvp.a.j()).s(iOException0)).B("uWeave socket encountered an error communicating with %s.", this.k);
            this.g();
        }
    }

    @Override  // gelg
    public final void k(byte[] arr_b) {
        alaa alaa0;
        try {
            alaa0 = alac.a(arr_b);
        }
        catch(IOException iOException0) {
            a.ae(akvp.a.j(), "Unable to parse received message.", iOException0);
            return;
        }
        Object object0 = this.c;
        synchronized(object0) {
            int v = this.h;
            if(v != 0) {
                if(v != 1 && v != 2) {
                    __monitor_enter(object0);
                    goto label_11;
                }
                goto label_26;
            }
            goto label_75;
        }
        try {
            try {
            label_11:
                byte[] arr_b1 = this.g.b(alaa0);
                for(Object object1: this.o) {
                    ((akzt)object1).i(this, alaa0.b, arr_b1);
                }
            }
            catch(akyq akyq0) {
                a.ae(akvp.a.j(), "Unable to decrypt received message.", akyq0);
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        __monitor_exit(object0);
        return;
        try {
        label_26:
            this.f();
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        try {
            batl.l(this.f != null);
            if(this.f.e()) {
                __monitor_enter(object0);
                goto label_54;
            }
            else {
                synchronized(this.c) {
                    bboh bboh0 = akvp.a;
                    ggtj ggtj0 = (ggtj)bboh0.h();
                    String s = this.k;
                    ggtj0.B("Processing [Initiator Hello] message from %s.", s);
                    try {
                        alaa alaa1 = this.f.c(alaa0);
                        if(this.f.b == null) {
                            this.d.F(6);
                        }
                        this.d.X(this.e);
                        this.e = this.d.a("peripheral_role_write_responder_auth_time");
                        ((ggtj)bboh0.h()).B("Sending [Responder Auth] to %s.", s);
                        this.p(alaa1.a(), s, new akvl(this), 6);
                    }
                    catch(akyq akyq1) {
                        ((ggtj)((ggtj)akvp.a.j()).s(akyq1)).B("Error handling [Initiator Hello] message from %s.", this.k);
                        this.g();
                        this.d.F(1);
                    }
                }
            }
            goto label_72;
        }
        catch(Throwable throwable2) {
            goto label_69;
        }
        try {
        label_54:
            ((ggtj)akvp.a.h()).B("Processing [Initiator Auth] message from %s.", this.k);
            try {
                this.f.d(alaa0);
                this.e(3);
                this.d.F(0);
                this.d.X(this.e);
            }
            catch(akyq akyq2) {
                ((ggtj)((ggtj)akvp.a.j()).s(akyq2)).B("Error handling [Initiator Auth] message from %s.", this.k);
                this.g();
                this.d.F(2);
            }
            goto label_71;
        }
        catch(Throwable throwable3) {
            try {
                __monitor_exit(object0);
                throw throwable3;
            }
            catch(Throwable throwable2) {
            }
        }
        try {
        label_69:
            __monitor_exit(object0);
            throw throwable2;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_71:
        __monitor_exit(object0);
    label_72:
        __monitor_exit(object0);
        __monitor_exit(object0);
        return;
        try {
        label_75:
            ((ggtj)akvp.a.j()).B("Message was received after channel disconnected; message: 0x%s", bboy.c(alaa0.a));
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    @Override  // akzu
    public final void l(ParcelFileDescriptor parcelFileDescriptor0, long v) {
        throw new UnsupportedOperationException();
    }

    @Override  // akzu
    public final void m(byte[] arr_b, String s) {
        Object object0 = this.c;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(((gekv)this.m).d && this.h == 3) {
            try {
                byte[] arr_b1 = this.g.a(arr_b, s).a();
                String s1 = String.format(Locale.US, "Error while sending message 0x%s to address %s; disconnecting.", bboy.c(arr_b), this.k);
                __monitor_enter(object0);
                try {
                    this.p(arr_b1, s1, null, 0);
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    throw throwable0;
                }
                __monitor_exit(object0);
            }
            catch(akyq akyq0) {
                throw new IllegalStateException("Unable to encrypt", akyq0);
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Must be connected and authenticated to send secure message.");
    }

    public final void n(int v) {
        synchronized(this.c) {
            this.i = v;
            akvo akvo0 = new akvo(this, v);
            ((bbll)this.b).g(akvo0, 10L, TimeUnit.SECONDS);
        }
    }

    @Override  // akzu
    public final byte[] o() {
        byte[] arr_b;
        synchronized(this.c) {
            arr_b = this.g == null ? null : ((akzp)this.g).b;
        }
        return arr_b;
    }

    private final void p(byte[] arr_b, String s, Runnable runnable0, int v) {
        boolean z = true;
        synchronized(this.c) {
            if(runnable0 == null) {
                if(v != 0) {
                    z = false;
                }
                batl.b(z);
            }
            else {
                if(v == 0) {
                    z = false;
                }
                batl.b(z);
                this.n(v);
            }
            alit alit0 = this.d.a("ble_weave_socket_write_time");
            this.m.l(arr_b).b(new akvn(this, s, runnable0, alit0));
        }
    }
}

