public final class fpra implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((fpjp)object0).a != 0x734A) {
            throw (fpjp)object0;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fplr.a).v_newBuilder();
        fpll fpll0 = (fpll)((ProtoLiteMessage)fplm.b).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!fpll0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fpll0).ensureMutable();
        }
        ((fplm)fpll0.b_message).c |= 8;
        ((fplm)fpll0.b_message).g = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fplr fplr0 = (fplr)hftp0.b_message;
        fplm fplm0 = (fplm)((ProtoLiteBuilder)fpll0).N_build();
        fplm0.getClass();
        fplr0.c = fplm0;
        fplr0.b |= 1;
        return (fplr)hftp0.N_build();
    }
}

