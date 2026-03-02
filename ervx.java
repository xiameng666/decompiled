final class ervx extends ibuo implements ibts {
    public ervx(Object object0) {
        super(1, object0, erwq.class, "onCheckedChanged", "onCheckedChanged(Z)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        erwq erwq0 = (erwq)this.e;
        String s = (String)erwq0.j.a();
        if(s != null) {
            erwq0.i(s, ((Boolean)object0));
        }
        cmhi cmhi0 = erwq0.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cmft.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cmfr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cmfr)hftp1.b_message).c = (z ? 2 : 3) - 1;
        ((cmfr)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cmft cmft0 = (cmft)hftp0.b_message;
        cmfr cmfr0 = (cmfr)hftp1.N_build();
        cmfr0.getClass();
        cmft0.f = cmfr0;
        cmft0.b |= 16;
        cmhh.a(cmhi0, 0x3DBAC, ((cmft)hftp0.N_build()), 4);
        return ibom.a;
    }
}

