public final class hftk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hftk a;
    public float b;
    private static volatile Parser c;

    static {
        hftk hftk0 = new hftk();
        hftk.a = hftk0;
        ProtoLiteMessage.L(hftk.class, ((ProtoLiteMessage)hftk0));
    }

    public static hftk b(float f) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hftk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hftk)hftp0.b_message).b = f;
        return (hftk)hftp0.N_build();
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
                    return new hfvw(((MessageLite)hftk.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"b"});
                }
                case 3: {
                    return new hftk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hftk.a));
                }
                case 5: {
                    return hftk.a;
                }
                case 6: {
                    Object object1 = hftk.c;
                    if(object1 == null) {
                        Class class0 = hftk.class;
                        synchronized(class0) {
                            hfvs0 = hftk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hftk.a));
                                hftk.c = hfvs0;
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

