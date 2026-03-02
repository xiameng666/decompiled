public final class bqoz implements gfsi {
    // This method was un-flattened
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v1;
        ggdy ggdy0 = new ggdy();
        ggdy ggdy1 = new ggdy();
        for(Object object1: ((hlgd)object0).b) {
            hlgi hlgi0 = (hlgi)object1;
            int v = hlgi0.c;
            switch(v) {
                case 0: {
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                default: {
                    throw null;
                }
            }
            switch(v1 - 1) {
                case 0: {
                    ggdy0.i((v == 1 ? ((hlkf)hlgi0.d) : hlkf.a));
                    break;
                }
                case 1: {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlkf.a).v_newBuilder();
                    String s = hlgi0.c == 2 ? ((String)hlgi0.d) : "";
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlkf hlkf0 = (hlkf)hftp0.b_message;
                    s.getClass();
                    hlkf0.b |= 1;
                    hlkf0.c = s;
                    ggdy1.i(((hlkf)hftp0.N_build()));
                }
            }
        }
        bqon bqon0 = new bqon();
        bqon0.a = ggdy0.h();
        bqon0.b = ggdy1.h();
        bqon0.f = ((hlgd)object0).c;
        bqon0.g = ((hlgd)object0).d ^ 1;
        return new bqoo(bqon0);
    }
}

