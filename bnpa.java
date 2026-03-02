public final class bnpa implements gfsi {
    public final gsyz a;

    public bnpa(gsyz gsyz0) {
        this.a = gsyz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        gsyz gsyz0 = this.a;
        ((fqyd)hftp0).n(gsyz0.b);
        if(!((fqyd)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyd)hftp0))).ensureMutable();
        }
        ((fqyf)((fqyd)hftp0).b_message).b = hfvv.a;
        ((fqyd)hftp0).k(gggq.d(((fqyf)object0).b, new bnpq(gsyz0)));
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

