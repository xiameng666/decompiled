import com.google.android.gms.cast.CastDevice;
import java.util.UUID;

public final class atye {
    private final boolean a;
    private final atyc b;
    private final atzc c;
    private final atyk d;
    private ProtoLiteBuilder e;

    public atye(atyc atyc0, atzc atzc0, atyk atyk0) {
        this.a = avij.e().u();
        this.b = atyc0;
        this.c = atzc0;
        this.d = atyk0;
    }

    public final void a(CastDevice castDevice0, long v) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(this.a && atyc.p(atxs0) && atxs0 != null) {
                this.c.b(castDevice0, v);
                glai glai0 = (glai)((ProtoLiteBuilder)this.b.f(atxs0, castDevice0)).N_build();
                this.b.n(glai0, gkey.ar);
            }
        }
    }

    public final void b(int v) {
        synchronized(this) {
            if(this.e == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glcu)hftp0.b_message).c = 1;
            ((glcu)hftp0.b_message).b |= 1;
            long v2 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glcu)hftv0).b |= 4;
            ((glcu)hftv0).e = v2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glcu glcu0 = (glcu)hftp0.b_message;
            glcu0.b |= 2;
            glcu0.d = v;
            glcu glcu1 = (glcu)hftp0.N_build();
            ProtoLiteBuilder hftp1 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glct glct0 = (glct)hftp1.b_message;
            glcu1.getClass();
            glct0.f = glcu1;
            glct0.b |= 8;
            atyc atyc0 = this.b;
            glah glah0 = atyc0.b();
            ProtoLiteBuilder hftp2 = this.e;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glct glct1 = (glct)hftp2.N_build();
            glct1.getClass();
            glai0.Z = glct1;
            glai0.c |= 0x800000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aD);
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.e == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glcu)hftp0.b_message).c = 2;
            ((glcu)hftp0.b_message).b |= 1;
            long v1 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glcu glcu0 = (glcu)hftp0.b_message;
            glcu0.b |= 4;
            glcu0.e = v1;
            glcu glcu1 = (glcu)hftp0.N_build();
            ProtoLiteBuilder hftp1 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glct glct0 = (glct)hftp1.b_message;
            glcu1.getClass();
            glct0.f = glcu1;
            glct0.b |= 8;
            atyc atyc0 = this.b;
            glah glah0 = atyc0.b();
            ProtoLiteBuilder hftp2 = this.e;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glct glct1 = (glct)hftp2.N_build();
            glct1.getClass();
            glai0.Z = glct1;
            glai0.c |= 0x800000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aD);
        }
    }

    public final void d() {
        synchronized(this) {
            if(this.e == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glcu)hftp0.b_message).c = 3;
            ((glcu)hftp0.b_message).b |= 1;
            long v1 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glcu glcu0 = (glcu)hftp0.b_message;
            glcu0.b |= 4;
            glcu0.e = v1;
            glcu glcu1 = (glcu)hftp0.N_build();
            ProtoLiteBuilder hftp1 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glct glct0 = (glct)hftp1.b_message;
            glcu1.getClass();
            glct0.f = glcu1;
            glct0.b |= 8;
            atyc atyc0 = this.b;
            glah glah0 = atyc0.b();
            ProtoLiteBuilder hftp2 = this.e;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glct glct1 = (glct)hftp2.N_build();
            glct1.getClass();
            glai0.Z = glct1;
            glai0.c |= 0x800000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aD);
        }
    }

    public final void e(int v) {
        synchronized(this) {
            if(this.e == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glcu)hftp0.b_message).c = 4;
            ((glcu)hftp0.b_message).b |= 1;
            long v2 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glcu)hftv0).b |= 4;
            ((glcu)hftv0).e = v2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glcu glcu0 = (glcu)hftp0.b_message;
            glcu0.b |= 2;
            glcu0.d = v;
            glcu glcu1 = (glcu)hftp0.N_build();
            ProtoLiteBuilder hftp1 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glct glct0 = (glct)hftp1.b_message;
            glcu1.getClass();
            glct0.f = glcu1;
            glct0.b |= 8;
            atyc atyc0 = this.b;
            glah glah0 = atyc0.b();
            ProtoLiteBuilder hftp2 = this.e;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glct glct1 = (glct)hftp2.N_build();
            glct1.getClass();
            glai0.Z = glct1;
            glai0.c |= 0x800000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aD);
        }
    }

    public final void f() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = this.e;
            if(hftp0 == null) {
                return;
            }
            long v1 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glct glct0 = (glct)hftp0.b_message;
            glct0.b |= 4;
            glct0.e = v1;
        }
    }

    public final void g() {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glct.a).v_newBuilder();
            String s = UUID.randomUUID().toString();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glct glct0 = (glct)hftp0.b_message;
            s.getClass();
            glct0.b |= 1;
            glct0.c = s;
            long v1 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glct glct1 = (glct)hftp0.b_message;
            glct1.b |= 2;
            glct1.d = v1;
            this.e = hftp0;
        }
    }
}

