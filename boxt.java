public final class boxt implements gfsi {
    public final boolean a;
    public final int b;
    public final int c;

    public boxt(boolean z, int v, int v1) {
        this.a = z;
        this.b = v;
        this.c = v1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hadr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hadr)hftv0).b |= 1;
        ((hadr)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hadr)hftv1).e = this.b - 1;
        ((hadr)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadr hadr0 = (hadr)hftp0.b_message;
        int v = this.c - 1;
        if(this.c == 0) {
            throw null;
        }
        hadr0.d = v;
        hadr0.b |= 2;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadr hadr1 = (hadr)hftp0.N_build();
        hadr1.getClass();
        hadp0.h = hadr1;
        hadp0.b |= 0x20;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp1 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadp1.b |= 0x40;
        hadp1.i = 1;
        return (ProtoLiteBuilder)object0;
    }
}

