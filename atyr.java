import android.os.SystemClock;

public final class atyr {
    final atzd a;
    private final atyc b;

    public atyr(atyc atyc0) {
        this.b = atyc0;
        this.a = new atzd();
    }

    public final void a() {
        glcc glcc0;
        synchronized(this) {
            atzd atzd0 = this.a;
            if(atzd0.a) {
                long v1 = SystemClock.elapsedRealtime() - atzd0.b;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((glcc)hftv0).b |= 1;
                ((glcc)hftv0).c = v1;
                boolean z = atzd0.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((glcc)hftv1).b |= 2;
                ((glcc)hftv1).d = z;
                boolean z1 = atzd0.e;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((glcc)hftv2).b |= 8;
                ((glcc)hftv2).f = z1;
                if(atzd0.c) {
                    long v2 = atzd0.d - atzd0.b;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glcc glcc1 = (glcc)hftp0.b_message;
                    glcc1.b |= 4;
                    glcc1.e = v2;
                }
                atzd0.a = false;
                atzd0.b = 0L;
                atzd0.c = false;
                atzd0.d = 0L;
                atzd0.e = false;
                glcc0 = (glcc)hftp0.N_build();
            }
            else {
                glcc0 = null;
            }
            if(glcc0 != null) {
                atyc atyc0 = this.b;
                glah glah0 = atyc0.b();
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).W = glcc0;
                ((glai)glah0.b_message).c |= 0x40000;
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bm);
            }
        }
    }

    public final void b() {
        synchronized(this) {
            atzd atzd0 = this.a;
            if(atzd0.c) {
                return;
            }
            atzd0.d = SystemClock.elapsedRealtime();
            atzd0.c = true;
        }
    }

    public final void c() {
        synchronized(this) {
            atzd atzd0 = this.a;
            if(atzd0.a) {
                return;
            }
            atzd0.a = true;
            atzd0.b = SystemClock.elapsedRealtime();
        }
    }

    public final void d() {
        synchronized(this) {
            this.a.e = true;
        }
    }
}

