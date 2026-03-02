import j..util.Collection.-EL;

public final class bgqo implements gfsi {
    public final bgqs a;
    public final gxoi b;

    public bgqo(bgqs bgqs0, gxoi gxoi0) {
        this.a = bgqs0;
        this.b = gxoi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxoh)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxoh)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoi gxoi0 = this.b;
        ((gxoh)hftp0.b_message).b = hfvv.a;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(((gxoh)object0).b).filter(new bgql(gxoi0)).filter(new bgqm(this.a)).limit(4999L).collect(ggaf.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoh gxoh0 = (gxoh)hftp0.b_message;
        gxoh0.c();
        hfrj.E(iterable0, gxoh0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoh gxoh1 = (gxoh)hftp0.b_message;
        gxoi0.getClass();
        gxoh1.c();
        gxoh1.b.add(gxoi0);
        return (gxoh)hftp0.N_build();
    }
}

