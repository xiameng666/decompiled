public final class atyq {
    private final atyc a;

    public atyq(atyc atyc0) {
        this.a = atyc0;
    }

    public final void a(gkff gkff0, Long long0, int v) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbf.a).v_newBuilder();
            gkff gkff1 = (gkff)atyc.i(gkff0, gkff.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glbf)hftp0.b_message).c = gkff1.d;
            ((glbf)hftp0.b_message).b |= 1;
            long v2 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glbf)hftv0).b |= 2;
            ((glbf)hftv0).d = v2;
            if(v != 0) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((glbf)hftp0.b_message).e = v - 1;
                ((glbf)hftp0.b_message).b |= 4;
            }
            glah glah0 = (glah)((ProtoLiteMessage)glai.a).v_newBuilder();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glbf glbf0 = (glbf)hftp0.N_build();
            glbf0.getClass();
            glai0.N = glbf0;
            glai0.c |= 0x40;
            glai glai1 = (glai)((ProtoLiteBuilder)glah0).N_build();
            this.a.n(glai1, gkey.bb);
        }
    }
}

