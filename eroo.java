public final class eroo implements gfsi {
    public final byte a;

    public eroo(byte b) {
        this.a = b;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        eqoh eqoh0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqok)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqok)object0))));
        int v = this.a;
        if(v == 1) {
            eqoh0 = eqoh.b;
        }
        else {
            switch(v) {
                case 2: {
                    eqoh0 = eqoh.c;
                    break;
                }
                case 3: {
                    eqoh0 = eqoh.d;
                    break;
                }
                case 4: {
                    eqoh0 = eqoh.e;
                    break;
                }
                default: {
                    eqoh0 = eqoh.f;
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqok eqok0 = (eqok)hftp0.b_message;
        eqok0.c = eqoh0.a();
        eqok0.b |= 1;
        return (eqok)hftp0.N_build();
    }
}

