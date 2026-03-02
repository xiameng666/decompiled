public final class bosr implements gfsi {
    public final boul a;
    public final fqzb b;

    public bosr(boul boul0, fqzb fqzb0) {
        this.a = boul0;
        this.b = fqzb0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzl)object0))));
        fqzc fqzc0 = ((fqzl)object0).y;
        if(fqzc0 == null) {
            fqzc0 = fqzc.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqzc0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)fqzc0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fqzc fqzc1 = (fqzc)hftp1.b_message;
        this.b.getClass();
        fqzc1.b();
        fqzc1.b.add(this.b);
        boul.y(hftp1, this.a.f.d());
        if(!((fqyg)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp0))).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)((fqyg)hftp0).b_message;
        fqzc fqzc2 = (fqzc)hftp1.N_build();
        fqzc2.getClass();
        fqzl0.y = fqzc2;
        fqzl0.b |= 0x20000;
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp0))).N_build();
    }
}

