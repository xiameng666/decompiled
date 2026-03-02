public final class caao {
    private final ProtoLiteBuilder a;

    public caao() {
        this.a = ((ProtoLiteMessage)gdhb.a).v_newBuilder();
    }

    public final byte[] a() {
        return ((gdhb)this.a.N_build()).toBytesArray();
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gdhc)hftp0.b_message).c = v - 1;
        ((gdhc)hftp0.b_message).b |= 1;
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhc gdhc0 = (gdhc)hftp0.b_message;
        gdhc0.b |= 2;
        gdhc0.d = v1;
        gdhc gdhc1 = (gdhc)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gdhb gdhb0 = (gdhb)hftp1.b_message;
        gdhc1.getClass();
        hfuo hfuo0 = gdhb0.b;
        if(!hfuo0.c()) {
            gdhb0.b = ProtoLiteMessage.E(hfuo0);
        }
        gdhb0.b.add(gdhc1);
    }
}

