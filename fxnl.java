public final class fxnl implements ibts {
    public final fxns a;
    public final long b;

    public fxnl(fxns fxns0, long v) {
        this.a = fxns0;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        fwqy fwqy0 = (fwqy)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fwqy.a).v_newBuilder();
        Object object1 = this.a.a.get();
        ibuq.e(object1, "get(...)");
        long v = ((Number)object1).longValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fwqy fwqy1 = (fwqy)hftp0.b_message;
        fwqy1.b |= 1;
        fwqy1.c = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxoq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gxoq)hftp1.b_message).b = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fwqy fwqy2 = (fwqy)hftp0.b_message;
        gxoq gxoq0 = (gxoq)hftp1.N_build();
        gxoq0.getClass();
        fwqy2.d = gxoq0;
        fwqy2.b |= 2;
        return (fwqy)hftp0.N_build();
    }
}

