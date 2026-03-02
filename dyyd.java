public final class dyyd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyli.a).v_newBuilder();
        dykv dykv0 = ((dyhj)object0).c;
        if(dykv0 == null) {
            dykv0 = dykv.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyli dyli0 = (dyli)hftp0.b_message;
        dykv0.getClass();
        dyli0.c = dykv0;
        dyli0.b = 1;
        return ((dyli)hftp0.N_build()).toBytesArray();
    }
}

