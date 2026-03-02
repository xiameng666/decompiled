public final class atwe implements Runnable {
    public final atxp a;
    public final atyb b;
    public final String c;
    public final String d;

    public atwe(atxp atxp0, atyb atyb0, String s, String s1) {
        this.a = atxp0;
        this.b = atyb0;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final void run() {
        atyc atyc0 = this.a.n.a;
        glah glah0 = atyc0.c(0L, null, this.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glac.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glac glac0 = (glac)hftp0.b_message;
        this.d.getClass();
        glac0.b |= 1;
        glac0.c = this.d;
        glac glac1 = (glac)hftp0.N_build();
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        String s = this.c;
        ((glai)glah0.b_message).O = hfvv.a;
        glah0.k(glac1);
        if(s != null) {
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glai0.b |= 0x40000;
            glai0.r = s;
        }
        atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bc);
    }
}

