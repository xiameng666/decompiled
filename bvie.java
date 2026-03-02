public final class bvie implements ibts {
    public final cmew a;
    public final String b;

    public bvie(cmew cmew0, String s) {
        this.a = cmew0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cmgf)object0), "$this$veConfig");
        cmew cmew0 = this.a;
        ibuq.f(cmew0, "value");
        ProtoLiteBuilder hftp0 = ((cmgf)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.b;
        ((cmfe)hftp0.b_message).i = cmew0.d;
        ((cmfe)hftp0.b_message).b |= 0x40;
        if(s != null && s.length() != 0) {
            ((cmgf)object0).e(s);
        }
        return ibom.a;
    }
}

