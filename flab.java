public final class flab implements gfsi {
    public final flad a;
    public final long b;

    public flab(flad flad0, long v) {
        this.a = flad0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        flaj flaj2;
        hfuo hfuo0 = this.a.c.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((flak)object0))));
        flal.i(((flah)hftp0), hfuo0);
        if(!((flah)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((flah)hftp0))).ensureMutable();
        }
        flak flak0 = (flak)((flah)hftp0).b_message;
        flak0.b |= 1;
        flak0.d = this.b;
        flak flak1 = (flak)((ProtoLiteBuilder)(((flah)hftp0))).N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)flak1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)flak1));
        for(int v = 0; v < ((flak)((flah)hftp1).b_message).f.size(); ++v) {
            flaj flaj0 = ((flah)hftp1).k(v);
            if((flaj0.b & 4) == 0) {
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)flaj0).jf(5, null);
                hftp3.X(((ProtoLiteMessage)flaj0));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                flaj flaj3 = (flaj)hftp3.b_message;
                flaj3.b &= -3;
                flaj3.d = 0L;
                flaj2 = (flaj)hftp3.N_build();
            }
            else {
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)flaj0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)flaj0));
                long v1 = flaj0.e;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                flaj flaj1 = (flaj)hftp2.b_message;
                flaj1.b |= 2;
                flaj1.d = v1;
                flaj2 = (flaj)hftp2.N_build();
            }
            ((flah)hftp1).o(v, flaj2);
        }
        return (flak)((ProtoLiteBuilder)(((flah)hftp1))).N_build();
    }
}

