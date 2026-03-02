import com.google.android.gms.cast.CastDevice;

public final class atvv implements Runnable {
    public final atxp a;
    public final CastDevice b;
    public final long c;
    public final boolean d;
    public final int e;
    public final String f;
    public final atyb g;
    public final String h;

    public atvv(atxp atxp0, CastDevice castDevice0, long v, boolean z, int v1, String s, atyb atyb0, String s1) {
        this.a = atxp0;
        this.b = castDevice0;
        this.c = v;
        this.d = z;
        this.e = v1;
        this.f = s;
        this.g = atyb0;
        this.h = s1;
    }

    @Override
    public final void run() {
        CastDevice castDevice0 = this.b;
        if(castDevice0 == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glar)hftv0).b |= 1;
        ((glar)hftv0).c = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        glar glar0 = (glar)hftp0.b_message;
        glar0.b |= 0x100;
        glar0.j = this.e;
        glar glar1 = (glar)hftp0.N_build();
        atyh atyh0 = this.a.m;
        atyc atyc0 = atyh0.a;
        glah glah0 = atyc0.c(this.c, this.f, this.g);
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai0 = (glai)glah0.b_message;
        glar1.getClass();
        glai0.i = glar1;
        glai0.b |= 0x40;
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        ((glai)glah0.b_message).e = 1;
        ((glai)glah0.b_message).b |= 4;
        atyh0.a(glah0, castDevice0);
        atyh.e(glah0, this.h);
        atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.D);
    }
}

