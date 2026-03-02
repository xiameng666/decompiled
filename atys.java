import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

public final class atys {
    private final atyc a;

    public atys(atyc atyc0) {
        this.a = atyc0;
    }

    public final void a(CastDevice castDevice0, long v, atyb atyb0, String s, gkfm gkfm0) {
        synchronized(this) {
            glah glah0 = this.h(castDevice0, v, atyb0, s);
            gkfm gkfm1 = (gkfm)atyc.i(gkfm0, gkfm.a);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).z = gkfm1.q;
            ((glai)glah0.b_message).b |= 0x200000;
            glai glai0 = (glai)((ProtoLiteBuilder)glah0).N_build();
            this.a.n(glai0, gkey.V);
        }
    }

    public final void b(CastDevice castDevice0, long v, atyb atyb0, gkey gkey0, String s) {
        synchronized(this) {
            glai glai0 = (glai)((ProtoLiteBuilder)this.h(castDevice0, v, atyb0, s)).N_build();
            this.a.n(glai0, gkey0);
        }
    }

    public final void c(CastDevice castDevice0, long v, atyb atyb0, String s, int v1) {
        synchronized(this) {
            glah glah0 = this.h(castDevice0, v, atyb0, s);
            gkfq gkfq0 = gkfq.b;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).y = gkfq0.h;
            ((glai)glah0.b_message).b |= 0x100000;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glai0.b |= 0x800000;
            glai0.B = v1;
            glai glai1 = (glai)((ProtoLiteBuilder)glah0).N_build();
            this.a.n(glai1, gkey.T);
        }
    }

    public final void d(CastDevice castDevice0, long v, atyb atyb0, String s, gkfq gkfq0) {
        synchronized(this) {
            glah glah0 = this.h(castDevice0, v, atyb0, s);
            gkfq gkfq1 = (gkfq)atyc.i(gkfq0, gkfq.a);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).y = gkfq1.h;
            ((glai)glah0.b_message).b |= 0x100000;
            glai glai0 = (glai)((ProtoLiteBuilder)glah0).N_build();
            this.a.n(glai0, gkey.T);
        }
    }

    public final void e(boolean z) {
        synchronized(this) {
            glai glai0 = (glai)((ProtoLiteBuilder)this.a.b()).N_build();
            this.a.n(glai0, (z ? gkey.ah : gkey.ag));
        }
    }

    public final void f(boolean z) {
        synchronized(this) {
            glai glai0 = (glai)((ProtoLiteBuilder)this.a.b()).N_build();
            this.a.n(glai0, (z ? gkey.aj : gkey.ak));
        }
    }

    public final void g(CastDevice castDevice0, long v, atyb atyb0, String s, int v1) {
        synchronized(this) {
            glah glah0 = this.h(castDevice0, v, atyb0, s);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).P = v1 - 1;
            ((glai)glah0.b_message).c |= 0x100;
            glai glai0 = (glai)((ProtoLiteBuilder)glah0).N_build();
            this.a.n(glai0, gkey.ae);
        }
    }

    private final glah h(CastDevice castDevice0, long v, atyb atyb0, String s) {
        glah glah0 = this.a.c(v, castDevice0.j, atyb0);
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        ((glai)glah0.b_message).e = 5;
        ((glai)glah0.b_message).b |= 4;
        if(!TextUtils.isEmpty(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glap.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glap glap0 = (glap)hftp0.b_message;
            s.getClass();
            glap0.b |= 1;
            glap0.c = s;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glap glap1 = (glap)hftp0.N_build();
            glap1.getClass();
            glai0.A = glap1;
            glai0.b |= 0x400000;
        }
        return glah0;
    }
}

