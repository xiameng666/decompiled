public final class dych implements ibts {
    public final long a;

    public dych(long v) {
        this.a = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dymw)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dymw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dymw)object0))));
        dymy dymy0 = dymx.a(hftp0);
        ProtoLiteBuilder hftp1 = dymy0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dymw)hftp1.b_message).d = this.a;
        dymy0.c(dymv.d);
        return dymy0.a();
    }
}

