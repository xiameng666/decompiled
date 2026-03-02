public final class bovd implements gfsi {
    public final Iterable a;

    public bovd(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((fqzv)object0).c & 1) != 0) {
            fqzu fqzu0 = ((fqzv)object0).e;
            if(fqzu0 == null) {
                fqzu0 = fqzu.a;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqzu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)fqzu0));
            if(!((fqzt)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqzt)hftp0))).ensureMutable();
            }
            ((fqzu)((fqzt)hftp0).b_message).b = hfty.a;
            ((fqzt)hftp0).k(this.a);
            fqzu fqzu1 = (fqzu)((ProtoLiteBuilder)(((fqzt)hftp0))).N_build();
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
            hftp1.X(((ProtoLiteMessage)(((fqzv)object0))));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fqzv fqzv0 = (fqzv)hftp1.b_message;
            fqzu1.getClass();
            fqzv0.e = fqzu1;
            fqzv0.c |= 1;
            return (fqzv)hftp1.N_build();
        }
        return (fqzv)object0;
    }
}

