public final class dxzg implements ibts {
    public final String a;
    public final dxfe b;

    public dxzg(String s, dxfe dxfe0) {
        this.a = s;
        this.b = dxfe0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dxfb)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dxfb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dxfb)object0))));
        dxfd dxfd0 = dxfc.a(hftp0);
        dxfd0.b();
        String s = this.a;
        ibuq.f(s, "key");
        dxfe dxfe0 = this.b;
        ibuq.f(dxfe0, "value");
        ProtoLiteBuilder hftp1 = dxfd0.a;
        s.getClass();
        dxfe0.getClass();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dxfb)hftp1.b_message).b().put(s, dxfe0);
        return dxfd0.a();
    }
}

