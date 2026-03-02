public final class bovh implements gfsi {
    public final int a;

    public bovh(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((fqzv)object0).c & 1) != 0) {
            fqzu fqzu0 = ((fqzv)object0).e;
            if(fqzu0 == null) {
                fqzu0 = fqzu.a;
            }
            int v = this.a;
            if(!fqzu0.b.contains(Integer.valueOf(v))) {
                fqzu fqzu1 = ((fqzv)object0).e;
                if(fqzu1 == null) {
                    fqzu1 = fqzu.a;
                }
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqzu1).jf(5, null);
                hftp0.X(((ProtoLiteMessage)fqzu1));
                if(!((fqzt)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((fqzt)hftp0))).ensureMutable();
                }
                fqzu fqzu2 = (fqzu)((fqzt)hftp0).b_message;
                fqzu2.b();
                fqzu2.b.i(v);
                fqzu fqzu3 = (fqzu)((ProtoLiteBuilder)(((fqzt)hftp0))).N_build();
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
                hftp1.X(((ProtoLiteMessage)(((fqzv)object0))));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fqzv fqzv0 = (fqzv)hftp1.b_message;
                fqzu3.getClass();
                fqzv0.e = fqzu3;
                fqzv0.c |= 1;
                return (fqzv)hftp1.N_build();
            }
        }
        return (fqzv)object0;
    }
}

