import j..util.Collection.-EL;

public final class bgqh implements gfsi {
    public final bgqs a;
    public final gxog b;

    public bgqh(bgqs bgqs0, gxog gxog0) {
        this.a = bgqs0;
        this.b = gxog0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxoh)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxoh)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxog gxog0 = this.b;
        ((gxoh)hftp0.b_message).c = hfvv.a;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(((gxoh)object0).c).filter(new bgqi(this.a, gxog0)).limit(4999L).collect(ggaf.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoh gxoh0 = (gxoh)hftp0.b_message;
        gxoh0.b();
        hfrj.E(iterable0, gxoh0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoh gxoh1 = (gxoh)hftp0.b_message;
        gxog0.getClass();
        gxoh1.b();
        gxoh1.c.add(gxog0);
        return (gxoh)hftp0.N_build();
    }
}

