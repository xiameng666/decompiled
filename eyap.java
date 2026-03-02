public final class eyap implements ibts {
    public final int a;

    public eyap(int v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((eygt)object0), "deviceState");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eygt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eygt)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eygt)hftp0.b_message).b = this.a != 3;
        return (eygt)hftp0.N_build();
    }
}

