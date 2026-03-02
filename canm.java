import android.os.SystemClock;
import jeb.synthetic.FIN;

public final class canm {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final int h;
    private int i;

    public canm(int v) {
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.i = 2;
        this.g = -1;
        this.h = v;
        this.a = 0L;
    }

    public final gitc a() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gitc)hftv0).c = this.h - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gitc)hftv1).d = 0;
        int v1 = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gitc)hftv2).e = v1;
        int v2 = this.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gitc)hftv3).g = v2;
        int v3 = this.e;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gitc)hftv4).h = v3;
        int v4 = this.f;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gitc)hftv5).f = v4;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((gitc)hftv6).i = 0;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        ((gitc)hftv7).j = 0;
        int v5 = this.i;
        if(!hftv7.isImmutable()) {
            hftp0.ensureMutable();
        }
        gitc gitc0 = (gitc)hftp0.b_message;
        if(v5 != 1) {
            gitc0.k = v5 - 2;
            if(this.g >= 0) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisz.a).v_newBuilder();
                int v6 = this.g;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gisz)hftp1.b_message).b = v6;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gitc gitc1 = (gitc)hftp0.b_message;
                gisz gisz0 = (gisz)hftp1.N_build();
                gisz0.getClass();
                gitc1.l = gisz0;
                gitc1.b |= 1;
            }
            long v7 = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gitc)hftp0.b_message).m = v7;
            gitc gitc2 = (gitc)hftp0.N_build();
            FIN.finallyCodeBegin$NT(v);
            return gitc2;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public final void b(int v) {
        synchronized(this) {
            this.e += v;
        }
    }

    public final void c(int v) {
        synchronized(this) {
            this.f += v;
        }
    }

    public final void d(int v) {
        synchronized(this) {
            this.d += v;
        }
    }

    public final void e(int v) {
        synchronized(this) {
            this.c += v;
        }
    }

    public final void f() {
        synchronized(this) {
            if(this.a > 0L) {
                this.b = SystemClock.elapsedRealtime() - this.a;
            }
        }
    }

    public final void g() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final void h(int v) {
        synchronized(this) {
            if(this.i != 4) {
                this.i = v;
            }
        }
    }

    public final void i() {
        synchronized(this) {
            this.g = 15;
        }
    }
}

