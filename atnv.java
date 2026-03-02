import android.content.Context;
import java.util.UUID;

public final class atnv extends atnu {
    public final String b;
    public final ProtoLiteBuilder c;
    private final long d;

    public atnv(Context context0, String s, int v, boolean z) {
        super(context0, v);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicq.a).v_newBuilder();
        this.c = hftp0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        s.getClass();
        gicq0.b |= 2;
        gicq0.d = s;
        if(hqlt.a.o().aG()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gicq gicq1 = (gicq)hftp0.b_message;
            gicq1.b |= 0x100;
            gicq1.k = z;
        }
        this.d = System.currentTimeMillis();
        this.b = UUID.randomUUID().toString();
    }

    public final void b() {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = 14;
        ((gicq)hftp0.b_message).b |= 0x20;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = 2;
        ((gicq)hftp0.b_message).b |= 0x20;
    }

    public final void d(hjjv hjjv0) {
        int v1;
        ProtoLiteBuilder hftp0 = this.c;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if((((gicq)hftv0).b & 0x20) == 0) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gicq)hftp0.b_message).h = 3;
            ((gicq)hftp0.b_message).b |= 0x20;
        }
        int v = hjjv0.a.ordinal();
        switch(v) {
            case 0: {
                v1 = 10;
                break;
            }
            case 1: {
                v1 = 11;
                break;
            }
            case 2: {
                v1 = 12;
                break;
            }
            case 3: {
                v1 = 13;
                break;
            }
            default: {
                v1 = v == 4 ? 14 : 15;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 0x80;
        gicq0.j = v1;
    }

    public final void e(long v, long v1) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 4;
        gicq0.e = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq1 = (gicq)hftp0.b_message;
        gicq1.b |= 8;
        gicq1.f = v1;
    }

    public final void f(boolean z, long v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = (z ? 6 : 5) - 1;
        ((gicq)hftp0.b_message).b |= 0x20;
        if(hqlt.a.o().ad() && z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gicq gicq0 = (gicq)hftp0.b_message;
            gicq0.b |= 16;
            gicq0.g = v;
        }
    }

    public final void g(long v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 8;
        gicq0.f = v;
    }

    public final void h(int v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 0x40;
        gicq0.i = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = 1;
        ((gicq)hftp0.b_message).b |= 0x20;
    }

    public final void i(long v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 4;
        gicq0.e = v;
    }

    public final void j() {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = 10;
        ((gicq)hftp0.b_message).b |= 0x20;
    }

    public final void k() {
        long v = System.currentTimeMillis() - this.d;
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicq gicq0 = (gicq)hftp0.b_message;
        gicq0.b |= 1;
        gicq0.c = v;
        String s = this.b;
        ProtoLiteBuilder hftp1 = aqra.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        s.getClass();
        ghys0.b |= 1;
        ghys0.e = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp1.b_message;
        gicq gicq1 = (gicq)hftp0.N_build();
        gicq1.getClass();
        ghys1.i = gicq1;
        ghys1.b |= 0x40;
        this.a(hftp1, ghyr.d);
    }

    public final void l(int v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicq)hftp0.b_message).h = v - 1;
        ((gicq)hftp0.b_message).b |= 0x20;
        this.k();
    }
}

