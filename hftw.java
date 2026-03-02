public final class hftw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hftw a;
    public int b;
    private static volatile Parser c;

    static {
        hftw hftw0 = new hftw();
        hftw.a = hftw0;
        ProtoLiteMessage.L(hftw.class, ((ProtoLiteMessage)hftw0));
    }

    public static hftw b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hftw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hftw)hftp0.b_message).b = v;
        return (hftw)hftp0.N_build();
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)hftw.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
                }
                case 3: {
                    return new hftw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hftw.a));
                }
                case 5: {
                    return hftw.a;
                }
                case 6: {
                    Object object1 = hftw.c;
                    if(object1 == null) {
                        Class class0 = hftw.class;
                        synchronized(class0) {
                            hfvs0 = hftw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hftw.a));
                                hftw.c = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

