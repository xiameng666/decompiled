public final class bvhb implements ibts {
    public final clnz a;

    public bvhb(clnz clnz0) {
        this.a = clnz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cmgf)object0), "$this$veConfig");
        buyi buyi0 = this.a.a;
        ibuq.f(buyi0, "value");
        ProtoLiteBuilder hftp0 = ((cmgf)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cmfe cmfe0 = (cmfe)hftp0.b_message;
        cmfe0.d = buyi0.a();
        cmfe0.b |= 2;
        return ibom.a;
    }
}

