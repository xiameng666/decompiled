public final class dycn implements gfsi {
    public final int a;

    public dycn(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eudq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eudq)object0))));
        switch(this.a) {
            case 1: {
                int v = ((eudq)object0).e + 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq0 = (eudq)hftp0.b_message;
                eudq0.b |= 8;
                eudq0.e = v;
                long v1 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq1 = (eudq)hftp0.b_message;
                eudq1.b |= 0x40;
                eudq1.h = v1;
                return (eudq)hftp0.N_build();
            }
            case 2: {
                int v2 = ((eudq)object0).f + 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq2 = (eudq)hftp0.b_message;
                eudq2.b |= 16;
                eudq2.f = v2;
                long v3 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq3 = (eudq)hftp0.b_message;
                eudq3.b |= 0x20;
                eudq3.g = v3;
                return (eudq)hftp0.N_build();
            }
            case 3: {
                int v4 = ((eudq)object0).i + 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq4 = (eudq)hftp0.b_message;
                eudq4.b |= 0x80;
                eudq4.i = v4;
                long v5 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eudq eudq5 = (eudq)hftp0.b_message;
                eudq5.b |= 0x100;
                eudq5.j = v5;
                return (eudq)hftp0.N_build();
            }
            default: {
                return (eudq)hftp0.N_build();
            }
        }
    }
}

