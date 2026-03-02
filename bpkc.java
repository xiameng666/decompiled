public final class bpkc implements gfsi {
    public final bpko a;

    public bpkc(bpko bpko0) {
        this.a = bpko0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtae.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtaj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gtal)object0).getClass();
        ((gtaj)hftv0).c = (gtal)object0;
        ((gtaj)hftv0).b |= 1;
        float f = (float)this.a.i;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtaj)hftp1.b_message).e = f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtae gtae0 = (gtae)hftp0.b_message;
        gtaj gtaj0 = (gtaj)hftp1.N_build();
        gtaj0.getClass();
        gtae0.c = gtaj0;
        gtae0.b = 10;
        return (gtae)hftp0.N_build();
    }
}

