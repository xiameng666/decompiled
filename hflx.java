import j..util.Collection.-EL;

public final class hflx implements gfsi {
    public final boolean a;
    public final boolean b;
    public final gged_interceptors c;
    public final boolean d;

    public hflx(boolean z, boolean z1, gged_interceptors gged0, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = gged0;
        this.d = z2;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hflq hflq0 = (hflq)object0;
        boolean z = this.a;
        if(z && this.b) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfns)hftv0).c = 2;
            ((hfns)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfns hfns0 = (hfns)hftp0.b_message;
            hfns0.b |= 2;
            hfns0.d = 5;
            return (hfns)hftp0.N_build();
        }
        boolean z1 = Collection.-EL.stream(this.c).anyMatch(new hfma());
        if(z && z1) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((hfns)hftv1).c = 2;
            ((hfns)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfns hfns1 = (hfns)hftp1.b_message;
            hfns1.b |= 2;
            hfns1.d = 7;
            return (hfns)hftp1.N_build();
        }
        if(this.d && z1) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((hfns)hftv2).c = 2;
            ((hfns)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfns hfns2 = (hfns)hftp2.b_message;
            hfns2.b |= 2;
            hfns2.d = 10;
            return (hfns)hftp2.N_build();
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hfns)hftp3.b_message).c = 1;
        ((hfns)hftp3.b_message).b |= 1;
        return (hfns)hftp3.N_build();
    }
}

