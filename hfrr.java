public final class hfrr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfrr a;
    public boolean b;
    private static volatile Parser c;

    static {
        hfrr hfrr0 = new hfrr();
        hfrr.a = hfrr0;
        ProtoLiteMessage.L(hfrr.class, ((ProtoLiteMessage)hfrr0));
    }

    public static hfrr b(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfrr)hftp0.b_message).b = z;
        return (hfrr)hftp0.N_build();
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
                    return new hfvw(((MessageLite)hfrr.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new hfrr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfrr.a));
                }
                case 5: {
                    return hfrr.a;
                }
                case 6: {
                    Object object1 = hfrr.c;
                    if(object1 == null) {
                        Class class0 = hfrr.class;
                        synchronized(class0) {
                            hfvs0 = hfrr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfrr.a));
                                hfrr.c = hfvs0;
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

