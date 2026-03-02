public final class affc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)((afoo)object0).c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)((afoo)object0).c));
        bxos bxos0 = (bxos)bxos.a.b();
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery0 = (hery)hftp0.b_message;
        hery0.b |= 0x2000;
        hery0.s = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery1 = (hery)hftp0.b_message;
        hery1.b |= 0x1000;
        hery1.r = true;
        return new afoo(((hery)hftp0.N_build()), ((afoo)object0).d, ((afoo)object0).e);
    }
}

