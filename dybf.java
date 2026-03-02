public final class dybf implements gfsi {
    public final gftc a;

    public dybf(gftc gftc0) {
        this.a = gftc0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((dydv)object0) == null) {
            return dydv.a;
        }
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((dydv)object0).b) {
            dydu dydu0 = (dydu)object1;
            if(!this.a.a(dydu0)) {
                ggdy0.i(dydu0);
            }
        }
        dydm dydm0 = (dydm)((ProtoLiteMessage)dydv.a).v_newBuilder();
        gged_interceptors gged0 = ggdy0.h();
        if(!dydm0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)dydm0).ensureMutable();
        }
        dydv dydv0 = (dydv)dydm0.b_message;
        dydv0.b();
        hfrj.E(gged0, dydv0.b);
        return (dydv)((ProtoLiteBuilder)dydm0).N_build();
    }
}

