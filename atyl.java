import com.google.android.gms.cast.CastDevice;

public final class atyl {
    private final atyc a;

    public atyl(atyc atyc0) {
        this.a = atyc0;
    }

    public final void a(glbe glbe0, CastDevice castDevice0, int v, gkey gkey0, String s) {
        atyc atyc0 = this.a;
        glah glah0 = atyc0.b();
        if(s != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glac.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glac glac0 = (glac)hftp0.b_message;
            glac0.b |= 1;
            glac0.c = s;
            glah0.k(((glac)hftp0.N_build()));
        }
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai0 = (glai)glah0.b_message;
        glbe0.getClass();
        glai0.ae = glbe0;
        glai0.c |= 0x20000000;
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai1 = (glai)glah0.b_message;
        glai1.b |= 0x80000000;
        glai1.H = v;
        glcb glcb0 = atyc.h(castDevice0);
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai2 = (glai)glah0.b_message;
        glcb0.getClass();
        glai2.aa = glcb0;
        glai2.c |= 0x2000000;
        atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey0);
    }
}

