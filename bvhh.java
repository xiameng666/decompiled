public final class bvhh implements ibts {
    public final clnf a;
    public final String b;

    public bvhh(clnf clnf0, String s) {
        this.a = clnf0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cmeu cmeu0;
        ibuq.f(((cmgf)object0), "$this$veConfig");
        clnf clnf0 = this.a;
        clmu clmu0 = clnf0.a;
        ibuq.f(clmu0, "value");
        ProtoLiteBuilder hftp0 = ((cmgf)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cmfe cmfe0 = (cmfe)hftp0.b_message;
        cmfe0.g = clmu0.a();
        cmfe0.b |= 16;
        ccmy ccmy0 = clnf0.e;
        if(ccmy0 == null) {
            cmeu0 = cmeu.a;
        }
        else {
            cmeu0 = ccmy0.a();
            if(cmeu0 == null) {
                cmeu0 = cmeu.a;
            }
        }
        ((cmgf)object0).b(cmeu0);
        ccow ccow0 = clnf0.d;
        ibuq.f(ccow0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.b;
        cmfe cmfe1 = (cmfe)hftp0.b_message;
        cmfe1.h = ccow0.a();
        cmfe1.b |= 0x20;
        if(s != null) {
            ((cmgf)object0).e(s);
        }
        return ibom.a;
    }
}

